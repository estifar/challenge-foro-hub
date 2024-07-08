package com.example.aluracursos.challenge_foro_hub.controller;

import com.example.aluracursos.challenge_foro_hub.topico.DatosRegistroTopico;
import com.example.aluracursos.challenge_foro_hub.topico.Topico;
import com.example.aluracursos.challenge_foro_hub.topico.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public void restrarTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico){
        topicoRepository.save(new Topico(datosRegistroTopico));
        System.out.println(datosRegistroTopico);
    }
}
