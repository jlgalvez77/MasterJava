public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = 'a';
        char arroba = '\u0040';
        char decimal = 64;
        System.out.println("arroba = " + arroba);

        System.out.println("Tipo Char corresponde en byte a: " + Character.BYTES);
        System.out.println("Tipo Char corresponde en bits a: " + Character.SIZE);
        System.out.println("Valor máximo de un Char: " + Character.MAX_VALUE);
        System.out.println("Valor mínimo de un Char: " + Character.MIN_VALUE);

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';
    }
}
