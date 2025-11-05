public class Cafeteria {
    public static void main(String[] args) {
        Bebida bebida = new Cafe();              // Café base
        bebida = new Leche(bebida);              // Se le agrega leche
        bebida = new Canela(bebida);             // Se le agrega canela

        System.out.println(bebida.getDescripcion() + " cuesta $" + bebida.getCosto());
    }
}