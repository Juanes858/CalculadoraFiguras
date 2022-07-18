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
public class Triangulo extends Figura{
    private double lados;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(double lados, double altura ) {
        this.lados = lados;
        this.altura = altura;
    }

    /**
     * @return the lados
     */
    public double getLados() {
        return lados;
    }

    /**
     * @param lados the lados to set
     */
    public void setLados(double lados) {
        this.lados = lados;
    }
    
    @Override
    public void perimetro() {
        double lados = getLados();
        double perimetro = lados+lados+lados;
        System.out.println("\n|Calculando el perimetro: ");
        System.out.println("El triangulo tiene un perimetro de: " + perimetro);
    }

    @Override
    public void area() {
        double lados = getLados();
        double altura = getAltura();
        double area = (altura*lados)/2;
        System.out.println("\n|Calculando el area");
        System.out.println("El triangulo tiene un area de: " + area);
    }
    
    public void pedirDatos(){
        double lados;
        double altura;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cual es la longitud de los lados ");
        lados = sc.nextDouble();
        System.out.println("Cual es la altura del triangulo ");
        altura = sc.nextDouble();
        
        this.setAltura(altura);
        this.setLados(lados);
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
}
