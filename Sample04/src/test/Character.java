package test;

public class Character {

	private String name;
	private int hp;
	private int offence;
	private int defence;

	public Character(){
	}

	public Character(String name, int hp, int offence, int defence) {
		this.name = name;
		this.hp = hp;
		this.offence = offence;
		this.defence = defence;
	}

	public void attack(Character opponent) {
		int damage = this.offence - opponent.defence;

		if(damage > 0) {
			opponent.hp = opponent.hp - damage;
			System.out.println(this.name + "は" + opponent.name + "に" + damage + "のダメージを与えた！");
		} else {
			System.out.println("ミス!" + this.name + "は" + opponent.name + "にダメージを与えられない" );
		}

	}

    public String getName() {
    	return name;
    }

    public void setName(String name) {
    	this.name = name;
    }

    public int getHp() {
    	return hp;
    }

    public void setHp(int hp) {
    	this.hp = hp;
    }

    public int getOffence() {
    	return offence;
    }

    public void setOffence(int offence) {
    	this.offence = offence;
    }

    public int getDefence() {
    	return defence;
    }

    public void setDefence(int defence) {
    	this.defence = defence;
    }



}
