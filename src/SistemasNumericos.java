import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingresa un número entero");
        int numeroDecimal = Integer.parseInt(numeroStr);
        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        String resultadoOctal = "Número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        String resultadoHexadecimal = "Número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexadecimal);

        String mensaje = resultadoBinario;
        mensaje+= "\n" + resultadoOctal;
        mensaje+= "\n" + resultadoHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);

    }
}
