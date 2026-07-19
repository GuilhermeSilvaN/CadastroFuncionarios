# Frontend Employee

Aplicação frontend desenvolvida em React para gerenciamento de funcionários.

Este projeto faz parte de uma aplicação full stack de cadastro de funcionários e tem como objetivo fornecer uma interface para interação com os recursos disponibilizados pelo backend da aplicação.

## Sobre o projeto

O Frontend Employee é uma aplicação web desenvolvida utilizando React e Vite.

A aplicação foi estruturada para fornecer uma interface de gerenciamento de funcionários, permitindo que o usuário interaja com os dados disponibilizados pela API do sistema.

O projeto utiliza o Vite como ferramenta de desenvolvimento e build, proporcionando um ambiente rápido para desenvolvimento com Hot Module Replacement (HMR).

## Funcionalidades

A aplicação possui como objetivo oferecer funcionalidades relacionadas ao gerenciamento de funcionários, incluindo:

* Visualização de funcionários cadastrados;
* Cadastro de novos funcionários;
* Atualização de informações;
* Exclusão de funcionários;
* Integração com a API backend;
* Interface web para gerenciamento dos dados.

As funcionalidades podem ser expandidas conforme o desenvolvimento da aplicação.

## Tecnologias utilizadas

* React;
* JavaScript;
* Vite;
* HTML;
* CSS;
* ESLint;
* Node.js;
* NPM.

## Estrutura do projeto

```text
frontend-employee/
│
├── public/
│
├── src/
│   ├── components/
│   ├── pages/
│   ├── services/
│   └── ...
│
├── .gitignore
├── index.html
├── package.json
├── package-lock.json
├── vite.config.js
└── README.md
```

A aplicação possui uma estrutura baseada em componentes, característica do desenvolvimento com React. A pasta `public` contém arquivos públicos da aplicação, enquanto a pasta `src` concentra o código-fonte principal.

## Arquitetura da aplicação

O frontend funciona como uma camada de apresentação e comunicação com o backend.

```text
Usuário
   │
   ▼
Interface React
   │
   ▼
Requisições HTTP
   │
   ▼
API Backend
   │
   ▼
Banco de Dados
```

O fluxo principal da aplicação pode ser representado da seguinte forma:

```text
1. Usuário acessa a aplicação
          ↓
2. React renderiza a interface
          ↓
3. Usuário realiza uma operação
          ↓
4. Frontend envia uma requisição para a API
          ↓
5. Backend processa a solicitação
          ↓
6. Frontend recebe a resposta
          ↓
7. Interface é atualizada
```

## Comunicação com a API

A aplicação frontend é responsável por consumir os endpoints disponibilizados pelo backend.

Um fluxo de cadastro de funcionário pode ser representado da seguinte forma:

```text
Formulário
    ↓
Dados do funcionário
    ↓
Requisição HTTP
    ↓
API Backend
    ↓
Persistência no banco de dados
    ↓
Resposta da API
    ↓
Atualização da interface
```

Exemplo conceitual de uma requisição:

```javascript
const funcionario = {
    nome: "João da Silva",
    cargo: "Desenvolvedor",
    salario: 5000
};

fetch("/api/funcionarios", {
    method: "POST",
    headers: {
        "Content-Type": "application/json"
    },
    body: JSON.stringify(funcionario)
});
```

## Componentização

A aplicação utiliza o conceito de componentes do React para dividir a interface em partes menores e reutilizáveis.

Uma possível organização da aplicação é:

```text
src/
│
├── components/
│   ├── Header/
│   ├── EmployeeCard/
│   ├── EmployeeForm/
│   └── EmployeeTable/
│
├── pages/
│   ├── Home/
│   ├── Employees/
│   └── EmployeeForm/
│
├── services/
│   └── api.js
│
├── App.jsx
└── main.jsx
```

Essa abordagem facilita a manutenção do código e permite reutilizar componentes em diferentes partes da aplicação.

## Gerenciamento do estado

O React permite controlar os dados exibidos na interface por meio de estados.

Um exemplo de gerenciamento de uma lista de funcionários:

```javascript
const [funcionarios, setFuncionarios] = useState([]);
```

Após receber os dados da API, o estado pode ser atualizado:

```javascript
setFuncionarios(response.data);
```

Quando o estado é alterado, o React atualiza automaticamente os componentes que dependem desses dados.

## Vite

O projeto utiliza o Vite como ferramenta de desenvolvimento e build.

O Vite fornece:

* Servidor de desenvolvimento rápido;
* Hot Module Replacement;
* Processo de build para produção;
* Integração com React;
* Configuração simplificada.

O projeto contém o arquivo `vite.config.js` e utiliza o ecossistema de dependências definido no `package.json`.

## Como executar o projeto

### 1. Clone o repositório

```bash
git clone https://github.com/GuilhermeSilvaN/CadastroFuncionarios.git
```

### 2. Acesse a pasta do frontend

```bash
cd CadastroFuncionarios/front-employee/frontend-employee
```

### 3. Instale as dependências

```bash
npm install
```

### 4. Execute o projeto em ambiente de desenvolvimento

```bash
npm run dev
```

Após iniciar o servidor de desenvolvimento, o Vite disponibilizará a aplicação localmente.

## Scripts disponíveis

Os comandos disponíveis podem ser consultados no arquivo `package.json`.

Normalmente, projetos React com Vite utilizam comandos como:

```bash
npm run dev
```

Para iniciar o ambiente de desenvolvimento.

```bash
npm run build
```

Para gerar a versão de produção da aplicação.

```bash
npm run preview
```

Para visualizar localmente a versão de produção gerada.

## Integração com o backend

Este frontend faz parte do projeto de cadastro de funcionários e deve ser utilizado em conjunto com a API backend responsável pelo processamento das regras de negócio e persistência dos dados.

A comunicação entre as aplicações ocorre por meio de requisições HTTP.

```text
Frontend React
      │
      │ HTTP
      ▼
Backend API
      │
      ▼
Banco de Dados
```

Essa separação permite que a aplicação frontend e o backend sejam desenvolvidos e mantidos de forma independente.

## Objetivo de aprendizagem

O projeto foi desenvolvido com o objetivo de praticar e consolidar conhecimentos relacionados a:

* Desenvolvimento de aplicações React;
* Componentização;
* Gerenciamento de estado;
* Consumo de APIs REST;
* Requisições HTTP;
* JavaScript moderno;
* Vite;
* Organização de projetos frontend;
* Integração entre frontend e backend.
