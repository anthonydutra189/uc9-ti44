package projeto;

import java.util.Arrays;

public class Meteor {
    
    public static void AnaliseMeteorologica(String[] args) {
         
         
    }
    public static double calcularMediaPonderadaTemperatura(double max, double min) {
       
        if(min  < -50 || max > 60){
                    System.out.println("INABITAVEL");
        }      
                return max * (0.7) + min * (0.2);
    }
    
    
    public static double classificarClima(double tempMedia, int umidadeMedia) {
        if(tempMedia > 30 && umidadeMedia > 75){
                    System.out.println("MUITO QUENTE E ÚMIDO");
        }
        
        else if (tempMedia < 15 && umidadeMedia < 50){
                    System.out.println("FRIO E SECO");
        }
        
        else if (tempMedia >= 20 || tempMedia <= 25 && umidadeMedia >= 50 || umidadeMedia <= 70){   
                    System.out.println("CONFORTAVEL");
        }

        else{
                    System.out.println("QUENTE LEVE");
        }

                return tempMedia;
        }
         
        
        public static double identificarCidadeComMaiorAmplitudeTermica(double indice, int i){
        // Temperaturas: [máxima, mínima] para 5 cidades
            double[][] temperaturas = {
                { 32.5, 22.1 }, // Cidade 1
                { 28.3, 18.7 }, // Cidade 2
                { 35.8, 24.9 }, // Cidade 3
                { 30.2, 20.5 }, // Cidade 4
                { 25.7, 15.3 }, // Cidade 5
            };
        
        
          
            double maiorAmplitude = 0;
            double[] amplitude;
        
            for(int v = 0; v < temperaturas.length ; v++){
        
                
                amplitude = temperaturas[v][0] - temperaturas[v][1];
                // maiorAmplitude = amplitude;

                System.out.println("amplitude" + amplitude);
                
                if(maiorAmplitude > amplitude){

                    maiorAmplitude = amplitude;
                
                    indice = v;
                    System.out.println("entrei linha 59");
                }
            }
                    System.out.println("entrei linha 61");
        
        return indice;
        
    }
        






        

    /*public static double calcularIndiceCalor(double temp, int umidade) {
      
        double maxTemp;
        double minTemp;
        

    // Temperaturas: [máxima, mínima] para 5 cidades
        double[][] temperaturas = {
                { 32.5, 22.1 }, // Cidade 1
                { 35.8, 24.9 }, // Cidade 3
                { 30.2, 20.5 }, // Cidade 4
                { 25.7, 15.3 }, // Cidade 5
        };
    // Umidades: [manhã, tarde, noite] para 5 cidades
        int[][] umidades = {
                { 85, 60, 75 }, // Cidade 1
                { 78, 55, 70 }, // Cidade 2
                { 90, 65, 80 }, // Cidade 3
                { 82, 58, 72 }, // Cidade 4
                { 75, 50, 68 }, // Cidade 5
            


        }; 
          return maxTemp - minTemp;
    };

        */
      /*          
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
        double indice = 0.0;
        double max = 28.3;
        double min = 18.7;
        double tempMedia = calcularMediaPonderadaTemperatura(max, min);
        int umidade = 40;
                                   
            System.out.println(calcularMediaPonderadaTemperatura(max, min));

            System.out.println(classificarClima(tempMedia,umidade));

            System.out.println(identificarCidadeComMaiorAmplitudeTermica(indice, 0));


        // Temperaturas: [máxima, mínima] para 5 cidades
        double[][] temperaturas = {
            { 32.5, 22.1 }, // Cidade 1
            { 28.3, 18.7 }, // Cidade 2
            { 35.8, 24.9 }, // Cidade 3
            { 30.2, 20.5 }, // Cidade 4
            { 25.7, 15.3 }, // Cidade 5
        };
        
        //Umidades: [manhã, tarde, noite] para 5 cidades
        int[][] umidades = {
            { 85, 60, 75 }, // Cidade 1
            { 78, 55, 70 }, // Cidade 2
            { 90, 65, 80 }, // Cidade 3
            { 82, 58, 72 }, // Cidade 4
            { 75, 50, 68 }, // Cidade 5
        };
                    
    }

}
                        
                        