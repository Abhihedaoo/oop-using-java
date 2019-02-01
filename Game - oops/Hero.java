class Hero {
	String name;
	int hp;
	int atk;
	int def;
 
	public Hero(String name, int hp, int atk, int def) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
    }
    
    void defend(int damage) {
        if (this.hp <= 25) damage += 15;
        if (this.hp >= 50) damage += 10;
        this.hp -= damage;
    }

    String currentStatus() {
        return "Hp : " + this.hp + 
               "\nAtk : " + this.atk + 
               "\ndef : " + this.def;
    }
}
