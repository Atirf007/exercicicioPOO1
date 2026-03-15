public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(14, 3, 1879, "Einstein");
        Pessoa p2 = new Pessoa(4, 1, 1643,"Newton");

        p1.calculaIdade(14, 03, 2026);
        p2.calculaIdade(14, 03, 2026);

        System.out.printf("Idade de %s se tivesse vivo: %d", p1.getNome(), p1.getIdade());
        System.out.printf("\nIdade de %s se tivesse vivo: %d", p2.getNome(), p2.getIdade());

    }
}
