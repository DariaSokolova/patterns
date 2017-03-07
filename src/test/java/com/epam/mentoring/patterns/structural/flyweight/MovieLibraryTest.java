package com.epam.mentoring.patterns.structural.flyweight;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class MovieLibraryTest {

	private MovieLibrary library = new MovieLibrary();
	
	@Test
	public void testFindMovie_getsMovie() {
		String name = "Die Hard";
		
		Movie movie = library.findMovie(name);
		
		assertEquals(name, movie.getName());
	}

	@Test
	public void testFindMovie_DifferentMovies() {
		String name1 = "Die Hard";
		String name2 = "Back to the Future";
		
		Movie movie1 = library.findMovie(name1);
		Movie movie2 = library.findMovie(name2);
		
		assertNotEquals(name1, movie2.getName());
		assertNotEquals(name2, movie1.getName());
		assertNotEquals(movie1, movie2);
	}

	@Test
	public void testFindMovie_sameMovieInstances() {
		String name = "Back to the Future";
		
		Movie movie1 = library.findMovie(name);
		Movie movie2 = library.findMovie(name);
		
		assertEquals(movie1, movie2);
	}
}
