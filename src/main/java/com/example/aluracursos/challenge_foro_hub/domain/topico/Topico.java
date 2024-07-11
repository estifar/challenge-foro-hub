package com.example.aluracursos.challenge_foro_hub.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idUsuario")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    private String nombre;
    private String correo;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaDeCreacion;
    private LocalDateTime fechaDeActualizacion;

    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.idUsuario = Long.valueOf(datosRegistroTopico.idUsuario());
        this.nombre = datosRegistroTopico.nombre();
        this.correo = datosRegistroTopico.correo();
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.fechaDeCreacion = LocalDateTime.now();
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if (datosActualizarTopico.titulo() != null){
            this.titulo = datosActualizarTopico.titulo();
        }
        if (datosActualizarTopico.mensaje() != null){
            this.mensaje = datosActualizarTopico.mensaje();
        }
        this.fechaDeActualizacion = LocalDateTime.now();
    }
}
