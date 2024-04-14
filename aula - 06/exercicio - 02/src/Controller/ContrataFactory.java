package Controller;

import model.Funcionario;
import rcavalcante.entradadedados.view.Input;
import rcavalcante.entradadedados.view.Scan;
import view.Teste;

public abstract class ContrataFactory {

	private final int QTD_ERROS_ACEITOS = 3;
	private int countErros = 0;
	private Funcionario novoFuncionario;
	private Input sc = new Scan();

	public ContrataFactory() {

	}

	public void inicialize(Funcionario f) {
		setNovoFuncionario(f);
	}

	public abstract Funcionario contratacao();

	private void setNovoFuncionario(Funcionario f) {

		novoFuncionario = f;
		setNomeNovoFuncionario();
		setSalarioNovoFuncionario();
		setIdNovoFuncionario();

	}

	private void setIdNovoFuncionario() {
		novoFuncionario.setId(sc.nextInt("Digite o id do novo funcionario"));
	}

	private void setSalarioNovoFuncionario() {
		try {
			novoFuncionario.setSalario(sc.nextDouble("Digite o Salario do novo funcionario"));
		}catch(NullPointerException e) {
			Teste.finalizaSistemaErro();
		}
		catch (Exception e) {
			countErros++;
			if(countErros > QTD_ERROS_ACEITOS) {
				Teste.finalizaSistemaErro();
			}
			System.err.println(e.getMessage());
			setSalarioNovoFuncionario();
		}finally {
			countErros = 0;
		}
	}

	private void setNomeNovoFuncionario() {
		novoFuncionario.setNome(sc.nextLine("Digite o nome do funcionario"));
	}
	

}
