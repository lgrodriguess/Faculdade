# 🐾 PetMatch – Portal de Adoção de Animais (Parte 2: JavaScript / jQuery)

Trabalho da faculdade, desenvolvido em três avaliações sobre o mesmo tema. O **PetMatch** é o site de uma ONG que resgata cães e gatos e os encaminha para adoção.

| Avaliação | Conteúdo | Status |
|---|---|---|
| Parte 1 | HTML5 e CSS3: site estático e responsivo | ✅ Concluída |
| **Parte 2** | **Interatividade no front-end com JavaScript e jQuery** | ✅ **Este repositório** |
| Parte 3 | A definir | ⏳ |

## ✨ O que a Parte 2 entrega

### 1. Filtro de pets sem recarregar a página
Busca por **nome**, **espécie** (cão/gato) e **porte** (pequeno/médio/grande). Os filtros funcionam juntos, os cartões entram e saem com efeito *fade*, o contador mostra "Mostrando X de Y pets" e uma mensagem aparece quando nenhum pet combina. A busca por nome ignora acentos e maiúsculas.

### 2. Modal com a história do pet
Ao clicar no cartão (ou em **Ver história**), abre um modal com a história, as características e o botão de adoção. O botão leva ao formulário já com o pet escolhido (`cadastro.html?pet=Thor`).
Fecha com **×**, **Esc** ou clique no fundo; o foco do teclado fica preso dentro do modal enquanto ele está aberto e volta ao botão de origem ao fechar.

### 3. Validação em tempo real do formulário de adoção
| Campo | Regra |
|---|---|
| Nome | Nome e sobrenome, apenas letras (aceita acentos, apóstrofo e hífen) |
| E-mail | Formato `nome@dominio.com` |
| CPF | Máscara automática `000.000.000-00` e conferência dos dígitos verificadores; rejeita sequências repetidas (`111.111.111-11`) |
| Data de nascimento | **Idade mínima de 18 anos**, calculada com a data completa; rejeita datas futuras |
| Telefone (opcional) | Máscara `(00) 00000-0000`, DDD válido e celular começando com 9 |
| Cidade | Apenas letras |
| Aceite | Obrigatório |

- O acerto aparece na hora; o **erro só aparece depois que a pessoa sai do campo** (ou tenta enviar), para não "brigar" com quem ainda está digitando.
- No envio, se houver erros, o formulário **não é enviado**, mostra um resumo e leva o foco ao primeiro campo inválido.
- Com tudo certo, mostra a confirmação e limpa o formulário. *Nesta parte os dados não são enviados a nenhum servidor.*

### 4. Galeria com carrossel em jQuery
Troca de fotos com efeito *fade*, setas, pontos de navegação, troca automática a cada 5 s, botão **Pausar**, navegação por setas do teclado e deslizar o dedo no celular. As "fotos" são emojis sobre cartões coloridos; para usar fotos reais, troque o `<div class="foto">` de cada slide por um `<img src="..." alt="...">`.

## ♿ Acessibilidade
- Mensagens de erro ligadas aos campos (`aria-describedby`, `aria-invalid`) e avisos em regiões `role="alert"` / `role="status"`.
- Modal com `role="dialog"`, `aria-modal`, foco gerenciado e fechamento por Esc.
- Carrossel com botão de pausa, rótulos de cada slide e `aria-live` ajustado conforme a troca automática.
- Respeita `prefers-reduced-motion` (animações desligadas e carrossel começa pausado).
- Sem JavaScript, o formulário continua com a validação nativa do navegador e a galeria aparece como uma lista de figuras.

## 🛠️ Tecnologias
- HTML5 e CSS3 (Grid, Flexbox, variáveis CSS)
- JavaScript (ES5/ES6) e [jQuery 3.7.1](https://jquery.com/) via CDN, com verificação de integridade (SRI)
- Fontes Fredoka e Nunito (Google Fonts)

## 📁 Estrutura

```
.
├── index.html      # Home: filtro, cartões, modal, tabelas e galeria
├── cadastro.html   # Pré-cadastro de adotante (validação em tempo real)
├── sobre.html      # Sobre nós
├── style.css       # Estilos (Parte 1 + estilos novos da Parte 2)
└── script.js       # Todo o JavaScript/jQuery da Parte 2
```

O `script.js` é compartilhado pelas páginas: cada função (`initFiltro`, `initModal`, `initCarrossel`, `initFormulario`) só roda se os elementos dela existirem na página.

## ▶️ Como executar
Não precisa instalar nada. Baixe o repositório e abra o `index.html` no navegador (é preciso ter internet para carregar o jQuery e as fontes).

Se preferir um servidor local:

```bash
python3 -m http.server 8000
# depois acesse http://localhost:8000
```

## 🧪 Exemplos para testar a validação
- CPF válido para teste: `529.982.247-25` (já o `111.444.777-36` é inválido).
- Data de nascimento de menor de idade → "É preciso ter 18 anos ou mais para adotar."
- Tente enviar o formulário vazio para ver o resumo de erros e o foco no primeiro campo.

## 📝 Observações
- Os pets, as histórias e os números da ONG são **fictícios**, criados para o trabalho.
- O CPF digitado é usado apenas para validação no navegador e não é armazenado nem enviado.

## 👤 Autor
**Luan Rodrigues** – [github.com/lgrodriguess](https://github.com/lgrodriguess)
Trabalho da disciplina Laboratório de Programação Web
