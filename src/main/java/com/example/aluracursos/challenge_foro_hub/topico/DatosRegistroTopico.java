package com.example.aluracursos.challenge_foro_hub.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotBlank
        String idUsuario,
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje) {

}
