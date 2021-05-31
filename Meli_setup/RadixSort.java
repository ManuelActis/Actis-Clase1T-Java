//Version del radix sort sin templates investigada de internet

public class RadixSort {

    public void sortearConteos(int iArray[], int tamanio, int posicion) {
        int[] salida = new int[tamanio + 1];
        int iMax = iArray[0];
        for (int i = 1; i < tamanio; i++)
        {
            if (iArray[i] > iMax)
                iMax = iArray[i];
        }
        int[] contador = new int[iMax + 1];

        for (int i = 0; i < iMax; ++i)
            contador[i] = 0;

            // Calculas cantidad de elementos
            for (int i = 0; i < tamanio; i++)
                contador[(iArray[i] / posicion) % 10]++;

            // Cuenta acumulador
            for (int i = 1; i < 10; i++)
                contador[i] += contador[i - 1];

            // Posiciona elementos en orden
            for (int i = tamanio - 1; i >= 0; i--) {
                salida[contador[(iArray[i] / posicion) % 10] - 1] = iArray[i];
                contador[(iArray[i] / posicion) % 10]--;
            }

            for (int i = 0; i < tamanio; i++)
                iArray[i] = salida[i];
        }

        // getter del Maximo

        public int iGetMax(int array[], int n)
        {
            int max = array[0];

            for (int i = 1; i < n; i++)
                if (array[i] > max)
                    max = array[i];

            return max;
        }


        public void radixSort(int array[], int tamanioo) {
            int max = iGetMax(array, tamanioo);
            for (int pos = 1; max / pos > 0; pos *= 10)
                sortearConteos(array, tamanioo, pos);
        }
}
