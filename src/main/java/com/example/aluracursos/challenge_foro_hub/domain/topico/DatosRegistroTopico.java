package com.example.aluracursos.challenge_foro_hub.domain.topico;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTopico(

        String idUsuario,
        @NotBlank
        String nombre,
        @NotBlank
        @Email
        String correo,
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje) {

}
