package com.veiculos.controller;

import com.veiculos.model.Veiculo;
import com.veiculos.repository.VeiculoRepository;
import com.veiculos.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @Autowired
    private VeiculoRepository veiculoRepository;

    @PostMapping
    public Veiculo cadastrar(@RequestBody Veiculo veiculo){

        return veiculoService.cadastrar(veiculo);
    }

    @GetMapping
    public List<Veiculo> listar(){
        return veiculoRepository.findAll();
    }

    @DeleteMapping("/{veiculoId}")	public ResponseEntity<Void>
    excluir(@PathVariable Long veiculoId){
        if(!veiculoRepository.existsById(veiculoId)) {
            return ResponseEntity.notFound().build();}
        veiculoService.excluir(veiculoId);
        return ResponseEntity.noContent().build();}




}
