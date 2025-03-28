import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScaner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try{
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr);
        } catch (InputMismatchException e){
            System.out.println("Error, debe introducir un número entero.");
            main(args);
            System.exit(0);
        }

        System.out.println("numero Decimal = " + numeroDecimal);

        String resultadoBinario = "Número Binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "Número Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHexadecimal = "Número Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje+= "\n" + resultadoOctal;
        mensaje+= "\n" + resultadoHexadecimal;

        System.out.println(mensaje);

    }
}
