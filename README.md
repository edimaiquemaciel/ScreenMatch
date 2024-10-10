# Sistema de Busca de Filmes com OMDb API

Este projeto é um sistema de busca de filmes que utiliza a [OMDb API](http://www.omdbapi.com/) para pesquisar informações de filmes a partir do título fornecido pelo usuário. O programa solicita ao usuário o nome de um filme, realiza a consulta na API e converte os dados recebidos em objetos Java. No final, todos os filmes pesquisados são salvos em um arquivo `filmes.json`.

## Funcionalidades

- Pesquisa de filmes pelo título usando a OMDb API.
- Conversão automática dos dados JSON da API para objetos Java.
- Tratamento de erros como formato incorreto de ano e argumento inválido na busca.
- Salvamento das informações de todos os filmes pesquisados em um arquivo JSON.

## Pré-requisitos

- **Java 11** ou superior
- Biblioteca **Gson** para conversão de JSON para Java e vice-versa
- Uma chave de API válida da [OMDb API](http://www.omdbapi.com/)

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/edimaiquemaciel/ScreenMatch.git
   ```
2. Abra o projeto em sua IDE de preferência.
3. Certifique-se de que a biblioteca **Gson** está incluída no classpath. Se estiver usando Maven, adicione a dependência no `pom.xml`:

   ```xml
   <dependency>
       <groupId>com.google.code.gson</groupId>
       <artifactId>gson</artifactId>
       <version>2.8.8</version>
   </dependency>
   ```

4. Substitua a chave de API no código:
   No trecho onde a URL da API é construída, substitua o valor da chave (`apikey=SUA_CHAVE_API`) pela sua chave pessoal da OMDb API.

   ```java
   String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=SUA_CHAVE_API";
   ```

5. Compile e execute o programa.

6. O programa solicitará que você digite o nome de um filme. Após a pesquisa, o título do filme será salvo no arquivo `filmes.json`.

7. Para encerrar a pesquisa, digite `sair`.

## Estrutura do Código

O código é dividido nas seguintes partes:

1. **Entrada do Usuário**: O programa solicita que o usuário digite o nome de um filme, ou `sair` para encerrar o programa.
2. **Requisição à API**: A consulta é feita usando a biblioteca `HttpClient` para enviar uma requisição GET ao OMDb API.
3. **Tratamento da Resposta**: A resposta JSON é convertida em um objeto Java usando a biblioteca **Gson**.
4. **Tratamento de Erros**: O código trata diferentes tipos de erros como:
   - Erros de conversão de ano.
   - Erros de argumento inválido na busca.
5. **Salvamento de Dados**: Todos os filmes pesquisados são armazenados em uma lista, que ao final do programa, é salva no arquivo `filmes.json`.

## Exemplo de Execução

Ao executar o programa, ele pedirá para você inserir o nome de um filme:

```bash
Digite o nome do filme:
```

Após inserir o nome, ele retornará os detalhes do filme, por exemplo:

```bash
Titulo já convertido!
Titulo: Inception (2010)
O programa finalizou corretamente!
```

Se você digitar `sair`, o programa será encerrado e os filmes pesquisados serão salvos no arquivo `filmes.json`.

## Possíveis Melhorias

- Tratar respostas com filmes não encontrados, exibindo uma mensagem clara para o usuário.
- Melhorar a interface de entrada para aceitar múltiplas palavras no título do filme.
- Adicionar mais detalhes ao arquivo `filmes.json`, como gênero, diretor e sinopse.

## Licença

Este projeto está licenciado sob os termos da licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
```

Esse `README.md` explica como o projeto funciona, como configurar, compilar e executar, além de fornecer exemplos de saída e sugestões de melhoria. Ajuste conforme necessário para seu projeto específico.
