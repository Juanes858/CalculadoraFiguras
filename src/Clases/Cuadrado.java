/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class Cuadrado extends Figura{
    private double lados;

    //constructor sin parametros
    public Cuadrado() {
    }
    //constructor con parametros
    public Cuadrado(int lados) {
        this.lados = lados;
    }
    
    //METODOS GET Y SET
    /**
     * @return the lados
     */
    public double getLados() {
        return lados;
    }

    /**
     * @param lados the lados to set
     */
    public void setLados(int lados) {
        this.lados = lados;
    }
    
    @Override
    public void perimetro() {
        double lados = getLados();
        double perimetro = lados+lados+lados+lados;
        System.out.println("\nCalculando perimetro");
        System.out.println("El perimetro del cuadrado es: " + perimetro);
    }

    @Override
    public void area() {
        double lados = getLados();
        double area = lados*lados;
        System.out.println("\nCalculando area");
        System.out.println("El area del cuadrado es: "+area);
    }
    
    public void pedirDatos(){
        double lados;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite la longitud de los lados: ");
        lados = sc.nextDouble();
        
        this.lados = lados;
    }
}
