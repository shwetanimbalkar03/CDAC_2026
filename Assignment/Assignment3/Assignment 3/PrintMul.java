import java.util.Scanner;
class PrintMul{
	public static void main(String args[]){
	Scanner no = new Scanner(System.in);
	System.out.println("Enter the number:");
	int num = no.nextInt();
	for(int i =1;i<=10;i++){
		int mul = (num * i);
		System.out.println(num + "*" + i + "=" + mul); 
	
	}
}
}	