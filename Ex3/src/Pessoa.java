public class Pessoa {
    private int idade;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private String nome;

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        if(diaNascimento >= 1 && diaNascimento <=31) {
            this.diaNascimento = diaNascimento;
        }
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        if(mesNascimento >= 1 && mesNascimento <=12) {
            this.mesNascimento = mesNascimento;
        }
    }

    public int getAnoNascimento() {

            return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        if (anoNascimento >= 1000) {
            this.anoNascimento = anoNascimento;
        }
    }

    public String informaNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual){

        this.idade = anoAtual - this.anoNascimento;

        if (mesAtual < this.mesNascimento || (mesAtual == this.mesNascimento && diaAtual < this.diaNascimento)) {
            this.idade--;
        }
    }
    public int informaIdade(){
        return idade;
    }

    public Pessoa (int diaNascimento, int mesNascimento, int anoNascimento, String nome){
        setDiaNascimento(diaNascimento);
        setMesNascimento(mesNascimento);
        setAnoNascimento(anoNascimento);
        this.nome = nome;
    }
    public Pessoa(){
        this.diaNascimento = 1;
        this.mesNascimento = 1;
        this.anoNascimento = 1000;
        calculaIdade(14, 3,2026);
    }






}
