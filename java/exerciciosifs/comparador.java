package exerciciosifs;

import java.util.Scanner;

public class comparador {
        public static void main (String[] args){

        int num1, num2;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite dois números e irei comparar");
        System.out.println("Digite um número");
        num1 = in.nextInt();
        System.out.println("Digite outro número");
        num2 = in.nextInt();
        if(num1 > num2){
        System.out.println(num1 + " é maior que " + num2);
        }else if(num1 < num2){
            System.out.println(num2 +" é maior que "+ num1);
        }else{
            System.out.println("os números são iguais");
        }


    }



}
