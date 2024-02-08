CREATE DATABASE IF NOT EXISTS tasks_database;
USE tasks_database;

CREATE USER 'tasks_user'@'%' IDENTIFIED BY 'tasks_password';
GRANT ALL PRIVILEGES ON tasks_database.* TO 'tasks_user'@'%';
FLUSH PRIVILEGES;
