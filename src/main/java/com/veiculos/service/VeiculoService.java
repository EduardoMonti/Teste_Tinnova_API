package com.veiculos.service;

import com.veiculos.model.Veiculo;
import com.veiculos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;


    public Veiculo cadastrar(Veiculo veiculo){

        //Criando veiculo e pegando a data atual
        veiculo.setCriado(new Date());

        //Veiculo ainda disponível
        veiculo.setVendido(false);
        System.out.println(veiculo);
        return veiculoRepository.save(veiculo);
    }

    public void excluir(Long veiculoId){
        veiculoRepository.deleteById(veiculoId);
    }


}
