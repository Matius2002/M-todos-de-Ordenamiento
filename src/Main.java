
public class Main {

    public static void main(String[] args) {
        Integer[] vals = {15, 60 , 8, 16, 44, 27, 12, 35};
        OrdenamientoHeapSort.heapsort(vals);

        //System.out.println("Ordenamiento Burbuja:");
        //System.out.println("Ordenamiento Por Selección:");
        //System.out.println("Ordenamiento Inserción:");

        System.out.println("Ordenamiento por montículos (HeapSort):");
        for (Integer val : vals){
            System.out.println(val);
            }
        }
    }
