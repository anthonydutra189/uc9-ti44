package aula02;

public class Metodo {
 
    public static void newLine(){
        System.out.println("entre o metodo newline");
    }

    public static void tresLinhas(){
        newLine();
        newLine();
        newLine();
    }

    public static void main(String[] args){
        System.out.println("Primeira linha");
        tresLinhas();
        System.out.println("Segunda linha");

    }
}
