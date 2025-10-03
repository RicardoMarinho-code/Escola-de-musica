/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Bateria extends Instrumento_musical {

    private int numeroPecas;

    public Bateria(String nome, String material, int numeroPecas) {
        super(nome, material);
        this.numeroPecas = numeroPecas;
    }

    @Override
    public void tocar() {
        System.out.println("Marcando o ritmo na " + getNome() + " com " + numeroPecas + " peças...");
        System.out.println("Boom! Tá! Boom! Tá!");
    }

    @Override
    public void afinar() {
        System.out.println("Ajustando a tensão das peles dos tambores.");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Número de peças: " + numeroPecas);
    }

    public int getNumeroPecas() {
        return numeroPecas;
    }
}
