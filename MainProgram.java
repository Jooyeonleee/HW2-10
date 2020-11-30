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
        
        else
            System.out.println("To be developed...\n");
    }
    
}
