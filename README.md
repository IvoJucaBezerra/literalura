
 ![BADGE RECEBIDA](https://github.com/IvoJucaBezerra/literalura/blob/main/img/badge%20literalura.png)

# CHALLENGE LITERALURA

1 - INICIANDO PROJETO:
Usando [SPRING BOOT](https://start.spring.io/) criei um projeto com:
* Java
* Maven como gerenciador de dependências
* Spring Boot 3.3.1
* Packaging JAR

2 - Criando pacotes:
* Dentro de br.com.alura.literalura vamos criar os seguintes pacotes:
* model - com as classes: Autor, Livro e LivroService; as records com: Dados, DadosAutor e DadosLivro e por fim um Enum de idiomas;
* service - classes: ConsumoApi e ConverteDados e uma interface: IConverteDados;
* repository - criei duas interfaces: AutorRepository e LivroRepository;
* principal - classe Principal;

3 - Analisando o formato da resposta Json da API https://gutendex.com/ , veremos as necessidades para modelagem e desserialização dos dados
e criamos a classe ConsumoApi. Adicionamos o Jackson no arquivo pom.xml. A biblioteca Jackson é uma poderosa ferramenta Java para processamento de dados JSON. 
Ela é amplamente utilizada para serializar objetos Java em JSON e desserializar JSON em objetos Java. 
Jackson é conhecida por sua eficiência, flexibilidade e facilidade de uso.

    <dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
			<version>2.15.2</version>
		</dependency>

https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind

4 - Na classe Principal implantamos o exibeMenu para interação com o usuário por linha de comando. Usando Switch case colocamos algumas opções para escolha no Menu.
5 - Criamos o Repository para persistir os dados usando o https://www.postgresql.org/ , para isso instale o banco de dados e crie a senha. 
Também devemos criar o banco que vamos usar no projeto. Usei liter_alura. (É importante criar direto no PGAdmin do PostgreSQL).

6 - Adicionar no pom.xml as dependências para trabalhar com JPA e a do Postgre: 

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>

		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<scope>runtime</scope>
		</dependency>




  Autor do projeto> Ivo Jucá 
  
  Se conecte comigo no LinkedIn https://www.linkedin.com/in/ivo-juca-bezerra/
  

