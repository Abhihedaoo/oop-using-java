class Animal extends Enemy {

	public Animal(int hp, int atk, int def) {
		super(hp, atk, def, false);
    }
    
    @Override
    void attack(Hero hero) {
        int damage = Math.max(0, this.atk - hero.def);
        hero.defend(damage);
    }

    String currentStatus() {
        return "hp : " +this. hp + 
               "\natk : " + this.atk + 
               "\ndef : " +this.def + 
               "\nIs aggressive : " + this.is_aggressive; 
    }
}