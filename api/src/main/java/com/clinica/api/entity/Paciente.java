package com.clinica.api.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import java.time.LocalDate;
import java.time.LocalDateTime;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity // diz para o jpa que esta classe e uma entidade
@Table(name = "pacientes") // diz para o jpa que a tabela e chamada de pacientes
public class Paciente {

    @Id // diz que o id e a primary key
    @GeneratedValue (strategy = GenerationType.IDENTITY) // diz que o id e auto incrementado
    private Long id;

    private String nome;
    private String email;
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;
    private String telefone;
    private String endereco;
    @Column(name = "plano_id")
    private Long planoId;
    @Column(name = "numero_carteirinha")
    private String numeroCarteirinha;
    @Column(name = "medico_assistente")
    private String medicoAssistente;
    @Column(name = "contato_medico")
    private String contatoMedico;
    private LocalDateTime dataCadastro;

    // Constructs
    public Paciente(String nome, String email, LocalDate dataNascimento, String telefone, String endereco, Long planoId, String numeroCarteirinha, String medicoAssistente, String contatoMedico, LocalDateTime dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
        this.planoId = planoId;
        this.numeroCarteirinha = numeroCarteirinha;
        this.medicoAssistente = medicoAssistente;
        this.contatoMedico = contatoMedico;
        this.dataCadastro = dataCadastro;
    }

    public Paciente() {}

    // Getters and Setters
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public Long getPlanoId() { return planoId; }
    public String getNumeroCarteirinha() { return numeroCarteirinha; }
    public void setNumeroCarteirinha(String numeroCarteirinha) { this.numeroCarteirinha = numeroCarteirinha; }
    public String getMedicoAssistente() { return medicoAssistente; }
    public void setMedicoAssistente(String medicoAssistente) { this.medicoAssistente = medicoAssistente; }
    public String getContatoMedico() { return contatoMedico; }
    public void setContatoMedico(String contatoMedico) { this.contatoMedico = contatoMedico; }
    public LocalDateTime getDataCadastro() { return dataCadastro; }
    public void setDataCadastro(LocalDateTime dataCadastro) { this.dataCadastro = dataCadastro; }
}