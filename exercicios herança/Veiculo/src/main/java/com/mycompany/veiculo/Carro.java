
package com.mycompany.veiculo;


public class Carro extends Veiculo{
    private int porta;
    
    
    public Carro(String marca, String modelo, int ano, int porta) {
        super(marca, modelo, ano); 
        this.setPorta(porta);
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    
}
