### Docker build

```shell
./gradlew :microservices:product-service:build
cd microservices/product-service
docker build -t product-service .
docker run --rm -p8080:8080 -e "SPRING_PROFILES_ACTIVE=docker" product-service
or
docker run -d -p8080:8080 -e "SPRING_PROFILES_ACTIVE=docker" --name my-prd-srv product-service

docker logs my-prd-srv -f

docker rm -f my-prd-srv
```

### Docker Compose
```shell
./gradlew build
docker-compose build
docker-compose up -d
docker-compose logs -f
docker-compose down
```

### Docker Test Script
```shell
./gradlew clean build && docker-compose build && ./test-em-all-02-docker.bash start stop
```

### Swagger Test
```shell
./gradlew build && docker-compose build && docker-compose up
```

Swagger 페이지 방문
`http://localhost:8080/openapi/swagger-ui.html`

