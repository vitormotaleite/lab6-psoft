package lab6;

import java.util.ArrayList;
import java.util.List;

public class Governo {
	
	private List<String> comorbidadesHabilitadas;
	private int idadeCorte;
	private List<String> profissoesHabilitadas;
	
	public Governo(int idadeCorte) {
		super();
		this.comorbidadesHabilitadas = new ArrayList<>();
		this.idadeCorte = idadeCorte;
		this.profissoesHabilitadas = new ArrayList<>();
	}

	public List<String> getComorbidadesHabilitadas() {
		return comorbidadesHabilitadas;
	}

	public void setComorbidadesHabilitadas(List<String> comorbidadesHabilitadas) {
		this.comorbidadesHabilitadas = comorbidadesHabilitadas;
	}

	public int getIdadeCorte() {
		return idadeCorte;
	}

	public void setIdadeCorte(int idadeCorte) {
		this.idadeCorte = idadeCorte;
	}

	public List<String> getProfissoesHabilitadas() {
		return profissoesHabilitadas;
	}

	public void setProfissoesHabilitadas(List<String> profissoesHabilitadas) {
		this.profissoesHabilitadas = profissoesHabilitadas;
	}
	
	public void addProfissao(String profissao) {
		this.profissoesHabilitadas.add(profissao);
	}
	
	public void addComobirdade(String comobirdade) {
		this.comorbidadesHabilitadas.add(comobirdade);
	}

}
