package entities;

public class PessoaFisisca extends Contribuintes{

private Double gastoSaude;
	
	public PessoaFisisca() {
		super();
	}

	public PessoaFisisca(String nome, Double renda, Double gastoSaude) {
		super(nome, renda);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	@Override
	public  Double imposto() {
		if (getRenda() < 20000.0) {
			return getRenda() * 0.15 - gastoSaude * 0.5;
		}
		else {
			return getRenda() * 0.25 - gastoSaude * 0.5;
		}
	}

}
