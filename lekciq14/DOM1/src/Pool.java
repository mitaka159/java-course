import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Pool {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(7);
		for (int i = 0; i < 5; i++) {
			Nishka worker = new Nishka();
			executor.execute(worker);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}

		System.out.println("Finished all threads");
	}
}
