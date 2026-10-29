public class vagaEmpresa {
    //Atributos
    private String nome;
    private String habilidadesParaVaga;
    private String empresa;
    private String enderecoDaEmpresa;

    //Construtor
    public vagaEmpresa(String habilidadesParaVaga, String empresa, String enderecoDaEmpresa){
        this.habilidadesParaVaga = habilidadesParaVaga;
        this.empresa = empresa;
        this.enderecoDaEmpresa = enderecoDaEmpresa;
    }

    public String getNome(){
        return nome;
    }

    public String getHabilidadesParaVaga(){
        return habilidadesParaVaga;
    }

    public String getEmpresa(){
        return empresa;
    }

    public String getEnderecoDaEmpresa(){
        return enderecoDaEmpresa;
    }

    public void setHabilidadesParaVaga(String habilidadesParaVaga){
        this.habilidadesParaVaga = habilidadesParaVaga;
    }

    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }

    public void setEnderecoDaEmpresa(String enderecoDaEmpresa){
        this.enderecoDaEmpresa = enderecoDaEmpresa;
    }

    //Método
    public void candidatura(candidato candidato){
         System.out.println(habilidadesParaVaga + "Empresa" + candidato.getNome() + "!");
    }
}

O que já foi feito
