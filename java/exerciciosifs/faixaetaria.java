package exerciciosifs;


import java.util.Scanner;

public class faixaetaria {
    
public static void main (String[] arg){

    int num;

    Scanner in = new Scanner(System.in);
    System.out.println("digite a sua idade");
    num = in.nextInt();
    if(12 >= num && num >= 0){
        System.out.println("Você é uma criança");
    }else if(num >= 13 && num <= 17){
        System.out.println("Você é um adolecente");
    }else if(num >= 18 && num <= 59){
        System.out.println("Você é um adulto");
    }else if(num >= 60){
        System.out.println("Você é um idoso");
    }else{
        System.out.println("oque é você???");
    }





}





}




