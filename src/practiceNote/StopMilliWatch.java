package practiceNote;

public class StopMilliWatch {
	private long startTime;
	private long endTime;
	
	private double getElapsedTime() {
		return (double) (endTime - startTime) /1000;
	}

	private void start() {
		startTime = System.currentTimeMillis();
	}
	private void stop() {
		endTime = System.currentTimeMillis();
	}
	public void execute() {
		start();
		for (long i = 0; i < 10000_000_000l; i++) {
		}
		stop();
		
		double elapsedTime = getElapsedTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
		
	}
}
