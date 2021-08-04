package zookeeeper;

public class Gorilla extends Mammal {
	
public Gorilla() {
	this.setEnegyLevel(100);
}

public void throwSomething() {
	System.out.println("The Gorilla threw a rock!");
	this.energyLevel -= 5;
}
public void eatBananas() {
	System.out.println("The Gorilla ate a bunch of bananas!");
	this.energyLevel += 10;
}
public void climb() {
	System.out.println("it climbed a tree");
	this.energyLevel -= 10;
}
}
