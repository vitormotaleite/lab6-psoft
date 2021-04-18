package lab6;

public class NaoHabilitado extends EstadoVacinacao {

	NaoHabilitado(Pessoa pessoa, Governo governo) {
		super(pessoa, governo);
	}

	@Override
	public String habilitarPrimeiraDose() {
		boolean status = false;
		for(String comorbidade: pessoa.getComorbidades()) {
			for(String comorbidadeHabilitada: governo.getComorbidadesHabilitadas()) {
				if (comorbidade.equals(comorbidadeHabilitada)) {
					status = true;
				}
			}
		}
		for(String profissaoHabilitada: governo.getProfissoesHabilitadas()) {
			if (pessoa.getProfissao().equals(profissaoHabilitada)) {
				status = true;
			}
		}
		if(pessoa.getIdade() >= governo.getIdadeCorte()) {
			status = true;
		}
		if(status == true) {
			pessoa.setEstadoVacinacao(new HabilitadaPrimeira(pessoa,governo));
		}
		else {
			return "pessoa nao apta para tomar primeira vacina.";
		}
		return "vacina habilitada";
	}

	@Override
	public String habilitarSegundaDose() {
		return "esta pessoa nao pode tomar a primeira vacina";
		
	}

	@Override
	public String finalizarVacinacao() {
		return "esta pessoa nao pode tomar a segunda vacina";
		
	}

	@Override
	public String toString() {
		return "Nao habilitada para tomar vacina.";
	}

	@Override
	public String primeiraDose() {
		return  "esta pessoa nao pode tomar a primeira vacina";
	}

	@Override
	public String segundaDose() {
		return  "esta pessoa nao pode tomar a segunda vacina";
	}

}
