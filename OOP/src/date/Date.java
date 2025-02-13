package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date {

	public static void main(String[] args) {

		//This is for current date
		LocalDate myObj = LocalDate.now();
		System.out.println(myObj);
		
		//this is for current time
		LocalTime myTime = LocalTime.now();
		System.out.println(myTime);
		
		//Current date and time
		LocalDateTime mydate = LocalDateTime.now();
		System.out.println(mydate);
		
		DateTimeFormatter myFormatobj = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss");
		
		String formattedDate = mydate.format(myFormatobj);
		
		System.out.println(formattedDate);

	}

}
