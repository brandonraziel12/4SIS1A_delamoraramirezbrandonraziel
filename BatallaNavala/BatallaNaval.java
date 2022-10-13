

import java.util.Scanner;
import javax.swing.JOptionPane;


public class BatallaNaval {
public static void main (String[]args){
Scanner in = new Scanner(System.in);
int nave=0;
int fila = 0;
int columna = 0;
int numero;
//Bienvenida y Menu principal
JOptionPane.showMessageDialog(null,"Bienvenido a BATALLA NAVAL");
do{
String menu = JOptionPane.showInputDialog("Menú principal \n 1.Nueva Partida \n 2.Continuar \n 0.Salir");
numero= Integer.parseInt(menu);
if(numero ==1){
partidaNueva(nave, fila, columna);
}else{
continuar();
}return;
}while (numero ==0);
}

private static void partidaNueva(int nave, int fila, int columna) {
String nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre: ");// showinputdialog es para mostrar el texto y da un cuadro para ingresar datos
nombreUsuario = nombreUsuario.toUpperCase();// cambiarlo a mayuscula
JOptionPane.showMessageDialog(null, "Hola, "+nombreUsuario);
System.out.println(" "+nombreUsuario);


int matrizU [] [] = new int [10] [10] ;
for(int i = 0; i<matrizU.length; i++){
for(int j = 0; j<matrizU[i].length; j++){
matrizU [i] [j] = 0;
System.out.print(matrizU[i][j]+" " );
}
System.out.println();
}

System.out.println(" ");

//Matriz de la computadora

System.out.println(" COMPUTADORA");
int matrizC [] [] = new int [10] [10];
for(int r = 0; r<matrizC.length; r++){
for(int s = 0; s<matrizC[r].length; s++){
System.out.print("[]");
}
System.out.println();
}
boolean condicion;
condicion= true;
while (true){
condicion= true;

//Informacion sobre los tipos de naves, y espacios que utiliza

String eleccion = JOptionPane.showInputDialog("Información de las naves(Seleccione el numero de nave): \n 1- Submarino, son 4 en el campo, ocupan 1 posicion y se representan con un 1"
+ "\n 2- Destructores, son 3 en el campo, ocupan 2 posiciones y se representan con un 2"
+ "\n 3- Cruceros, son 2 en el campo, ocupan 3 posiciones y se representan con un 3"
+ "\n 4- Acorazados, es 1 en el campo, ocupa 4 posiciones y se presentan con un 4");


//Solicitud de filas y columnas
//fila
String numeroFila = JOptionPane.showInputDialog("Ingrese un numero de fila entre 1 y 10: ");
JOptionPane.showMessageDialog(null, "El numero ingresado es: "+numeroFila);

//columna
String numeroColumna = JOptionPane.showInputDialog("Ingrese un numero de columna entre 1 y 10: ");

//conversion de String a int

nave = Integer.parseInt(eleccion);
fila = Integer.parseInt(numeroFila);
columna = Integer.parseInt(numeroColumna);

//if para verificar si hay espacio

if(fila == 1 && nave == 4 || fila == 2 && nave == 4 || fila == 3 && nave == 4 || fila == 1 && nave == 3 ||
fila == 2 && nave == 3 || fila == 1 && nave == 2 || fila == 10 && nave == 4 || fila == 9 && nave == 4 ||
fila == 8 && nave == 4 || fila == 10 && nave == 3 || fila == 9 && nave == 3 || fila == 10 && nave == 2||
columna == 1 && nave == 4 ||columna == 1 && nave == 3 ||columna == 1 && nave == 2 ||columna == 2 && nave == 4 ||
columna == 2 && nave == 3 || columna == 3 && nave == 4){
JOptionPane.showMessageDialog(null, "ATENCION, la nave no puede ser colocada debido a falta de espacio");
}else{ if(nave == 4){ // aqui se colocan los numeros en la matriz
matrizU [fila][columna] = nave;
matrizU [fila-1][columna-1] = nave;
matrizU[fila-2][columna-2] = nave;
matrizU[fila-3][columna-3] = nave;
matrizU[fila+1][columna+1] = nave;
matrizU[fila+2][columna+2] = nave;
matrizU[fila+3][columna+3] = nave;
}

}
}
}
// para ver si desea continuar y el nivel que desea jugar
private static void continuar() {
Scanner in= new Scanner (System.in);
String nivel = JOptionPane.showInputDialog("Que nivel desea: 1:Facil 2:Dificil ");
nivel = in.nextLine();
JOptionPane.showMessageDialog(null, "Bienvenido al nivel:"+nivel);
}
}