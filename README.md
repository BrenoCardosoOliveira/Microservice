# Microservice - Catálogo de Produtos e Pedidos

Projeto de microsserviços com Spring Boot e Spring Cloud que simula um catálogo de produtos e pedidos de compra.

## Tecnologias
- Java 17
- Spring Boot
- Spring Cloud (Eureka, Gateway)
- Maven

## Microsserviços
- `product-service`: CRUD de produtos
- `order-service`: Criação de pedidos
- `service discovery`: Eureka-server
- `api-gateway`: Entrada única para os microsserviços

## Como executar
1. Suba o discovery:
   ```bash
   cd service discovery && mvn spring-boot:run
   ````
2. Inicie os serviços:
    ```bash
    cd product-service && mvn spring-boot:run
    cd order-service && mvn spring-boot:run
    cd api-gateway && mvn spring-boot:run
    ```
Exemplo de requisições
- `POST /products` → Cadastra produto

- `GET /products` → Lista produtos

- `POST /orders` → Cria pedido
