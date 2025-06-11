public class SoporteTecnico extends Usuario {
    

// Constructor
    public SoporteTecnico(String Usuario, String contrasena, String nombre,String apellido) {
        super(Usuario, contrasena, nombre,apellido);
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




}
