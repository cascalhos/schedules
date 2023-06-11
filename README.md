# Microsserviço Agendamento

## Objetivo
Microsserviço com objetivo de cuidar do agendamento de procedimentos estéticos

## Como rodar a aplicação teste
Esse é apenas um teste pra rodar um hello Word ao acessar nossa aplicação

**Não precisa baixar o repositório em sua máquina!**

* Digite o seguinte comando no terminal para subir a aplicação:

Primeiro baixe a imagem:
```bash
docker pull thamipontes/agendamento:latest
```
Segundo rode o container
```bash
docker run -p 8080:8080 thamipontes/agendamento:latest
```
Terceiro chame o endpoint no browser 

http:localhost:8080/hello-word

Para consultar os endpoints, basta acessar nosso Swagger: http://localhost:8080/swagger-ui/index.html
