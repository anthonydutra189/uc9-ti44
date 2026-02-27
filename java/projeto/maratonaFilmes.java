package projeto;

import aula05.boo;

public class maratonaFilmes {    


    public static void exibirCabechalho(){
        System.out.printf("|-----------------------------------------------|\n \t\tMARATONA DE FILMES \n|-----------------------------------------------|");
        System.out.println("\n\n\n\tINFORMAÇÕES SOBRE DA MARATONA:");
        System.out.println("Usuário:"  );
        System.out.println("Quantidade de filmes:" );
        System.out.println("Duração média dos filmes:");
        System.out.println("\n\n\tCÁLCULOS:");
        System.out.println();
    }
   
    public static double calcularTempoTotal(int filmes , double duracaoMedia){
        int intValue = 10; 
        double doubleValue = (double) intValue;
        return filmes * duracaoMedia;
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

    public static boolean isValida(int filmes){
       
        if(filmes >= 1 ){
            return true;
        }else{
            return false;
        }
        
    }
    
    public static void main(String[] args) {
     
        double horas;
        int filmes = 0;
        double duracaoMedia = 1.55;
        horas = filmes * duracaoMedia;
    
        exibirCabechalho();
        System.out.println(calcularTempoTotal(filmes, duracaoMedia));
        System.out.println(classificarMaratona(horas));
        System.out.println(isValida(filmes));
    }
}
