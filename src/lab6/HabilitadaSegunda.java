package lab6;

public class HabilitadaSegunda extends EstadoVacinacao {

	HabilitadaSegunda(Pessoa pessoa, Governo governo) {
		super(pessoa, governo);
	}

	@Override
	public String habilitarPrimeiraDose() {
		return "esta pessoa realizou a primeira dose";
	}

	@Override
	public String primeiraDose() {
		return "esta pessoa realizou a primeira dose";
	}

	@Override
	public String habilitarSegundaDose() {
		return "esta pessoa esta habilitada para tomar a segunda vacina";
	}

	@Override
	public String segundaDose() {
		pessoa.setEstadoVacinacao(new Finalizada(pessoa,governo));
		return "esta pessoa realizou a segunda dose";
	}

	@Override
	public String finalizarVacinacao() {
		return "esta pessoa ainda nao tomou a segunda vacina";
	}

	@Override
	public String toString() {
		return "habilitada para tomar a segunda dose";
	}

}
