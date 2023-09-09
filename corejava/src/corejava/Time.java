package corejava;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today=LocalDate.now();
		System.out.println("Current Date="+today);
		LocalDate first_Day_2023=LocalDate.of(2022,Month.JANUARY, 6);
		System.out.println("Specific Date="+first_Day_2023);
		 LocalDate todaykolkata=LocalDate.now(ZoneId.of("Asia/Kolkata"));
		 System.out.println("current date in IST="+todaykolkata);
		 
		 //time
		 LocalTime t=LocalTime.now();
		 System.out.println("Current Time="+t);
		 LocalTime specificTime=LocalTime.of(12,50);
		 System.out.println("Specific time of day="+specificTime);
		 
		 LocalTime timekolkata=LocalTime.now(ZoneId.of("America/Chicago"));
		 System.out.println("Time="+timekolkata);
		 //Date
		 LocalDate todayy=LocalDate.now();
		 System.out.println("Current date="+todayy);
		

	}

}
