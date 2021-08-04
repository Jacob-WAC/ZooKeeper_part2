package zookeeeper;

public class Bat extends Mammal {

	public Bat() {
		this.setEnegyLevel(300);
	}
	
	public void fly() {
		System.out.println("the bat takes off into the air!");
		this.energyLevel -= 50;
	}
	public void eatHumans() {
		
		this.energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("AHHHH HELP IT ALL ON FIRE AND IT BURNS");
		this.energyLevel -= 100;
	}
}
