package exercicio;

import java.time.LocalDate;

public class Pessoa {

    private String nome = " ";
    private String cpf = " ";
    private LocalDate dataDeNacimento;

    // CRIANDO O CONSTRUTOR DA CLASSE
    public Pessoa(String nome, String cpf,LocalDate dataDeNacimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNacimento = dataDeNacimento;
    }

    //construtor vazio
    public Pessoa() {    }

    //METODOS ACESSORES GET E SET
    public String getNome() { return this.nome;}
    public void setNome(String nome){this.nome = nome;}
    public String getCpf(){return this.cpf;}
    public void setCpf(String cpf) { this.cpf = cpf; }
    public LocalDate getDataDeNacimento() { return dataDeNacimento; }
    public void setDataDeNacimento(LocalDate dataDeNacimento){ this.dataDeNacimento = dataDeNacimento;}


    @Override
    public String toString() {
        String s = " ";
        s += "----------------------------------------------\n";
        s += "- Nome : " + getNome() + "\n";
        s += "- Data de Nascimento : " + getDataDeNacimento() + "\n";
        s += "- Cpf : " + getCpf() + "\n";
        return s;
    }

}//fim da class Pessoa
