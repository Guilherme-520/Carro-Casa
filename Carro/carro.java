package Carro;

public class carro {
    private pneu[] rodas;
    
    public carro(pneu[] rodas) {
        // O carro recebe as rodas por agregação
        this.rodas = rodas;
    }
    
    public void mostrarRodas() {
        for (pneu pneu : rodas) {
            System.out.println("Roda tamanho: " + pneu.getTamanho());
        }
    }
}
