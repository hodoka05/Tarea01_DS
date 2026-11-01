public class Incidente {
    private String idIncidente;
    private String descripcion;
    private int nivel;
    private String estado;
    private Usuario usuario;

    public Incidente(String idIncidente, String descripcion, int nivel, Usuario usuario) {
        this.idIncidente = idIncidente;
        this.descripcion = descripcion;
        this.nivel = nivel;
        this.usuario = usuario;
        this.estado = "ABIERTO";
    }

    public void registrarIncidente() {
        System.out.println("Incidente " + idIncidente + " registrado para el usuario: " + usuario.getNombre());
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Estado del incidente " + idIncidente + " actualizado a: " + nuevoEstado);
    }

    public String getIdIncidente() { 
        return idIncidente; }
    public String getDescripcion() { 
        return descripcion; }
    public int getNivel() { 
        return nivel; }
    public String getEstado() { 
        return estado; }
    public Usuario getUsuario() { 
        return usuario; }
}