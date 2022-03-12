public class Principal {
    public static void main(String args[]) {
        Papagaio paraguaio = new Papagaio();
        Cachorro cururu = new Cachorro();
        Gato yuumi = new Gato();

        paraguaio.setNome("José");
        System.out.println(paraguaio.voar());
        System.out.println(paraguaio.emitirSom());

        cururu.setNome("Biscoito");
        cururu.setTamanho("pequinim");
        cururu.setRaca("Shi-tzu");
        System.out.println(cururu.amamentar());
        System.out.println(cururu.emitirSom());

        yuumi.setNome("Gato");
        yuumi.setRaca("Munchkin");
        System.out.println(yuumi.amamentar());
        System.out.println(yuumi.emitirSom());
    }
}
