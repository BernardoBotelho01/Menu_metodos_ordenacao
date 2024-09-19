public class QuickSort {
    int cont = 0; // Contador de iterações

    public void quickSort(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            int p = particao(vetor, esquerda, direita);
            quickSort(vetor, esquerda, p);  // Ordena a parte esquerda
            quickSort(vetor, p + 1, direita);  // Ordena a parte direita
        }
        // Após a ordenação final, imprime o vetor completamente ordenado
        if (esquerda == 0 && direita == vetor.length - 1) {
            System.out.println("Vetor ordenado:");
            for (int imprimir : vetor) {
                System.out.print("[" + imprimir + "] ");
            }
            System.out.println();

        }
    }

    public int particao(int[] vetor, int esquerda, int direita) {
        int meio = (esquerda + direita) / 2;
        int pivo = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;

        while (true) {
            do {
                i++;
            } while (vetor[i] < pivo);

            do {
                j--;
            } while (vetor[j] > pivo);

            if (i >= j) {
                return j;
            }

            // Troca os elementos
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;

            // Incrementa o contador e imprime a cada iteração
            cont++;
            System.out.println("Quick Sort ordenando");
            System.out.println("Iteração " + cont + ":");
            for (int imprimir : vetor) {
                System.out.print("[" + imprimir + "] ");
            }
            System.out.println("\n");
        }


    }
    // Método para resetar o contador
    public void resetarContador() {
        cont = 0;
    }

}