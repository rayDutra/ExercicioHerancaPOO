package exercicio;

public class Animal {
    private String nome;
    private float comprimento;
    private int num_patas;
    private String cor;
    private String ambiente;
    private float vel_media;

    public Animal(String nome, float comprimento, int num_patas, String cor, String ambiente, float vel_media) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.num_patas = num_patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.vel_media = vel_media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getNum_patas() {
        return num_patas;
    }

    public void setNum_patas(int num_patas) {
        this.num_patas = num_patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVel_media() {
        return vel_media;
    }

    public void setVel_media(float vel_media) {
        this.vel_media = vel_media;
    }

    public void dados() {
        System.out.println("Animal: " + this.nome);
        System.out.println("Comprimento: " + this.comprimento + " metros");
        System.out.println("Número de patas: " + this.num_patas);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ambiente: " + this.ambiente);
        System.out.println("Velocidade média: " + this.vel_media + " m/s");
    }
}
