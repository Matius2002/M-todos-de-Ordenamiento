public class OrdenamientoHeapSort {

    //Ordenamiento por montículos
    public static void heapsort(Integer[] data) {
        data = monticulo(data, data.length);
        for (int i = 0; i < data.length; i++) {
            data = eliminarRaiz(data, data.length - i);
            data = monticulo(data, data.length - i - 1);
        }
    }

    //Función para construir montículo
    private static Integer[] monticulo(Integer[] data, int n) {
        for (int i = 0; i < n; i++) {
            if (padre(i) != -1) {
                int p = data[padre(i)];
                if (data[i] > p) {
                    data[padre(i)] = data[i];
                    data[i] = p;
                    monticulo(data, n);
                }
            }
        }
        return data;
    }

    //Función para determinar padres
    private static int padre(int index) {
        return (index == 0) ? - 1 : (index - 1) / 2;
    }

    //Función para eliminar padres
    private static Integer[] eliminarRaiz(Integer[] data, int n) {
        Integer aux;
        aux = data[n - 1];
        data[n - 1] = data[0];
        data[0] = aux;
        return data;
    }
}


