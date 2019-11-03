package exercicio;

import java.time.LocalDate;
import java.util.Random;

public class Funcionario extends Pessoa {

    Random sortearNumero = new Random();

    private int contador = 0;
    private int id;
    private double salario = 0;
    private LocalDate dataDeAdmissao;
    private String cargo = " ";
    private int energia = 0;
    private int credibilidade = 0;

    // CRIANDO O CONSTRUTOR DA CLASSE
    public Funcionario(double salario,LocalDate dataDeAdmissao,String cargo,int energia, int credibilidade){
        super();
        this.salario = salario;
        this.dataDeAdmissao = dataDeAdmissao;
        this.cargo = cargo;
        this.energia = energia;
        this.credibilidade = credibilidade;
    }

    public Funcionario(){
        contador++;
        this.id = contador;
    }

    //METODOS ACESSORES GET E SET
    public int getId(){ return this.id;}
    public double getSalario(){ return this.salario;}
    public void setSalario(double salario) {this.salario = salario;}
    public LocalDate getDataDeAnimassao() { return this.dataDeAdmissao;}
    public void setDataDeAdmissao(LocalDate dataDeAdmissao){this.dataDeAdmissao = dataDeAdmissao;}
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

    public void tomarCafe(){
        this.setEnergia(this.getEnergia() + sortearNumero.nextInt(16));
        if(this.getEnergia() >= 100) {
            //Energia carregada
            this.setEnergia(100);
        }//fim if
    }//fim do method tomarCafe


    public void fofocar(){}

    public void solicitarAumento(){
        int fator = sortearNumero.nextInt(120);
        if(fator <= this.getCredibilidade()){
            System.out.println("Parabéns \nSolicitaço aceita!");
            int aumento = 5+sortearNumero.nextInt(11);
            double novoSalario = this.getSalario() + (this.getSalario() * (aumento / 100));
            this.setSalario(novoSalario);
            System.out.println("Você recebeu aumento de " + aumento +"%");
        }//fim do if
    }//fim do method solicitar Aumento

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
