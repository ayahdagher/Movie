import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {

// making 5 movies: a short film, a feature length movie, a longer movie, a default movie to add to, and a replica movie to test the equals method with. 

Movie bao = new Movie("Bao", "Domee Shi" , 8, "animated/family", true);

Movie tdwp = new Movie("The Devil Wears Prada", "David Frankel", 109, "romance/comedy", true); 

Movie dune = new Movie("Dune", "Denis Villeneuve", 155, "sci-fi/adventure", true);

Movie empty = new Movie(); 

Movie bootlegDune = new Movie("Dune", "Denis Villeneuve", 155, "sci-fi/adventure", true);

// testing out the toString method

System.out.println(" "); 

System.out.println(bao);
System.out.println(tdwp);
System.out.println(dune); 
System.out.println(empty); 

System.out.println(" "); 

// testing out the equals method

System.out.println("Are dune and bootlegDune the same movie? " + dune.equals(bootlegDune)); 

System.out.println(" "); 

// adding values to the empty movie with mutator methods

Scanner scan = new Scanner(System.in); 

System.out.println("Let's make a movie! What will it be called?");
String newTitle = scan.nextLine(); 
empty.setTitle(newTitle);

System.out.println("Who will direct the movie?");
String newDirector = scan.nextLine(); 
empty.setDirector(newDirector);

System.out.println("What is the runtime in minutes?");
int newRuntime = scan.nextInt(); 
empty.setRuntime(newRuntime);

System.out.println("What is the genre?");
String newGenre = scan.nextLine(); 
empty.setGenre(newGenre); 

System.out.println("Has it won any awards? True for yes, false for no.");
boolean newAward = scan.nextBoolean(); 
empty.setAwardwinning(newAward);

System.out.println("Here is the new movie!");
System.out.println(empty);

System.out.println(" "); 

// testing the accessor methods

System.out.println(dune.getTitle() + ", directed by " + dune.getDirector() + ", is one of the most popular " + dune.getGenre() + " movies lately! It's " + dune.getAwardwinning() + " that it's awardwinning. Its runtime is " + dune.getRuntime() + " minutes."); 

// testing the runtimerec method

System.out.println(bao.runtimeRec());
System.out.println(tdwp.runtimeRec());
System.out.println(dune.runtimeRec());

// testing the awardwinning method

Movie tester = new Movie();
System.out.println(bao.awardwinningRec());
System.out.println(tester.awardwinningRec());

  }
}