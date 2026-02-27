package projeto;
public class maratonaFilmes {    


    public static void exibirCabechalho(){
        System.out.printf("|-----------------------------------------------|\n \t\tMARATONA DE FILMES \n|-----------------------------------------------|");
        System.out.println("\ndigite seu nome");
        //nomeDoUsuario = in.nextLine();
        System.out.println("digite quantidade de filmes");
        //filmes = in.nextInt();
        System.out.println("média do duracao dos filmes");
        //duracao = in.nextDouble();
        System.out.println("\n\n\n\tINFORMAÇÕES SOBRE DA MARATONA:");
        System.out.println("Usuário:" );
        System.out.println("Quantidade de filmes:" );
        System.out.println("Duração média dos filmes:");
        System.out.println("\n\n\tCÁLCULOS:");
        System.out.println();
    }
   
    public static double calcularMediaTotal(int quantidade , double duracao){
        int intValue = 10; 
        double doubleValue = (double) intValue;
        return quantidade * duracao;
    }
     
    public static String classificarMaratona(double horas){
        
        if(horas < 4) {
            System.out.println("Maratona leve");
        }else if(horas > 4 && horas < 8){
            System.out.println("Maratona Moderada");
        }else if(horas > 8 ){
            System.out.println("Maratona Épica");
        }
        
        return ""; 
    }

    public static boolean istrue(boolean filmes) {

        if(filmes = true){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        return true;
    }
    
    public static void main(String[] args) {
        boolean filmes;
        double horas;
        int quantidade = 10;
        double duracao = 1.55;
        horas = quantidade * duracao;
    
        exibirCabechalho();
        System.out.println(calcularMediaTotal(quantidade, duracao));
        System.out.println(classificarMaratona(horas));
        System.out.println(istrue(filmes));
    }
}
