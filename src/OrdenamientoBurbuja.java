public class OrdenamientoBurbuja {

    //Ordenamiento de burbuja
    public static void burbuja(Integer[] data){
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data.length - 1; j++){
                if (data[j] > data[j + 1]){
                    Integer temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
}
