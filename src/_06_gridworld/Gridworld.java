package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
public static void main(String[] args) {
	World world = new World();
	world.show();
	
	Bug bug = new Bug();
	
	Location location = new Location(4,4);
	
	world.add(location, bug);
	
	Bug bugtwo = new Bug();
	Random rand = new Random();
	int ran = rand.nextInt(10);
	Random rando = new Random();
	int ra = rando.nextInt(10);
	bugtwo.setColor(Color.BLUE);
	bugtwo.turn();
	bugtwo.turn();
	Location randomLocation = new Location(ran, ra);
	Flower firstFlower = new Flower();
	int flowerX = ran - 1;
	int flowerY = ra;
	Location rightFlower = new Location(flowerX, flowerY);
	Flower leftFlower = new Flower();
	int secondFlowerx = ran + 1;
	Location secondFlower = new Location(secondFlowerx, flowerY);
	world.add(randomLocation, bugtwo);
	world.add(rightFlower, firstFlower);
	world.add(secondFlower, leftFlower);
	
	
	
	
	for (int y = 0; y < 10; y++) {
	    
		for (int xx = 0; xx < 10; xx++) {
			Flower every = new Flower();
			Location xy = new Location(xx, y);
			world.add(xy, every);
			
		}
		
	}
	

}
}
