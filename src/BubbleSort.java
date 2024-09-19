class BubbleSort {
    public void bubbleSort(int[] vetor) {
        System.out.println();
        // Ordenação Bubble Sort
        System.out.println("Bubble Sort Ordenando");
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
            // Imprime o vetor a cada iteração
            System.out.println("Iteração " + (i + 1) + ":");
            for (int imprimir : vetor) {
                System.out.print("[" + imprimir + "] ");
            }
            System.out.println("\n");
        }

        // Mostra o vetor ordenado
        System.out.println("Vetor Ordenado:");
        for (int imprimir : vetor) {
            System.out.print("[" + imprimir + "] ");
        }
        System.out.println("\n");
    }
}