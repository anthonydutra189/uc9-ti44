package aula04;

import java.util.Scanner;

public class aprovado {
    
    public static void main(String[] args) {
        int nota;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite usa nota");
        nota = in.nextInt();
        if(nota >= 6){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }

    }

}
