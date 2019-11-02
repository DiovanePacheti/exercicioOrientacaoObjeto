package com.company;

import exercicio.Cachorro;

import java.util.Scanner;
import exercicio.Funcionario;
public class Main {

    public static void main(String[] args) {
	// write your code here
     /*   Scanner scan = new Scanner(System.in);
        Cachorro dog = new Cachorro();
        String nomeCachorro = " ";

        System.out.println("Digite o nome do cachorro : ");
        nomeCachorro = scan.nextLine();
        if(nomeCachorro.length()>3){
            dog.setNome(nomeCachorro);
        }

        System.out.println(dog.toString());

      */
        int opcao = 0;
        Scanner scan = new Scanner(System.in);
        Funcionario[] novoFuncionario = new Funcionario[30];
        novoFuncionario[0] = new Funcionario();


/*
       System.out.print("digite o nome do Funcionario : ");
       novoFuncionario.setNome(scan.nextLine());
       novoFuncionario.setCpf(scan.nextLine());
       String data = scan.nextLine();
       String[] partes = data.split("/");
       int dia = Integer.parseInt(partes[0]);
       int mes = Integer.parseInt(partes[1]);
       int ano = Integer.parseInt(partes[2]);
       novoFuncionario.setDataDeNacimento(LocalDate.of(ano,mes,dia));
*/
        //do{
        System.out.println("|-----------OSins--------------|");
        System.out.println("|1- Trabalhar                  |   ");
        System.out.println("|2- Tomar Café                 |");
        opcao = scan.nextInt();

        switch (opcao){
            case 1:
                novoFuncionario[0].trabalhar();
            case 2 :
                String infarto = novoFuncionario[0].tomarCafe();

                System.out.println(infarto);
        }//fim do switch

    }//fim da metodo main
}
