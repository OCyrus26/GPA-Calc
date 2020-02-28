import java.util.*; //Import Scanner 

public class gpaV2 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in); //Scanner = Scan 

		// variables
		String transcript = ("Course\tCredit\tGrade\tGradePoints\n\tHours\n");
		String courseName =  " ";
		String grade = " ";
		String letterGrade = " ";

		int creditHours = 0;

		float gpa;

		double gradePoint2 = 0;
		double totalGradePoints =0;
		double totalHours =0;

		{
			//while loop
			while (true && !letterGrade.equalsIgnoreCase("Q"))
			{
				System.out.println("Please enter your course name: ");
				courseName = scan.next();
				if (courseName.equalsIgnoreCase("end"))
				{
					break;
				}

				System.out.println("Enter grade: ");
				letterGrade = scan.next();
				switch (letterGrade) 
				{

				case "A" : gradePoint2 = 4.00;

				break;

				case "A-" : gradePoint2 = 3.70;

				break;

				case "B+" : gradePoint2 = 3.33;
				
				break;

				case "B" : gradePoint2 = 3.00;

				break;

				case "B-" : gradePoint2 = 2.70;

				break;

				case "C+" : gradePoint2 = 2.30;

				break;

				case "C" : gradePoint2 = 2.00;

				break;

				case "C-" : gradePoint2 = 1.70;

				break;

				case "D+" : gradePoint2 = 1.30;

				break;

				case "D" : gradePoint2 = 1.00;

				break;

				case "D-" : gradePoint2 = 0.70;

				break;

				case "F" : gradePoint2 = 0.00;

				break;


				default: 
				}

				if (true) 
				{
					System.out.println("Your grade point is: "+gradePoint2);
				}

				System.out.print("Now please enter your credit hours earned: ");
				creditHours = scan.nextInt();

				gradePoint2 = creditHours*gradePoint2;

				transcript = transcript + "\n"+courseName+"\t" +creditHours + "\t"+ letterGrade +"\t"+gradePoint2+"\n";
				totalHours = totalHours+creditHours;
				totalGradePoints = totalGradePoints+gradePoint2;

			}

		}
		System.out.println(transcript);
		System.out.print(totalHours+" Total Credit Hours Attempted   ");
		System.out.println(totalGradePoints+" Total Grade Points");


		gpa = (float) (totalGradePoints/totalHours);
		System.out.println("Your GPA is: "+gpa);


	} 
}

