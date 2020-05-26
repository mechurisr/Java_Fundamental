package practiceNote;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MilliPrac {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(2000589167275105l);
		
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		 String date = sdf.format(cal.getTime());
		 System.out.println(date);
				
	}

}
