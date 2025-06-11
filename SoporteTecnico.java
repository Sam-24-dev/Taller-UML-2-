import java.util.List;

public class SoporteTecnico extends Usuario {
    private List<Incidente> incidentes;


// Constructor actualizado
    public SoporteTecnico(String Usuario, String contrasena, String nombre, String apellido,
                          List<Incidente> incidentesReportados, List<Incidente> incidentes) {
        super(Usuario, contrasena, nombre, apellido, incidentesReportados);
        this.incidentes = incidentes;
    }

public void brindarAsistencia(Usuario usuario) {
        System.out.println("Asistencia brindada al usuario: " + usuario.getNombre());
    }

    public void resolverProblemaTecnico(Usuario usuario) {
        System.out.println("Problema técnico resuelto para el usuario: " + usuario.getNombre());
    }

    public void derivarProblemaAGestion(Administrador administrador) {
        System.out.println("Problema derivado al administrador: " + administrador.getNombre());
    }

 // Getters y setters de incidentes
    public List<Incidente> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(List<Incidente> incidentes) {
        this.incidentes = incidentes;
    }


}
