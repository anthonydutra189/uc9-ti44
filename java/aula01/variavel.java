public class variavel {

    public static void main(String[] args){
        // Declaração de variavel

        String caracteris;
        int x,y;
        String nomes;
        int horas , tempo;
        String mensagem;

    
        mensagem = "Tchau terra fique bem!"; //atribuindo a String
        horas = 11; //atribuido o valor 11 a var hora
        tempo = 56; // atribuido o valor 56 var tempo
        x=3; 
        y=x; // tem o mesmo valor de x, ou seja 3
        System.out.println(mensagem);
        System.out.print(horas);
        System.out.print(":");
        System.out.println(tempo);
        System.out.println("faz uma conta ai");
        System.out.print((horas*60)+tempo);
        //
        System.out.println("Fração de hora que a var minuto representa");
        System.out.println(tempo/60);// da zero, um erro matemático
        System.out.println("A porcentagem de hora que a var tempo representa");
        System.out.println((tempo * 100)/60);//93%

    

    }

    
}
