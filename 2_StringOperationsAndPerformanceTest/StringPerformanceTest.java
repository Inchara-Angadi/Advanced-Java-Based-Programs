package program;

public class StringPerformanceTest {
	
	    public static void main(String[] args) {
	        int iterations = 10000;
	        String text = "AIET";

	        // Test with StringBuffer (Thread-safe, slower)
	        StringBuffer stringBuffer = new StringBuffer();
	        long startTime1 = System.nanoTime();
	        for (int i = 0; i < iterations; i++) {
	            stringBuffer.append(text);
	        }
	        long endTime1 = System.nanoTime();
	        long durationBuffer = endTime1 - startTime1;

	        // Test with StringBuilder (Non-thread-safe, faster)
	        StringBuilder stringBuilder = new StringBuilder();
	        long startTime2 = System.nanoTime();
	        for (int i = 0; i < iterations; i++) {
	            stringBuilder.append(text);
	        }
	        long endTime2 = System.nanoTime();
	        long durationBuilder = endTime2 - startTime2;

	        // Output the results
	        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ns");
	        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ns");

	        // Justification
	        if (durationBuilder < durationBuffer) {
	            System.out.println("\nStringBuilder is faster and better for single-threaded performance.");
	        } else {
	            System.out.println("\nStringBuffer is safer for multithreading, but slower than StringBuilder.");
	        }
	    }
	}


