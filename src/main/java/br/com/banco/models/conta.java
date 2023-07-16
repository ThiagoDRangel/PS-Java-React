package br.com.banco.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "conta")
@Data
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_conta;

    private String nome_responsavel;
}
