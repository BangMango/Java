package pokemon;

public class NewPokemon extends Pokemon{
	NewPokemon(){}
	NewPokemon(String name, String type, Skill skill1,Skill skill2, Skill skill3, Skill skill4, Status status){
		this.name=name;
		this.type=type;
		this.skill1=skill1;
		this.skill2=skill2;
		this.skill3=skill3;
		this.skill4=skill4;
		this.status=status;
	}
}
