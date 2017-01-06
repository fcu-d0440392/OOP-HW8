package fcu.iecs.oop.pokemon;

public abstract class Pokemon implements Fightable{


	private final String name;
	private int cp;
	private final PokemonType type;

	Pokemon(String name  , PokemonType type , int cp)
	{
	  this.name = name;
	  this.cp = cp;
	  this.type = type;
	}
	
	public String getName()
	{
	  return this.name; 
	}

	public  PokemonType getType()
	{
	  return this.type; 
	}

	public int getCp()
	{
	  return this.cp;
	}

	public void setCp(int cp)
	{
	  this.cp = cp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
