

import java.util.List;

public class PersonalAcademico extends Usuario {

    // Constructor actualizado
    public PersonalAcademico(String Usuario, String contrasena, String nombre, String apellido, List<Incidente> incidentesReportados) {
        super(Usuario, contrasena, nombre, apellido, incidentesReportados);
    }

    public void reportarError(String email, String contenido) {
        System.out.println("Error reportado en: " + email + " - Comentario: " + contenido);
    }

    public void solicitarAsesoramientoDelSistema(String email, String contenido) {
        System.out.println("Asesoramiento solicitado - Tema: " + email + " - Comentario: " + contenido);
    }

    // public void comentarEnForo(Foro foro, String comentario) {
    //     System.out.println("Comentario en foro " + foro.getId() + ": " + comentario);
    // }
}

