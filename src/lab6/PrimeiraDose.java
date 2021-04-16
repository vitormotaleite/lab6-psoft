package lab6;

public class PrimeiraDose extends EstadoVacinacao {

	PrimeiraDose(Pessoa pessoa, Governo governo) {
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
		if(pessoa.getDiasPrimeiraDose() >= 20) {
			pessoa.setEstadoVacinacao(new HabilitadaSegunda(pessoa,governo));
		}
		return "esta pessoa ainda nao pode tomar a segunda vacina";
	}

	@Override
	public String segundaDose() {
		return "esta pessoa nao pode tomar a segunda vacina";
	}

	@Override
	public String finalizarVacinacao() {
		return "esta pessoa nao pode tomar a segunda vacina";
	}

	@Override
	public String toString() {
		return "tomou a primeira dose";
	}

}
