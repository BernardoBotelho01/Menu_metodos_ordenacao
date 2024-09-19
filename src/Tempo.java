class Tempo {
    public double tempoBubbleSortTotal = 0;
    public double tempoSelectionSortTotal = 0;
    public double tempoInsertionSortTotal = 0;
    public double tempoMergeSortTotal= 0;
    public double tempoQuickSortTotal= 0;
    public double tempoHeapSortTotal= 0;

    public double somaDosTemposBubble = 0;
    public double somaDosTemposSelection = 0;
    public double somaDosTemposInsertion = 0;
    public double somaDosTemposMerge= 0;
    public double somaDosTemposQuick= 0;
    public double somaDosTemposHeap= 0;

    public int contadorExecucoesBubble = 0;
    public int contadorExecucoesSelection = 0;
    public int contadorExecucoesInsertion = 0;
    public int contadorExecucoesMerge= 0;
    public int contadorExecucoesQuik= 0;
    public int contadorExecucoesHeap= 0;

    // Método para calcular tempo do Bubble Sort
    public void calcularTempoBubbleSort(BubbleSort metodo, int[] vetor) {
        long inicio = System.nanoTime();
        metodo.bubbleSort(vetor);
        long fim = System.nanoTime();
        double tempoAtual = (fim - inicio) / 1_000_000_000.0;
        tempoBubbleSortTotal = tempoAtual;
        somaDosTemposBubble += tempoAtual;
        contadorExecucoesBubble++;
    }

    // Método para calcular tempo do Selection Sort
    public void calcularTempoSelectionSort(SelectionSort metodo, int[] vetor) {
        long inicio = System.nanoTime();
        metodo.selectionSort(vetor);
        long fim = System.nanoTime();
        double tempoAtual = (fim - inicio) / 1_000_000_000.0;
        tempoSelectionSortTotal = tempoAtual;
        somaDosTemposSelection += tempoAtual;
        contadorExecucoesSelection++;
    }

    // Método para calcular tempo do Insertion Sort
    public void calcularTempoInsertionSort(InsertionSort metodo, int[] vetor) {
        long inicio = System.nanoTime();
        metodo.insertionSort(vetor);
        long fim = System.nanoTime();
        double tempoAtual = (fim - inicio) / 1_000_000_000.0;
        tempoInsertionSortTotal = tempoAtual;
        somaDosTemposInsertion += tempoAtual;
        contadorExecucoesInsertion++;
    }
    // Método para calcular tempo do Merge Sort
    public void calcularTempoMergeSort(MergeSort metodo, int[] vetor) {
        long inicio = System.nanoTime();
        metodo.mergeSort(vetor, 0, vetor.length - 1);
        long fim = System.nanoTime();
        double tempoAtual=(fim - inicio) / 1_000_000_000.0;
        tempoMergeSortTotal = tempoAtual;
        somaDosTemposMerge += tempoAtual;
        contadorExecucoesMerge++;
    }
    // Método para calcular tempo do Quick Sort
    public void calcularTempoQuickSort(QuickSort metodo, int[] vetor) {
        long inicio = System.nanoTime();
        metodo.quickSort(vetor, 0, vetor.length - 1);
        long fim = System.nanoTime();
        double tempoAtual=(fim - inicio) / 1_000_000_000.0;
        tempoQuickSortTotal = tempoAtual;
        somaDosTemposQuick += tempoAtual;
        contadorExecucoesQuik++;
    }
    // Método para calcular tempo do Heap Sort
    public void calcularTempoHeapSort(HeapSort metodo, int[] vetor) {
        long inicio = System.nanoTime();
        metodo.heapSort(vetor);
        long fim = System.nanoTime();
        double tempoAtual = (fim - inicio) / 1_000_000_000.0;
        tempoHeapSortTotal = tempoAtual;
        somaDosTemposHeap += tempoAtual;
        contadorExecucoesHeap++;
    }

    public void tempoTotal() {
        System.out.printf("Tempo total do Bubble Sort: %.6f segundos%n", tempoBubbleSortTotal);
        System.out.printf("Tempo total do Selection Sort: %.6f segundos%n", tempoSelectionSortTotal);
        System.out.printf("Tempo total do Insertion Sort: %.6f segundos%n", tempoInsertionSortTotal);
        System.out.printf("Tempo total do Merge Sort: %.6f segundos%n", tempoMergeSortTotal);
        System.out.printf("Tempo total do Quick Sort: %.6f segundos%n", tempoQuickSortTotal);
        System.out.printf("Tempo total do Heap Sort: %.6f segundos%n", tempoHeapSortTotal);
    }

    public void somaDosTempos() {
        System.out.printf("Soma dos tempos do Bubble Sort: %.6f segundos%n", somaDosTemposBubble);
        System.out.printf("Soma dos tempos do Selection Sort: %.6f segundos%n", somaDosTemposSelection);
        System.out.printf("Soma dos tempos do Insertion Sort: %.6f segundos%n", somaDosTemposInsertion);
        System.out.printf("Soma dos tempos do Merge Sort: %.6f segundos%n", somaDosTemposMerge);
        System.out.printf("Soma dos tempos do Quick Sort: %.6f segundos%n", somaDosTemposQuick);
        System.out.printf("Soma dos tempos do Heap Sort: %.6f segundos%n", somaDosTemposHeap);
    }

    public void mediaDosTempos() {
        if (contadorExecucoesBubble > 0) {
            double mediaBubble = somaDosTemposBubble / contadorExecucoesBubble;
            System.out.printf("Média dos tempos do Bubble Sort: %.6f segundos%n", mediaBubble);
        } else {
            System.out.println("Nenhuma execução do Bubble Sort foi realizada ainda.");
        }

        if (contadorExecucoesSelection > 0) {
            double mediaSelection = somaDosTemposSelection / contadorExecucoesSelection;
            System.out.printf("Média dos tempos do Selection Sort: %.6f segundos%n", mediaSelection);
        } else {
            System.out.println("Nenhuma execução do Selection Sort foi realizada ainda.");
        }

        if (contadorExecucoesInsertion > 0) {
            double mediaInsertion = somaDosTemposInsertion / contadorExecucoesInsertion;
            System.out.printf("Média dos tempos do Insertion Sort: %.6f segundos%n", mediaInsertion);
        } else {
            System.out.println("Nenhuma execução do Insertion Sort foi realizada ainda.");
        }
        if (contadorExecucoesMerge > 0) {
            double mediaMerge = somaDosTemposMerge / contadorExecucoesMerge;
            System.out.printf("Média dos tempos do Merge Sort: %.6f segundos%n", mediaMerge);
        } else {
            System.out.println("Nenhuma execução do Merge Sort foi realizada ainda.");
        }
        if (contadorExecucoesQuik > 0) {
            double mediaQuick = somaDosTemposQuick / contadorExecucoesQuik;
            System.out.printf("Média dos tempos do Quick Sort: %.6f segundos%n", mediaQuick);
        } else {
            System.out.println("Nenhuma execução do Quick Sort foi realizada ainda.");
        }
        if (contadorExecucoesHeap > 0) {
            double mediaHeap = somaDosTemposHeap / contadorExecucoesHeap;
            System.out.printf("Média dos tempos do Heap Sort: %.6f segundos%n", mediaHeap);
        } else {
            System.out.println("Nenhuma execução do Heap Sort foi realizada ainda.");
        }
    }

    public void resetarTempo() {
        tempoBubbleSortTotal = 0;
        tempoSelectionSortTotal = 0;
        tempoInsertionSortTotal = 0;
        tempoMergeSortTotal =0;
        tempoQuickSortTotal =0;
        tempoHeapSortTotal=0;
    }
}