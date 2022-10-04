
class EntradaTexto {
    // metodo principal

    public static void main(String[] args) {
        // estructura basica
        // declaracion de variable
        String nombre;
        // mensaje de usuario
        System.out.println("Porfavor introduce tu nombre: ");

        // Ln es salto de linea
        nombre = System.console().readLine();
        System.out.println("Hola " + nombre + " Bienvenido a la tronadera");
    }
}