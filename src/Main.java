import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continuarPrograma = true;

        BubbleSort metodo1 = new BubbleSort();
        SelectionSort metodo2 = new SelectionSort();
        InsertionSort metodo3 = new InsertionSort();
        MergeSort metodo4 = new MergeSort();
        QuickSort metodo5 = new QuickSort();
        HeapSort metodo6 = new HeapSort();
        Tempo tempoExecucao = new Tempo();
        System.out.println();
        System.out.println("-------Programa de ordenação de vetores-------\n");

        System.out.print("Digite o tamanho do vetor que deseja ordenar: ");
        int max = teclado.nextInt();

        int[] vetorOriginal = new int[max];
        int[] vetorParaBubble = new int[max];
        int[] vetorParaSelection = new int[max];
        int[] vetorParaInsertio = new int[max];
        int[] vetorParaMerge= new int[max];
        int[] vetorParaQuick= new int[max];
        int[] vetorParaHeap= new int[max];

        // Gera o vetor inicial
        gerarNovoVetor(vetorOriginal);
        vetorParaBubble = vetorOriginal.clone();
        vetorParaSelection = vetorOriginal.clone();
        vetorParaInsertio = vetorOriginal.clone();
        vetorParaMerge = vetorOriginal.clone();
        vetorParaQuick = vetorOriginal.clone();
        vetorParaHeap = vetorOriginal.clone();

        metodo4.resetarContador();
        metodo5.resetarContador();
        metodo6.resetarContador();

        while (continuarPrograma) {
            System.out.println();
            System.out.println("Vetor gerado:");
            for (int imprime : vetorOriginal) {
                System.out.print("[" + imprime + "] ");
            }
            System.out.println("\n");

            System.out.println("Digite qual método de ordenação quer usar:");
            System.out.println("Opção 1 - Bubble Sort");
            System.out.println("Opção 2 - Selection Sort");
            System.out.println("Opção 3 - Insertion Sort");
            System.out.println("Opção 4 - Merge Sort");
            System.out.println("Opção 5 - Quick Sort");
            System.out.println("Opção 6 - Heap Sort");
            System.out.println("Opção 7 - continuar e gerar novo vetor");
            System.out.println("Opção 8 - tempo dos métodos");
            System.out.println("Opção 9 - soma dos tempos");
            System.out.println("Opção 10 - média dos tempos");
            System.out.println("Opção 0 - sair");
            System.out.print("Opção: ");

            int opcao = teclado.nextInt();
            System.out.println();

            if (opcao == 1) {
                tempoExecucao.calcularTempoBubbleSort(metodo1, vetorParaBubble.clone());
            } else if (opcao == 2) {
                tempoExecucao.calcularTempoSelectionSort(metodo2, vetorParaSelection.clone());
            }
            else if (opcao == 3) {
                tempoExecucao.calcularTempoInsertionSort(metodo3, vetorParaInsertio.clone());
            }
            else if (opcao == 4) {
                tempoExecucao.calcularTempoMergeSort(metodo4, vetorParaMerge.clone());
            }
            else if (opcao == 5) {
                tempoExecucao.calcularTempoQuickSort(metodo5, vetorParaQuick.clone());
            }
            else if (opcao == 6) {
                tempoExecucao.calcularTempoHeapSort(metodo6, vetorParaHeap.clone());
            }
            else if (opcao == 7) {
                // Gera um novo vetor e clona para ambos os métodos
                gerarNovoVetor(vetorOriginal);
                vetorParaBubble = vetorOriginal.clone();
                vetorParaSelection = vetorOriginal.clone();
                vetorParaInsertio = vetorOriginal.clone();
                vetorParaMerge = vetorOriginal.clone();
                vetorParaQuick = vetorOriginal.clone();

                metodo4.resetarContador();
                metodo5.resetarContador();
                metodo6.resetarContador();
            }
            else if (opcao == 8) {
                tempoExecucao.tempoTotal();
            } else if (opcao == 9) {
                tempoExecucao.somaDosTempos();
            } else if (opcao == 10) {
                tempoExecucao.mediaDosTempos();
            } else if (opcao == 0) {
                System.out.println("Programa encerrado...");
                continuarPrograma = false;
                break; // Sai do loop interno e externo
            }
            else {
                System.out.println("Opção inválida, digite uma valida...");
            }
        teclado.close();
    }

    private static void gerarNovoVetor(int[] vetor) {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(1000);
        }
    }
}
