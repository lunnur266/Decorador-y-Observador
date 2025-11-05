public class Leche extends DecoradorBebida {
    private Bebida bebida;

    public Leche(Bebida bebida) {
        this.bebida = bebida;
    }

    //--
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Leche";
    }

    //--
    public int getCosto() {
        return bebida.getCosto() + 500;
    }
}