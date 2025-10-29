public class Aluno extends Pessoa {
    private int matricula;
    private double N1;
    private double N2;
    private int faltas;

    private final double MEDIA_APROVACAO = 7.0;
    private final double MEDIA_REPROVACAO = 3.0;

    // Construtor padrão (sem parâmetros)
    public Aluno() {}

    // Construtor com parâmetros
    public Aluno(String nome, String endereco, String rg, String cpf,
                 int matricula, double N1, double N2, int faltas) {
        super(nome, endereco, rg, cpf);
        this.matricula = matricula;
        this.N1 = N1;
        this.N2 = N2;
        this.faltas = faltas;
    }

    // Imprime todos os dados do aluno (inclusive os da classe Pessoa)
    public void imprimeAluno() {
        imprimePessoa();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota P1: " + N1);
        System.out.println("Nota P2: " + N2);
        System.out.println("Faltas: " + faltas);
    }

    // Imprime somente as faltas
    public void imprimeFaltas() {
        System.out.println("Faltas: " + faltas);
    }

    // Calcula média e mostra resultado
    public void resultado() {
        double media = (N1 + N2) / 2;
        System.out.println("Média: " + media);

        if (media >= MEDIA_APROVACAO) {
            System.out.println("Resultado: Aprovado");
        } else if (media < MEDIA_REPROVACAO) {
            System.out.println("Resultado: Reprovado");
        } else {
            System.out.println("Resultado: Exame / Reavaliação");
        }
    }
}
