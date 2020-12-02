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
