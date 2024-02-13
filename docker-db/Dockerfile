# Use a imagem oficial do MySQL como base
FROM mysql:latest

# Defina a variável de ambiente para configurar a senha do root
ENV MYSQL_ROOT_PASSWORD=root_password

# Copie o arquivo SQL de inicialização para o diretório de inicialização do MySQL
COPY init.sql /docker-entrypoint-initdb.d/

# Exponha a porta padrão do MySQL
EXPOSE 3306
