package projeto;





public class Meteor {
    
    public static void main(String[] args) {
                          
           // Temperaturas: [máxima, mínima] para 5 cidades
         double[][] temperaturas = {
           { 32.5, 22.1 }, // Cidade 1
           { 28.3, 18.7 }, // Cidade 2
           { 35.8, 24.9 }, // Cidade 3
           { 30.2, 20.5 }, // Cidade 4
           { 25.7, 15.3 }, // Cidade 5
           };
         String[] cidade ={ 
         "#1",
         "#2", 
         "#3", 
         "#4", 
         "#5" 
        };        
       //Umidades: [manhã, tarde, noite] para 5 cidades
        int[][] umidades = {
           { 85, 60, 75 }, // Cidade 1
           { 78, 55, 70 }, // Cidade 2
           { 90, 65, 80 }, // Cidade 3
           { 82, 58, 72 }, // Cidade 4
           { 75, 50, 68 }, // Cidade 5
           };
           

         
          
           
                                      
               System.out.println(calcularMediaPonderadaTemperatura(temperaturas));
    
               System.out.println(classificarClima(temperaturas,umidades));
    
               System.out.print(identificarCidadeComMaiorAmplitudeTermica(temperaturas, cidade));

               System.out.println(calcularIndiceCalor(temperaturas , umidades));
       }
    public static void AnaliseMeteorologica(String[] args) {
         
         
    }
    public static double calcularMediaPonderadaTemperatura(double[][] temperaturas) {
       double max = temperaturas[2][0];
    double min = temperaturas[2][1];
       if(min  < -50 || max > 60){
                    System.out.println("INABITAVEL");
        }      
                return max * (0.7) + min * (0.2) ;
    }
    
    
    public static double classificarClima(double temperaturas[][],int[][] umidade) {
       double tempMedia = calcularMediaPonderadaTemperatura(temperaturas);
       double umidadeMedia = umidade[0][0];
        
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
         
        
        public static String identificarCidadeComMaiorAmplitudeTermica(double[][] temperaturas, String[]cidade ){
            String indice;
            double maxAmp = temperaturas[0][0];
            double maiorAmplitude = 0;
            double listaDeAmplitude;
            
            for(int v = 0; v < temperaturas.length; v++){
                if(temperaturas[v][0] > maxAmp)
                    {
                        maiorAmplitude = temperaturas[v][0] - temperaturas[v][1];
                    }
                    
                 //  System.out.println(listaDeAmplitude = temperaturas[v][0] - temperaturas[v][1]);  ;         
     
                }
          
                indice = "a maior amplitude é " +  cidade[3]  +  " (" +  maiorAmplitude +")";
                return indice ;
                
            }

            public static double calcularIndiceCalor(double temperaturas[][], int[][] umidade) {
              
            double temp = temperaturas[0][0];
            int umi = umidade[0][0];   
            
            double indiceCalor = temp + 0.5 * (umi/100) * (temp - 20);
            
          
                
                
                
                
                return indiceCalor ;
            }
                
                
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
                   

}
                        
                        