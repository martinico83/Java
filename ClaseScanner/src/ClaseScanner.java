import java.util.Scanner;

public class ClaseScanner {
    public static void main(String args[]){
        System.out.println("Ingrese un nombre: ");
        Scanner consola = new Scanner (System.in); 
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Ingrese un titulo: ");
        var titulo = consola.nextLine();
        System.out.println("Resultado = " + titulo + " " + usuario);
    }
}