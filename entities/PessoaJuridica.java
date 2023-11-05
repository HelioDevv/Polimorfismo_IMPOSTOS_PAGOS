package entities;

public class PessoaJuridica extends Contribuintes{

private Integer nFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double renda, Integer nFuncionarios) {
		super(nome, renda);
		this.nFuncionarios = nFuncionarios;
	}

	public Integer getnFuncionarios() {
		return nFuncionarios;
	}

	public void setnFuncionarios(Integer nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}
	
	@Override
	public  Double imposto() {
		double sum = 0.0;
		if(nFuncionarios > 10) {
			sum += super.getRenda() * 0.14;
		}else {
			sum += super.getRenda() * 0.16;
		}
		return sum;
	}

}
