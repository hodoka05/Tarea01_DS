public class Gerencia {
    private String idGerente;

    public Gerencia(String idGerente) {
        this.idGerente = idGerente;
    }

    public void resolverIncidente(Incidente incidente) {
        incidente.actualizarEstado("RESUELTO_POR_GERENCIA");
        System.out.println("Gerente " + idGerente + " resolvió el incidente " + incidente.getIdIncidente());
    }

    public String getIdGerente() { 
        return idGerente; }
}
