package aula02;

import java.util.Scanner;

public class conveter{

    public static void main(String[]args){
        //Declaração de variáveis;
        final double CM_PARA_POL = 2.54;
        final double POL_PARA_PES = 12.0;
        double cm,polegadas,pes;
        int pol;
        Scanner in = new Scanner(System.in);
        //fim das Declarações

        //Entrada de dados:
        System.out.println("Digite um valor EXATO em cm");
        cm = in.nextDouble();
       
        //Converter
        polegadas = (cm / CM_PARA_POL);
        pes = polegadas / POL_PARA_PES;
       
        //Casting
        pol = (int)polegadas;
        //polegadas = pol; Casting não necessário pois int está "contido(junto)"
        //no tipo double ""(mais complexo)""

        //Saida de dados
        System.out.printf("%.2f cm = %.2f pol = %.2f pés \n",cm,polegadas,pes);
        System.out.printf("%d esse é o valor da variavel pol\n",pol);
    }

}