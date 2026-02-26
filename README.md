📌 Backend – API Projects

API REST desenvolvida com Java + Spring Boot para gerenciamento de projetos.

🚀 Tecnologias Utilizadas

☕ Java 17+

🌱 Spring Boot

🗄 Spring Data JPA

🐘 PostgreSQL

🔄 Maven

🔐 Spring Validation

🌍 CORS Configuration

📂 Estrutura do Projeto
src/main/java/com/seuprojeto
 ├── controller
 ├── service
 ├── repository
 ├── domain (entity)
 ├── dto
 ├── config
 └── exception
⚙️ Configuração do Banco de Dados
application.yml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/projects_db
    username: postgres
    password: postgres
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        format_sql: true
🗄 Script de Banco (PostgreSQL)
CREATE DATABASE projects_db;

CREATE TABLE projects (
    id SERIAL PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    description TEXT,
    start_date DATE NOT NULL,
    end_date DATE,
    status VARCHAR(30) NOT NULL
);
▶️ Como Executar
1️⃣ Clonar o projeto
git clone https://github.com/seu-usuario/projects-api.git
cd projects-api
2️⃣ Subir o PostgreSQL

Via Docker:

docker run --name postgres-projects \
  -e POSTGRES_DB=projects_db \
  -e POSTGRES_USER=postgres \
  -e POSTGRES_PASSWORD=postgres \
  -p 5432:5432 \
  -d postgres
3️⃣ Rodar a aplicação
mvn spring-boot:run

Ou:

./mvnw spring-boot:run

A API ficará disponível em:

http://localhost:8080
📡 Endpoints
🔹 Criar Projeto
POST /api/projects

Body:

{
  "name": "Sistema ERP",
  "description": "Projeto interno",
  "startDate": "2026-02-01",
  "endDate": "2026-06-01",
  "status": "PLANNED"
}
🔹 Listar Projetos
GET /api/projects
🔹 Buscar por ID
GET /api/projects/{id}
🔹 Atualizar Projeto
PUT /api/projects/{id}
🔹 Deletar Projeto
DELETE /api/projects/{id}
