package practiceNote;

public class StopNanoWatch {
	private long startTime;
	private long endTime;
	
	private double getElapsedTime() {
		return (double) (endTime - startTime) / 1_000_000_000;
	}
	
	private void start() {
		startTime = System.nanoTime();
	}
	
	private void stop() {
		endTime = System.nanoTime();
	}
	public void execute() {
		start();
		for (long i = 0; i <20000_000_000l; i++) {
		}
		stop();
		
		double elapsedTime = getElapsedTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}
}
