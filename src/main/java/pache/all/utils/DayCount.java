package pache.all.utils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Logger;

import org.joda.time.DateTime;
import org.joda.time.Days;

/**
 * 
 * @author lpache
 *
 */
public class DayCount {

	private static final String JU_START = "15/05/2017";
	private static final String LEO_START = "01/06/2017";
	private static final String DMY_FORMATTER = "dd/MM/yyyy";
	private static final Logger LOG = Logger.getLogger(DayCount.class.getName());

	public DayCount() {
		throw new InstantiationError("Utility class, do not instantiate!!!");
	}

	public static int countDays(Calendar beginning, Calendar ending) {
		int days = 0;
		while(beginning.before(ending) && beginning.getTimeInMillis() != ending.getTimeInMillis()) {
			days++;
			beginning.add(Calendar.DAY_OF_YEAR, 1);
		}
		return days;
	}

	public static void main(String[] args) {
		//JodaTime
		int leoDays = newCountDays(newCalendar(LEO_START).getTimeInMillis(), Calendar.getInstance().getTimeInMillis());
		int juDays = newCountDays(newCalendar(JU_START).getTimeInMillis(), Calendar.getInstance().getTimeInMillis());
		LOG.info("Leo days: "+ leoDays);
		LOG.info("Jú days: "+ juDays);
		
		//Calendar
		int leoDays1 = countDays(newCalendar(LEO_START), newCalendarInstance(true));
		int juDays1 = countDays(newCalendar(JU_START), newCalendarInstance(true));
		LOG.info("Leo days: "+ leoDays1);
		LOG.info("Jú days: "+ juDays1);
	}
	
	private static Calendar newCalendarInstance(boolean resetTime) {
		Calendar date = Calendar.getInstance();
		if(resetTime) {
			return resetTimeFromDate(date);
		}
		return date;
	}

	public static final Calendar resetTimeFromDate(Calendar calendar) {

		if (calendar == null)
			return null;

		Calendar reseted = Calendar.getInstance();
		reseted.clear();
		reseted.set(Calendar.YEAR, calendar.get(Calendar.YEAR));
		reseted.set(Calendar.MONTH, calendar.get(Calendar.MONTH));
		reseted.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH));

		reseted.getTime(); // força atualização do timeInMills

		return reseted;
	}

	private static int newCountDays(long startTime, long timeNow) {
		Days days = Days.daysBetween(new DateTime(startTime), new DateTime(timeNow));
		return days.getDays();
	}

	private static Calendar newCalendar(String date) {
		Calendar dateTime = Calendar.getInstance();
		dateTime.setTimeInMillis(dateTimeFormatter(date, DMY_FORMATTER));
		return dateTime;
	}

	private static Long dateTimeFormatter(String date, String pattern) {
		SimpleDateFormat dateFormatter = new SimpleDateFormat(pattern);
		try {
			return dateFormatter.parse(date).getTime();
		} catch (ParseException e) {
			return null;
		}
	}
}
