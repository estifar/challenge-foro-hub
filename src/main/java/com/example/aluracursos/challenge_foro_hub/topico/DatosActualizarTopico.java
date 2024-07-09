package com.example.aluracursos.challenge_foro_hub.topico;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull
        Long id,
        String titulo,
        String mensaje) {
}
