# spring-in-action
Repository with notes and codes about Spring in Action book

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
  - Poderiamos ter anotado a classe de outras formas, mas optar pelo `@Controller` é mais descrito e semântico, delimita bem qual o papel da classe dentro do sistema
