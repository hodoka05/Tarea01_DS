public class ServicioAdicional {
private String idServicio;
    private String descripcion;
    private double costo;

    public ServicioAdicional(String idServicio, String descripcion, double costo) {
        this.idServicio = idServicio;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public void personalizarServicio() {
        System.out.println("Personalizando servicio adicional: " + descripcion);
    }

    // Getters y Setters
    public String getIdServicio() { 
        return idServicio; }
    public void setIdServicio(String idServicio) { 
        this.idServicio = idServicio; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { 
        this.descripcion = descripcion; }
    public double getCosto() { 
        return costo; }
    public void setCosto(double costo) { 
        this.costo = costo; }


}
