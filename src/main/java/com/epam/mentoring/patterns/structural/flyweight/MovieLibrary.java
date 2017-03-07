package com.epam.mentoring.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MovieLibrary {

	  private Map<String, Movie> movies = new HashMap<String, Movie>();
	  
	  public Movie findMovie(String name) {
		  if (!movies.containsKey(name)) {
			  movies.put(name, new Movie(name));
		  }
		return movies.get(name);
	  }
}
