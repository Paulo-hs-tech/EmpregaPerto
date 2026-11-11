public class Candidato extends Perfil {
    //Atributos
    private String profissao;
    private String experiencia;
    private String curriculo;
    private String formacao;

    //Construtor
    public Candidato(String nome, String telefone, String email, Localizacao localizacao, String profissao, String experiencia, String curriculo, String formacao) {

        super(nome, telefone, email, localizacao);
    
        this.profissao = profissao;
        this.experiencia = experiencia;
        this.curriculo = curriculo;
        this.formacao = formacao;
    }

    //Getters
    public String getProfissao(){
        return profissao;
    }

    public String getExperiencia(){
        return experiencia;
    }

    public String getCurriculo(){
        return curriculo;
    }

    public String getFormacao(){
        return formacao;
    }

    //Setters
    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

    public void setExperiencia(String experiencia){
        this.experiencia = experiencia;
    }

    public void setCurriculo(String curriculo){
        this.curriculo = curriculo;
    }

    public void setFormacao(String formacao){
        this.formacao = formacao;
    }

    //Métodos

    @Override
    public void exibirDados() {
        System.out.println("Candidato: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Profissão: " + profissao);
        System.out.println("Experiência: " + experiencia);
        System.out.println("Currículo: " + curriculo);
        System.out.println("Formação: " + formacao);
    
        getLocalizacao().exibirEndereco();
    }
    public void cadastrarCurriculo(String curriculo){
        this.curriculo = curriculo;
        System.out.println("Currículo cadastrado com sucesso!");
    }

    public void buscarVagas(){
        System.out.println("Buscando vagas para: " + this.profissao);
    }

    public void enviarCandidatura(String vaga){
        System.out.println("Candidatura enviada para: " + vaga);
    }

    public void atualizarCurriculo(String novoCurriculo){
        this.curriculo = novoCurriculo;
        System.out.println("Currículo atualizado com sucesso!");
    }
}
