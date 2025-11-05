
import java.util.List;
import java.util.ArrayList;

public class EstacionMeteorologica implements Sujeto {
    private List<Observador> observadores;
    private float temperatura;
    private float humedad;
    private float presion;

    public EstacionMeteorologica() {
        observadores = new ArrayList<>();
    }

    public void registrarObservador(Observador o) {
        observadores.add(o);
    }

    public void eliminarObservador(Observador o) {
        observadores.remove(o);
    }

    public void notificarObservadores() {
        for (Observador o : observadores) {
            o.actualizar(temperatura, humedad, presion);
        }
    }

    
    public void setDatos(float temperatura, float humedad, float presion) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
        notificarObservadores();
    }
}
