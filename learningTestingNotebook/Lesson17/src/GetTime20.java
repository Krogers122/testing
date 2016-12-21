/*
 * Threads and blocks of code
 * this will show how to execute time and will continue to 
 * show time until told to stop
 */
import java.util.*;
import java.text.DateFormat;

public class GetTime20 extends Thread{
	
	public void run() {
	
	Date rightNow;
	Locale currentLocale;//get the current location
	DateFormat timeFormatter;
	DateFormat dateFormatter;
	String timeOutput;
	String dateOutput;
	
	for (int i =1; i <= 20; i++) {
		rightNow = new Date();
		currentLocale = new Locale("en");
		/*
		 * this will pull the information from 
		 * the specific region "en" for English
		 */
		//date format
		timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale );
		dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale );
			// try changing the DEFAULT to SHORT, MEDIUM, LONG, FULL to get differ
			// date styles
		
		timeOutput = timeFormatter.format(rightNow);
		dateOutput = dateFormatter.format(rightNow);
		
		System.out.println(timeOutput);
		System.out.println(dateOutput);
		System.out.println();
		
		/*
		 *  Using the sleep method must also use the try and catch method
		 *  in order to find out if there are errors
		 */
		try {
			Thread.sleep(2000); //this is in milliseconds
		}
		catch(InterruptedException e)
		{}
	}

}
	
}
