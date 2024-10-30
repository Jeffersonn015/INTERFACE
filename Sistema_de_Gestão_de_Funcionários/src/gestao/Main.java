package gestao;

public class Main {
    public static void main(String[] args) {
        
        // Exemplo de Funcionário Assalariado
        Funcionario funcionarioAssalariado = new FuncionarioAssalariado(); 
        System.out.println("O bônus do Funcionário Assalariado é de R$" + funcionarioAssalariado.calcularBonus() + " \n");
        
        // Exemplo de Funcionário Horista
        Funcionario funcionarioHorista = new FuncionarioHorista(2000, 15); //horas trabalhadas e pagamento por hora
        System.out.println("O bônus do Funcionário Horista anualmente é de R$" + funcionarioHorista.calcularBonus()); // Retorna 10% do valor anual
    }
}
