import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


    int a []= {1,2,3,4,5,6,7,8,9,10};
    int pos = busqueda_binaria(a,7,0,a.length-1);
    if(pos ==-1){
        System.out.println("El dato no esta en el array");
    }else {
        System.out.println("el dato se encuentra en la posicion: "+pos);
    }




    }
    public static int busquedaBinarias(int []a,int dato) {
        int inicio = 0, mitad, fin = a.length - 1;

        while (inicio <= fin) {
            mitad = (inicio + fin) / 2;
            if (a[mitad] == dato) {
                return mitad+1;
            } else if (a[mitad] < dato) {
                inicio = mitad + 1;
            } else {
                fin = mitad - 1;
            }
        }
        return -1;

    }
    public  static int busqueda_binaria(int a[],int dato,int inicio,int fin){
    int mitad = (inicio+fin)/2;
    //caso base
        if (a[mitad] == dato){
            return mitad;
        }
        if (inicio >fin){
            return-1;
        }
    //caso  general
        if (dato < a[mitad]) {
            return busqueda_binaria(a,dato,inicio,mitad-1);
        }else {
            return busqueda_binaria(a,dato,mitad+1,fin);
        }

    }
}
