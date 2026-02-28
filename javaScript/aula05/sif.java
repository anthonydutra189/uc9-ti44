package aula05;

import java.util.Scanner;
public class sif {
    

    public static void main (String[] args){
        
   
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua idade");
        num = in.nextInt();

        if(num < 10){
            System.out.println("entrou no primeiro IF");
        }else if(num > 10){
            System.out.println("entrou no primeiro else if");  
        }else{
            System.out.println("entrou no primeiro else ");
        }


    
}
}