
public class SimpleProgram {
	
	public double findAverage(double[] numbers) {
		int length = numbers.length;
		int total = 0;
		
		for(int i = 0; i < length; i++) {
			total += numbers[i];
		}
		return total/length;
	}
	
}
