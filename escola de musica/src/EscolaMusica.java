/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

public class EscolaMusica {
    public static void main(String[] args) {

        Instrumento_musical[] banda = new Instrumento_musical[4];

        System.out.println("======= A ORQUESTRA VAI COMEÇAR =======");
        System.out.println("\n\n");

      
        banda[0] = new Piano("Pian", "Madeira", 88);
        banda[1] = new Violao("Violão", "Ferro", 6);
        banda[2] = new Saxofone("Saxofone", "Latão", "Alto");
        banda[3] = new Bateria("Bateria", "Muitos", 5);

        
        System.out.println("Instrumentos:");
        for (Instrumento_musical instrumento : banda) {
            instrumento.mostrarInformacoes();
            System.out.println();
        }

        System.out.println("\nAfinando os instrumentos...");
        for (Instrumento_musical instrumento : banda) {
            instrumento.afinar();
        }

        System.out.println("\nA banda começa a tocar!");
        for (Instrumento_musical instrumento : banda) {
            instrumento.tocar();
        }
    }
}
