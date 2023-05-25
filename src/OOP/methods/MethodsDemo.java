package methods;

public class MethodsDemo {

	public static void main(String[] args) {
		int sumV=sum(1,3);
				//printToConsole(sum);
		printToConsole(sum(sumV,3.5));
		printToConsole("text");
	}
private static int sum(int i1, int i2) {
	int result = i1+i2;
	return result;
}

private static double sum(double d1,double d2) {
	return d1+d2;
}
private static void printToConsole(String text) {
	System.out.println(text);
}
private static void printToConsole(int i) {
	System.out.println(i);
}

private static void printToConsole(double d) {
	System.out.println(d);
}
}
