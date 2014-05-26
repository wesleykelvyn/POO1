import java.util.*;

public class Banco {

	private String nome;
	private int numero;
	private List<Agencia> agencias = new ArrayList<Agencia>();
	private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public void cadastrarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}

	public Funcionario pesquisarFuncionarioPorCPF(String cpf) {

		for (Funcionario funcionario : funcionarios) {

			if (funcionario.getCpf().equals(cpf)) {
				return funcionario;
			}
		}

		throw new RuntimeException("Funcionario n„o encontrado: " + cpf);
	}

	public void cadastrarAgencia(Agencia agencia) {
		agencias.add(agencia);
	}

	public Agencia pesquisarAgenciaPorNumero(int numero) {

		for (Agencia agencia : agencias) {

			if (agencia.getNumero() == numero) {
				return agencia;
			}
		}

		throw new RuntimeException("Agencia n√£o encontrada: " + numero);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

}
