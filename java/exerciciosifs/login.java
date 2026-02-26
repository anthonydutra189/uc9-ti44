package exerciciosifs;

import java.util.Scanner;

public class login {
    

    public static void main(String[] args) {
    String name;
    int num;
        
        Scanner in = new Scanner(System.in);
        System.out.println("digite seu usuário");
        name = in.nextLine();
        System.out.println("digite sua senha");
        num = in.nextInt(); 
        if(name.equals("admin") && num == 1234){
            System.out.println("passa");
        }else{
            System.out.println("BLOQUEADO");
        }

    }


}
