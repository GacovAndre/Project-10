import java.util.Scanner;
public class FactorialCalculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Vnesete pozitiven broj za da go presmetate negoviot faktoriel : ");
int number = scanner.nextInt();
if (number < 0) {
System.out.println("Faktorielot e nedefiniran za negativnite broevi. ");
} else {
long factorial = calculateFactorial(number);
System.out.println("Faktorielot za " + number + " e " + factorial );
}
scanner.close();
}
public static long calculateFactorial(int n) {
if (n == 0 || n == 1) {
return 1;
} else {
long result = 1;
for (int i = 2; i <= n; i++) {
result *= i;
}
return result;
}
}
}