public class Ordenamiento {
    public static void ordenarLineal (int []array){
        final int LONG = array.length;
        int buff;
        int vint =0;
        for (int i = 0; i < LONG; i++) {
            System.out.println("Vuelta de afuera: "+ i);
            for (int j = i+1; j < LONG; j++) {
                System.out.println("Vuelta de adentro: "+ j);
                if (array[i]>array[j]){
                  buff = array [i];
                  array[i]=array[j];
                  array[j]=buff;
                }

            }

        }

    }
    public static void ordenarBurbuja(int[] array) {
        final int LONG = array.length;

        for (int i = 0; i < LONG-1; i++) {
            for (int j = 0; j < LONG-1-i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void ordenarBurbujero(int []array){
        final int LONG = array.length;
        boolean orden=false;
        for (int i = 0; i < LONG-1; i++) {
            orden =false;
            for (int j = 0; j < LONG-1-i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    orden = true;
                }

            }
            if (!orden){
                break;
            }


        }

    }

}
