
package com.mycompany.veiculo;


public class NewClass {
    public static void main(String[] args) {
        Carro carro = new Carro("honda", "civic", 2004, 4);
        Moto moto = new Moto("yamaha", "lander", 2008, 250);
        
        System.out.println("Marca do carro: " + carro.getMarca());
        System.out.println("modelo: " + carro.getModelo());
        System.out.println("ano: " + carro.getAno());
        System.out.println("quantas portas: " + carro.getPorta());
        
        System.out.println("Marca da moto: " + moto.getMarca());
        System.out.println("modelo: " + moto.getModelo());
        System.out.println("ano: " + moto.getAno());
        System.out.println("cilindradas: " + moto.getCilindrada());
    }
}
