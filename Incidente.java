import java.time.LocalDateTime;
import java.util.List;

public class Incidente {
    protected int id;
    protected LocalDateTime fecha_Reportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List<String>  log_actualizaciones;
    protected LocalDateTime fecha_cerrado;
    protected String tipo ; 
    protected SoporteTecnico soporteTecnico; 
    protected Usuario beneficiario; 




   // Constructor
    public Incidente(int id, LocalDateTime fecha_Reportado, String estado, String titulo,
                     String descripcion, List<String> log_actualizaciones,
                     LocalDateTime fecha_cerrado, String tipo,SoporteTecnico soporteTecnico, Usuario beneficiario) {
        this.id = id;
        this.fecha_Reportado = fecha_Reportado;
        this.estado = estado;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.log_actualizaciones = log_actualizaciones;
        this.fecha_cerrado = fecha_cerrado;
        this.tipo = tipo;
         this.soporteTecnico = soporteTecnico;
        this.beneficiario = beneficiario;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFecha_Reportado() {
        return fecha_Reportado;
    }

    public void setFecha_Reportado(LocalDateTime fecha_Reportado) {
        this.fecha_Reportado = fecha_Reportado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getLog_actualizaciones() {
        return log_actualizaciones;
    }

    public void setLog_actualizaciones(List<String> log_actualizaciones) {
        this.log_actualizaciones = log_actualizaciones;
    }

    public LocalDateTime getFecha_cerrado() {
        return fecha_cerrado;
    }

    public void setFecha_cerrado(LocalDateTime fecha_cerrado) {
        this.fecha_cerrado = fecha_cerrado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
    public SoporteTecnico getSoporteTecnico() { return soporteTecnico; }
    public void setSoporteTecnico(SoporteTecnico soporteTecnico) { this.soporteTecnico = soporteTecnico; }

    public Usuario getBeneficiario() { return beneficiario; }
    public void setBeneficiario(Usuario beneficiario) { this.beneficiario = beneficiario; }









}
