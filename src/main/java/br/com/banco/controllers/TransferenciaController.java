package br.com.banco.controllers;

import br.com.banco.models.Transferencia;
import br.com.banco.services.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@RestController
@RequestMapping("/api/transferencias")
@CrossOrigin(origins = "http://localhost:3000")
public class TransferenciaController {
    @Autowired
    private TransferenciaService transferenciaService;

    @GetMapping
    public Page<Transferencia> getTransferencias(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "4") int size
    ) {
        return transferenciaService.findAllPageable(PageRequest.of(page - 1, size));
    }
}
