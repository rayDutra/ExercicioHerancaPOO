package exercicio;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, float comprimento, int num_patas, String cor, String ambiente, float vel_media, String alimento) {
        super(nome, comprimento, num_patas, cor, ambiente, vel_media);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void dadosMamifero() {
        System.out.println("Mamífero: " + this.getNome());
        System.out.println("Comprimento: " + this.getComprimento() + " metros");
        System.out.println("Número de patas: " + this.getNum_patas());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ambiente: " + this.getAmbiente());
        System.out.println("Velocidade média: " + this.getVel_media() + " m/s");
        System.out.println("Alimento: " + this.alimento);
    }
}
