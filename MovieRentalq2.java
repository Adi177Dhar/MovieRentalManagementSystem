public class MovieRental {
	public void Collection(boolean stat) {
    	if(stat==true){
    		System.out.println("Browse from our huge collection of movies!");
    	}
    	else
    		System.out.println("There are no movies available to be rented.");
  	}

  	public static void main(String[] args) {
  		boolean[] CollectionStat = {true, false, true, true, false};
    	MovieRental movies = new MovieRental();
    	for(int i=0; i<moviesStat.length; i++){
    		movies.Collection(moviesStat[i]);
    	}
  	}
}