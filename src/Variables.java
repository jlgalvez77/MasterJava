public class Variables {
    public static void main(String[] args) {
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar.toUpperCase());

        int numero = 10;

        boolean valor = true;
        int numero2 = 5;
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        String nombre;
        nombre = "Jose";

        if (numero > 10){
            nombre = "Juan";
        }
        System.out.println(nombre);
    }
}
