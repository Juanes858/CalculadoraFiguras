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
public class Circulo extends Figura{
    private double radio;
    
  

    public Circulo() {
    }
    

    public Circulo(double radio ) {
        this.radio = radio;
       
    }
    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
      
    @Override
    public void perimetro() {
        double radio = getRadio();
        double perimetro = (radio*2)*PI;
        System.out.println("\nCalculando perimetro");
        System.out.println("El perimetro del circulo es: " + perimetro);
    }

    @Override
    public void area() {
        double radio = getRadio();
        double area = (Math.pow(radio, 2))*PI;
        System.out.println("\nCalculando area");
        System.out.println("El area del circulo es: " + area);
    }
    public void pedirDatos (){
        double radio;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite el radio del circulo: ");
        radio = sc.nextDouble();
        
        this.radio = radio;
        
    }
            
}
