import java.util.Scanner;

public class ativade02{
public static void main(String[] args){
    String line , line2; 
    Scanner in = new Scanner(System.in);
    System.out.println("digite seu primeiro nome");
    line = in.nextLine();
    line = line.toUpperCase();
    System.out.println("Digite seu segundo nome");
    line2 = in.nextLine();
    System.out.println("Citação "+line +"."+ line2);
    }
}
