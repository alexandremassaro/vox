# Sistema de Controle de Produção e Consumo de Tinta

Este é um projeto de um sistema para controlar a produção e consumo de tinta de uma linha de produção de indústria automotiva, especificamente da parte de pinturas. O projeto foi desenvolvido para a disciplina de Programação Orientada a Objetos na faculdade, utilizando o padrão MVC (Model-View-Controller).

## Estrutura do Projeto

O projeto está organizado nos seguintes pacotes:

- **model**: Contém as classes que representam os dados.
- **dao**: Contém as interfaces e classes para acesso aos dados e comunicação com o banco de dados.
- **controller**: Contém as classes responsáveis pela lógica de negócios e manipulação dos dados.
- **view**: Contém as classes responsáveis pela interface com o usuário.

## Estrutura de Diretórios

```plaintext
src/
├── controller/
│   ├── LinhaProducaoController.java
│   ├── TurnoController.java
│   └── RegistroController.java
├── dao/
│   ├── LinhaProducaoDAO.java
│   ├── TurnoDAO.java
│   └── RegistroDAO.java
├── model/
│   ├── LinhaProducao.java
│   ├── Turno.java
│   └── Registro.java
└── view/
    ├── MainView.java
    ├── LinhaProducaoView.java
    ├── TurnoView.java
    └── RegistroView.java
```

## Descrição das Tabelas do Banco de Dados

O banco de dados possui três tabelas:

- **linha_producao**
  - `linha_id` (int): Identificador único da linha de produção.
  - `nome` (String): Nome da linha de produção.

- **turno**
  - `turno_id` (int): Identificador único do turno.
  - `linha_id` (int): Identificador da linha de produção associada.
  - `nome` (String): Nome do turno.

- **registro**
  - `registro_id` (int): Identificador único do registro.
  - `turno_id` (int): Identificador do turno associado.
  - `consumo` (double): Consumo de tinta no registro.
  - `producao` (double): Produção de tinta no registro.
  - `objetivo` (double): Objetivo de produção de tinta.

## Guia de Instalação

1. Clone o repositório:
    ```sh
    git clone https://github.com/alexandremassaro/vox.git
    ```

2. Navegue até o diretório do projeto:
    ```sh
    cd seu-repositorio
    ```

3. Abra o projeto em sua IDE de preferência (recomendado: IntelliJ IDEA ou Eclipse).

4. Configure a conexão com o banco de dados no arquivo `src/dao/DatabaseConnection.java` (ou similar).

5. Execute a classe `MainView` para iniciar o aplicativo.

## Contribuição

Para contribuir com o projeto:

1. Faça um fork do repositório.
2. Crie uma nova branch com a sua feature ou correção de bug:
    ```sh
    git checkout -b minha-feature
    ```
3. Faça commit das suas alterações:
    ```sh
    git commit -m 'Minha nova feature'
    ```
4. Faça push para a branch:
    ```sh
    git push origin minha-feature
    ```
5. Abra um Pull Request.

