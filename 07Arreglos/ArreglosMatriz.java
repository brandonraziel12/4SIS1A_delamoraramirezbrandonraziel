import java.util.*;

public class ArreglosMatriz {

    public static void main(String[]args){

    
    /*
     *  // vamos a realizar un arreglo unidiminsional y correrlo para ver que hay dentro de cada elemento
     */

     // definir un arreglo
     // tipo de dato nombre tamaño
     int arreglo[] = new int[10];
     int valor;

     Scanner entrada = new Scaner(System.in);

     for(int j = 0;j < arreglo.length; j++){

        System.out.println("Ingrese el valor de la posicion del arreglo ");
        valor = entrada.nextInt();
     }

     // vamos a recorrerlo
     for(int i = 0;i< arreglo.length;i++){
        System.out.println("La magia: "+ arreglo[i]);

     }

    
}
}
