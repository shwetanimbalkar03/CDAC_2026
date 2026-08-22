import java.util.Scanner;
class CalSumFor{
	public static void main(String args[]){
	Scanner no = new Scanner(System.in);
	System.out.println("Enter the number");
	int N = no.nextInt();
	int sum = 0;
	for(int i = 1; i<=N; i++){
	sum = sum + i;
	}
	System.out.println("sum is " + sum);

}
}
