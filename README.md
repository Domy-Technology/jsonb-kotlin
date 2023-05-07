# Examplo de Uso de JSONB com Kotlin + Spring JPA

## Spring JPA

Na versao 6 do Kibernate foi adicionada a anotacao `@JdbcTypeCode(SqlTypes.JSON)` que facilita muit para trabalhar com JSONB do Postgres

## Para Testar

Basta executar o comando `docker compose up -d` na raiz do projeto para que o container do Postgres seja iniciado, caso ja tenha o Postgres instalado em sua maquina, basta atualizar as credenciais no arquivo [application.yaml](src/main/kotlin/resources/application.yaml)

## Collection Insomia

Na pasta `assets` existe uma collection que pode ser importada no Insomnia para testes.

