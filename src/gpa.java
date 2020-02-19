import java.util.Scanner;

public class gpa {

	public static void main(String[] args) 
	{
		
			
		
		Scanner scan = new Scanner (System.in);
		
		String letterGrade = " ";
		double gradePoint = 0;
		
		
		while (!letterGrade.equalsIgnoreCase("Q")) 
		{
			System.out.println("Enter grade: ");
			letterGrade = scan.next();
		switch (letterGrade) 
		{
		
		case "A" : gradePoint = 4.00;
			
		break;
		
		case "A-" : gradePoint = 3.70;
		
		break;
		
		case "B+" : gradePoint = 3.33;
		
		break;
		
		case "B" : gradePoint = 3.00;
		
		break;
		
		case "B-" : gradePoint = 2.70;
		
		break;
		
		case "C+" : gradePoint = 2.30;

		break;

		case "C" : gradePoint = 2.00;

		break;

		case "C-" : gradePoint = 1.70;

		break;

		case "D+" : gradePoint = 1.30;

		break;
		
		case "D" : gradePoint = 1.00;

		break;
		
		case "D-" : gradePoint = 0.70;

		break;
		
		case "F" : gradePoint = 0.00;

		break;
		
		
		default: 
		}
		
		if (!letterGrade.equalsIgnoreCase("Q")) 
		{
			System.out.println("Your grade point is: "+gradePoint);
		}
		
		else 
		{
			System.out.println("End Program");

		}
		} 
		
	}

}
