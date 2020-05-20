package practiceNote;

public class StopWatchDemo {
	public static void run(StopMilliWatch s1) {
		s1.execute();
	}
	
	public static void run(StopNanoWatch s1) {
		s1.execute();
	}
	
	public static void main(String[] args) {
		StopMilliWatch s1 = new StopMilliWatch();
		//StopNanoWatch s1 = new StopNanoWatch();
		run(s1);
	}

}
