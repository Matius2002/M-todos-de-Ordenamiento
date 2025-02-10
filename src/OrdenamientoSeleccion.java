public class OrdenamientoSeleccion {

    //Ordenamiento por selección
    public static void seleccion(Integer[] data){
        for (int i = 0; i < data.length - 1; i++) { //Bucle externo (Recorre posición del arreglo)
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) { //Bucle interno (Busca el menor elemento)
                if (data[j] < data[minIndex]) {
                    minIndex = j; //Guarda la posición del número más pequeño

                }
            }

            //Intercambio solo si encontró un menor valor
            if (minIndex != i) {
                Integer aux = data[i];
                data[i] = data[minIndex];
                data[minIndex] = aux;
            }
        }
    }
}
