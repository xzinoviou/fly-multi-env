# Fly-Multi-Env

 A small Spring Boot project showing how to manage different environments with flyway

---

Project was created with the following requirements:

- Java 17+
- Docker & Docker compose
- Image of `Postgresql 12.2`

---

You will also need to create the following list of env variables (or declare your own based on the environments you will create) 
and replace the asterisks by providing values.


```shell
#common
POSTGRES_DB_SCHEMA=******

#dev
POSTGRES_USER=******
POSTGRES_PASSWORD=******
POSTGRES_DB=******
POSTGRES_PORT=******
POSTGRES_URL=jdbc:postgresql://localhost:${POSTGRES_PORT}/${POSTGRES_DB}

#test
TEST_POSTGRES_USER=******
TEST_POSTGRES_PASSWORD=******
TEST_POSTGRES_DB=test_******
TEST_POSTGRES_PORT=******
TEST_POSTGRES_URL=jdbc:postgresql://localhost:${TEST_POSTGRES_PORT}/${TEST_POSTGRES_DB}
```

Alternatively you can supply an `.env` file with the variables in the root directory of the project.
I use IDEA Intellij from https://www.jetbrains.com/idea/ and the plugin EnvFile (https://plugins.jetbrains.com/plugin/7861-envfile/) comes really handy and easy to use.

---

You are also provided ( check the docker folder ) with a set of docker-compose files for the creation of the project infrastructure.
