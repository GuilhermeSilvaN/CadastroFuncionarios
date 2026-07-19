# Cadastro de Funcionários

Sistema web desenvolvido para o gerenciamento de funcionários.

O projeto é composto por uma aplicação frontend, responsável pela interface utilizada pelo usuário, e uma API backend, responsável pelo processamento das informações e comunicação com o banco de dados.

## Sobre o projeto

O sistema permite realizar operações básicas de gerenciamento de funcionários, como:

* Cadastrar funcionários;
* Visualizar funcionários cadastrados;
* Atualizar informações;
* Excluir registros.

A aplicação foi desenvolvida como um projeto full stack, integrando uma interface web com uma API responsável pelo gerenciamento dos dados.

## Tecnologias utilizadas

### Frontend

* React;
* JavaScript;
* Vite;
* HTML;
* CSS.

### Backend

* Java;
* Spring Boot;
* Spring Data JPA;
* Maven.

## Estrutura do projeto

```text
CadastroFuncionarios/
│
├── api-employee/
│   └── Backend da aplicação
│
└── front-employee/
    └── Interface da aplicação
```

## Funcionamento

O usuário interage com a interface do sistema. As ações realizadas, como cadastrar ou consultar um funcionário, são enviadas para a API.

A API processa essas informações e realiza a comunicação com o banco de dados.

```text
Usuário
   ↓
Interface Web
   ↓
API
   ↓
Banco de Dados
```

## Como executar

Para executar o projeto, é necessário iniciar separadamente o frontend e a API.

### Frontend

```bash
cd front-employee/frontend-employee
npm install
npm run dev
```

### Backend

```bash
cd api-employee
./mvnw spring-boot:run
```

No Windows, pode ser utilizado:

```bash
mvnw.cmd spring-boot:run
```

## Objetivo

O projeto foi desenvolvido para praticar conceitos de desenvolvimento full stack, integração entre frontend e backend, criação de APIs e gerenciamento de dados.

## Autor

Desenvolvido por **Guilherme Silva**.

## Licença

Este projeto foi desenvolvido para fins de estudo e prática de desenvolvimento de software.

