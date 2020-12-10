import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        MainProgram mainProgram = new MainProgram();
        mainProgram.printBanner();
        while (true) {
            int studentID = mainProgram.receiveStudentID();
            mainProgram.runModule(studentID);
        }
    }

    public void printBanner() {
        System.out.println("[2020-Fall Software Engineering]");
        System.out.println("Simple Software Development Project");
        System.out.println();
    }

    public int receiveStudentID() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a student ID: ");
        return input.nextInt();
    }

    public void runModule(int studentID) {
        if (studentID == 11530)
            System.out.println("No. It is the professor ID.\n");
        
        else if (studentID == 1816195) {
        	System.out.println("[Student ID: 1816195]");
        	System.out.println("1. Calculate Factorial");
        	System.out.println("2. Calculate Absolute Value");
        	
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter menu number: ");
        	int menu = sc.nextInt();
        	
        	if (menu == 1) {
        		System.out.print("Enter a positive integer to calculate factorial: ");
        		int n = sc.nextInt();
        		if (n<0) 
            		System.out.println("Please enter a positive integer. \n");
        		else
        			System.out.println("Factorial " + n + " is " + factorial_1816195(n) + "\n");
        	}
        	else if (menu == 2) {
        		System.out.print("Enter a real number to calculate absolute value: ");
        		float f = sc.nextFloat();
        		System.out.println("Absolute value of " + f + " is " + absolute_1816195(f) + "\n");
        	}
        }
        
        else if (studentID == 1816913) {
        	System.out.println("[Student ID: 1816913]");
        	System.out.println("1. Calculate Power");
        	System.out.println("2. Calculate Factorial");
        	
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter menu number: ");
        	int menu = sc.nextInt();
        	
        	if (menu == 1) {
        		System.out.print("Enter two positive integers to calculate power: ");
        		int n1 = sc.nextInt();
        		int n2 = sc.nextInt();
        		if (n1 <= 0 || n2 < 0) 
            		System.out.println("Please enter positive integer. \n");
        		else
        			System.out.println(power_1816913(n1, n2) + "\n");
        	}
        	else if (menu == 2) {
        		System.out.print("Enter a positive integer to calculate factorial: ");
        		int n = sc.nextInt();
        		if (n < 0)
        			System.out.println("Please enter positive integer. \n");
        		else 
        			System.out.println(factorial_1816913(n) + "\n");
        	}
        }
	else if(studentID == 1816526){
		System.out.println("[Student ID: 1816526]");
		System.out.println("1. Calculate Maximum");
		System.out.println("2. Calculate Factorial");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter menu number: ");
		int menu = sc.nextInt();

		if (menu == 1){
			System.out.print("Enter first integer to calculate maximum: ");
			int a = sc.nextInt();
			System.out.print("Enter second integer to calculate maximum: ");
			int b = sc.nextInt();
			System.out.println("Maximum value is " +max_1816526(a, b)+"\n");
	
		}
		else if(menu == 2){
			System.out.print("Enter a positive integer to calculate factorial: ");
			int n = sc.nextInt();
			if(n <0)
				System.out.println("Please enter positive integer.");
			else if(n > 100)
				System.out.prinln("It's too big ! Please enter positive integer less than 100");
			else
				System.out.println(n+ "! is " +factorial_1816526(n)+ "\n");
		}
		else
			System.out.println("You enter the wrong number. Please enter 1 or 2");

		receiveStudentID();

	}
        else
            System.out.println("To be developed...\n");
    }
    
    public static int factorial_1816195 (int n) {
    	int result = 1;
    	
    	for (int i=1; i<=n; i++) {
    		result *= i;
    	}
    	return result;
    }
    
    public static float absolute_1816195 (float f) {
    	float result = 0;
    	if ( f >= 0 )
    		result = f;
    	else 
    		result = -f;
    	return result;
    }
    
    public static int power_1816913 (int n1, int n2) {
    	int answer = 1;
    	int i;
    	if (n2 == 0 ) return 1;
    	for (i=1; i<=n2; i++) {
    		answer *= n1;
    	}
    	return answer;
    }
    
    public static int factorial_1816913 (int n) {
    	int answer = 1;
    	int i;
    	if (n == 0) return 0;
    	for (i=1; i<=n; i++)
    		answer *= i;
    	return answer;
    }
    public int max_1816526(int a, int b){
	int max = 0;
	max = a>b ? a : b;
	return max;
    }
    public int factorial_1816526(int n){
	    int fact = 1;
	    if(n == 0) return 1;
	    for(int i = 0 ; i<=n; i++)
		    fact *= i;
	    return fact;
    }
    
}
