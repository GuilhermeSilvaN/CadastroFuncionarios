# API Employee

API REST desenvolvida em Java com Spring Boot para gerenciamento de funcionários.

Este projeto faz parte de uma aplicação full stack de cadastro de funcionários e é responsável pelo processamento das regras de negócio, exposição dos endpoints da API e comunicação com o banco de dados.

## Sobre o projeto

A API Employee foi desenvolvida para fornecer os recursos necessários para o gerenciamento de funcionários de uma aplicação.

O backend funciona como uma camada intermediária entre o frontend e o banco de dados, recebendo requisições HTTP, processando as operações solicitadas e retornando respostas para a aplicação cliente.

A aplicação utiliza o ecossistema Spring Boot e o Maven como ferramenta de gerenciamento e construção do projeto.

## Funcionalidades

A API possui como objetivo fornecer operações relacionadas ao gerenciamento de funcionários, incluindo:

* Cadastro de funcionários;
* Consulta de funcionários;
* Atualização de dados;
* Exclusão de funcionários;
* Exposição de endpoints REST;
* Comunicação com o banco de dados;
* Processamento das regras de negócio da aplicação.

## Tecnologias utilizadas

* Java;
* Spring Boot;
* Spring Web;
* Spring Data JPA;
* Hibernate;
* Maven;
* Banco de dados relacional;
* Git e GitHub.

## Estrutura do projeto

```text
api-employee/
│
├── .mvn/
│   └── wrapper/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   │
│   └── test/
│
├── .gitattributes
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

A pasta `src` concentra o código-fonte da aplicação. O arquivo `pom.xml` é responsável pelo gerenciamento das dependências e configurações do projeto Maven. O projeto também utiliza o Maven Wrapper, permitindo executar comandos Maven sem a necessidade de uma instalação global do Maven.

## Arquitetura da aplicação

A aplicação segue uma arquitetura baseada na separação de responsabilidades entre as principais camadas do backend.

```text
Cliente
   │
   ▼
Controller
   │
   ▼
Service
   │
   ▼
Repository
   │
   ▼
Banco de Dados
```

Cada camada possui uma responsabilidade específica dentro da aplicação.

### Controller

Responsável por receber as requisições HTTP e disponibilizar os endpoints da API.

Exemplo conceitual:

```text
POST    /employees
GET     /employees
GET     /employees/{id}
PUT     /employees/{id}
DELETE  /employees/{id}
```

### Service

Responsável por concentrar as regras de negócio da aplicação.

Essa camada processa os dados recebidos pelos controllers e define como as operações devem ser executadas.

### Repository

Responsável pela comunicação com o banco de dados.

Utilizando o Spring Data JPA, essa camada permite realizar operações de persistência sem a necessidade de escrever manualmente todas as consultas SQL.

### Entity

Representa as entidades persistidas no banco de dados.

A entidade relacionada aos funcionários representa os dados que serão armazenados e manipulados pela aplicação.

## Fluxo de uma requisição

O funcionamento de uma requisição pode ser representado da seguinte forma:

```text
Frontend
   │
   │ Requisição HTTP
   ▼
Controller
   │
   ▼
Service
   │
   ▼
Repository
   │
   ▼
Banco de Dados
   │
   ▼
Repository
   │
   ▼
Service
   │
   ▼
Controller
   │
   ▼
Frontend
```

Por exemplo, ao cadastrar um funcionário:

```text
1. Usuário preenche o formulário
          ↓
2. Frontend envia uma requisição POST
          ↓
3. Controller recebe os dados
          ↓
4. Service processa a operação
          ↓
5. Repository salva os dados
          ↓
6. Banco de dados armazena o funcionário
          ↓
7. API retorna uma resposta HTTP
          ↓
8. Frontend atualiza a interface
```

## API REST

A aplicação disponibiliza recursos por meio do protocolo HTTP.

As principais operações utilizadas seguem os princípios do CRUD.

### Create

Responsável pelo cadastro de um novo funcionário.

```http
POST /employees
```

Exemplo de dados enviados:

```json
{
    "nome": "João da Silva",
    "cargo": "Desenvolvedor",
    "salario": 5000
}
```

### Read

Responsável pela consulta dos funcionários cadastrados.

```http
GET /employees
```

Para buscar um funcionário específico:

```http
GET /employees/{id}
```

### Update

Responsável pela atualização dos dados de um funcionário.

```http
PUT /employees/{id}
```

### Delete

Responsável pela exclusão de um funcionário.

```http
DELETE /employees/{id}
```

## Persistência de dados

A aplicação utiliza o Spring Data JPA para realizar a comunicação com o banco de dados.

O fluxo de persistência é:

```text
Objeto Java
     ↓
JPA / Hibernate
     ↓
SQL
     ↓
Banco de Dados
```

O Hibernate atua como uma implementação de JPA, realizando o mapeamento entre as entidades Java e as tabelas do banco de dados.

Esse processo é conhecido como ORM (Object-Relational Mapping).

## Maven

O projeto utiliza Maven para gerenciamento de dependências e construção da aplicação.

As dependências utilizadas pelo projeto são definidas no arquivo:

```text
pom.xml
```

O projeto também possui o Maven Wrapper:

```text
mvnw
mvnw.cmd
```

Isso permite executar o projeto utilizando os comandos Maven sem depender necessariamente de uma instalação global do Maven.

## Como executar o projeto

### 1. Clone o repositório

```bash
git clone https://github.com/GuilhermeSilvaN/CadastroFuncionarios.git
```

### 2. Acesse a pasta da API

```bash
cd CadastroFuncionarios/api-employee
```

### 3. Execute a aplicação

No Windows:

```bash
mvnw.cmd spring-boot:run
```

No Linux ou macOS:

```bash
./mvnw spring-boot:run
```

Também é possível executar a aplicação diretamente pela IDE, utilizando a classe principal do projeto Spring Boot.

## Integração com o frontend

A API foi desenvolvida para ser consumida pela aplicação frontend do projeto.

A arquitetura completa pode ser representada da seguinte forma:

```text
┌────────────────────┐
│     Frontend       │
│      React         │
└─────────┬──────────┘
          │
          │ HTTP / JSON
          ▼
┌────────────────────┐
│    API Employee    │
│    Spring Boot     │
└─────────┬──────────┘
          │
          │ JPA / Hibernate
          ▼
┌────────────────────┐
│     Database       │
└────────────────────┘
```

Essa arquitetura permite separar a interface da aplicação das regras de negócio e da persistência de dados.

## Organização das responsabilidades

A separação entre as camadas permite uma melhor organização do código:

```text
Controller
    ↓
Responsável pela comunicação HTTP

Service
    ↓
Responsável pelas regras de negócio

Repository
    ↓
Responsável pela persistência

Entity
    ↓
Representação dos dados
```

Essa abordagem facilita a manutenção, a evolução e a realização de testes na aplicação.

## Objetivo de aprendizagem

O projeto foi desenvolvido com o objetivo de praticar e consolidar conhecimentos relacionados a:

* Desenvolvimento de APIs REST;
* Java;
* Spring Boot;
* Spring Data JPA;
* Hibernate;
* Arquitetura em camadas;
* Operações CRUD;
* Persistência de dados;
* Banco de dados relacionais;
* Integração entre frontend e backend;
* Gerenciamento de dependências com Maven.

