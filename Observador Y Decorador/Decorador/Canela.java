public class Canela extends DecoradorBebida {
    private Bebida bebida;

    public Canela(Bebida bebida) {
        this.bebida = bebida;
    }

    //--
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Canela";
    }

    //--
    public int getCosto() {
        return bebida.getCosto() + 300;
    }
}
