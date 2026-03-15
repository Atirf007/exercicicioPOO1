public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Funcionario(){
        this.nome = "";
        this.sobrenome = "";
        this.salarioMensal = 0;
    }

    public Funcionario(String nome, String sobrenome, double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        setSalarioMensal(salarioMensal);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if(salarioMensal>0) {
            this.salarioMensal = salarioMensal;
        }
    }

    public double calcularSalarioAnual(){
        return this.salarioMensal*12;
    }

    public void aumentarSalarioMensal(){
        this.salarioMensal = this.salarioMensal*1.1;

    }

}
