public class AppClima {
    public static void main(String[] args) {
        EstacionMeteorologica estacion = new EstacionMeteorologica();

        Observador temp = new PantallaTemperatura();
        Observador pron = new PantallaPronostico();
        Observador alerta = new PantallaAlerta();

        estacion.registrarObservador(temp);
        estacion.registrarObservador(pron);
        estacion.registrarObservador(alerta);

        System.out.println("---- Primera actualización ----");
        estacion.setDatos(28, 65, 1013);

        System.out.println("\n---- Segunda actualización ----");
        estacion.setDatos(35, 70, 1008);
    }
}
