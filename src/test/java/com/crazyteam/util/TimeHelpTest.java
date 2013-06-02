package com.crazyteam.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeHelpTest {

	@Test
	public void testGetTimeNum() {
		int timeNum=TimeHelp.getTimeNum();
		assertEquals(timeNum, 3);
		
	}

}
