package telran.multithreading;

public class CounterUpdater extends Thread{
	private static long counter;

	private int nRuns;
	
	public CounterUpdater(int nRuns) {
		super();
		this.nRuns = nRuns;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < nRuns; i++) {
			counterIncrement();
		}
	}

	synchronized static private void counterIncrement() {
			counter++;
	}
	
	public static long getCounter() {
		return counter;
	}
}
