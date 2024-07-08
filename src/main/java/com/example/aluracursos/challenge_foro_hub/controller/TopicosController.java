package com.example.aluracursos.challenge_foro_hub.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @PostMapping
    public void restrarTopico(@RequestBody String parametro){
        System.out.println("La solicitud llega de forma correcta");
        System.out.println(parametro);
    }
}
