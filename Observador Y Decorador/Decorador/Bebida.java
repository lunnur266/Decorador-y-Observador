public abstract class Bebida {
    protected String descripcion = "Bebida desconocida";

    public String getDescripcion() {
        return descripcion;
    }

    public abstract int getCosto();
}