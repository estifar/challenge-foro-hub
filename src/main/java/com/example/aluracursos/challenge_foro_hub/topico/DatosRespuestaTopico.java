package com.example.aluracursos.challenge_foro_hub.topico;

public class DatosRespuestaTopico {
    private Long idUsuario;
    private String nombre;
    private String correo;
    private String titulo;
    private String mensaje;

    public DatosRespuestaTopico(Long idUsuario, String nombre, String correo, String titulo, String mensaje) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.titulo = titulo;
        this.mensaje = mensaje;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensaje() {return mensaje;
    }
}
