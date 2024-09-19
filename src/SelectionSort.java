class SelectionSort {
    public void selectionSort(int[] vetor) {
        System.out.println();
        // Ordenação Selection Sort
        System.out.println("Selection Sort ordenando");
        for (int i = 0; i < vetor.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            int aux = vetor[menor];
            vetor[menor] = vetor[i];
            vetor[i] = aux;

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