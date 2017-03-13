package com.epam.mentoring.patterns.behavioral.iterator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RepositoryTest {
	private Repository repository;
	private String items[] = {"London" , "Oxford" ,"Cambridge"};
	
	@Test
	public void testHasNext() {
		repository = new Repository(items);
		assertTrue(repository.getIterator().hasNext());
	}

	@Test
	public void testHasNext_WhenRepositoryIsEmpty() {
		items = new String [0];
		repository = new Repository(items);
		
		assertFalse(repository.getIterator().hasNext());
	}
	
	@Test
	public void testHasNext_WhenRepositoryIsNull() {
		repository = new Repository(null);
		
		assertFalse(repository.getIterator().hasNext());
	}
	
	@Test
	public void testNext() {
		repository = new Repository(items);
		
		Iterator iterator = repository.getIterator();
		
		assertEquals("London", iterator.next());
		assertEquals("Oxford", iterator.next());
		assertEquals("Cambridge", iterator.next());
		assertNull(iterator.next());
	}
	
	@Test
	public void testFirst() {
		repository = new Repository(items);
		
		Iterator iterator = repository.getIterator();
		
		assertEquals("London", iterator.first());
	}
	
	@Test
	public void testCurrent() {
		repository = new Repository(items);
		
		Iterator iterator = repository.getIterator();
		
		assertEquals("London", iterator.current());
		iterator.next();
		assertEquals("Oxford", iterator.current());
		iterator.next();
		assertEquals("Cambridge", iterator.current());
		iterator.next();
		assertNull(iterator.current());
	}
}
