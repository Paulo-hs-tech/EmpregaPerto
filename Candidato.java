public class Candidato {
    //Atributos
    private String nome;
    private String telefone;
    private String habilidades;
    private String areaDeInteresse;

    //Construtor
    public Candidato(String nome, String telefone, String habilidades, String areaDeInteresse){
        this.nome = nome;
        this.telefone = telefone;
        this.habilidades = habilidades;
        this.areaDeInteresse = areaDeInteresse;
    }

    public String getNome(){
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getHabilidades(){
        return habilidades;
    }

    public String getAreaDeInteresse(){
        return areaDeInteresse;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void steHabilidades(String habilidades){
        this.habilidades = habilidades;
    }
    
    public void setAreaDeInteresse(String areaDeInteresse){
        this.areaDeInteresse = areaDeInteresse;
    }

    //Método
    public void candidatarse(vagaEmpresa vagaEmpresa){
        System.out.println(nome + "vaga" + vagaEmpresa.getNome() + "!");
    }

}
