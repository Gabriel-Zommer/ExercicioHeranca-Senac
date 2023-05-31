/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Zommer
 */
public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João", 40, 5000.0, "Vendas");
        Vendedor vendedor = new Vendedor("Maria", 25, 2000.0, 100000.0);

        System.out.println("Nome do gerente: " + gerente.getNome());
        System.out.println("Idade do gerente: " + gerente.getIdade());
        System.out.println("Salário do gerente: " + gerente.getSalario());
        System.out.println("Área de atuação do gerente: " + gerente.getAreaAtuacao());

        System.out.println();

        System.out.println("Nome do vendedor: " + vendedor.getNome());
        System.out.println("Idade do vendedor: " + vendedor.getIdade());
        System.out.println("Salário do vendedor: " + vendedor.getSalario());
        System.out.println("Meta de vendas do vendedor: " + vendedor.getMetaVendas());
    }
}
