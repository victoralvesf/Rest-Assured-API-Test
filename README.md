# Teste de API com JUnit e Rest Assured

Este é um projeto Java com Maven desenvolvido para realizar testes de uma API utilizando JUnit e Rest Assured. 

O objetivo principal é validar o comportamento da API em diferentes cenários, garantindo a integridade e a funcionalidade dos endpoints.

## Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas em sua máquina antes de executar os testes:

- Java JDK
- Maven

## Configuração do Projeto

1. Clone este repositório para sua máquina local:

```bash
git clone https://github.com/victoralvesf/Rest-Assured-API-Test
```

2. Navegue até o diretório do projeto:

```bash
cd Rest-Assured-API-Test
```

3. Execute os testes usando o Maven ou JUnit:

```bash
# Maven
mvn test
```

> **Observação:**   
> Para executar os testes usando o JUnit, é necessário abrir o projeto em alguma IDE Java.

## Estrutura do Projeto

O projeto possui a seguinte estrutura de diretórios:

- **src/main/java:** Contém classes de teste usando JUnit e Rest Assured para validar a API.
- **pom.xml:** Arquivo de configuração do Maven, especificando as dependências e configurações do projeto.

## Dependências

O projeto utiliza as seguintes dependências:

- **JUnit:** Framework de testes unitários para Java.
- **Rest Assured:** Biblioteca para testar serviços RESTful.
- **Gson:** Biblioteca para converter JSON em Objetos Java.
- **Dotenv Java:** Biblioteca para carregar variáveis de ambiente de um arquivo `.env`.

Essas dependências são gerenciadas pelo Maven e serão baixadas automaticamente durante a compilação.

___

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE). Consulte o arquivo `LICENSE` para obter mais detalhes.

