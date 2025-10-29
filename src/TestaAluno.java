public class TestaAluno {
    public static void main(String[] args) {

        // Criando e imprimindo dados da pessoa
        Pessoa p1 = new Pessoa("José", "Rua Antonio Marques, 30", "3.698.222-8", "568.234.981-15");
        System.out.println("--- Dados da Pessoa ---");
        p1.imprimePessoa();

        System.out.println("\n=========================\n");

        // Criando e imprimindo dados do aluno
        Aluno a1 = new Aluno("Pedro", "Rua Almeida, 20", "4.687.098-2", "456.876.123-12",
                59751, 4.5, 8.0, 10);

        System.out.println("--- Dados do Aluno ---");
        a1.imprimeAluno();

        System.out.println("\n--- Status do Aluno ---");
        a1.resultado();
    }
}
