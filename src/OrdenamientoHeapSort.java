public class OrdenamientoHeapSort {

    // Ordenamiento por montículos (HeapSort)
    public static void heapsort(Integer[] data) {
        // Construimos el montículo inicial con todos los elementos
        data = monticulo(data, data.length);

        // Eliminamos la raíz (el mayor) y reconstruimos el montículo hasta ordenar todos los elementos
        for (int i = 0; i < data.length; i++) {
            // Mueve la raíz del montículo (el mayor) al final del arreglo
            data = eliminarRaiz(data, data.length - i);
            // Reconstruye el montículo sin incluir el elemento que ya está ordenado
            data = monticulo(data, data.length - i - 1);
        }
    }

    // Función para construir un montículo (Heap)
    // Convierte el arreglo en un montículo de tipo "Max-Heap" (el mayor valor en la raíz)
    private static Integer[] monticulo(Integer[] data, int n) {
        for (int i = 0; i < n; i++) {
            // Si el nodo tiene un padre válido
            if (padre(i) != -1) {
                int p = data[padre(i)]; // Valor del padre
                // Si el hijo es mayor que el padre, se intercambian
                if (data[i] > p) {
                    data[padre(i)] = data[i];
                    data[i] = p;
                    // Llamada recursiva para garantizar la propiedad de montículo
                    monticulo(data, n);
                }
            }
        }
        return data;
    }

    // Función para determinar el índice del padre de un nodo en el montículo
    private static int padre(int index) {
        // El primer nodo (índice 0) no tiene padre, devolvemos -1
        return (index == 0) ? - 1 : (index - 1) / 2;
    }

    // Función para eliminar la raíz del montículo
    // Intercambia la raíz (máximo valor) con el último elemento
    private static Integer[] eliminarRaiz(Integer[] data, int n) {
        Integer aux;
        aux = data[n - 1]; // Guardamos el último elemento
        data[n - 1] = data[0]; // Movemos la raíz al final del arreglo
        data[0] = aux; // Colocamos el último elemento en la raíz
        return data;
    }
}


