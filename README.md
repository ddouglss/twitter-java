
![Java](https://img.shields.io/badge/language-Java-yellow)
![License](https://img.shields.io/badge/license-MIT-blue)


# 🛡️ Spring Security 6 + JWT + MySQL

Este projeto é um backend seguro inspirado na estrutura do Twitter, desenvolvido com foco em **boas práticas de segurança** utilizando o **Spring Security 6**. A autenticação e autorização são feitas por meio de **tokens JWT**, garantindo uma aplicação **100% stateless**, ideal para ambientes modernos e escaláveis.

A aplicação implementa controle de acesso com **roles de usuário** (`USER` e `ADMIN`), protegendo rotas com base nas permissões apropriadas. A persistência dos dados é feita via **banco de dados MySQL**, executado em ambiente isolado através do **Docker**.

---

## 🔐 Tecnologias e funcionalidades

- ✅ Spring Boot + Spring Security 6
- ✅ Autenticação e autorização com JWT (stateless)
- ✅ Geração e uso de chave pública/privada para tokens JWT
- ✅ Controle de acesso com roles (`ROLE_USER`, `ROLE_ADMIN`)
- ✅ Boas práticas de segurança para APIs REST
- ✅ Integração com banco de dados MySQL via Docker

---

## ✅ Funcionalidades

- [PUBLIC] Criar novo usuário
- [PUBLIC] Login com geração de token JWT
- [ADMIN] Listar todos os usuários
- [PRIVATE] Criar tweet (autenticado)
- [PRIVATE] Deletar tweet (autenticado)
- [PUBLIC] Listar tweets (feed público)

---

## 🚀 Tarefas Realizadas

- Iniciar projeto com dependências:
  - Spring Web, Spring Security, OAuth2 Resource Server, Spring Data JPA, MySQL Driver
- Criar entidades: `User`, `Role`, `Tweet`
- Criar repositórios JPA
- Configurar autenticação e autorização com JWT
- Gerar par de chaves pública e privada para o token
- Criar funcionalidades públicas e protegidas
- Automatizar criação do admin e roles no startup
- Testar endpoints e segurança

---

## 🐳 Como rodar com Docker

1. Subir banco MySQL com Docker:

```bash
docker run --name mysql-secure -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=twitter_clone -p 3306:3306 -d mysql:8.0
```

2. Rodar aplicação Spring Boot normalmente.

---

## 🧪 Testes

A API pode ser testada com ferramentas como **Postman** ou **Insomnia**, utilizando o token JWT retornado no login para acessar rotas privadas e administrativas.

---

## 📄 Licença

Este projeto está licenciado sob a licença MIT.

## ✍️ Autor

**Douglas Souza Silva**  
Estudante e desenvolvedor Java em constante aprendizado.  
[LinkedIn](https://www.linkedin.com/ddouglss) • [GitHub](https://github.com/ddouglss)

---
> _Este repositório acompanha a evolução prática do conteúdo abordado no curso, com foco em aprendizado sólido e aplicação no mundo real._
