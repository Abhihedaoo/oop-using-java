class Enemy {
	int hp;
	int atk;
	int def;
	boolean is_aggressive;
 
	public Enemy(int hp, int atk, int def, boolean is_aggressive) {
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.is_aggressive = is_aggressive;
	}
	
	void attack(Hero hero) {
		int damage = Math.max(this.atk - hero.def, 0);
		hero.defend(damage);
	}

	void defend(int damage) {
		if (this.hp <= 20) damage += 10;
		if (this.hp >= 40) damage += 8;
		this.hp -= damage;
	}
}
