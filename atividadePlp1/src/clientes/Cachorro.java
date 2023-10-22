package clientes;

public class Cachorro extends Animal implements SomEmitido{
	private String tamanho;
	private String corPelagem;
	private String raca;
	
	public Cachorro(String nome, int idade, String tamanho, String corPelagem, String raca) {
		super(nome, idade);
		this.tamanho = tamanho;
		this.corPelagem = corPelagem;
		this.raca = raca;
	}
	
	public void latir() {
		System.out.println(getNome() + "está latindo!");
	}
	
	public void abanarRabo() {
		System.out.println(getNome() + "está feliz!");
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
		System.out.println(getNome() + " está latindo: Woof-Woof");
		
	}

}
