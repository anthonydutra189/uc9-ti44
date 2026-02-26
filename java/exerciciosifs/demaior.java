package exerciciosifs;

import java.util.Scanner;


public class demaior {

    public static void main (String[] args){
        int idade;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua idade");
        idade = in.nextInt();
        if(idade >= 18){
            System.out.println("você é maior de idade ");
        }else{
            System.out.println("você é menor de idade");
        }
    }

}
