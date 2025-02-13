# Exercitando SQL

## Propósito do Projeto

Este projeto foi desenvolvido para aprendizado de PostgreSQL com SpringBoot e Maven. Ele utiliza um banco de dados chamado `escola` e uma tabela chamada `alunos`. O objetivo é realizar operações básicas de leitura no banco de dados e retornar os dados no formato JSON.

---

## Tecnologias Necessárias

Para rodar este projeto, você precisará das seguintes tecnologias instaladas:

- **Java 17** ou superior
- **PostgreSQL** (com um banco de dados chamado `escola` já configurado)
- **Maven** (para gerenciar as dependências)
- **IntelliJ IDEA** ou outra IDE de sua preferência

---

## Como Rodar a Aplicação no IntelliJ IDEA

1. Clone o repositório do projeto para sua máquina local.
2. Abra o projeto no IntelliJ IDEA.
3. Certifique-se de que o banco de dados PostgreSQL está rodando e que o banco `escola` foi criado.
4. Certifique-se de que a tabela `alunos` foi criada com a seguinte estrutura:
   ```sql
   CREATE TABLE alunos (
       id SERIAL PRIMARY KEY,
       nome VARCHAR NOT NULL,
       idade INT NOT NULL
   );

5. Configure o arquivo application.properties conforme descrito abaixo.
6. No IntelliJ, execute o comando Run para iniciar a aplicação.
7. Acesse o endpoint http://localhost:8080/alunos no navegador ou em um cliente HTTP (como Thundeclient) para verificar o retorno.

---

## Dependências Usadas

As dependências utilizadas no projeto são:

- spring-boot-starter-data-jpa
- spring-boot-starter-validation
- spring-boot-starter-web
- postgresql
- spring-boot-starter-test

---

## Configuração do application.properties

Certifique-se de que o arquivo application.properties está configurado corretamente:

```java
spring.application.name=exercitando-sql

spring.datasource.url=jdbc:postgresql://localhost:5432/escola
spring.datasource.username="seu username"
spring.datasource.password="sua senha"
spring.datasource.driver-class-name=org.postgresql.Driver

//Configurações do JPA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

---

## API Disponível
A aplicação possui um único endpoint para listar os alunos cadastrados no banco de dados.

### GET /alunos
Descrição: Retorna uma lista de todos os alunos cadastrados no banco de dados.
- **URL:** http://localhost:8080/alunos
- **Exemplo de Retorno JSON:**

```json
[
  {
    "id": 1,
    "nome": "Luis Silva",
    "idade": 33
  },
  {
    "id": 2,
    "nome": "Eduardo Matos",
    "idade": 20
  },
  {
    "id": 3,
    "nome": "Bruno Camacho",
    "idade": 25
  },
  {
    "id": 4,
    "nome": "Maria Santos",
    "idade": 23
  },
  {
    "id": 5,
    "nome": "Karina Evangelista",
    "idade": 31
  }
]
```
