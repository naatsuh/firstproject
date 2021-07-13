package com.laercio.firstproject.controller;

import com.laercio.firstproject.model.Usuario;
import com.laercio.firstproject.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> listaDeUsuario () {
        return usuarioRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario cadastroDeUsuario (@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
