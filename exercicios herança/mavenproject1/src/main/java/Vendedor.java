/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Zommer
 */
public class Vendedor extends Funcionario {
    private double metaVendas;

    public Vendedor(String nome, int idade, double salario, double metaVendas) {
        super(nome, idade, salario);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }
}