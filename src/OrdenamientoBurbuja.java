public class OrdenamientoBurbuja {

    //Ordenamiento de burbuja
    public static void burbuja(Integer[] data){
        boolean swapped;
        for (int i = 0; i < data.length - 1; i++){ //Bucle externo
            swapped = false;
            for (int j = 0; j < data.length - 1 - i; j++){ //Bucle interno (Comparaciones y Swaps)
                if (data[j] > data[j + 1]){ //Comparar e Intercambiar si es Necesario
                    Integer temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true; //Hubo un intercambio
                }
            }
            if (!swapped) break; // Si no hubo intercambios, el array ya está ordenado
        }
    }
}
