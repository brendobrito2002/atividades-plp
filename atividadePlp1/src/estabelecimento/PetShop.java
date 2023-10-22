package estabelecimento;

import clientes.Animal;
import clientes.Cachorro;
import clientes.Gato;
import clientes.SomEmitido;

public class PetShop {
	
	public static void main(String [] args) {
		Animal[] animais = new Animal[2];
		animais[0] = new Cachorro("Rex", 3, "Grande", "Dourado", "Labrador");
		animais[1] = new Gato("Nala", 2, "Medio", "Branco", "Vira-lata");
		
		for(Animal animal : animais) {
			((SomEmitido)animal).emitirSom();
		}
	}
}
