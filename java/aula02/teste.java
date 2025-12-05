package aula02;

import java.util.Scanner;

public class teste{

    public static void main(String[]args){
        //Declaração de variáveis;
        final double CM_PARA_POL = 2.54;
        final double POL_PARA_PES = 12.0;
        double cm, metros , km , milhas,milhasn,jardas,milimetro,micrometro,nanometro;
        double polegadas; 
        double pes;
        Scanner in = new Scanner(System.in);
        //fim das Declarações

        System.out.println("Digite um valor EXATO em cm");
        cm = in.nextDouble();
        polegadas = (cm / CM_PARA_POL);
        
        milimetro = cm /10;
       
        micrometro = milimetro / 1000;
        
        nanometro = micrometro / 1000;
        
        pes = polegadas / POL_PARA_PES;
       
        metros = cm /1000;
        System.out.println("Valor em metros é "+ metros);
        jardas = metros/1.094;
        System.out.println("Valor em metros é "+ jardas);
        km = metros /1000;
        System.out.println("Valor em Kilometros é "+ km);
        milhas = km /1.609;
        System.out.println("Valor em milhas é "+ milhas);
        milhasn = milhas /1.852;
        System.out.println("Valor em milhas náuticas é "+ milhasn);

        System.out.printf("%.2f cm = %.2f pol = %.2f pés = %.2f metros = \n",cm,polegadas,pes,metros);
        System.out.println("Valor em militros é "+milimetro);
        System.out.println("Valor em micrometro é "+micrometro);
        System.out.println("Valor em nanoometro é "+nanometro);
        System.out.println("Valor em pés é "+ pes);

    }

}