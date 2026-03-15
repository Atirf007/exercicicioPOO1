public class Main {
    public static void main(String[] args) {

        Item i1 = new Item("a123", "Creme dental", 3, -2.5);
        Item i2 = new Item("HJ12", "Escova de dente", 4, 5.7);

        System.out.printf("Código do item: %s", i1.getCodigo());
        System.out.printf("\nDescrição do item: %s", i1.getDescricao());
        System.out.printf("\nQuantidade comprada: %d", i1.getQuantidadeComprada());
        System.out.printf("\nPreço do item: %.2f", i1.getPrecoItem());
        System.out.printf("\nValor total do item: %.2f", i1.getTotal());

        System.out.printf("\n\nCódigo do item: %s", i2.getCodigo());
        System.out.printf("\nDescrição do item: %s", i2.getDescricao());
        System.out.printf("\nQuantidade comprada: %d", i2.getQuantidadeComprada());
        System.out.printf("\nPreço do item: %.2f", i2.getPrecoItem());
        System.out.printf("\nValor total do item: %.2f", i2.getTotal());


    }
}
