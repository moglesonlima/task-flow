# TaskFlow - Sistema de Gerenciamento de Tarefas

O TaskFlow é um aplicativo web de código aberto para gerenciamento de tarefas, projetado para ajudar os usuários a organizar suas atividades diárias de forma eficiente. Com uma interface intuitiva e recursos robustos, o TaskFlow permite aos usuários criar, visualizar, atualizar e excluir tarefas de maneira fácil e conveniente.

## Funcionalidades Principais

- **Autenticação de Usuário:** Os usuários podem se cadastrar e fazer login para acessar suas tarefas pessoais de forma segura.
- **Gerenciamento de Tarefas:** Crie, visualize, edite e exclua tarefas de acordo com suas necessidades.
- **Ordenação e Filtro:** Ordene suas tarefas por diferentes critérios e filtre por status para uma organização eficaz.
- **Design Responsivo:** A interface do usuário é adaptável a dispositivos móveis e desktops, garantindo uma experiência consistente em todos os dispositivos.

## Tecnologias Utilizadas

- **Frontend:** HTML, CSS, JavaScript (React.js), Bootstrap
- **Backend:** Java (Spring Boot)
- **Banco de Dados:** MySQL
- **Autenticação:** JSON Web Tokens (JWT)

## Como Executar o Projeto Localmente

1. Clone este repositório:

    ```
    git clone https://github.com/moglesonlima/task-flow.git
    ```

2. Navegue até o diretório do projeto:

    ```
    cd task-flow
    ```

3. Instale as dependências do frontend e do backend:

    ```
    cd frontend
    npm install
    cd ../backend
    mvn install
    ```

4. Inicie o servidor backend:

    ```
    mvn spring-boot:run
    ```

5. Inicie o servidor frontend:

    ```
    cd ../frontend
    npm start
    ```

6. Acesse o TaskFlow em seu navegador:

    ```
    http://localhost:3000
    ```

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para enviar pull requests ou relatar problemas.

## Licença

Este projeto é licenciado sob a [Licença MIT](LICENSE).
