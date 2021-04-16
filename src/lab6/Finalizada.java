package lab6;

public class Finalizada extends EstadoVacinacao {

	Finalizada(Pessoa pessoa, Governo governo) {
		super(pessoa, governo);
	}

	@Override
	public String habilitarPrimeiraDose() {
		return "esta pessoa realizou a primeira e segunda dose";
	}

	@Override
	public String primeiraDose() {
		return "esta pessoa realizou a primeira e segunda dose";
	}

	@Override
	public String habilitarSegundaDose() {
		return "esta pessoa realizou a primeira e segunda dose";
	}

	@Override
	public String segundaDose() {
		return "esta pessoa realizou a primeira e segunda dose";
	}

	@Override
	public String finalizarVacinacao() {
		return "esta pessoa realizou a primeira e segunda dose";
	}

	@Override
	public String toString() {
		return "finalizada vacinacao";
	}

}
