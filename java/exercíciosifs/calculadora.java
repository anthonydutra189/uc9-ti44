package aula04;

import java.util.Scanner;

public class calculadora {
    
    public static void main(String[] args) {
        int num1,num2,conta;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma operação(1(+),2(-),3(*),4(/)");
        conta = in.nextInt();
        switch(conta){
                case 1:
                    System.out.println("VOCê SELECIONOU ADIÇÃO (+)");
                    System.out.println("Digite um número");
                    num1 = in.nextInt();
                    System.out.println("Digite o segundo número");
                    num2 = in.nextInt();
                    System.out.println(num1 + num2);
                break;
                case 2:
                    System.out.println("VOCê SELECIONOU SUBITRAÇÃO (+)");
                    System.out.println("Digite um número");
                    num1 = in.nextInt();
                    System.out.println("Digite o segundo número");
                    num2 = in.nextInt();
                    System.out.println(num1 - num2);
                break;
                case 3:
                    System.out.println("VOCê SELECIONOU MULTIPLICAÇÃO(+)");
                    System.out.println("Digite um número");
                    num1 = in.nextInt();
                    System.out.println("Digite o segundo número");
                    num2 = in.nextInt();
                    System.out.println(num1 * num2);
                break;
                case 4:
                    System.out.println("VOCê SELECIONOU DIVISÃO(+)");
                    System.out.println("Digite um número");
                    num1 = in.nextInt();
                    System.out.println("Digite o segundo número");
                    num2 = in.nextInt();
                    System.out.println(num1 / num2);
                break; 
                default:
                    System.out.println("você digitou um número invalido"); 

        }
    }

}
