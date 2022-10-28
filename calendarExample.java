package JavaBasics;

import java.util.Calendar;

public class calendarExample {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.getTime());
		System.out.println(cal.getTimeZone());
		System.out.println(cal.getActualMaximum(4));
		System.out.println(cal.clone());
		
	}

}
