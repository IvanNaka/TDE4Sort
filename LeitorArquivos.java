import java.io.*;
import java.util.*;

public class LeitorArquivos {
    public static int[] lerDados(String filePath) throws IOException {
        List<Integer> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                linha = linha.trim();
                if (linha.isEmpty() || !linha.matches("\\d+")) {
                    continue;
                }
                lista.add(Integer.parseInt(linha));
            }
        }

        return lista.stream().mapToInt(i -> i).toArray();
    }
}
