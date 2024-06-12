package test;

import l06.c03.s01.Enemy;
import l06.c03.s01.Hero;

public class RPG {

	public static void main(String[] args) {

		Hero hero = new Hero("勇者", 10, 5, 3, 1);
		Enemy slime = new Enemy("スライム", 5, 2, 2, "スライム");

		//hero.attack(slime);
		//slime.attack(hero);


		hero.magic_attack(slime);
	}

}
