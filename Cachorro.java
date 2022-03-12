public class Cachorro extends Mamifero{
    private String tamanho;
    private String raca;

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getTamanho() {
        return tamanho;
    }
    public String getRaca() {
        return raca;
    }

    public String amamentar() {
        return "amamentou";
    }
    public String emitirSom() {
        return "au au";
    }
}
