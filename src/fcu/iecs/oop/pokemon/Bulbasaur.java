package fcu.iecs.oop.pokemon;

public class Bulbasaur extends Pokemon implements Fightable{

	Bulbasaur(String name, PokemonType type, int cp) {
		super(name, type, cp);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("\"Tackle¡K\"");
	}

}
