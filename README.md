# spring-in-action
Repository with notes and codes about Spring in Action book

[Errata](https://manning-content.s3.amazonaws.com/download/2/cf76b1d-f831-4318-94aa-dc804d49f77c/Walls7_SpringIA_5E_err1.html)
[Repositorio do livro](https://github.com/habuma/spring-in-action-5-samples)

### Ler depois

- [SLF4J](https://www.slf4j.org/)
- [Spring validation](https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#validation)

### Capítulo 1

- É comentado sobre a tag `<packaging>...</packaging>` no pom.xml. No initializer que eu fiz não veio com essa tag. Acredito que isso não seja totalmente importante por enquanto.
- A anotação `@SpringBootApplication` combina o uso de três anotações ao mesmo tempo:
  - `@SpringBootConfiguration` que serve para marcar uma classe como de configuração, semelhante a anotação `@configuration`
  -  `EnableAutoConfiguration` como o nome já sugere, ela diz ao Spring boot para configurar automáticamente
  - `ComponentScan` como o nome já sugere, faz com que o spring procure por outras classes importantes, com as anotaçãoes `@Controller`, `@Servlet` ou qualquer outro componente que possa ser registrado.
- A anotação `@RunWith` pertence ao JUnit. Com ela definimos quem será o test runner da nossa aplicação que guiara a execução dos testes
- A anotação `@Controller` vai fazer as seguintes coisas:
  - Identifica a classe como um componente, para ser encontrada durante o ComponentScan
  - Uma instância desse componente é criada
  - Esse bean ficará a disposição, dentro do contexto da aplicação
  - Poderiamos ter anotado a classe de outras formas, mas optar pelo `@Controller` é mais descrito e semântico. delimita bem qual o papel da classe dentro do sistema  
- Não precisamos fazer deploy da aplicação dentro do Tomcat, é considerado que o tomcat fazer parte dela... Isso faz sentido?
- O nosso fluxo de desenvolvimento para essa primeira página foi o seguinte:
  1. Criamos um novo projeto utilizando o spring initializer
  2. Criamos um controller que irá atender a requisição para a página principal
  3. Criamos uma view para renderizar a página principal
  4. Criamos um teste que faz um request para o controller da nossa página principal, verifica se tudo está conforme esperado.
- A quantidade de código relacionado com o framework que teremos que escrever (estrutura, configuração e etc) será muito pequena, comparado as funcionalidades.

### Capítulo 2

Tipos de anotações que posso usar para mapear requisições:

- `@RequestMapping`:	General-purpose request handling
- `@GetMapping`:	Handles HTTP GET requests
- `@PostMapping`:	Handles HTTP POST requests
- `@PutMapping`:	Handles HTTP PUT requests
- `@DeleteMapping`:	Handles HTTP DELETE requests
- `@PatchMapping`:	Handles HTTP PATCH requests

É preferível usar o `RequestMapping` a nível da classe, e os mapeamentos mais específicos nos métodos.

Para acessar a minha primeira página basta acessar `locahost:8080/`, não precisa colocar o context-name da aplicação.

Posso desabilitar o caching dos templates, basta adicionar o seguinte no `application.properties`: `spring.thymeleaf.cache=false
`
