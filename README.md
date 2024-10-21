# Address Finder API

## Descrição

Este é um projeto de uma API para consulta de endereços utilizando um CEP (Código de Endereçamento Postal) como chave de busca. O projeto é desenvolvido em **Java** com o framework **Spring Boot** e utiliza **WireMock** para simular as respostas de APIs externas com base em CEPs mockados. O código segue os princípios de **SOLID** e boas práticas de programação.

O projeto também implementa o log de consultas realizadas, armazenando os dados de cada requisição em um banco de dados.

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database**
- **Docker**
- **WireMock**
- **Maven**

## Estrutura do Projeto

- `com.finder.address`: Contém os pacotes com a lógica da aplicação.
  - `controller`: Define os endpoints da API.
  - `service`: Contém a lógica de negócio para consulta e armazenamento dos dados.
  - `repository`: Interface para realizar operações no banco de dados.
  - `model`: Classes de domínio do projeto, incluindo o DTO (Data Transfer Object) e as entidades de log.
  - `dto`: Definição dos Data Transfer Objects (DTOs) usados na API.
  - `config`: Configurações gerais do projeto, incluindo o Docker e WireMock.
  
## Endpoints

A API possui os seguintes endpoints:

### Consulta de CEP

- **GET** `/api/address/{zipcode}`

  Realiza a busca do endereço de acordo com o CEP informado.
