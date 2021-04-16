package lab6;

public abstract class EstadoVacinacao {
	
	Pessoa pessoa;
	Governo governo;
	
	EstadoVacinacao(Pessoa pessoa, Governo governo) {
		this.pessoa = pessoa;
		this.governo = governo;
	}
	
	public abstract String habilitarPrimeiraDose();
	public abstract String primeiraDose();
	public abstract String habilitarSegundaDose();
	public abstract String segundaDose();
	public abstract String finalizarVacinacao();
	public abstract String toString();

}
