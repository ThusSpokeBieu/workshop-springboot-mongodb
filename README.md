# Workshop: Springboot MongoDB
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

This project was developed during a java course of @DevSuperior with only academic goals: apply and improve the acquired knowledge.

It was inspired by @acenelio [project](https://github.com/acenelio/workshop-springboot2-mongodb).

The following technologies were used for learning proposal:
- Java
- Springboot
- Maven
- MongoDB and MongoDBCompass
- Postman
- Lombok
- MapStruct
- jQuery
 
## Requirements
- [Java Runtime Environment](https://www.java.com/pt-BR/download/) (JRE) v8 or higher
- [Apache Maven](https://maven.apache.org/)
- [MongoDB and MongoDBCompass](https://www.mongodb.com/)
- A application for API testing for HTTP requests, such as [Postman](https://www.postman.com/), you can use a web browser for it too.

## Building/Installation

Use maven for install the repository and all dependencies.

## Running

Run WorkshopmongodbApplication.
Then you can access the database using the local port 8080:

http://localhost:8080/users<br>
http://localhost:8080/posts

You can access a specific user or post by /<b>{id}</b>.<br>

```bash
Example:
http://localhost:8080/users/636958fa2dfdd9718aafbe01
```

You can do simple queries for a specific post by title with /titlesearch?text=<b>{textToSearch}</b>.<br>

```bash
Example
http://localhost:8080/posts/titlesearch?text=good
```

You can also do full queries in post with /fullsearch?text=<b>{textToSearch}</b>&minDate=<b>{yyyy-MM-dd}</b>&maxDate=<b>{yyyy-MM-dd}</b>.<br>
```bash
Example
http://localhost:8080/posts/fullsearch?text=see%20ya%20soon&minDate=2015-01-15&maxDate=2022-11-08
```

