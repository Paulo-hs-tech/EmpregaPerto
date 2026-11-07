
public abstract class Perfil {

    private String nome;
    private String telefone;
    private String email;
    private Localizacao localizacao;

    public Perfil(String nome, String telefone,String email, Localizacao localizacao) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.localizacao = localizacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }
    
    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public abstract void exibirDados();
}
