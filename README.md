## Serviço que centraliza as requisições e faz o gateway para o backend
## twitter-client-gateway

### Build docker
- mvn install
- docker build -t twcli-gateway-docker .
- docker run --net mynet123 --ip 172.18.0.22 -d -p 8092:8092 {tag}

(twitter-client-gateway)
Tecnologias
Java 8 (rest)
Maven
Spring boot
Spring cloud

Em desenvolvimento...

Autor Leo costa - Initial work
