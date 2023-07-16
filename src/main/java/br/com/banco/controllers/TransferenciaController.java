package br.com.banco.controllers;

import br.com.banco.models.Transferencia;
import br.com.banco.services.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transferencias")
public class TransferenciaController {
    @Autowired
    private TransferenciaService transferenciaService;

    @GetMapping
    public Page<Transferencia> getAllTransferencias(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "4") int size
    ) {
        return transferenciaService.findAllPageable(PageRequest.of(page - 1, size));
    }
}
