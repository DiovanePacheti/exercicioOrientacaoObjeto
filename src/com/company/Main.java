package com.company;

import exercicio.Cachorro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        Cachorro dog = new Cachorro();
        String nomeCachorro = " ";

        System.out.println("Digite o nome do cachorro : ");
        nomeCachorro = scan.nextLine();
        if(nomeCachorro.length()>3){
            dog.setNome(nomeCachorro);
        }

        System.out.println(dog.toString());
    }//fim da metodo main
}
