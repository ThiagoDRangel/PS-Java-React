package br.com.banco.services;

import br.com.banco.models.Transferencia;
import br.com.banco.repositories.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferenciaService {

    @Autowired
    private TransferenciaRepository transferenciaRepository;

    public List<Transferencia> findAll() {
        return transferenciaRepository.findAll();
    }

    public Page<Transferencia> findAllPageable(Pageable pageable) {
        return transferenciaRepository.findAll(pageable);
    }
}
