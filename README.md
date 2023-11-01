# PicPay Simplifik

## Descrição

Este projeto é uma implementação inspirada no PicPay, onde dois tipos de usuários, comuns e lojistas, têm carteiras com dinheiro e podem realizar transferências entre eles. O projeto enfatiza o fluxo de transferência entre dois usuários, com a validação de saldo antes da transferência e a consulta a um serviço autorizador externo para garantir a segurança das transações.

## Requisitos do Projeto

- Cadastro de usuários com Nome Completo, CPF, e-mail e Senha, garantindo que CPF/CNPJ e e-mails sejam únicos no sistema.
- Transferência de dinheiro entre usuários e para lojistas.
- Lojistas apenas recebem transferências e não enviam dinheiro para ninguém.
- Validação de saldo antes da transferência.
- Consulta a um serviço autorizador externo para garantir a segurança das transações.
- Todas as transferências são tratadas como transações para garantir reversibilidade em caso de inconsistências, com retorno do dinheiro para a carteira do usuário que envia.


## Tecnologias Utilizadas

- Java
- Spring (API RESTful)
- Hibernate (ORM)
- Postman

## Instalação e Uso

- Clone este repositório.
- Configure um ambiente Java e Spring compatível.
- Importe o projeto em sua IDE favorita.
- Execute o aplicativo.
- Use o Postman ou qualquer outra ferramenta de teste de API para interagir com o sistema.

## Contribuição

Contribuições são bem-vindas! Se você deseja melhorar este projeto, abra uma solicitação de pull (Pull Request) e revisarei seu código.



