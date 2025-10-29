# Projeto TestaAluno - Java POO

## Objetivo
Estudo de **Programação Orientada a Objetos (POO)** em Java aplicando:
- **Herança**
- **Encapsulamento**
- **Construtores**
- **Métodos**

## Estrutura do projeto
- `Pessoa.java` → classe base com dados pessoais.
- `Aluno.java` → classe derivada de Pessoa, com matrícula, notas e faltas.
- `TestaAluno.java` → classe principal com o método main para testar as classes.

## Funcionalidades
- Exibir dados de uma pessoa.
- Exibir dados de um aluno.
- Calcular média do aluno e determinar status: **Aprovado**, **Reavaliação** ou **Reprovado**.

## Como executar
1. Abra o projeto no **IntelliJ IDEA**.
2. Compile e execute a classe `TestaAluno.java`.

## Saída do Console

```text
--- Dados da Pessoa ---
Nome: José
Endereço: Rua Antonio Marques, 30
RG: 3.698.222-8
CPF: 568.234.981-15

=========================

--- Dados do Aluno ---
Nome: Pedro
Endereço: Rua Almeida, 20
RG: 4.687.098-2
CPF: 456.876.123-12
Matrícula: 59751
Nota P1: 4.5
Nota P2: 8.0
Faltas: 10

--- Status do Aluno ---
Média: 6.25
Resultado: Exame / Reavaliação

Process finished with exit code 0
