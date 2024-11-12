import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] filePaths = {
                "Dados\\aleatorio_100.csv",
                "Dados\\aleatorio_1000.csv",
                "Dados\\aleatorio_10000.csv",
                "Dados\\crescente_100.csv",
                "Dados\\crescente_1000.csv",
                "Dados\\crescente_10000.csv",
                "Dados\\decrescente_100.csv",
                "Dados\\decrescente_1000.csv",
                "Dados\\decrescente_10000.csv"
        };

        for (String filePath : filePaths) {
            RelatorioOrdenacao.analyze(filePath);
        }
    }
}
