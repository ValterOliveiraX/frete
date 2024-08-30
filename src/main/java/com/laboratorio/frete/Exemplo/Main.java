package com.laboratorio.frete.Exemplo;

import com.laboratorio.frete.model.Cidade;
import com.laboratorio.frete.DAO.*;
public class Main {

    public static void main(String[] args) {
        CidadeDAO cidadeDAO = new CidadeDAO();

        // Criando e salvando uma nova cidade
     //   Cidade cidade = new Cidade("São Paulo", "SP");
       // cidadeDAO.save(cidade);

        // Buscando uma cidade por ID
        Cidade cidadeEncontrada = cidadeDAO.findById(1L);
        System.out.println("Cidade encontrada: " + cidadeEncontrada.getNome() + ", " + cidadeEncontrada.getEstado());

        // Atualizando uma cidade
        cidadeEncontrada.setNome("Rio de Janeiro");
        cidadeEncontrada.setEstado("RJ");
        cidadeDAO.update(cidadeEncontrada);

        // Deletando uma cidade
        cidadeDAO.delete(cidadeEncontrada);
    }
}

