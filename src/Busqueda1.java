import java.util.Arrays;

public class Busqueda1 {

    public static void main(String[] args) {

        int a[]= {1,2,3,4,5,6,7,8,9,10};
        int pos= busquedaLineal(a,11);
        if(pos ==-1){
            System.out.println("El dato no esta en el array");
        }else {
            System.out.println("el dato se encuentra en la posicion: "+pos);
        }

    }
    public static int busquedaBinaria(int[] arr, int x) {
        int inicio = 0;
        int fin = arr.length - 1;
        int medio;
        int loop = 0;

        while (inicio <= fin) {
            medio = inicio + (fin - inicio) / 2;
            System.out.println("Medio: " + arr[medio]);

            if (arr[medio] == x) {
                return medio;
            }

            if (arr[medio] < x) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
            loop++;
            System.out.println("Loop nro : " + loop);
        }

        return -1;
    }
    public static int busquedaLineal (int[] arr, int x){
        int fin = arr.length -1;
        int i = 0;
        while (i <= fin ){
            if (arr[i] == x){
                return i;
            }
            i++;
        }

        return -1;
    }
    public static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;

        // Algoritmo de burbuja
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                // Intercambiar si el elemento actual es mayor que el siguiente
                if (arreglo[j] > arreglo[j+1]) {
                    // Intercambiar arreglo[j] y arreglo[j+1]
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temp;
                }
            }
        }
    }
}


