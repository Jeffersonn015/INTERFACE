package gestao;

// Classe FuncionarioHorista implementando a interface da classe Funcionario
public class FuncionarioHorista implements Funcionario {

    public double horasTrabalhadasAnual;    // Total de horas trabalhadas pelo funcionário no ano
    public double pagamentoPorHora;    // Pagamento por hora do funcionário

    // Construtor para inicializar horas trabalhadas e pagamento por hora
    public FuncionarioHorista(double horasTrabalhadasAnual, double pagamentoPorHora) {
        this.horasTrabalhadasAnual = horasTrabalhadasAnual;
        this.pagamentoPorHora = pagamentoPorHora;
    }

    // Implementação do método calcularBonus()
    @Override
    public double calcularBonus() {
    	
        double salarioAnual = horasTrabalhadasAnual * pagamentoPorHora; //Vai calcular a hora total trabalhada no ano * pagamento por hora
        return salarioAnual * 0.10; // Calcula o bônus como 10% do salário anual
    }
}
