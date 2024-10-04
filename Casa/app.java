package Casa;

import java.util.Scanner;

public class app {  // O nome da classe deve ser "App" ou o nome que você preferir
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao construtor de casas!");
        System.out.print("Quantos cômodos você quer na sua casa? ");
        int numeroDeComodos = scanner.nextInt();
        scanner.nextLine();  // Consome a nova linha após o número

        // Criando uma nova casa
        casa casa = new casa(numeroDeComodos);

        // Adicionando cômodos
        for (int i = 0; i < numeroDeComodos; i++) {
            System.out.print("Digite o nome do cômodo " + (i + 1) + ": ");
            String nomeComodo = scanner.nextLine();
            casa.adicionarComodo(i, nomeComodo);
        }

        // Mostrando os cômodos
        System.out.println("\nCômodos da casa:");
        casa.mostrarComodos();

        scanner.close();
    }
}
