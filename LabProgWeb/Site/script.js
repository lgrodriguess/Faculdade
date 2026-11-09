/* PetMatch – Parte 2 (Unidade 3): interatividade com JavaScript e jQuery
 *
 * Este arquivo é usado em index.html (filtro, modal e galeria) e em
 * cadastro.html (validação do formulário). Cada função "init" só faz
 * alguma coisa se os elementos dela existirem na página atual.
 */
$(function () {
  'use strict';

  /* Quem pede "menos movimento" no sistema operacional não vê animações. */
  var reduzMovimento = window.matchMedia && window.matchMedia('(prefers-reduced-motion: reduce)').matches;
  if (reduzMovimento) { $.fx.off = true; }

  /* Tira acentos e deixa em minúsculas: "Médio" vira "medio". */
  function semAcento(texto) {
    return texto.normalize('NFD').replace(/[̀-ͯ]/g, '').toLowerCase();
  }

  /* ------------------------------------------------------------------
   * Dados dos pets (usados no modal). A chave é o data-id do cartão.
   * ------------------------------------------------------------------ */
  var PETS = {
    thor: {
      nome: 'Thor', artigo: 'o', emoji: '🐶', info: 'Cão • 2 anos • Porte médio',
      historia: 'Thor foi encontrado vagando perto da rodoviária, magro e assustado, mas abanando o rabo para todo mundo. Em poucas semanas ganhou peso, aprendeu a dar a pata e virou o queridinho dos voluntários. Adora correr atrás de bolinha e dorme de barriga para cima.',
      tracos: ['Brincalhão', 'Ótimo com crianças', 'Vacinado', 'Castrado']
    },
    mel: {
      nome: 'Mel', artigo: 'a', emoji: '🐱', info: 'Gata • 1 ano • Porte pequeno',
      historia: 'Mel nasceu numa ninhada resgatada de um terreno baldio e foi alimentada de mamadeira pelos voluntários. Cresceu mansa, acostumada com colo e com o barulho da ONG. Dorme onde tiver sol e ronrona assim que alguém senta ao lado.',
      tracos: ['Carinhosa', 'Tranquila', 'Ideal para apartamento', 'Vacinada']
    },
    bidu: {
      nome: 'Bidu', artigo: 'o', emoji: '🐕', info: 'Cão • 5 anos • Porte pequeno',
      historia: 'Bidu viveu quatro anos com um senhor que precisou se mudar e não pôde levá-lo. Chegou à ONG com o cobertor favorito e muita saudade. Hoje é o mais calmo do canil: gosta de passeios curtos no fim da tarde e de companhia no sofá.',
      tracos: ['Calmo', 'Companheiro', 'Bom para quem mora sozinho', 'Castrado']
    },
    luna: {
      nome: 'Luna', artigo: 'a', emoji: '🐈', info: 'Gata • 3 anos • Porte pequeno',
      historia: 'Luna apareceu na porta da sede num dia de chuva e decidiu que ficaria por ali. É curiosa, vive explorando as prateleiras mais altas e se dá bem com os outros gatos da casa. Gosta de carinho, mas na hora que ela escolhe.',
      tracos: ['Independente', 'Curiosa', 'Convive bem com outros gatos', 'Vacinada']
    },
    rex: {
      nome: 'Rex', artigo: 'o', emoji: '🦮', info: 'Cão • 4 anos • Porte grande',
      historia: 'Rex foi resgatado de uma obra abandonada, onde passou meses cuidando sozinho do terreno. É grande e forte, mas dócil como um filhote. Precisa de espaço para gastar energia e de uma família com paciência para os passeios longos.',
      tracos: ['Dócil', 'Energético', 'Precisa de espaço', 'Vacinado']
    },
    tom: {
      nome: 'Tom', artigo: 'o', emoji: '🐈‍⬛', info: 'Gato • 3 anos • Porte médio',
      historia: 'Tom é um gato preto que esperou mais que os outros por uma família, só por causa de superstições bobas. Quem convive com ele descobre um gato dengoso, que segue a gente pela casa e ronrona alto assim que ganha colo.',
      tracos: ['Dengoso', 'Sociável', 'Ronrona alto', 'Castrado']
    }
  };

  /* ==================================================================
   * 1) FILTRO DE PETS (manipulação do DOM, sem recarregar a página)
   * ================================================================== */
  function initFiltro() {
    var $form = $('#filtros');
    if (!$form.length) { return; }

    var $cards = $('#lista-pets .card');
    var $status = $('#f-status');
    var $vazio = $('#sem-resultado');

    $form.prop('hidden', false); // sem JavaScript o filtro nem aparece

    function aplicar() {
      var nome = semAcento($.trim($('#f-nome').val()));
      var especie = $('#f-especie').val();
      var porte = $('#f-porte').val();
      var visiveis = 0;

      $cards.each(function () {
        var $card = $(this);
        var combina =
          (!especie || $card.data('especie') === especie) &&
          (!porte || $card.data('porte') === porte) &&
          semAcento($card.find('h3').text()).indexOf(nome) !== -1;

        if (combina) {
          visiveis++;
          $card.stop(true, true).fadeIn(200);
        } else {
          $card.stop(true, true).fadeOut(200);
        }
      });

      $status.text('Mostrando ' + visiveis + ' de ' + $cards.length + ' pets.');
      $vazio.toggle(visiveis === 0);
    }

    $form.on('input change', 'input, select', aplicar);
    $form.on('submit', function (e) { e.preventDefault(); }); // Enter na busca não recarrega
    $form.on('reset', function () { setTimeout(aplicar, 0); }); // espera o reset limpar os campos

    aplicar();
  }

  /* ==================================================================
   * 2) MODAL COM A HISTÓRIA DO PET
   * ================================================================== */
  function initModal() {
    var $modal = $('#modal-pet');
    if (!$modal.length) { return; }

    var $caixa = $modal.find('.modal-box');
    var aberto = false;
    var focoAnterior = null;

    function abrir(id) {
      var pet = PETS[id];
      if (!pet) { return; }

      $('#modal-emoji').text(pet.emoji);
      $('#modal-titulo').text(pet.nome);
      $('#modal-info').text(pet.info);
      $('#modal-historia').text(pet.historia);
      var $tracos = $('#modal-tracos').empty();
      $.each(pet.tracos, function (i, traco) { $tracos.append($('<li>').text(traco)); });
      $('#modal-adotar')
        .attr('href', 'cadastro.html?pet=' + encodeURIComponent(pet.nome))
        .text('Adotar ' + pet.artigo + ' ' + pet.nome);

      focoAnterior = document.activeElement;
      aberto = true;
      $('body').addClass('modal-aberto');
      $modal.stop(true, true).fadeIn(200, function () { $caixa.trigger('focus'); });
    }

    function fechar() {
      if (!aberto) { return; }
      aberto = false;
      $('body').removeClass('modal-aberto');
      $modal.stop(true, true).fadeOut(150, function () {
        if (focoAnterior) { $(focoAnterior).trigger('focus'); } // devolve o foco a quem abriu
      });
    }

    // Clique no cartão (ou no botão "Ver história"); o link "Adotar" segue normalmente.
    $('#lista-pets').on('click', '.card', function (e) {
      if ($(e.target).closest('a').length) { return; }
      abrir($(this).data('id'));
    });

    $modal.on('click', '.modal-close', fechar);
    $modal.on('click', function (e) { if (e.target === $modal[0]) { fechar(); } }); // clique no fundo

    $(document).on('keydown', function (e) {
      if (!aberto) { return; }
      if (e.key === 'Escape') { fechar(); return; }
      if (e.key !== 'Tab') { return; }

      // Mantém o Tab dentro do modal enquanto ele estiver aberto.
      var $foco = $caixa.find('a[href], button:not([disabled])');
      var primeiro = $foco.first()[0];
      var ultimo = $foco.last()[0];
      var atual = document.activeElement;
      if (e.shiftKey && (atual === primeiro || atual === $caixa[0])) {
        e.preventDefault();
        ultimo.focus();
      } else if (!e.shiftKey && atual === ultimo) {
        e.preventDefault();
        primeiro.focus();
      }
    });
  }

  /* ==================================================================
   * 3) GALERIA – CARROSSEL COM EFEITO FADE (jQuery)
   * ================================================================== */
  function initCarrossel() {
    var $car = $('#carrossel');
    if (!$car.length) { return; }

    var $slides = $car.find('.slide');
    var $dots = $car.find('.dots');
    var $pausar = $car.find('.car-pause');
    var total = $slides.length;
    var atual = 0;
    var timer = null;
    var pausadoPeloUsuario = !!reduzMovimento; // quem prefere menos movimento começa pausado
    var pausadoTemporario = false;             // mouse em cima ou foco dentro da galeria

    $car.addClass('js-carousel');
    $slides.hide().eq(0).show();

    $slides.each(function (i) {
      $(this).attr({ role: 'group', 'aria-roledescription': 'slide', 'aria-label': (i + 1) + ' de ' + total });
      $('<button type="button">')
        .attr('aria-label', 'Ir para a foto ' + (i + 1))
        .data('i', i)
        .appendTo($dots);
    });

    function marcarPonto() {
      $dots.children().attr('aria-current', 'false').eq(atual).attr('aria-current', 'true');
    }

    function ir(novo) {
      novo = (novo + total) % total;
      if (novo === atual) { return; }
      $slides.eq(atual).stop(true, true).fadeOut(400);
      $slides.eq(novo).stop(true, true).fadeIn(400);
      atual = novo;
      marcarPonto();
    }

    function atualizarTimer() {
      clearInterval(timer);
      timer = null;
      var rodando = !pausadoPeloUsuario && !pausadoTemporario;
      if (rodando) { timer = setInterval(function () { ir(atual + 1); }, 5000); }
      // Leitor de tela: avisa a troca de foto só quando não está passando sozinho.
      $car.find('.slides').attr('aria-live', rodando ? 'off' : 'polite');
      $pausar.text(pausadoPeloUsuario ? 'Reproduzir' : 'Pausar')
        .attr('aria-label', pausadoPeloUsuario ? 'Retomar a troca automática' : 'Pausar a troca automática');
    }

    $car.on('click', '.prev', function () { ir(atual - 1); });
    $car.on('click', '.next', function () { ir(atual + 1); });
    $dots.on('click', 'button', function () { ir($(this).data('i')); });
    $pausar.on('click', function () { pausadoPeloUsuario = !pausadoPeloUsuario; atualizarTimer(); });

    $car.on('mouseenter focusin', function () { pausadoTemporario = true; atualizarTimer(); });
    $car.on('mouseleave focusout', function () { pausadoTemporario = false; atualizarTimer(); });

    $car.on('keydown', function (e) {
      if (e.key === 'ArrowLeft') { ir(atual - 1); }
      if (e.key === 'ArrowRight') { ir(atual + 1); }
    });

    // Deslizar o dedo no celular
    var x0 = null;
    $car.on('touchstart', function (e) { x0 = e.originalEvent.touches[0].clientX; });
    $car.on('touchend', function (e) {
      if (x0 === null) { return; }
      var dx = e.originalEvent.changedTouches[0].clientX - x0;
      if (Math.abs(dx) > 40) { ir(dx < 0 ? atual + 1 : atual - 1); }
      x0 = null;
    });

    marcarPonto();
    atualizarTimer();
  }

  /* ==================================================================
   * 4) FORMULÁRIO DE ADOÇÃO – VALIDAÇÃO EM TEMPO REAL
   * ================================================================== */

  // --- Máscaras (formatam enquanto a pessoa digita) ---
  function soDigitos(valor) { return valor.replace(/\D/g, ''); }

  function mascaraCPF(valor) {
    var d = soDigitos(valor).slice(0, 11);
    var partes = [d.slice(0, 3), d.slice(3, 6), d.slice(6, 9)].filter(Boolean).join('.');
    return d.length > 9 ? partes + '-' + d.slice(9) : partes;
  }

  function mascaraTelefone(valor) {
    var d = soDigitos(valor).slice(0, 11);
    if (!d.length) { return ''; }
    if (d.length <= 2) { return '(' + d; }
    if (d.length <= 6) { return '(' + d.slice(0, 2) + ') ' + d.slice(2); }
    if (d.length <= 10) { return '(' + d.slice(0, 2) + ') ' + d.slice(2, 6) + '-' + d.slice(6); }
    return '(' + d.slice(0, 2) + ') ' + d.slice(2, 7) + '-' + d.slice(7);
  }

  // --- Regras: cada função devolve '' se o valor é válido, ou a mensagem de erro ---
  function validarNome(valor) {
    var v = $.trim(valor);
    if (!v) { return 'Informe seu nome completo.'; }
    if (v.split(/\s+/).length < 2 || !/^\p{L}[\p{L}'’\- ]+$/u.test(v)) {
      return 'Digite nome e sobrenome, usando apenas letras.';
    }
    return '';
  }

  function validarEmail(valor) {
    var v = $.trim(valor);
    if (!v) { return 'Informe seu e-mail.'; }
    if (!/^[A-Za-z0-9._%+-]+@[A-Za-z0-9-]+(\.[A-Za-z0-9-]+)*\.[A-Za-z]{2,}$/.test(v)) {
      return 'E-mail inválido. Use o formato nome@exemplo.com.';
    }
    return '';
  }

  /* CPF: 11 dígitos, não pode ser tudo igual e os 2 últimos são dígitos verificadores. */
  function cpfValido(d) {
    if (d.length !== 11 || /^(\d)\1{10}$/.test(d)) { return false; }
    for (var t = 9; t < 11; t++) {
      var soma = 0;
      for (var i = 0; i < t; i++) { soma += Number(d.charAt(i)) * (t + 1 - i); }
      var dv = ((soma * 10) % 11) % 10;
      if (dv !== Number(d.charAt(t))) { return false; }
    }
    return true;
  }

  function validarCPF(valor) {
    var d = soDigitos(valor);
    if (!d) { return 'Informe seu CPF.'; }
    if (d.length < 11) { return 'O CPF tem 11 dígitos.'; }
    if (!cpfValido(d)) { return 'CPF inválido. Confira os números.'; }
    return '';
  }

  /* Idade completa em anos a partir de "AAAA-MM-DD" (valor do input type="date"). */
  function calcularIdade(iso) {
    var p = iso.split('-').map(Number);
    var hoje = new Date();
    var idade = hoje.getFullYear() - p[0];
    var jaFezAniversario = (hoje.getMonth() + 1 > p[1]) || (hoje.getMonth() + 1 === p[1] && hoje.getDate() >= p[2]);
    return jaFezAniversario ? idade : idade - 1;
  }

  var IDADE_MINIMA = 18;

  function validarNascimento(valor) {
    if (!valor) { return 'Informe sua data de nascimento.'; }
    var idade = calcularIdade(valor);
    if (isNaN(idade) || idade < 0 || idade > 120) { return 'Data de nascimento inválida.'; }
    if (idade < IDADE_MINIMA) { return 'É preciso ter ' + IDADE_MINIMA + ' anos ou mais para adotar.'; }
    return '';
  }

  function validarTelefone(valor) {
    var d = soDigitos(valor);
    if (!d) { return ''; } // campo opcional
    if (d.length < 10) { return 'Telefone incompleto. Digite o DDD e o número.'; }
    if (Number(d.slice(0, 2)) < 11) { return 'DDD inválido.'; }
    if (d.length === 11 && d.charAt(2) !== '9') { return 'Celular deve começar com 9 depois do DDD.'; }
    return '';
  }

  function validarCidade(valor) {
    var v = $.trim(valor);
    if (!v) { return 'Informe sua cidade.'; }
    if (!/^\p{L}[\p{L}'’.\- ]+$/u.test(v)) { return 'Cidade inválida. Use apenas letras.'; }
    return '';
  }

  function validarAceite(marcado) {
    return marcado ? '' : 'Você precisa aceitar para continuar.';
  }

  function dataISO(d) {
    function dois(n) { return (n < 10 ? '0' : '') + n; }
    return d.getFullYear() + '-' + dois(d.getMonth() + 1) + '-' + dois(d.getDate());
  }

  function initFormulario() {
    var $form = $('#form-adocao');
    if (!$form.length) { return; }

    // Com JavaScript, as mensagens são as nossas; sem ele, vale a validação do navegador.
    $form.attr('novalidate', 'novalidate');
    $('#nascimento').attr('max', dataISO(new Date()));

    var $alertaErro = $('#alerta-erro');
    var $alertaOk = $('#alerta-ok');

    var campos = {
      nome:       { validar: validarNome },
      email:      { validar: validarEmail },
      cpf:        { validar: validarCPF, mascara: mascaraCPF },
      nascimento: { validar: validarNascimento },
      telefone:   { validar: validarTelefone, mascara: mascaraTelefone },
      cidade:     { validar: validarCidade },
      aceite:     { validar: validarAceite }
    };
    var ids = Object.keys(campos);
    var tocado = {}; // o erro só aparece depois que a pessoa saiu do campo (ou tentou enviar)

    function valorDe($el) { return $el.is(':checkbox') ? $el.prop('checked') : $el.val(); }

    /* Valida um campo e atualiza a tela. Devolve true se está válido. */
    function validar(id) {
      var $el = $('#' + id);
      var $campo = $el.closest('.campo');
      var $erro = $('#erro-' + id);
      var valor = valorDe($el);
      var msg = campos[id].validar(valor);
      var preenchido = $el.is(':checkbox') ? valor : $.trim(valor) !== '';

      $campo.removeClass('valido invalido');
      $erro.text('');
      $el.removeAttr('aria-invalid');

      if (msg === '') {
        if (preenchido) { $campo.addClass('valido'); }  // acerto aparece na hora
      } else if (tocado[id]) {
        $campo.addClass('invalido');                     // erro só depois de "tocar" no campo
        $erro.text(msg);
        $el.attr('aria-invalid', 'true');
      }
      return msg === '';
    }

    function limparEstados() {
      tocado = {};
      $form.find('.campo').removeClass('valido invalido');
      $form.find('.erro').text('');
      $form.find('[aria-invalid]').removeAttr('aria-invalid');
    }

    $.each(campos, function (id, cfg) {
      var $el = $('#' + id);
      if ($el.is(':checkbox')) {
        $el.on('change', function () { tocado[id] = true; validar(id); });
        return;
      }
      $el.on('input', function () {
        if (cfg.mascara) { $el.val(cfg.mascara($el.val())); }
        validar(id); // a cada tecla
      });
      $el.on('blur', function () { tocado[id] = true; validar(id); });
    });

    // Pré-seleciona o pet quando a pessoa chega por "Adotar o Thor" (?pet=Thor)
    var petDaUrl = new URLSearchParams(window.location.search).get('pet');
    if (petDaUrl) {
      $('#pet option').each(function () {
        if (this.value === petDaUrl) { $('#pet').val(petDaUrl); }
      });
    }

    // Ao editar de novo depois de enviar, some a mensagem de sucesso.
    $form.on('input change', function () { $alertaOk.empty(); });

    $form.on('submit', function (e) {
      e.preventDefault();
      $alertaOk.empty();

      var invalidos = [];
      $.each(ids, function (i, id) {
        tocado[id] = true;
        if (!validar(id)) { invalidos.push(id); }
      });

      if (invalidos.length) {
        $alertaErro.text(invalidos.length === 1
          ? 'Corrija o campo destacado antes de enviar.'
          : 'Corrija os ' + invalidos.length + ' campos destacados antes de enviar.');
        $('#' + invalidos[0]).trigger('focus');
        return;
      }

      // Tudo certo. Aqui os dados seguiriam para o servidor (por exemplo com fetch/$.post).
      // Nesta parte do trabalho só confirmamos o recebimento na própria página.
      var primeiroNome = $.trim($('#nome').val()).split(/\s+/)[0];
      var pet = $('#pet').val();
      var interesse = pet === 'Ainda não sei' ? '' : ' Pet de interesse: ' + pet + '.';
      $alertaErro.empty();
      $alertaOk.text('Pré-cadastro recebido, ' + primeiroNome + '!' + interesse +
        ' A ONG vai entrar em contato pelo e-mail informado.');

      $form[0].reset();
      limparEstados();
      $alertaOk[0].scrollIntoView({ behavior: reduzMovimento ? 'auto' : 'smooth', block: 'center' });
    });

    // Some o aviso de erro geral assim que a pessoa começa a corrigir.
    $form.on('input change', function () { $alertaErro.empty(); });
  }

  initFiltro();
  initModal();
  initCarrossel();
  initFormulario();
});
