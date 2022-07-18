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
public class Trapecio extends Figura{
    private double baseMayor;
    private double baseMenor;
    private double ladoA;
    private double ladoB;
    private double altura;

    public Trapecio() {
    }

    public Trapecio(double baseMayor, double baseMenor, double ladoA, double ladoB) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    
    /**
     * @return the baseMayor
     */
    public double getBaseMayor() {
        return baseMayor;
    }

    /**
     * @param baseMayor the baseMayor to set
     */
    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }

    /**
     * @return the baseMenor
     */
    public double getBaseMenor() {
        return baseMenor;
    }

    /**
     * @param baseMenor the baseMenor to set
     */
    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    /**
     * @return the ladoA
     */
    public double getLadoA() {
        return ladoA;
    }

    /**
     * @param ladoA the ladoA to set
     */
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    /**
     * @return the ladoB
     */
    public double getLadoB() {
        return ladoB;
    }

    /**
     * @param ladoB the ladoB to set
     */
    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
    
    public void pedirDatos(){
        double baseMayor;
        double baseMenor;
        double ladoA;
        double ladoB;
        double altura;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la base mayor del trapecio: ");
        baseMayor = sc.nextDouble();
        System.out.println("Ingrese la longitud de la base menor del trapecio: ");
        baseMenor = sc.nextDouble();
        System.out.println("Ingrese la longitud de el lado A del trapecio: ");
        ladoA = sc.nextDouble();
        System.out.println("Ingrese la longitud de el lado B del trapecio: ");
        ladoB = sc.nextDouble();
        System.out.println("Ingresa la medida de la altura del trapecio: ");
        altura = sc.nextDouble();
        
        this.setBaseMayor(baseMayor);
        this.setBaseMenor(baseMenor);
        this.setLadoA(ladoA);
        this.setLadoB(ladoB);
        this.altura = altura;
    }
    
    @Override
    public void perimetro() {
        double baseMayor = getBaseMayor();
        double baseMenor = getBaseMenor();
        double ladoA = getLadoA();
        double ladoB = getLadoB();
        
        double perimetro = baseMayor + baseMenor + ladoA + ladoB;
        System.out.println("\nCalculando el perimetro"); 
        System.out.println("El perimetro del trapecio es: " + perimetro);
    }

    @Override
    public void area() {
        double baseMayor = getBaseMayor();
        double baseMenor = getBaseMenor();
        double ladoA = getLadoA();
        double ladoB = getLadoB();
        double altura = getAltura();
        
        double area = ((baseMayor+baseMenor)*altura)/2;
        System.out.println("\nCalculando el area");
        System.out.println("El area del trapecio es: " + area);
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
