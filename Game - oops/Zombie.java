class Zombie extends Enemy {
	
	public Zombie(int hp, int atk, int def) {
		super(hp, atk, def, true);
    }
    
    @Override
    void attack(Hero hero) {
        int damage = Math.max(0, this.atk - hero.def);
        hero.defend(damage);
    }

    String currentStatus() {
        return "hp : " + this.hp +
               " atk : " + this.atk +
               " def : " + this.def +
               " Is aggressive : " + this.is_aggressive;
    }

}
