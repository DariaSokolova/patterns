package com.epam.mentoring.patterns.behavioral.iterator;

public class Repository implements Iterable {
	private String items[];

	public Repository(String items[]) {
		this.items = items;
	}
	@Override
	public Iterator getIterator() {
		return new ItemIterator();
	}

	private class ItemIterator implements Iterator {
		int index;

		@Override
		public boolean hasNext() {
			return !isEmpty() && index < items.length ? true : false;
		}

		@Override
		public Object next() {
			return this.hasNext() ? items[index++] : null;
		}

		@Override
		public Object first() {
			return !isEmpty() ? items[0] : null;
		}

		@Override
		public Object current() {

			Boolean f = index < items.length;
			f.booleanValue();
			return !isEmpty() && index < items.length ? items[index] : null;
		}

		private boolean isEmpty() {
			return items == null || items.length == 0 ? true : false;
		}
	}
}
