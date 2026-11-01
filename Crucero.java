import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Crucero {
    private String idCrucero;
    private String nombre;
    private String ruta;
    private Date fechaSalida;
    private List<Cabina> cabinas;

    public Crucero(String idCrucero, String nombre, String ruta, Date fechaSalida) {
        this.idCrucero = idCrucero;
        this.nombre = nombre;
        this.ruta = ruta;
        this.fechaSalida = fechaSalida;
        this.cabinas = new ArrayList<>();
    }

    public void agregarCabina(Cabina cabina) {
        this.cabinas.add(cabina);
    }

    public String obtenerDetalles() {
        return "Crucero: " + nombre + " | Ruta: " + ruta + " | Fecha de Salida: " + fechaSalida;
    }

    public void actualizarItinerario(String nuevaRuta) {
        this.ruta = nuevaRuta;
        System.out.println("Itinerario actualizado a: " + nuevaRuta);
    }

    public String getIdCrucero() { 
        return idCrucero; }
    public String getNombre() { 
        return nombre; }
    public String getRuta() { 
        return ruta; }
    public Date getFechaSalida() { 
        return fechaSalida; }
    public List<Cabina> getCabinas() { 
        return cabinas; }
}