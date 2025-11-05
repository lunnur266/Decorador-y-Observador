public class PantallaAlerta implements Observador {
    private float temperatura;

    public void actualizar(float temperatura, float humedad, float presion) {
        this.temperatura = temperatura;
        verificarAlerta();
    }

    public void verificarAlerta() {
        if (temperatura > 30) {
            System.out.println("Sofocante  Alerta: ¡Temperatura alta!");
        } else if (temperatura < 10) {
            System.out.println("Helada  Alerta: ¡Temperatura muy baja!");
        } else {
            System.out.println("Templado Clima estable.");
        }
    }
}
