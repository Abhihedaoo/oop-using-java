class Controller {
	public static void main(String[] argv) {
        // Creating the object for Hero 
        Hero hero = new Hero("Iron man", 100, 20, 40);

        // Creating the object for Enemy
        Enemy enemy = new Enemy(100, 15, 20, true);

        // Creating the object for Enemy
        Animal animal = new Animal(100, 10, 20);
        // Creating the object for Enemy
        Zombie zombie = new Zombie(100, 15, 20);

        // attacks
        enemy.attack(hero);
        animal.attack(hero);
        zombie.attack(hero);

        System.out.println(hero.currentStatus());
	}
}