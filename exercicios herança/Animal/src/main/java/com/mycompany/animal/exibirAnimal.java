/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author Zommer
 */
public class exibirAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Pandora", 12, "cachorro", "pastor alemão" );
        Gato gato = new Gato("Max", 6, "gato", "Preto e branco");
        
        System.out.println("o nome do cachorro é: " + cachorro.getNome());
        System.out.println("a idade do cachorro é: " + cachorro.getIdade());
        System.out.println("oque ele é: " + cachorro.getTipo());
        System.out.println("qual a raça? " + cachorro.getRaca());
        System.out.println("...................................");
        System.out.println("o nome do gato é: " + gato.getNome());
        System.out.println("a idade do gato é: " + gato.getIdade());
        System.out.println("oque ele é: " + gato.getTipo());
        System.out.println("qual a cor? " + gato.getCor());
        
        
    }
}
