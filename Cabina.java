public class Cabina {
   private String idCabina;
    private String tipo;
    private String estado;
    private double precio;

    public Cabina(String idCabina, String tipo, String estado, double precio) {
        this.idCabina = idCabina;
        this.tipo = tipo;
        this.estado = estado;
        this.precio = precio;
    }

    public boolean verificarDisponibilidad() {
        return "disponible".equalsIgnoreCase(estado);
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public String getIdCabina() { 
        return idCabina; }
    public void setIdCabina(String idCabina) { 
        this.idCabina = idCabina; }
    public String getTipo() { 
        return tipo; }
    public void setTipo(String tipo) { 
        this.tipo = tipo; }
    public String getEstado() { 
        return estado; }
    public double getPrecio() { 
        return precio; }
    public void setPrecio(double precio) { 
        this.precio = precio; }

}
