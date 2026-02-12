
import java.util.Scanner;
public class maratonaFilmes {
    

        public static String nomeDoUsuario;
        public static int filmes = 10;
        public static double duracao = 1.34 ;
        public static double teTo;//teTO = tempo Total 
        public static Scanner in = new Scanner(System.in);
    


    public static void exibirCabechalho(){
        System.out.printf("|-----------------------------------------------|\n \t\tMARATONA DE FILMES \n|-----------------------------------------------|");
        System.out.println("\ndigite seu nome");
        //nomeDoUsuario = in.nextLine();
        System.out.println("digite quantidade de filmes");
        //filmes = in.nextInt();
        System.out.println("média do duracao dos filmes");
        //duracao = in.nextDouble();
        System.out.println("\n\n\n\tINFORMAÇÕES SOBRE DA MARATONA:");
        System.out.println("Usuário:" + nomeDoUsuario  );
        System.out.println("Quantidade de filmes:" + filmes);
        System.out.println("Duração média dos filmes:" + duracao);
        System.out.println("\n\n\tCÁLCULOS:");
        System.out.println();
    }
   
    public static double calcularMedia(int filmes,double duracao){
    
        return  filmes * duracao;
    }
     
    
    public static void main(String[] args) {
      
        exibirCabechalho();
          //teTO = tempo Total
        System.out.println(teTo);


    }
}
