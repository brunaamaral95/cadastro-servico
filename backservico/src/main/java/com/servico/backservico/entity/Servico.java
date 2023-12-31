package com.servico.backservico.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="servico")
@Data
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeCliente;
    @Temporal(TemporalType.DATE)
    private Date dataInicio=new Date();
     @Temporal(TemporalType.DATE)
    private Date dataTermino;
    private String descricaoServico;
    private Double valorServico;
    private Double valorPago;
     @Temporal(TemporalType.DATE)
    private Date dataPagemento;
    private String status; //pendente/realizado ou cancelado
    
    
}
