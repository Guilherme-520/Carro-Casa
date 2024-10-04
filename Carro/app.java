package Carro;
import java.util.Scanner;
public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando rodas separadamente
        pneu[] rodas = new pneu[4];
        for (int i = 0; i < rodas.length; i++) {
            System.out.print("Digite o tamanho da roda " + (i + 1) + ": ");
            String tamanho = scanner.nextLine();
            rodas[i] = new pneu(tamanho);
        }

        // O carro usa as rodas
        carro carro = new carro(rodas);
        System.out.println("Rodas do carro:");
        carro.mostrarRodas(); // Mostra as rodas do carro
        
        scanner.close();
    }
}
