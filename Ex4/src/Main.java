//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estoque estoque1 = new Estoque("Impressora", 13, 6);
        Estoque estoque2 = new Estoque("Monitor", 11, 13);
        Estoque estoque3 = new Estoque("Mouse", 6, 2);

        estoque1.darBaixa(5);;

        estoque2.repor(7);

        estoque3.darBaixa(4);

        if(estoque1.precisaRepor()){
            System.out.printf("\n\nÉ preciso repor %s", estoque1.getNome());
        }
        else {
            System.out.printf("\n\nNão é preciso repor %s", estoque1.getNome());
        }

        if(estoque2.precisaRepor()){
            System.out.printf("\n\nÉ preciso repor %s", estoque2.getNome());
        }
        else {
            System.out.printf("\n\nNão é preciso repor %s", estoque2.getNome());
        }

        if(estoque3.precisaRepor()){
            System.out.printf("\n\nÉ preciso repor %s", estoque3.getNome());
        }
        else {
            System.out.printf("\n\nNão é preciso repor %s", estoque3.getNome());
        }

        System.out.printf("\n\n%s", estoque1.mostra());
        System.out.printf("\n\n%s", estoque2.mostra());
        System.out.printf("\n\n%s\n\n", estoque3.mostra());


    }
}