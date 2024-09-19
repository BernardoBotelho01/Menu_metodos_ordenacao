public class MergeSort {
    int cont = 0; // Contador de iterações

    public void mergeSort(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = (esquerda + direita) / 2;  // Calcula o ponto médio

            // Divide a primeira metade
            mergeSort(vetor, esquerda, meio);

            // Divide a segunda metade
            mergeSort(vetor, meio + 1, direita);

            // Mescla as duas metades
            merge(vetor, esquerda, meio, direita);

        }

    }
    public void merge(int[] vetor, int esquerda, int meio, int direita) {
        // Tamanhos dos sub-vetores
        int n1 = meio - esquerda + 1;
        int n2 = direita - meio;

        // Vetores temporários
        int[] esquerdaArray = new int[n1];
        int[] direitaArray = new int[n2];

        // Copia os dados para os vetores temporários
        for (int i = 0; i < n1; i++) {
            esquerdaArray[i] = vetor[esquerda + i];
        }
        for (int j = 0; j < n2; j++) {
            direitaArray[j] = vetor[meio + 1 + j];
        }

        // Índices para os vetores temporários e o vetor original
        int i = 0, j = 0;
        int k = esquerda;

        // Mescla os vetores temporários de volta ao vetor original
        while (i < n1 && j < n2) {
            if (esquerdaArray[i] <= direitaArray[j]) {
                vetor[k] = esquerdaArray[i];
                i++;
            } else {
                vetor[k] = direitaArray[j];
                j++;
            }

            cont++; // Incrementa o contador de iterações

            // Imprime o vetor a cada iteração
            System.out.println("Merge Sort ordenando");
            System.out.println("Iteração " + cont + ":");
            for (int imprimir : vetor) {
                System.out.print("[" + imprimir + "] ");
            }
            System.out.println("\n");

            k++;
        }

        // Copia os elementos restantes de esquerdaArray, se houver
        while (i < n1) {
            vetor[k] = esquerdaArray[i];
            i++;
            k++;
        }

        // Copia os elementos restantes de direitaArray, se houver
        while (j < n2) {
            vetor[k] = direitaArray[j];
            j++;
            k++;
        }

        // Após mesclar, imprime o vetor completo se for a última mesclagem
        if (direita - esquerda == vetor.length - 1) {
            System.out.println("Vetor ordenado:");
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