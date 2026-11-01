import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reserva {
    private String idReserva;
    private String estadoReserva;
    private Date fechaReserva;
    
    private Usuario usuario;
    private List<Cabina> cabinas;
    private List<ServicioAdicional> serviciosAdicionales;
    private MetodoPago metodoPago;
    private List<NotificacionServicio> notificaciones;

    public Reserva(String idReserva, Usuario usuario, MetodoPago metodoPago) {
        this.idReserva = idReserva;
        this.usuario = usuario;
        this.metodoPago = metodoPago;
        this.estadoReserva = "PENDIENTE";
        this.fechaReserva = new Date();
        this.cabinas = new ArrayList<>();
        this.serviciosAdicionales = new ArrayList<>();
        this.notificaciones = new ArrayList<>();
    }

    public void agregarCabina(Cabina cabina) {
        if (cabina.verificarDisponibilidad()) {
            this.cabinas.add(cabina);
            cabina.cambiarEstado("reservada");
        }
    }

    public void agregarServicioAdicional(ServicioAdicional servicio) {
        this.serviciosAdicionales.add(servicio);
    }

    public void agregarNotificador(NotificacionServicio servicioNotificacion) {
        this.notificaciones.add(servicioNotificacion);
    }

    public double precioTotal() {
        double total = 0.0;
        for (Cabina c : cabinas) {
            total += c.getPrecio();
        }
        for (ServicioAdicional s : serviciosAdicionales) {
            total += s.getCosto();
        }
        return total;
    }

    public void confirmarReserva() {
        if (metodoPago != null && metodoPago.procesarPago()) {
            this.estadoReserva = "CONFIRMADA";
            for (Cabina c : cabinas) {
                c.cambiarEstado("ocupada");
            }
            notificar("Reserva " + idReserva + " confirmada con éxito.");
        } else {
            System.out.println("No se pudo procesar el pago de la reserva.");
        }
    }

    public void cancelarReserva() {
        this.estadoReserva = "CANCELADA";
        for (Cabina c : cabinas) {
            c.cambiarEstado("disponible");
        }
        notificar("Reserva " + idReserva + " ha sido cancelada.");
    }

    private void notificar(String mensaje) {
        for (NotificacionServicio n : notificaciones) {
            n.enviarNotificacion(mensaje);
        }
    }

    // Getters y Setters
    public String getIdReserva() { 
        return idReserva; }
    public String getEstadoReserva() { 
        return estadoReserva; }
    public Date getFechaReserva() { 
        return fechaReserva; }
    public Usuario getUsuario() { 
        return usuario; }
    public List<Cabina> getCabinas() { 
        return cabinas; }
    public List<ServicioAdicional> getServiciosAdicionales() { 
        return serviciosAdicionales; }
}
