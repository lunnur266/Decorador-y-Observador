public class Cafeteria {
    public static void main(String[] args) {
        Bebida bebida = new Cafe();              // Café base
        bebida = new Leche(bebida);              // Se le agrega leche o se cambia por la de leche de coco
        bebida = new Canela(bebida);             // Se le agrega canela o cacao en polvo

        System.out.println(bebida.getDescripcion() + " cuesta $" + bebida.getCosto());
    }

}

