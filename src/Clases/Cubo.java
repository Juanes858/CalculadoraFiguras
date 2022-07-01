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
 * 
 */
public class Cubo extends Figura{
    private double lados;
    
    
   

    public Cubo() {
    }
   

    public Cubo(double lados) {
        this.lados = lados;
    }
    /**
     * @return constructor sin parametros
     */
    public double getLados() {
        return lados;
        
    }

    /**
     * @param lados constructor con parametros
     */
    public void setLados(double lados) {
        this.lados = lados;
        
        
    }
    @Override
    public void perimetro() {
        double lados = getLados();
        double perimetro = 12*lados;
        System.out.println("\nCalculando perimetro");
        System.out.println("El perimetro del cubo es: " + perimetro);
   
    }

    @Override
    public void area() {
        
        double lados = getLados();
        double area = (lados*lados)*6;
        System.out.println("\nCalculando area");
        System.out.println("El area del cubo es: "+area);
        
    }
     public void pedirDatos(){
        double lados;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite la longitud de los lados: ");
        lados = sc.nextDouble();
        
        this.setLados(lados);
     }
}
