package com.company;

import exercicio.Cachorro;

import java.time.LocalDate;
import java.util.Scanner;
import exercicio.Funcionario;
import exercicio.MiniMercado;
import exercicio.QuadroDeFuncionariosCheioException;

public class Main {

    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

        MiniMercado mercado = new MiniMercado();
        boolean validar = false;
        int cont = 0;//controlando numeros de contrataçoes
        do {
            Funcionario novoFuncionario = new Funcionario();
            do {
                System.out.print("Digite o nome do funcionario : ");
                String nome = scan.next();
                if(nome.length() > 2 ){
                    novoFuncionario.setNome(nome);
                    validar = true;

                }else {

                    System.out.println("Você não pode cadastra um nome vaziou ou com menos de 2 letras !");
                }
            }while(!validar);

            validar = false; //retornando para o estado falso
            do {
                System.out.print("Digite o salario do funcionario : ");
                double salario = scan.nextDouble();
                if(salario > 0) {
                    novoFuncionario.setSalario(salario);
                    validar = true;
                }else{
                    System.out.println("valor invalido ");
                }
            }while (!validar);

            System.out.print("Digite a data de aniversario do funcionario : ");
            String data = scan.next(); //formato esperado da data 00/00/0000
            String[] partes = data.split("/"); //definindo o simbolo separador
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);
            novoFuncionario.setDataDeNacimento(LocalDate.of(ano,mes,dia));
            System.out.println("Digite o cpf do Funcionario : ");

            try {
                mercado.contratarFuncionario(novoFuncionario);
            } catch (QuadroDeFuncionariosCheioException e) {
                e.printStackTrace();
            }
            System.out.println("Deseja cadastrar outro funcionario : [S - sim  / N - não]");
            String sair = scan.next();
            System.out.println(novoFuncionario.toString());
            cont++;
            if(sair.equalsIgnoreCase("n")){
                break;
            }

        }while (true);


    }//fim da metodo main
}
