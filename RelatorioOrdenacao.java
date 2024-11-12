import java.io.*;
import java.util.*;

public class RelatorioOrdenacao {
    public static void analyze(String filePath) throws IOException {
        int[] dados = LeitorArquivos.lerDados(filePath);

        for (String tipoOrdenacao : List.of("Bubble", "Insertion", "Quick")) {
            int[] tempData = Arrays.copyOf(dados, dados.length);

            long tempoIni = System.nanoTime();

            switch (tipoOrdenacao) {
                case "Bubble" -> AlgoritmosOrdenacao.bubbleSort(tempData);
                case "Insertion" -> AlgoritmosOrdenacao.insertionSort(tempData);
                case "Quick" -> AlgoritmosOrdenacao.quickSort(tempData, 0, tempData.length - 1);
            }

            long tempoFinal = System.nanoTime();
            System.out.printf("%s Sort levou %d ns para %s%n", tipoOrdenacao, (tempoFinal - tempoIni), filePath);
        }
    }
}
