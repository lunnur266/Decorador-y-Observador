
public class PantallaTemperatura implements Observador {
    private float temperatura;

    public void actualizar(float temperatura, float humedad, float presion) {
        this.temperatura = temperatura;
        mostrar();
    }

    public void mostrar() {
        System.out.println("Pantalla de Temperatura: " + temperatura + "°C");
    }
}
