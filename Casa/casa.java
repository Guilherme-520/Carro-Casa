package Casa;

public class casa {
    private comodo[] comodos;

    public casa(int numeroDeComodos) {
        // Inicializa um array de comodos
        comodos = new comodo[numeroDeComodos];
    }

    public void adicionarComodo(int indice, String nomeComodo) {
        if (indice >= 0 && indice < comodos.length) {
            comodos[indice] = new comodo(nomeComodo);
        } else {
            System.out.println("Índice de cômodo inválido.");
        }
    }

    public void mostrarComodos() {
        for (comodo comodo : comodos) {
            if (comodo != null) {
                System.out.println("Cômodo: " + comodo.getNome());
            } else {
                System.out.println("Cômodo vazio.");
            }
        }
    }
}
