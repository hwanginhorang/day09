package practice;

import java.util.ArrayList;
import java.util.Scanner;

class Quiz03{
	public int op(ArrayList<String> arr) {
		int sum;
		sum = Integer.parseInt(arr.get(0)) + Integer.parseInt(arr.get(1));
		return sum;
	}
	public ArrayList<String> in() {
		ArrayList<String> arr = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("수 입력 : ");
		int num = input.nextInt();
		arr.add(num+"");
		arr.add(input.nextInt()+"");
		return arr;
	}
	public void pr(ArrayList<String> arr, int sum) {
		System.out.println(arr.get(0)+"+"+arr.get(1)+"="+sum);
	}
}
public class P3 {
	public static void main(String[] args) {
		Quiz03 q = new Quiz03();
		ArrayList<String> arr = q.in();
		int sum = q.op(arr);
		q.pr(arr,sum);
	}
}
