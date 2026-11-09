
$(function () {
  'use strict';

  var FOTOS = {
    rex:  { src: 'imagens/rex.jpg',  alt: 'Foto do Rex, cão cinza de porte grande' },
    thor: { src: 'imagens/thor.jpg', alt: 'Foto do Thor, cão de porte médio deitado ao ar livre', pos: 'center 40%' },
    bidu: { src: 'imagens/bidu.jpg', alt: 'Foto do Bidu, cão pequeno usando um moletom azul', pos: 'center 30%' },
    mel:  { src: 'imagens/mel.jpg',  alt: 'Foto da Mel, gata deitada de barriga para cima' },
    luna: { src: 'imagens/luna.jpg', alt: 'Foto da Luna, gata clara de olhos azuis olhando para cima' },
    tom:  { src: 'imagens/tom.jpg',  alt: 'Foto do Tom, gato preto e branco de olhos amarelos' }
  };

  /* Ordem dos pets nos slides da galeria (os 4 primeiros do index.html). */
  var ORDEM_GALERIA = ['thor', 'mel', 'bidu', 'luna'];

  /* Troca o conteúdo de $alvo (que tinha um emoji) pela foto do pet. */
  function preencher($alvo, id, emoji) {
    var foto = FOTOS[id];
    if (!foto) { $alvo.text(emoji || ''); return; }

    var $img = $('<img>')
      .attr({ src: foto.src, alt: foto.alt, loading: 'lazy', decoding: 'async' })
      .css('object-position', foto.pos || 'center');

    // Se a imagem não carregar, volta o emoji.
    $img.on('error', function () {
      $alvo.removeClass('com-foto').attr('aria-hidden', 'true').text(emoji || '');
    });

    $alvo.addClass('com-foto').removeAttr('aria-hidden').empty().append($img);
  }

  // Disponível para o script.js (usado no modal).
  window.PetFotos = { preencher: preencher };

  /* 1) Cartões da lista de pets */
  $('#lista-pets .card').each(function () {
    var $pic = $(this).find('.pic');
    preencher($pic, $(this).data('id'), $pic.text());
  });

  /* 2) Galeria (carrossel): um slide para cada pet */
  $('#carrossel .slide .foto').each(function (i) {
    if (ORDEM_GALERIA[i]) { preencher($(this), ORDEM_GALERIA[i], $(this).text()); }
  });
});
