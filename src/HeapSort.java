public class HeapSort {
    int cont = 0; // Contador de iterações

    public void heapSort(int[] vetor) {
        int n = vetor.length;

        // Constrói o heap (rearranja o vetor)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(vetor, n, i);
        }
        System.out.println("Heap Sort Ordenando");
        // Extrai um por um os elementos do heap
        for (int i = n - 1; i >= 0; i--) {
            // Move a raiz (maior elemento) para o final
            int temp = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = temp;

            cont++; // Incrementa o contador de iterações
            System.out.println("Iteração " + cont + ":");
            for (int imprimir : vetor) {
                System.out.print("[" + imprimir + "] ");
            }
            System.out.println("\n");

            // Chama o heapify na raiz
            heapify(vetor, i, 0);
        }

        // Imprime o vetor completamente ordenado
        System.out.println("Vetor Ordenado:");
        for (int imprimir : vetor) {
            System.out.print("[" + imprimir + "] ");
        }
        System.out.println();
    }

    // Função para reorganizar o heap
    public void heapify(int[] vetor, int n, int i) {
        int maior = i; // Inicializa o maior como raiz
        int esquerda = 2 * i + 1; // Filho à esquerda
        int direita = 2 * i + 2; // Filho à direita

        // Se o filho à esquerda for maior que a raiz
        if (esquerda < n && vetor[esquerda] > vetor[maior]) {
            maior = esquerda;
        }

        // Se o filho à direita for maior que o maior atual
        if (direita < n && vetor[direita] > vetor[maior]) {
            maior = direita;
        }

        // Se o maior não for a raiz
        if (maior != i) {
            int troca = vetor[i];
            vetor[i] = vetor[maior];
            vetor[maior] = troca;

            // Recursivamente aplica o heapify na sub-árvore afetada
            heapify(vetor, n, maior);
        }
    }
    // Método para resetar o contador
    public void resetarContador() {
        cont = 0;
    }
}