package com.oracle.truffle.sl.test;

import org.junit.Test;

import com.oracle.truffle.api.interop.InteropLibrary;

public class TruffleIssueTest {
	@Test(expected = IllegalArgumentException.class)
	public void myTest() {
		InteropLibrary.getFactory().createDispatched(-1);
	}
}
