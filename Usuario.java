import java.util.List;

public class Usuario {
   protected String Usuario;
    protected String contrasena;
    protected String nombre;
    protected String apellido;
    private List<Incidente> incidentesReportados;

    protected Usuario(String Usuario, String contrasena, String nombre, String apellido,List<Incidente> incidentesReportados) {
        this.Usuario = Usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido= apellido;
       this.incidentesReportados = incidentesReportados;


    }
     // Método login
    protected boolean login(String Usuario, String contrasena) {
        return this.Usuario.equals(Usuario) && this.contrasena.equals(contrasena);
    }

    // Método logout (puede ser más útil con sesiones, aquí es simple)
    protected void logout() {
        System.out.println(nombre + " ha cerrado sesión.");
    }


    // Getters y Setters
    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

     public List<Incidente> getIncidentesReportados() {
        return incidentesReportados;
    }

    public void setIncidentesReportados(List<Incidente> incidentesReportados) {
        this.incidentesReportados = incidentesReportados;
    }



}