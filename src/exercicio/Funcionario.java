package exercicio;

public class Funcionario extends Pessoa {

    private double salario = 0;
    private int dataDeAdmissao = 0;
    private String cargo = " ";
    private int energia = 0;
    private int credibilidade = 0;

    // CRIANDO O CONSTRUTOR DA CLASSE
    public Funcionario(String raca,String nome,String porte,String pedigree, double peso, int dataDeNacimento, int energia){
        super();
        this.salario = salario;
        this.dataDeAdmissao = dataDeAdmissao;
        this.cargo = cargo;
        this.energia = energia;
        this.credibilidade = credibilidade;
    }
    public Funcionario(){}

    //METODOS ACESSORES GET E SET
    public double getSalario(){ return this.salario;}
    public void setSalario(double salario) {this.salario = salario;}
    public int getDataDeAnimassao() { return this.dataDeAdmissao;}
    public void setDataDeAdmissao(int dataDeAdmissao){this.dataDeAdmissao = dataDeAdmissao;}
    public String getCargo(){return this.cargo;}
    public void setCargo(String cargo) { this.cargo = cargo; }
    public int getEnergia() { return this.energia; }
    public void setEnergia(int energia){ this.energia = energia;}
    public int getCredibilidade() { return this.credibilidade; }
    public void setCredibilidade(int credibilidade) { this.credibilidade = credibilidade; }

    public void trabalhar(){
        if(this.getEnergia()>=50){
            this.setSalario(this.getSalario() + (15.50)) ;
            this.setEnergia(this.getEnergia()-50);
            this.setCredibilidade((int)(this.getCredibilidade() + 0.1));
            if(this.getCredibilidade()>100){
                this.setCredibilidade(100);
            }
        }else{
            System.out.println("Energia Insuficiente");
        }//fim do bloco if/else
    }
    public void tomarCafe(){}
    public void fofocar(){}
    public void solicitarAumento(){}
    public void dormir(){}

    @Override
    public String toString() {
        String s = " ";
        s += super.toString();
        s += "----------------------------------------------\n";
        s += "- Salario : " + getSalario() + "\n";
        s += "- Data de Admissão : " + getDataDeAnimassao() + "\n";
        s += "- Cargo : " + getCargo() + "\n";
        s += "- Energia : " + getEnergia() + "\n";
        s += "- Credibilidade : " + getCredibilidade() + "\n";
        s += "- --------------------------------------------------\n";
        return s;
    }
}//fim da class Funcionario
