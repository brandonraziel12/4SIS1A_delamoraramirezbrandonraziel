import java.util.Scanner;
import java.lang.Math;

//libreria math es para el uso de raiz cuadrada y potencias, asi como numero de euler pi, etc

public class Figuras {

    //variables globales
    double lado, altura, area, perimetro, lado2, lado3, base;
    int opcion, opcion1;
    char letra;

    //objeto
    Scanner entrada = new Scanner(System.in);

    //metodos

    public void menu(){
        /**
         * vamos a realizar un prgorama que se encargue del calculo del area y perimetro de cuadrado, triangulo, rectangulo y circulo
         */

        do{
            System.out.println("Programa para el calculo de area y perimetro de figuras");
            System.out.println("Elija una opcion deseada: ");
            System.out.println("1.- Cuadrado");
            System.out.println("2.- Triangulo");
            System.out.println("3.- Circulo");
            System.out.println("4.- Rectangulo");
            System.out.println("5.- Salir");

            opcion = entrada.nextInt();

            switch(opcion){
                case 1: 
                    calcularCuadrado();
                    break;
                case 2: 
                    calcularTriangulo();
                    break;
                case 3: 
                    calcularCirculo();
                    break;
                case 4: 
                    calcularRectangulo();
                    break;
                default:
                    System.out.println("Gracias por ocupar este programa saluditos");
                    break;
            }
            System.out.println("¿Desea repetir el programa?, escriba S para repetir ");
            letra = entrada.next().charAt(0);

        }while(letra == 's' || letra == 'S');
    }

    public void calcularCuadrado(){
        try{
            System.out.println("Ingrese el valor del lado del cuadrado: ");
            lado = entrada.nextDouble();
            perimetro = lado*4;
            area = lado*lado;
            System.out.println("El perimetro es de: " +perimetro + " el area es de: " + area);

        }catch(Exception e){
            System.out.println("Ingrese unicamente valores numericos");
            System.out.println("Error: " + e.getMessage());

        }
    }

    public void calcularTriangulo(){
        
        System.out.println("ingrese 1 para el area y 2 para el perimetro : ");
        opcion = entrada.nextInt();

        switch(opcion){
            case 1:
               
                    try{
                        System.out.println("Ingresa la base del triangulo: ");
                    
                        base = entrada.nextDouble();
                        System.out.println("Ingrese la altura del triangulo: ");
                        altura = entrada.nextDouble();
                        area = (base*altura)/2;
                        System.out.println("El area del triangulo es: " + area);

                    }catch(Exception e){
                        System.out.println("Ingrese unicamente valores numericos");
                        System.out.println("Error: " + e.getMessage());
                        System.out.println(e.getStackTrace()); //obtiene la raiz del problema

                    }
                
                break;
        
            case 2:
            System.out.println("Seleccione el tipo de triangulo a calcular: ");
            System.out.println("1.- Triangulo equilatero ");
            System.out.println("2.- Triangulo isoceles ");
            System.out.println("3.- Triangulo escaleno ");
            opcion1 = entrada.nextInt();
            switch(opcion1){
                case 1:

                try{
                    System.out.println("Ingresa lado del triangulo equilatero: ");
                    lado = entrada.nextDouble();
                    perimetro = lado*3;
                    System.out.println("El perimetro del triangulo equilatero es: " + perimetro);

                }catch(Exception e){
                    System.out.println("Ingrese unicamente valores numericos");
                    System.out.println("Error: " + e.getMessage());
                    System.out.println(e.getStackTrace()); //obtiene la raiz del problema

                }
                break;

                
                case 2:
                try{
                    System.out.println("Ingresa lado A del triangulo isoceles: ");
                    lado = entrada.nextDouble();
                    System.out.println("Ingresa lado B del triangulo isoceles: ");
                    lado2 = entrada.nextDouble();
                    perimetro = (2*lado)+lado2;
                    System.out.println("El perimetro del triangulo isoceles es: " + perimetro);

                }catch(Exception e){
                    System.out.println("Ingrese unicamente valores numericos");
                    System.out.println("Error: " + e.getMessage());
                    System.out.println(e.getStackTrace()); //obtiene la raiz del problema

                }
                break;


                case 3:
                try{
                    System.out.println("Ingresa lado A del triangulo escaleno: ");
                    lado = entrada.nextDouble();
                    System.out.println("Ingresa lado B del triangulo escaleno: ");
                    lado2 = entrada.nextDouble();
                    System.out.println("Ingresa lado C del triangulo escaleno: ");
                    lado3 = entrada.nextDouble();
                    perimetro = lado+lado2+lado3;
                    System.out.println("El perimetro del triangulo escaleno es: " + perimetro);

                }catch(Exception e){
                    System.out.println("Ingrese unicamente valores numericos");
                    System.out.println("Error: " + e.getMessage());
                    System.out.println(e.getStackTrace()); //obtiene la raiz del problema

                }
                
                break;

            }
                //ahi lo hacen de tarea, porque quiero que identifique si es un triangulo equilatero, escaleno o isoseles
                break;
            default:
                System.out.println("Opcion invalida ayoss");
                break;
        }
    }

    public void calcularCirculo(){
        System.out.println("ingrese 1 para el area y 2 para el perimetro : ");
        opcion = entrada.nextInt();

        switch(opcion){
            case 1:
                System.out.println("Ingresa el radio del circulo: ");
                lado = entrada.nextDouble();

                //pi * r* r
                area = Math.PI*lado*lado;
                System.out.println("El area es de: " + area);
                break;
            case 2:
                System.out.println("Ingrese el diametro del circulo: ");
                lado = entrada.nextDouble();

                //PI * diametro
                perimetro = Math.PI*lado;
                System.out.println("El perimetro es de : " + perimetro);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

        
    }

    public void calcularRectangulo(){
        try{
            System.out.println("Ingrese el valor del lado A del rectangulo: ");
            lado = entrada.nextDouble();
            System.out.println("Ingrese el valor del lado B del rectangulo: ");
            lado2 = entrada.nextDouble();
            perimetro = (lado*2)+(lado2*2);
            area = lado*lado2;
            System.out.println("El area del rectangulo es de: " + area);
            System.out.println("El perimetro del rectangulo es de: " + perimetro );

        }catch(Exception e){
            System.out.println("Ingrese unicamente valores numericos");
            System.out.println("Error: " + e.getMessage());

        }
        //tarea wiiii para que ahorita lo acaben *w*
        
    }
    
}