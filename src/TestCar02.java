import java.util.*;

public class TestCar02 {
	public static String name = "";
	public static String color = "";
	public static int year = 0;
	
	public static void main(String[] args) {
		input();
		output();
	}

	private static void input() {
		// TODO Auto-generated method stub
		System.out.println("값을 입력하세요(차이름 색상 연도)");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		color = sc.next();
		year = Integer.parseInt(sc.next());
	}

	private static void output() {
		// TODO Auto-generated method stub
		System.out.println(name + color + year);
	}
}
