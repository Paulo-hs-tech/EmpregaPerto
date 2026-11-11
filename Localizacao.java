public class Localizacao{
    //encapsulamento e atributos
    private String cep;
    private String bairro;
    private String cidade;
    private String numero;
    
    public Localizacao(String cep, String bairro, String cidade, String numero){
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
    }
    //métodos getters e setters
    public String getCep(){
        return cep;
    }
    public String getBairro(){
        return bairro;
    }
    public String getCidade(){
        return cidade;
    }
    public String getNumero(){
        return numero;
    }
    
    public void setCep(String cep){
        this.cep = cep;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    //método de exibir o endereço 
    public void exibirEndereco(){
        System.out.println("CEP: " + cep);
        System.out.println("Bairro: " + bairro);
        System.out.println("Cidade: " + cidade);
        System.out.println("Número: " + numero);
    }

    //verificar se duas localidades são do mesmo bairro
    public boolean mesmoBairro(Localizacao outra){
        return this.bairro.equalsIgnoreCase(outra.getBairro())
          && this.cidade.equalsIgnoreCase(outra.getCidade());
    }

    // Verificar se duas localizações são da mesma cidade
    public boolean mesmaCidade(Localizacao outra) {
        return this.cidade.equalsIgnoreCase(outra.getCidade());
    }
    
}
