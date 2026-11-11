public class VagaEmprego{
    //Atributos
    private String cargo;
    private double salario;
    private String requisitos;
    private String tipoContratacao;
    private Empresa empresa;

    //Construtor
    public VagaEmprego(String cargo, double salario, String requisitos, String tipoContratacao, Empresa empresa) {

        this.cargo = cargo;
        this.salario = salario;
        this.requisitos = requisitos;
        this.tipoContratacao = tipoContratacao;
        this.empresa = empresa;
    }
    
    //Métodos

    public String getCargo(){
        return cargo;
    }

    public double getSalario(){
        return salario;
    }

    public String getRequisitos(){
        return requisitos;
    }

    public String getTipoContratacao(){
        return tipoContratacao;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
    

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void setRequisitos(String requisitos){
        this.requisitos = requisitos;
    }

    public void setTipoContratacao(String tipoContratacao){
        this.tipoContratacao = tipoContratacao;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    public void publicarVagaEmprego() {
        System.out.println("Empresa: " + empresa.getNome());
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
        System.out.println("Requisitos: " + requisitos);
        System.out.println("Tipo de contratação: " + tipoContratacao);
    }
