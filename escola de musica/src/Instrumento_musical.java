/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RICARDO.MARINHO
 */
public abstract class Instrumento_musical {
    private String nome;
    private String material;
    
    public Instrumento_musical (String nome, String material){
        this.nome = nome;
        this.material = material;
   
    }
    
    public abstract void tocar ();
    
    public abstract void afinar ();
   
    public void mostrarInformacoes (){
        System.out.println("Nome: " + this.nome);
        System.out.println("Material: " + this.material);
    }
    
    public String getNome (){
        return nome;
    }
    
    public String getMaterial (){
        return material;
    }
    
}
