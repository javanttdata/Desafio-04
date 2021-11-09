<h1>RESOLUÇÃO DO DESAFIO 04 CYBERTRON :computer::books:</h1> 
_____________________________________

<h2>Prólogo: Seu objetivo durante o desafio 4 é entender o papel da camada de persistência, a abstração da linguagem dos bancos de dados criada pelas ferramentas de ORM e a partir desse entendimento ser capaz de se comunicar com qualquer tipo de banco de dados independendo da sua linguagem nativa. O seu foco durante o desafio 2 deve estar em saber implementar suas próprias classes de repositório.
Neste desafio iremos abstrair os conceitos de banco de dados.</h2>

<b>a) Com suas palavras conceitue: (máx 5 linhas/cada)</b>

<b>i. O que é JDBC?</b>
<i>R: Java Database Connectivity: é uma api dinâmica para salvar e manipular o banco de dados. Ela faz o envio de instruçõe SQL para um banco de dados relacional.</i>

<b>ii. O que é ORM, cite 3 exemplos?</b>
<i>R: Object Relational Mapper: mapeia os objetos e os relaciona com os dados que os mesmos representam. Uma das facilidades é que as tabelas são abstraídas.  Exemplos: Hibernate, ActiveJPA e Ebean.</i>

<b>iii. O que é JPA e qual é a sua relação com os ORM’s?</b>
<i>R: Java Persistence API é uma especificação de como o ORM deve ser implementado na plataforma Java. Em resumo, JPA é uma especificação e ORM é a ferramenta para mapear e relacionar objetos e dados.</i>

<b>iv. O que é Spring Data?</b>
<i>R: É um projeto do Spring que busca facilitar a implementação da camada de persistência. Entre os projetos Spring, existe o Spring Data JPA, que é um conjunto de especificações e implementações internas 
e automáticas que facilita a interação entre JPA, ORM, JDBC e, finalmente, o banco de dados. Digamos que seja a primeira camada de abstração antes de chegar até o Bando de Dados.</i>

.
.
.

<b>d) O que caracteriza um projeto “CRUD básico”? (máx 10 linhas);</b>
<i>R: O CRUD é um pattern de manipulação de dados em uma api. O acrônimo significa: C de Create - tem a função de criar uma entidade, inserindo e salvando os atributos passados. R de Read - busca no BD 
as informações previamente passadas. Pode ser uma busca geral, ou pode ser também uma busca por um parâmetro específico, como o ID. U de Update - é o método de atualizar as
informações anteriormente criadas e salvas. D de delete - como o próprio nome sugere, é o método para apagar uma inserção no BD.</i> 




