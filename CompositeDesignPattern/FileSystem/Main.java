package CompositeDesignPattern.FileSystem;

public class Main {
    public static void main(String[] args) {

        //This is my root folder
        Directory movieDirectory = new Directory("Movies");
        // This folder is under the movies folder
        Directory comedyMovieDirectory = new Directory("Comedy_Movie");
        movieDirectory.add(comedyMovieDirectory);
        // This folder is under the movies folder
        Directory horrorMovieDirectory = new Directory("Horror_Movie");
        movieDirectory.add(horrorMovieDirectory);
        
        // Adding a movie to the comedy_movie Folder
        file golmal = new file("Golmal");
        comedyMovieDirectory.add(golmal);
        // Adding a movie to the comedy_movie Folder
        file annable = new file("Annable");
        horrorMovieDirectory.add(annable);
    
    
    movieDirectory.ls();
    
    }
    
}
