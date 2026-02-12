package aula05;

public class dist {
    
    
    //EXEMPLO DE DESENVOLVIMENTO INCREMENTAL:
    
    //calcular a distâcia entre dois pontos
    
    //distancia dada par: dist = {(x2 - x1)}^2 + (y2 - y1)^2}^1/2
    public static void main(String[] args) {
    
    double x1,x2,y1,y2,distX,distY,dx,dy,resultado; 
    x1 = 0;
    x2 = 5; 
    y1 = 0;
    y2 = 5;
    dx = x2 - x1;
    dy = y2 - y1;
    //dy = y2 - y1;   

    distX = Math.pow(dx, 2.0);
    distY = Math.pow(dy, 2.0);
    System.out.println("Distancia do eixo x: " + distX);
    System.out.println("Distancia do eixo y: " + distY);
    resultado = Math.sqrt((distX+distY));
    System.out.println(resultado);



    }
}



