package gestao;

//Classe Funcionario Assalariado implementando a interface da classe Funcionario
public class FuncionarioAssalariado implements Funcionario {
	
	// Implementação do metodo calcularBonus()
    @Override
    public double calcularBonus() {
        return 5000.00; //Por ser um valor fixo retonar o valor fixo fornecido
    }
}
