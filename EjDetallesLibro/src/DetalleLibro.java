import java.util.Scanner;

public class DetalleLibro {
    public static void main(String[] args) {
        Scanner consola = new Scanner (System.in);
        System.out.println("Ingrese el titulo del libro: ");
        var titulo = consola.nextLine();
        System.out.println("Ingrese el nombre del autor: ");
        var autor = consola.nextLine();
        System.out.println(titulo + ". Fue escrito por: " + autor);
    }
    
}
