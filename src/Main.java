
public class Main {

    public static void main(String[] args) {
        Integer[] vals = {4, 1 , 13, 15, 76, 27, 48, 59};
        OrdenamientoSelección.seleccion(vals);

        //System.out.println("Ordenamiento Burbuja:");
        System.out.println("Ordenamiento Por Selección:");
        //System.out.println("Ordenamiento Inserción:");
        //System.out.println("Ordenamiento por montículos (HeapSort):");
        for (Integer val : vals){
            System.out.println(val);
            }
        }
    }
