package com.edu.maven;

import org.junit.Test;

import junit.framework.Assert;

public class TestMavenFirst {
	@Test
	public void testsayHello(){
		MavenFirst first = new MavenFirst();
		String result = first.sayHello("maven");
		Assert.assertEquals("hello maven", result);
	}
}
