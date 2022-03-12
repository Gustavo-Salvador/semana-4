public class Gato extends Mamifero{
    private String raca;

    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getRaca() {
        return raca;
    }

    public String amamentar() {
        return "amamentou";
    }
    public String emitirSom() {
        return "miu";
    }
}
