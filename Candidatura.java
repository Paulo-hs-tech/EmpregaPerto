import java.time.LocalDate;

public class Candidatura {

    // Atributos
    private LocalDate dataCandidatura;
    private String status;
    private Candidato candidato;
    private VagaEmprego vaga;

    // Construtor
    public Candidatura(Candidato candidato, VagaEmprego vaga) {
        this.dataCandidatura = LocalDate.now(); // Obtém automaticamente a data atual
        this.status = "Pendente";
        this.candidato = candidato;
        this.vaga = vaga;
    }

    // Getters
    public LocalDate getDataCandidatura() {
        return dataCandidatura;
    }

    public String getStatus() {
        return status;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public VagaEmprego getVaga() {
        return vaga;
    }

    // Setters
    public void setDataCandidatura(LocalDate dataCandidatura) {
        this.dataCandidatura = dataCandidatura;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public void setVaga(VagaEmprego vaga) {
        this.vaga = vaga;
    }

    // Métodos
    public void enviarCandidatura() {
        status = "Enviada";
        System.out.println("Candidatura enviada com sucesso!");
    }

    public void acompanharStatus() {
        System.out.println("Status da candidatura: " + status);
    }

    public void cancelarCandidatura() {
        status = "Cancelada";
        System.out.println("Candidatura cancelada!");
    }
}
