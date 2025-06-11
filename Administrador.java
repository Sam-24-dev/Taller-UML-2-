public class Administrador extends Usuario {

    // Constructor
    public Administrador(String Usuario, String contrasena, String nombre,String apellido) {
        super(Usuario, contrasena, nombre,apellido);
    }



    // Método para crear un nuevo usuario con rol (simplificado)
    public Usuario crearUsuarioConRol(String usuario, String contraseña) {
        return new Usuario(usuario, contraseña, "Nombre Usuario","Apellido Usuario");
    }

    // Método para asignar permisos (representado como mensaje)
    public void asignarPermiso(String usuario) {
       
    }

    // Método para actualizar el software
    public void actualizarSoftware() {
        
    }

    // Método para asignar un profesor responsable a un curso
    //public void asignarResponsable(Curso curso, Profesor profesor) {
      //  curso.setResponsable(profesor);
        //System.out.println("Profesor " + profesor.getNombre() + " asignado como responsable del curso: " + curso.getNombreCurso());
   // }






    
}
