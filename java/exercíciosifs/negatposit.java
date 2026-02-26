package aula04;

import java.util.Scanner;

public class negatposit{

    public static void main(String[] args){

        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número");
        num = in.nextInt();
        if(num <= -1){
            System.out.println("Seu número é negativo");
        }else if(num == 0){
            System.out.println("Seu número é neutro(não positivo nem negativo)");
        }else{
            System.out.println("Seu numero é positivo");
        }

    }





}


