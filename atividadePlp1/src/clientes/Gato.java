package clientes;

public class Gato extends Animal implements SomEmitido{
	private String tamanho;
	private String corPelagem;
	private String raca;
	
	public Gato(String nome, int idade, String tamanho, String corPelagem, String raca) {
		super(nome, idade);
		this.tamanho = tamanho;
		this.corPelagem = corPelagem;
		this.raca = raca;
	}
	
	public void miar() {
		System.out.println(getNome() + "está miando!");
	}
	
	public void ronrronar() {
		System.out.println(getNome() + "está ronrronando!");
	}
	
	public String getTamanho() {
		return tamanho;
	}

	public String getCorPelagem() {
		return corPelagem;
	}

	public String getRaca() {
		return raca;
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está miando: Miau");
		
	}

}
