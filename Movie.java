public class Movie
{

// instance data. 5 variables used to describe the movie

private String title ; 
private String director ; 
private int runtime ; 
private String genre ; 
private boolean awardwinning ; 

// two constructors. one default, and one with parameters

public Movie(String t, String d, int r, String g, boolean a)
{
    setTitle(t);
    setDirector(d);
    setRuntime(r);
    setGenre(g);
    setAwardwinning(a);
}

public Movie()
{
  this("Untitled", "Unknown", 0, "Unknown", false); 
}

// 5 accessor methods for 5 pieces of instance data

public String getTitle()
{
  return title ; 
}

public String getDirector()
{
  return director ; 
}

public int getRuntime()
{
  return runtime ; 
}

public String getGenre()
{
  return genre ; 
}

public boolean getAwardwinning()
{
  return awardwinning ; 
}

// 5 mutator methods for 5 pieces of instance data

public void setTitle(String s)
{
  title = s;
}

public void setDirector(String d)
{
  director = d;
}

public void setRuntime(int r)
{
  runtime = r;
}

public void setGenre(String g)
{
  genre = g;
}

public void setAwardwinning(boolean a)
{
  awardwinning = a;
}

// 4 methods: recommending based on runtime, recommending based on whether it won any awards, equals, and toString

public String runtimeRec()

{
if(runtime <= 40 && runtime > 0)
  {
    String recommendation1 = new String ("This is a short film. I would recommend it if you don't have time to watch a feature length film, but still want to enjoy an artful passion project.");
    return recommendation1;
  }

else if(runtime > 40 && runtime < 150)
{
  String recommendation2 = new String ("This is a feature length film. I would recommend it for a trip to the theater, a movie night with friends, or even just a relaxed weekend watch.");
    return recommendation2;
}

else
{
  String recommendation3 = new String ("This movie is quite a bit longer than your average flick. I would recommend you to set aside an afternoon or evening to unwind and enjoy.");
    return recommendation3;
}
}
  
public String awardwinningRec()
{

if(awardwinning == true)
{
  String recommendation4 = new String ("This movie is awardwinning! I would recommend this movie, as it's been critically acclaimed.");
    return recommendation4;
}

else
{
String recommendation5 = new String ("While this movie did not recieve any awards, it could very well be a hidden gem. I would recommend you watch and decide for yourself if it should have recieved any accolades!");
    return recommendation5;
}
}

public boolean equals(Movie m)
{
if ((this.getTitle() == m.getTitle()) && (this.getDirector() == m.getDirector()) && (this.getRuntime() == m.getRuntime()) && (this.getGenre() == m.getGenre()) && (this.getAwardwinning() == m.getAwardwinning())) 
{
      return true;
} 
else 
{
      return false;
}  
}

public String toString()
{
  if(awardwinning == true)
  {
  return("The title of the movie is " + getTitle() + ", and it's directed by " + getDirector() + "." + "It's a " + getGenre() + " movie that has a runtime of " + getRuntime() + " minutes. It is an awardwinning movie!");
  }
  else
  {
    return("The title of the movie is " + getTitle() + ", and it's directed by " + getDirector() + "." + "It's a " + getGenre() + " movie that has a runtime of " + getRuntime() + " minutes. It has not won any awards.");
  }
  
}
}
