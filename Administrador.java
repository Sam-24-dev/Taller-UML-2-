
import java.util.List;

public class Administrador extends Usuario {
// Constructor actualizado
    public Administrador(String Usuario, String contrasena, String nombre, String apellido, List<Incidente> incidentesReportados) {
        super(Usuario, contrasena, nombre, apellido, incidentesReportados);
    }

    // Crear usuario (simulado)
    public Usuario crearUsuarioConRol(String usuario, String contrasena, List<Incidente> incidentes) {
        return new Usuario(usuario, contrasena, "Nombre Usuario", "Apellido Usuario", incidentes);
    }

    public void asignarPermiso(String usuario) {
        System.out.println("Permiso asignado al usuario: " + usuario);
    }

    public void actualizarSoftware() {
        System.out.println("Software actualizado por el administrador.");
    }

    // public void asignarResponsable(Curso curso, Profesor profesor) {
    //     curso.setResponsable(profesor);
    //     System.out.println("Profesor " + profesor.getNombre() + " asignado al curso: " + curso.getNombreCurso());
    // }





    
}
