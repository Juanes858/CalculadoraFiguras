/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author Juan Esteban Acosta
 */
public class Piramide extends Figura {
    private double base;
    private double altura;
    private double lado;

    public Piramide() {
    }
    

    public Piramide(double base, double altura ) {
        this.base = base;
        this.altura = altura;
    }
    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void pedirDatos(){
        double lado;
        double base;
        double altura;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud de los lados: ");
        lado = sc.nextDouble();
        System.out.println("Ingrese la longitud de la base: ");        
        base = sc.nextDouble();
        System.out.println("Ingrese la longitud de la altura: ");
        altura = sc.nextDouble();
        
        this.altura = altura;
        this.base = base;
        this.lado = lado;
    }
    
    @Override
    public void perimetro() {
        double lado = getLado();
        double altura = getAltura();
        double base = getBase();
        
        double perimetro = (base*3)+(lado*3);
        System.out.println("\nCalculando perimetro");
        System.out.println("El perimetro de la piramide es: " + perimetro);
    }

    @Override
    public void area() {
        double lado = getLado();
        double altura = getAltura();
        double base = getBase();
        
        double area = ((base*base)/2)+(((base*altura)/2)*3);
        System.out.println("\nCalculando perimetro");
        System.out.println("El perimetro de la piramide es: " + area);
    }

    /**
     * @return the lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(double lado) {
        this.lado = lado;
    }
    
}
