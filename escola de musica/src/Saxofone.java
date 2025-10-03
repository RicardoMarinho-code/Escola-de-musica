/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Saxofone extends Instrumento_musical {
     private String tipo; 
     
    public Saxofone(String nome, String material, String tipo) {
        super(nome, material);
        this.tipo = tipo;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando jazz suave no " + getNome() + " do tipo " + tipo + "...");
        System.out.println("♪ Melodia envolvente de saxofone ♪");
    }

    @Override
    public void afinar() {
        System.out.println("Ajustando a embocadura e as chaves do saxofone.");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Tipo de saxofone: " + tipo);
    }

    public String getTipo() {
        return tipo;
    }
}
