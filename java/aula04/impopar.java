package aula04;

import java.util.Scanner;


public class impopar {
    
    public static void main (String[] args) {
    int par;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numero");
        par = in.nextInt();
        if(par % 2 == 0){
            System.out.println("Seu numero é par");
        }else{
            System.out.println("Seu numero é impar");
        }

    }

}
