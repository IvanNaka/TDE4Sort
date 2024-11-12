public class AlgoritmosOrdenacao {

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void quickSort(int[] array, int menor, int maior) {
        if (menor < maior) {
            int pi = particao(array, menor, maior);
            quickSort(array, menor, pi - 1);
            quickSort(array, pi + 1, maior);
        }
    }

    private static int particao(int[] array, int menor, int maior) {
        int pivo = array[maior];
        int i = (menor - 1);
        for (int j = menor; j < maior; j++) {
            if (array[j] < pivo) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[maior];
        array[maior] = temp;
        return i + 1;
    }
}
