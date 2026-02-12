package aula04;

import java.util.scanner;

public class switch {
    
    public static void main(String[] args) {
        int num;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número entre 1 a 3");
        num = in.nextInt();
        switch(num < 12 ){
            case 1:
                System.out.println("UM");
                break;
            case 2:
                System.out.println("DOIS");
                break;
            case 3:
                System.out.println("TRÊS");
            
                

        }


    } 

}
