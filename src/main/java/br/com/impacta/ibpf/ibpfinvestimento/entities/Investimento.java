package br.com.impacta.ibpf.ibpfinvestimento.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TB_INVESTIMENTOS")
public class Investimento {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "id_conta")
    private Long idConta;

    @Column(name = "nome")
    private String nome;

    @Column(name = "juros")
    private Double juros;

    @Column(name = "data_aquisicao")
    private Date dataAquisicao;

    @Column(name = "saldo")
    private Double saldo;

    @Column(name = "cotas")
    private Integer cotas;

    public Investimento(){

    }
    public Investimento(Long id, Long idConta, String nome, Double juros, Date dataAquisicao, Double saldo, Integer cotas) {
        this.id = id;
        this.idConta = idConta;
        this.nome = nome;
        this.juros = juros;
        this.dataAquisicao = dataAquisicao;
        this.saldo = saldo;
        this.cotas = cotas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdConta() {
        return idConta;
    }

    public void setIdConta(Long idConta) {
        this.idConta = idConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    public Integer getCotas() {
        return cotas;
    }

    public void setCotas(Integer cotas) {
        this.cotas = cotas;
    }

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
