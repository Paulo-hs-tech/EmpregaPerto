
public class Empresa extends Perfil {

    private String cnpj;
    private String setor;

    public Empresa(String nome, String email, String endereco,
                   String cnpj, String setor) {

        super(nome, email, endereco);
        this.cnpj = cnpj;
        this.setor = setor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public void exibirDados() {
        System.out.println("Empresa: " + getNome());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Setor: " + setor);
    }
}

