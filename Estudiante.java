

import java.util.List;

public class Estudiante extends Usuario {

    // Constructor actualizado
    public Estudiante(String Usuario, String contrasena, String nombre, String apellido, List<Incidente> incidentesReportados) {
        super(Usuario, contrasena, nombre, apellido, incidentesReportados);
    }

    // public void solicitarInscripcionCurso(Curso curso) {
    //     System.out.println("Solicitud de inscripción al curso: " + curso.getNombreCurso());
    // }

    // public void realizarActividadSumativa(Curso curso, ActividadSumativa actividad) {
    //     System.out.println("Actividad " + actividad.getId() + " realizada en el curso: " + curso.getNombreCurso());
    // }
}

