package projeto;

public class Meteor {

   /* public static void AnaliseMeteorologica(String[] args) {

    } */

    public static double calcularMediaPonderadaTemperatura(double max, double min) {
    
       return max * 100 / 70 - min * 100 / 70 ;
    }

  /*  public static double classificarClima(double tempMedia, int umidadeMedia) {
 
    return ;

    } */

   /*public static double calcularIndiceCalor(double temp, int umidade) {
        return;
    }

    public static int gerarAlertas(int cidadeIndex) {
        return;
    }

     public static String calcularEstatisticasAvancadas() {
    }
        
        
    public static int compararCidades(int cidade1, int cidade2) {
       return;
    } 

     public static String gerarRelatorioDetalhado() {
    } */

    public static void main(String[] args) {
        double max;
        double min; 
        // Temperaturas: [máxima, mínima] para 5 cidades
        double[][] temperaturas = {
                { 32.5, 22.1 }, // Cidade 1
                { 28.3, 18.7 }, // Cidade 2
                { 35.8, 24.9 }, // Cidade 3
                { 30.2, 20.5 }, // Cidade 4
                { 25.7, 15.3 } // Cidade 5
        };
             

        
        System.out.println(calcularMediaPonderadaTemperatura(max, min));
        // Umidades: [manhã, tarde, noite] para 5 cidades
        int[][] umidades = {
                { 85, 60, 75 }, // Cidade 1
                { 78, 55, 70 }, // Cidade 2
                { 90, 65, 80 }, // Cidade 3
                { 82, 58, 72 }, // Cidade 4
                { 75, 50, 68 } // Cidade 5
        };
    }
}
