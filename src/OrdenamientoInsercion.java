public class OrdenamientoInsercion {

    //Ordenamiento por inserción
    public static void insercion(Integer[] data){
        for (int i = 1; i < data.length; i++){ //Inicialización del bucle externo
            Integer aux = data[i]; //Guardar el valor actual en una variable auxiliar
            int j = i - 1;
            while (j >= 0 && data[j] > aux){ //Desplazar los elementos mayores hacia la derecha
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = aux; //Insertar el valor a su posición correcta
        }
    }
}
