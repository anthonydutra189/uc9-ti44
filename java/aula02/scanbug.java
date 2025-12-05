package aula02;

import java.util.Scanner;

public class scanbug{

    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        String nome;
        int idade;
        
        System.out.println("Digite a sua idade ");
        idade = in.nextInt();
        in.nextLine(); //Correção para um "bug" do Scanner

        System.out.println("Digite o seu nome ");
        nome = in.nextLine();


        System.out.printf("Olá %s, sua idade é: %d\n",nome,idade);





    }


}


