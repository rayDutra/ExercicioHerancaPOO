package exercicio;

public class Peixe extends Animal {
    private String caracteristica;

    public Peixe(
    	String nome, float comprimento, int num_patas, String cor, String ambiente, float vel_media, String caracteristica) {
        super(nome, comprimento, num_patas, cor, ambiente, vel_media);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public void dadosPeixe() {
        System.out.println("Peixe: " + this.getNome());
        System.out.println("Comprimento: " + this.getComprimento() + " metros");
        System.out.println("Número de patas: " + this.getNum_patas());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ambiente: " + this.getAmbiente());
        System.out.println("Velocidade média: " + this.getVel_media() + " m/s");
        System.out.println("Característica: " + this.caracteristica);
    }
}
