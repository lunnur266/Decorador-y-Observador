
public class PantallaPronostico implements Observador {
    private float humedad;
    private float presion;

    public void actualizar(float temperatura, float humedad, float presion) {
        this.humedad = humedad;
        this.presion = presion;
        mostrar();
    }

    public void mostrar() {
        System.out.println("Pantalla de Pronóstico: humedad " + humedad + "%, presión " + presion + " hPa");
    }
}
