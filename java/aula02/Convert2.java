package aula02;

import java.util.Scanner;

public class Convert2 {
    
   
    public static double pol;
    public static final double CM_PARA_POL = 2.54;
    public static final double POL_PARA_PES = 12.0;
    public static final double CM_PARA_METROS = 1000;
    public static final double METROS_PARA_KILOMETROS = 100000;

    public static void cmParaPolegada(double d){
        pol = d / CM_PARA_POL;
        System.out.printf("valor digitado em polegadas: %.2f ",pol);
        //faz converção
        //imprime o resultado com um printf(%.2f,variavel)
    
    }

    public static void polegadasParaPes(double p){
        double pes;
        pes = pol / POL_PARA_PES;
        System.out.printf("Valor digitado em pés: %.2f ",pes);

    }
    
    public static void CM_PARA_METROS(double d){
        double metros;
        metros = d / CM_PARA_METROS;
        System.out.printf("Valor digitado em metros: %.2f ",metros);

    }
    public static void metrosParaKilometros(double d){
        double km;
        km = d / METROS_PARA_KILOMETROS;
        System.out.printf("Valor digitado em kilometros: %.2f ",km);

    }

    public static void main(String[] args){
        double cm; 

        Scanner in = new Scanner(System.in);
        System.out.println("digito o valor de cm's");
        cm = in.nextDouble();
        cmParaPolegada(cm);
        polegadasParaPes(cm);
        CM_PARA_METROS(cm);
        metrosParaKilometros(cm);

    }





}
