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
			System.out.print("Enter your array size to calculate maximum");
			int m = sc.nextInt();
			if(m>10)
				System.out.println("It's too long! Please enter positive array size less than 10!");
			else if(m<=0)
				System.out.println("It's too small! Please enter positive array size more than 1!");
			else
				System.out.println("Maximum value is " +max_1816526(m)+"\n");
	
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

        }    

	else if(studentID == 1815940) {
		System.out.println("[Student ID: 1815940]\n");
		System.out.println("1.Caculate Exponent Power");
		System.out.println("2.Caculate Absolute\n");
		Scanner input=new Scanner(System.in);
		System.out.print("Enter menu number:");
		int menu=input.nextInt();
		
		if(menu==1){
			int a,b;
			System.out.print("\nEnter the base number (only positive integer):");
			a=input.nextInt();
			if(a<=0) {
				while(true){	
					System.out.print("Please Enter the positive number:");
					a=input.nextInt();
					if(a>0) break;
				}
				}
			System.out.print("Enter the exponent number (only positive integer):");
			b=input.nextInt();
			if(b<=0) {
				while(true){	
					System.out.print("Please Enter the positive number:");
					b=input.nextInt();
					if(b>0) break;
				}
				}

			System.out.println("\nThe result of calculate "+a+"^"+b+" is "+ power_1815940(a,b) +"\n");
		}
		
		else if(menu==2){
			float a;
			System.out.print("\nEnter the Real number:");
			a=input.nextInt();
					
			System.out.println("\nThe result of calculate absolute "+a+" (|"+a+"|) is "+ absolute_1815940(a) +"\n");
		}
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
    public static int max_1816526(int m){
    	Scanner scan = new Scanner(System.in);
	int max = 0;
	int[] num = new int[m];
	for(int i = 0; i<m;i++){
		System.out.print("Enter an integer which will be in index "+(i+1)+" : ");
		num[i] = scan.nextInt();
		if(i == 0) max = num[i];
		else
			max = max<num[i] ? num[i] : max;
	}
	return max;
    }
    public static int factorial_1816526(int n){
	    int fact = 1;
	    if(n == 0) return 1;
	    for(int i = 0 ; i<=n; i++)
		    fact *= i;
	    return fact;
    }
    
    public static int power_1815940(int a, int b){
	int result=1;
	for(int i=1;i<=b;i++)
		result=result*a;
	return result;

    }
    
    public static float absolute_1815940(float a){
    	if(a>=0)
    		a=a;
    	else
    		a=-a;
    	return a;
    }
    

    
}
