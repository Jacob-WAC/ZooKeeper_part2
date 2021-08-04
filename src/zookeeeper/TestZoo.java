package zookeeeper;

public class TestZoo {
public static void main(String[] args) {
	Bat killerbat = new Bat();
	
	killerbat.displayEnergy();
	killerbat.attackTown();
	killerbat.displayEnergy();
	killerbat.attackTown();
	killerbat.attackTown();
	killerbat.eatHumans();
	killerbat.eatHumans();
	killerbat.fly();
	killerbat.displayEnergy();
}
}
