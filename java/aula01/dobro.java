public class dobro {
    public static void main(String[] args){
       
        double pi, minuto , balanco;// declaração da var doble
        pi = 3.14159; // atribuição de valor francionário 
        minuto = 56.0;
        balanco = 1234.45; //erro?
        System.out.println("Fração de hora contida na var mínuto");
        System.out.println(minuto/60.0);//0.9333333...
        System.out.println("Porcetangem de hora na var mínuto");
        System.out.println((minuto/60.0)*100.0);
        /*  ERRO
        int x = 1.1; // erro de compilação.
        double y = 1; // não da erro , mas não é uma boa prática.       
        double y = 1/3; //vai dar erro!
        double y = 1.0 / 3.0  // modo correto de declaração/atribuição
        */
       //Erros de Arrdondamento
        
       System.out.println(0.1 * 10);
       System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);
    }
}
