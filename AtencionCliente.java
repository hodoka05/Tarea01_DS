import java.util.ArrayList;
import java.util.List;

public class AtencionCliente {
    private String idAgente;
    private List<Incidente> incidentesAtendidos;

    public AtencionCliente(String idAgente) {
        this.idAgente = idAgente;
        this.incidentesAtendidos = new ArrayList<>();
    }

    public void atenderIncidente(Incidente incidente) {
        incidentesAtendidos.add(incidente);
        incidente.actualizarEstado("EN_PROCESO");
        System.out.println("Agente " + idAgente + " atendiendo incidente: " + incidente.getDescripcion());
    }

    public void escalarIncidente(Incidente incidente, Gerencia gerencia) {
        System.out.println("Agente " + idAgente + " escalando incidente " + incidente.getIdIncidente() + " a Gerencia.");
        gerencia.resolverIncidente(incidente);
    }

   
    public String getIdAgente() { return idAgente; }
}