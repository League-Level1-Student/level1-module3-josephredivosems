package _05_netflix;

public class MovieRunner {
public static void main(String[] args) {
	
	Movie endgame = new Movie("Avengers Endgame", 9);
	
	Movie rots = new Movie("Star Wars: Revenge of The Sith", 10);
	
	Movie noelle = new Movie("Noelle", 7);
	
	Movie caroline = new Movie("Caroline", 7);
	
	Movie fallout = new Movie("Mission Impossible: Fallout", 9);
	
	rots.getTicketPrice();
	
	NetflixQueue collection = new NetflixQueue();
	
	collection.addMovie(endgame);

	collection.addMovie(rots);
	
	collection.addMovie(fallout);
	
	collection.addMovie(caroline);
	
	collection.addMovie(noelle);
	
	collection.printMovies();
	
	collection.sortMoviesByRating();
	
	System.out.println("The best movie is... " + collection.getBestMovie());
	
	System.out.println("The second best movie is... " + collection.getMovie(2));
}
}
