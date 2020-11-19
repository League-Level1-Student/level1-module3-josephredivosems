package _01_intro_to_static;

public class Athlete {

	static int nextBibNumber;
	static String raceLocation = "New York";
	static String raceStartTime = "9.00am";

	String name;
	int speed;
	int bibNumber;

	Athlete(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}

	public static void main(String[] args) {

		Athlete joe = new Athlete("joe", 10); 
		System.out.println(joe.name);
		System.out.println(joe.speed);
			// create two athletes
			// print their names, bibNumbers, and the location of their race.

		Athlete joey = new Athlete("joey", 11);
		System.out.println(joey.name);
		System.out.println(joey.speed);

	}
}
