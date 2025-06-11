public class PersonalAcademico extends Usuario {

// Constructor
    public PersonalAcademico(String Usuario, String contrasena, String nombre,String apellido) {
        super(Usuario, contrasena, nombre,apellido);
    }

    public void reportarError(String email, String comntenido) {
        System.out.println("Error reportado en: " + email + " - Comentario: " + comntenido);
    }

    public void solicitarAsesoramientoDelSistema(String email, String contenido) {
        System.out.println("Asesoramiento solicitado - Tema: " + email + " - Comentario: " + contenido);
    }

   // public void comentarEnForo(Foro foro, String comentario) {
     //   System.out.println("Comentario en foro " + foro.getId() + ": " + comentario);
    //}

}