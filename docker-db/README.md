# Inicializando container - MySQL
**Acerca do Dockerfile**

Nele estão definidas as variáveis referentes tanto ao acesso, bem como está realizando a tarefa de aplicar as configurações iniciais do banco contidas no arquivo ``init.sql``

**Acerca do ``init.sql``**

Nele se encontram comandos SQL os quais realizaram as configurações iniciais da base de dados.

#### Comandos - Inicializar base de dados
+ Construção da imagem Docker:


    ```docker build -t mysql-tasks .```

+ Execução do container Docker:
   
    ``` docker run -d --name mysql-container -p 3306:3306 mysql-tasks```