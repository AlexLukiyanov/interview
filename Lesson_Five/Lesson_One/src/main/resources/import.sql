DROP TABLE students IF EXISTS;

CREATE TABLE IF NOT EXISTS students (id bigserial, name VARCHAR(255), mark int, PRIMARY KEY (id));
INSERT INTO students (name, mark) VALUES ('Bob', 10), ('Jack', 80);