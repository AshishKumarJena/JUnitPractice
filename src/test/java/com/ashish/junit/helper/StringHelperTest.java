package com.ashish.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	// AACD => CD ACD => CD CDEF => CDEF CDAA => CDAA

	StringHelper helper = new StringHelper();

	@Test
	public void testTruncateAInFirst2Positions_Ainfirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));

		// expected,actual
	}

	@Test
	public void testTruncateAInFirst2Positions_Ainfirst2Position() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));

	}

	// expected:<ABC[]> but was:<ABC[D]>

}
