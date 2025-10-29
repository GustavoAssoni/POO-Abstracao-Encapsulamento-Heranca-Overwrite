public class Pessoa {
    private String nome;
    private String endereco;
    private String rg;
    private String cpf;

    // Construtor padrão (sem parâmetros)
    public Pessoa() {}

    // Construtor com parâmetros
    public Pessoa(String nome, String endereco, String rg, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.rg = rg;
        this.cpf = cpf;
    }

    // Método para imprimir os dados da pessoa
    public void imprimePessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
    }
}
