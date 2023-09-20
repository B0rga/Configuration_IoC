package br.com.fateczonasul.service;

import br.com.fateczonasul.model.Cliente;
import br.com.fateczonasul.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService{

    private ClienteRepository repository;

    @Autowired
    public ClienteService(ClienteRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente Cliente){
        // validarCliente(cliente);
        // this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        // Aplica validações
    }
}