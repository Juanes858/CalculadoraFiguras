/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorafiguras;

import Clases.Circulo;
import Clases.Cuadrado;
import Clases.Cubo;
import Clases.Piramide;
import Clases.Trapecio;
import Clases.Triangulo;
import java.util.Scanner;

/**
 *
 * @author Juan Esteban Acosta
 */
public class CalculadoraFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Circulo circulo = new Circulo();
        Cuadrado cuadrado = new Cuadrado();
        Cubo cubo = new Cubo();
        Piramide piramide = new Piramide();
        Trapecio trapecio = new Trapecio();
        Triangulo triangulo = new Triangulo();
        
        int opcion0 = 0;
        int opcion1 = 0;
        
        while(opcion0 != 3){
            
            System.out.println("\nCalculadora"
                    + "\nDigite la opcion que desea realizar: "
                    + "\n1. Perimetro "
                    + "\n2. Calcular area"
                    + "\n3. Salir");
            opcion0 = sc.nextInt();
            switch(opcion0){
                case 1:
                    System.out.println("Figuras"
                            + "\n1. Circulo"
                            + "\n2. Cuadrado"
                            + "\n3. Cubo"
                            + "\n4. Piramide"
                            + "\n5. Trapecio"
                            + "\n6. Triangulo");
                    opcion1 = sc.nextInt();
                    switch(opcion1){
                        case 1: // Circulo
                            circulo.pedirDatos();
                            circulo.perimetro();
                            break;
                        case 2: // Cuadrado
                            cuadrado.pedirDatos();
                            cuadrado.perimetro();
                            break;
                        case 3: // Cubo
                            cubo.pedirDatos();
                            cubo.perimetro();
                            break;
                        case 4: // Piramide
                            piramide.pedirDatos();
                            piramide.perimetro();
                            break;
                        case 5: // Trapecio
                            trapecio.pedirDatos();
                            trapecio.perimetro();
                            break;
                        case 6: //Triangulo
                            triangulo.pedirDatos();
                            triangulo.perimetro();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\nFiguras"
                            + "\n1. Circulo"
                            + "\n2. Cuadrado"
                            + "\n3. Cubo"
                            + "\n4. Piramide"
                            + "\n5. Trapecio"
                            + "\n6. Triangulo");
                    opcion1 = sc.nextInt();
                    switch(opcion1){
                        case 1: // Circulo
                            circulo.pedirDatos();
                            circulo.area();
                            break;
                        case 2:// Cuadrado
                            cuadrado.pedirDatos();
                            cuadrado.area();
                            break;
                        case 3:// cubo
                            cubo.pedirDatos();
                            cubo.area();
                            break;
                        case 4: // piramide
                            piramide.pedirDatos();
                            piramide.area();
                            break;
                        case 5: // Trapecio
                            trapecio.pedirDatos();
                            trapecio.area();
                            break;
                        case 6://Triangulo
                            triangulo.pedirDatos();
                            triangulo.area();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Saliste, Feliz dia");
                    break;
                default:
                    System.out.println("Valor irreconocible");
                    break;
            }
            
        }
        
    }
    
}
