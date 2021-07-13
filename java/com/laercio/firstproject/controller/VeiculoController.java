package com.laercio.firstproject.controller;

import com.laercio.firstproject.model.Veiculo;
import com.laercio.firstproject.repository.VeiculoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoRepository veiculoRepository;

    @GetMapping
    public List<Veiculo> listaDeVeiculos () {
        return veiculoRepository.findAll();
    }

    @GetMapping("/{idusuario}")
    public ResponseEntity<List<Veiculo>> listarDeVeiculosPorUsuario (@PathVariable Long idusuario) {
        return new ResponseEntity<List<Veiculo>>(veiculoRepository.findByidusuario(idusuario), HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Veiculo cadastroDeVeiculo (@RequestBody Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }


}
