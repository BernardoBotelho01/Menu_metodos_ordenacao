class InsertionSort {
    public void insertionSort(int[] vetor) {
        System.out.println();
        // Ordenação Insertion Sort
        System.out.println("Insertion Sort ordenando");
        for (int i = 1; i < vetor.length; i++) {
            int aux = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = aux;

            // Imprime o vetor a cada iteração
            System.out.println("Iteração " + i + ":");
            for (int imprimir : vetor) {
                System.out.print("[" + imprimir + "] ");
            }
            System.out.println("\n");
        }

        // Mostra o vetor ordenado
        System.out.println("Vetor ordenado:");
        for (int imprimir : vetor) {
            System.out.print("[" + imprimir + "] ");
        }
        System.out.println("\n");
    }
}
