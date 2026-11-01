import java.util.ArrayList;
import java.util.List;

public class Operador {
    private String idOperador;
    private String cargo;
    private List<Crucero> crucerosAsignados;

    public Operador(String idOperador, String cargo) {
        this.idOperador = idOperador;
        this.cargo = cargo;
        this.crucerosAsignados = new ArrayList<>();
    }

    public void administrarCrucero(Crucero crucero) {
        this.crucerosAsignados.add(crucero);
        System.out.println("Crucero " + crucero.getNombre() + " asignado al operador " + idOperador);
    }

    public void modificarItinerario(Crucero crucero, String nuevaRuta) {
        crucero.actualizarItinerario(nuevaRuta);
    }

    public void aplicarCancelacion(Reserva reserva) {
        reserva.cancelarReserva();
        System.out.println("Cancelación aplicada por el operador.");
    }

    public String getIdOperador() { 
        return idOperador; }
    public String getCargo() { 
        return cargo; }
}