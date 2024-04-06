package main.domain;

import javax.persistence.Table;

import java.time.Instant;

import javax.persistence.Entity;

@Entity
@Table(name = "TB_Curso")
public class Matricula {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="Matri_seq")
	@SequenceGenerator(name="Matri_seq", sequenceName="sq_matricula", initialValue = 1, allocationSize = 1)
    private Long id;

    Column(name = "CODIGO", length 10, nullable = false, unique = true)
    private String codigo;

    Column(name = "DATAMATRICULA", nullable = false)
    private Instant dataMatricula;

    Column(name = "VALOR", nullable = false)
    private Double Valor;

    Column(name = "STATUS", nullable = false)
    private String Status;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Instant getDataMatricula() {
        return dataMatricula;
    }
    public void setDataMatricula(Instant dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
    public Double getValor() {
        return Valor;
    }
    public void setValor(Double valor) {
        Valor = valor;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }
}
