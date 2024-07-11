package com.example.aluracursos.challenge_foro_hub.controller;


import com.example.aluracursos.challenge_foro_hub.topico.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public ResponseEntity<DatosRespuestaTopico> registrarTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico,
                                                                UriComponentsBuilder uriComponentsBuilder) {
        Topico topico = topicoRepository.save(new Topico(datosRegistroTopico));
        DatosRespuestaTopico datosRespuestaTopico = new DatosRespuestaTopico(
                topico.getIdUsuario(),
                topico.getNombre(),
                topico.getCorreo(),
                topico.getTitulo(),
                topico.getMensaje()
        );

        URI url = uriComponentsBuilder.path("/topicos/{idUsuario}")
                .buildAndExpand(topico.getIdUsuario())
                .toUri();
        return ResponseEntity.created(url).body(datosRespuestaTopico);
    }

    @GetMapping
    public ResponseEntity<List<Topico>> listadoTopicos() {
        return ResponseEntity.ok(topicoRepository.findAll());
    }


    @PutMapping
    @Transactional
    public ResponseEntity actualizarTopico(@RequestBody @Valid DatosActualizarTopico datosActualizarTopico) {
        Topico topico = topicoRepository.getReferenceById(datosActualizarTopico.id());
        topico.actualizarDatos(datosActualizarTopico);
        var datosActualizados = new DatosActualizarTopico(
                topico.getIdUsuario(),
                topico.getTitulo(),
                topico.getMensaje() + " Fecha de actualizacion: " + LocalDateTime.now());
        return ResponseEntity.ok(datosActualizados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> eliminarTopico(@PathVariable Long id) {
        Topico topico = topicoRepository.getReferenceById(id);
        topicoRepository.delete(topico);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DatosRespuestaTopico> retornaDatosTopico(@PathVariable Long id) {
        Topico topico = topicoRepository.getReferenceById(id);
        var datosTopicos = new DatosRespuestaTopico(
                topico.getIdUsuario(),
                topico.getNombre(),
                topico.getCorreo(),
                topico.getTitulo(),
                topico.getMensaje());
        return ResponseEntity.ok(datosTopicos);
    }
}
