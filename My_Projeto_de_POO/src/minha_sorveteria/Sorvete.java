package minha_sorveteria;
import javax.swing.JOptionPane;

public abstract class Sorvete {

	private String nome;
	private Fabrica fabrica = null;
	private Leite leite = null;
	private Acucar acucar = null;
	private Chocolate chocolate = null;
	private Fruta fruta = null;
	private Recheio recheio = null;
	
	public Sorvete(String nome, Fabrica fabrica, Leite leite, Acucar acucar, Chocolate chocolate, Fruta fruta, Recheio recheio){
		this.nome = nome;
		this.fabrica = fabrica;
		this.leite = leite;
		this.acucar = acucar;
		this.chocolate = chocolate;
		this.fruta = fruta;
		this.recheio = recheio;
	}
	
	public Sorvete() {
		// TODO Auto-generated constructor stub
	}

	private int temperatura, tempo;

	public void preparo() {
		JOptionPane.showMessageDialog(null, "Temperatura: " + this.temperatura + "�C, tempo de preparo: " + this.tempo);
	}

	public abstract void preparar();

	public void box() {
		JOptionPane.showMessageDialog(null, "Empacotando na embalagem BondFaro...");
	}

	@Override
	public String toString() {

		String descricao = "Ingredientes:\n";
		if (leite != null) {
			descricao += leite.getDescricao()+", pre�o: "+leite.getPreco();
		}
		if (acucar != null) {
			descricao += "\n" + acucar.getDescricao()+", pre�o: "+acucar.getPreco();
		}
		if (fruta != null) {
			descricao += "\n" + fruta.getDescricao()+", pre�o: "+fruta.getPreco();
		}
		if (chocolate != null) {
			descricao += "\n" + chocolate.getDescricao()+", pre�o: "+chocolate.getPreco();
		}
		if (recheio != null) {
			descricao += "\n" + recheio.getDescricao()+", pre�o: "+recheio.getPreco();
		}
		return descricao;
	}

	public double preco(){
		double preco = leite.getPreco();

		    if (acucar != null) {
		    	preco += acucar.getPreco();
		    }
		    
		    if (chocolate != null) {
		    	preco += chocolate.getPreco();
		    }
		    if (fruta != null) {
		    	preco += fruta.getPreco();
		    }
		    
		    if (recheio != null) {
		    	preco += recheio.getPreco();
		    }
		    
		if (preco == 0) {
		   	return 0.0;
		} else {
			return preco;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Leite getLeite() {
		return leite;
	}

	public void setLeite(Leite leite) {
		this.leite = leite;
	}

	public Acucar getAcucar() {
		return acucar;
	}

	public void setAcucar(Acucar acucar) {
		this.acucar = acucar;
	}

	public Chocolate getChocolate() {
		return chocolate;
	}

	public void setChocolate(Chocolate chocolate) {
		this.chocolate = chocolate;
	}

	public Fruta getFruta() {
		return fruta;
	}

	public void setFruta(Fruta fruta) {
		this.fruta = fruta;
	}

	public Recheio getRecheio() {
		return recheio;
	}

	public void setRecheio(Recheio recheio) {
		this.recheio = recheio;
	}

	public Fabrica getFabrica() {
		return fabrica;
	}

	public void setFabrica(Fabrica fabrica) {
		this.fabrica = fabrica;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
}
