package pache.all.utils;


import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

public class DayCountTest {

	@Test
	public void countDays() {
		Calendar beginningDay = Calendar.getInstance();
		Calendar endingDay = Calendar.getInstance();
		endingDay.add(Calendar.DAY_OF_YEAR, 30);
		
		int count = DayCount.countDays(beginningDay, endingDay);
		assertEquals(30, count);
	}
	
	@Test(expected = InstantiationError.class)
	public void shouldReturnInstantiotionError(){
		new DayCount();
	}
}
