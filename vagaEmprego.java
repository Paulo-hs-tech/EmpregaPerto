public class vagaEmprego{
    //Atributos
    private String cargo;
    private double salario;
    private String requisitos;
    private String tipoContratacao;

    //Construtor
    public VagaEmprego(String cargo, double salario, String requisitos, String tipoContratacao){
        this.cargo = cargo;
        this.salario = salario;
        this.requisitos = requisitos;
        this.tipoContratacao = tipoContratacao;
    }

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

    //Métodos
    public void publicarvagaEmprego(Empresa Empresa){
        System.out.println("Candidate-se: " );
        System.out.println("Empresa: " + Empresa.getNomeEmpresa());
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
        System.out.println("Requisitos: " + requisitos);
        System.out.println("Tipo de contratacao: " + tipoContratacao);
    }
}
