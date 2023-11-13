package singleton;

public class Printer {
	private static Printer printer = null;
	private Printer() {}
	
	public static Printer getPrinter() {
		if (printer == null) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {}
			printer = new Printer();
		}
		return printer;
	}
	
	public void print(String str) {
		System.out.println(str);
	}
}
