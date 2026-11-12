# Roteiro04
# Sistema de Gerenciamento de Reservas de Hotel


Este projeto consiste em um sistema para gestão de reservas hoteleiras, desenvolvido como roteiro prático da disciplina de Programação Orientada a Objetos (POO). O objetivo central é a aplicação de conceitos de persistência, interfaces gráficas e lógica de objetos em Java.

---

## Funcionalidades

- **Cadastro de Hóspedes:** Registro de nome, documento (CPF ou Passaporte), contato e endereço.
- **Cadastro de Quartos:** Registro de número, tipo (Simples, Duplo, Suíte) e preço por noite.
- **Gestão de Reservas:** Associação entre hóspede e quarto com definição de períodos de estadia.
- **Navegação Dinâmica:** Uso de janelas modais (`JDialog` com `modal = true`) para seleção de entidades, garantindo a integridade do fluxo de reserva através de telas como `DlgSelecionarHospede` e `DlgSelecionarQuarto`.

---

## Especificações Técnicas

- **Fundamentos de POO:** Implementação obrigatória de métodos essenciais (`construtores`, `equals`, `hashCode` e `toString`) e gerenciadores de classe.
- **Interface Gráfica (GUI):** Desenvolvida em Java Swing com foco em interatividade e chamadas dinâmicas entre telas.
- **Persistência de Dados:** Implementação de serialização para salvamento em arquivos (`CSV`, `JSON` ou `XML`) via classe `FilePersistence` e suas respectivas especializações de formato.

---

## Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/lgrodriguess/NOME_DO_REPOSITORIO.git
```

2. Abra o projeto em uma IDE Java, como:

- IntelliJ IDEA
- Eclipse
- NetBeans

3. Compile e execute a classe principal do projeto.

---

## Tecnologias Utilizadas

- Java
- Java Swing
- Programação Orientada a Objetos (POO)
- Serialização de Dados

---

## Membros

- [Luan Gabriel Rodrigues Longo](https://github.com/lgrodriguess)
- [Vitor Pereira dos Reis](https://github.com/Vitor-PdosReis)

---
