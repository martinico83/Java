
//Mi clase en Java
public class HolaMundo {

    public static void main(String args[]) {
        var palabra = "HOLA TINO";
        System.out.println(palabra);
        var conComa = 15.699;
        System.out.println(conComa);
        System.out.println(palabra + " " + conComa);
        var nombre = "Martin";
        var segundoNombre = "Nicolas";
        var apellido = "Orona";
        var segundoApellido = "Sacido";
        var nombreCompleto = nombre + " " + segundoNombre + " " + apellido + " " + segundoApellido;
        System.out.println(nombreCompleto);
        var num1 = 1;
        var num2 = 8;
        System.out.println(num1 + num2 + nombre);
        System.out.println(nombre + num1 + num2);
        System.out.println(nombre + (num1 + num2));

    }

}
