# Sistema Produtos - Exercício sobre polimorfismo e Herança

Projeto desenvolvido como exercício do curso de Java do professor Nélio Alves, focando nos conceitos de polimorfismo entre classes, herança e boas práticas de orientação a objetos.

## Funcionalidades

-  Cadastro de produto, verificando se é comum, importado ou usado
-  impressão da tag do produto com suas diferenças (polimorfismo)-  

  ## Conceitos Aplicados

   - Henraça (Classe importedProduct e UsedProduct)
   - Encapsulamento com getters e setters
   - Polimorfismo (priceTag())

## Tecnologias Utilizadas

   - Java SE

   - Git/GitHub

   - Markdown (documentação)

##  Como Executar

### Pré-requisitos

- Java JDK 21 ou superior
- Git (para clonar o repositório)

### Passo a Passo
Pode utilizar uma IDE como Intellij ou VSCode

ou

1. **Clone o repositório:**
```bash
git clone https://github.com/MarcosJuniorDev/ExercicioComposicaoJava.git
cd ExercicioComposicaoJava
```
2. **Compile o projeto e execute a aplicação**
```bash
javac -d bin src/entities/*.java src/enums/*.java src/*.java
java -cp bin Main
```
