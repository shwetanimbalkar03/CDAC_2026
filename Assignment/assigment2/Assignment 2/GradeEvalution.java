class GradeEvalution {
	public static void main(String args[]){
	int avg = 85;
	int math = 80;
	int sci = 80;
	int history = 90;
	
	if(avg>=90){
	System.out.println("Grade A");
	}

	else if(avg>=70){
	System.out.println("Grade B");
	}
	
	else if(avg>=50){
	System.out.println("Grade C");
	}
	
	else if(avg>=30){
	System.out.println("Grade D");
	}
	
	else {
		System.out.println("Fail");
	}
}
}
