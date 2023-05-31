/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formageometrica;

/**
 *
 * @author Zommer
 */
public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado("Azul", 5.0);
        Circulo circulo = new Circulo("Vermelho", 2.5);

        System.out.println("Cor do quadrado: " + quadrado.getCor());
        System.out.println("Lado do quadrado: " + quadrado.getLado());

        System.out.println();

        System.out.println("Cor do círculo: " + circulo.getCor());
        System.out.println("Raio do círculo: " + circulo.getRaio());
    }
}
