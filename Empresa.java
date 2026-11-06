
public class Empresa extends Perfil {

    private String cnpj;
    private String areaAtuacao;

    public Empresa(String nome, String telefone, String email, Localizacao localizacao, String cnpj, String areaAtuacao) {

        super(nome, telefone, email, localizacao);
        this.cnpj = cnpj;
        this.areaAtuacao = areaAtuacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }
    
    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public void exibirDados() {
        System.out.println("Empresa: " + getNome());
        System.out.println("E-mail: " + getEmail());
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Setor: " + setor);
    }
}

