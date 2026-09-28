import java.util.Scanner;

public class Something_idk {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Array size : ");
	int size = sc.nextInt();
	int[] a = new int[size];
	System.out.println("Enter Array elements : ");

	for (int i = 0; i < a.length; i++) {
		a[i] = sc.nextInt();
	}
	for (int i = 0; i < a.length; i++) {
		if (a[i] % 2 == 0) {
			System.out.println(a[i] + "");
		}
	}

}
