
public class Main {

    public static void main(String[] args) {
        Integer[] vals = {1, 2 , 3, 5, 6, 7, 8, 9};
        OrdenamientoBurbuja.burbuja(vals);

        System.out.println("Ordenamiento Burbuja:");
        //System.out.println("Ordenamiento Por Selección:");
        //System.out.println("Ordenamiento Inserción:");
        //System.out.println("Ordenamiento por montículos (HeapSort):");
        for (Integer val : vals){
            System.out.println(val);
            }
        }
    }
