package com.epam.mentoring.patterns.creational.singleton;

import java.lang.reflect.Method;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonTest {

	@Test
	public void TestGetInstance_Eager() throws Exception {
		testSingleton(EagerSingleton.class);
	}

	@Test
	public void TestGetInstance_BillPugh() throws Exception {
		testSingleton(BillPughSingleton.class);
	}

	@Test
	public void TestGetInstance_Lazy() throws Exception {
		testSingleton(LazySingleton.class);
	}

	@Test
	public void TestGetInstance_StaticBlock() throws Exception {
		testSingleton(StaticBlockSingleton.class);
	}

	@Test
	public void TestGetInstance_ThreadSafeDoubleCheck() throws Exception {
		testSingleton(ThreadSafeDoubleCheckSingleton.class);
	}

	@Test
	public void TestGetInstance_ThreadSafe() throws Exception {
		testSingleton(ThreadSafeSingleton.class);
	}

	private void testSingleton(Class clazz) throws Exception {
		Method method = clazz.getMethod("getInstance", null);
		Singleton singleton1 = (Singleton) method.invoke(null, (Object[]) null);
		Singleton singleton2 = (Singleton) method.invoke(null, (Object[]) null);

		assertEquals(singleton1, singleton2);
	}
}
