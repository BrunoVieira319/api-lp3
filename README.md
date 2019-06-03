# Trabalho Final LP3
With Gradle: <code>./gradlew build && ./gradlew bootRun</code> <br/>
With Docker: <code>sudo docker-compose up</code> <br/>
Endpoint: <code>localhost:8080/info</code>

Este trabalho consistirá na criação de um agregador, ou seja, iremos criar uma
API que irá agregar dados de outras fontes.
Um caso bastante comum na indústria é a necessidade de um cliente
consultar dados que estão espalhados em diversas fontes. Para facilitar a
catpura destes dados utiliza-se agregadores, que são um mecanismo
intermediário – entre o cliente e as fontes de dados – e que são responsáveis
por consultar as diversas fontes, agregar os dados, e retornar o dado já
processado para o cliente.
Para isso, iremos criar uma API REST com um único endpoint, e este
endpoint deve retornar um dado estruturado no formato JSON que é a
agregação dos dados das diversas fontes.

As APIs consultadas no trabalhos são: 
1) https://advisor.climatempo.com.br
Este serviço expõe uma API para consulta de dados de meteorologia de uma
determinada cidade ou região.
2) https://api.github.com/zen
Este endpoint retorna uma frase diferente a cada consulta.
3) https://lp3-secret.herokuapp.com/
Este endpoint retornará um dado secreto para cada estudante, porém ele é
protegido por um usuário e senha (que será fornecida em separado). O
mecanismo de autenticação que deve ser usado é o Basic Authorization.
