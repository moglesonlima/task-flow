# Usando uma imagem base do MySQL
FROM mysql:latest

# Definindo variáveis de ambiente para configurar a senha do root
ENV MYSQL_ROOT_PASSWORD=root_password
ENV MYSQL_DATABASE=tasks_database
ENV MYSQL_USER=tasks_user
ENV MYSQL_PASSWORD=tasks_password

# Copiando um arquivo SQL de inicialização para criar o banco de dados e um usuário
COPY ./init.sql /docker-entrypoint-initdb.d/

# Expondo a porta padrão do MySQL
EXPOSE 3306
