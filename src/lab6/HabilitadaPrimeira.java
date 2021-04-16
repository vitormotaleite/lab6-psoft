package lab6;

public class HabilitadaPrimeira extends EstadoVacinacao{

	HabilitadaPrimeira(Pessoa pessoa, Governo governo) {
		super(pessoa, governo);
	}

	@Override
	public String habilitarPrimeiraDose() {
		return  "esta pessoa esta habilitada para tomar a primeira vacina";
	}

	@Override
	public String habilitarSegundaDose() {
		return  "esta pessoa nao pode tomar a segunda vacina";
	}

	@Override
	public String finalizarVacinacao() {
		return  "esta pessoa nao pode tomar a segunda vacina";
	}

	@Override
	public String toString() {
		return "habilitada para tomar a primeira dose";
	}

	@Override
	public String primeiraDose() {
		pessoa.setDiasPrimeiraDose(0);
		pessoa.setEstadoVacinacao(new PrimeiraDose(pessoa,governo));
		return "esta pessoa realizou a primeira dose";
	}

	@Override
	public String segundaDose() {
		return  "esta pessoa nao pode tomar a segunda vacina";
	}

	

}
