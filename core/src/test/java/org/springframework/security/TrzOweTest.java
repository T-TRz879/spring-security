package org.springframework.security;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TrzOweTest {
	@Test
	public void testClassSame() {
		SuperA a = new A();
		assertThat(SuperA.class.isAssignableFrom(a.getClass())).isTrue();
	}
}

interface SuperA {
	void say();
}

class A implements SuperA {

	@Override
	public void say() {
		System.out.println("i am a");
	}
}

