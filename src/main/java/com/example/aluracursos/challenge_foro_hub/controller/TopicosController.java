package com.example.aluracursos.challenge_foro_hub.controller;

import com.example.aluracursos.challenge_foro_hub.topico.DatosActualizarTopico;
import com.example.aluracursos.challenge_foro_hub.topico.DatosRegistroTopico;
import com.example.aluracursos.challenge_foro_hub.topico.Topico;
import com.example.aluracursos.challenge_foro_hub.topico.TopicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public void restrarTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico){
        topicoRepository.save(new Topico(datosRegistroTopico));
    }

    @GetMapping
    public List<Topico> listadoTopicos(){
        return topicoRepository.findAll();
    }

    @PutMapping
    @Transactional
    public void actualizarTopico(@RequestBody @Valid DatosActualizarTopico datosActualizarTopico){
        Topico topico = topicoRepository.getReferenceById(datosActualizarTopico.id());
        topico.actualizarDatos(datosActualizarTopico);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void eliminarTopico(@PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        topicoRepository.delete(topico);
    }
}
