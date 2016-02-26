import java.util.Scanner;

public class JavaLessonFour {

	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= 20)
		{
			if(i==3)
			{
				i+=2;
				continue;					
			}
			System.out.println(i);
			i++;
			
			if((i%2) == 0)
			{
				i++;
			}
			
			double myPi = 4.0;
			double j = 3.0;
			//4 - 4/3 + 4/5 - 4/7
			
			while(j < 20000)
			{
				myPi = myPi - (4/j) + (4/(j+2));
				j +=4;
				System.out.println(myPi);
			}
			System.out.println("Value of PI: " + Math.PI);		
			
			String  contYorN = "Y";
			int h = 1;
			while (contYorN.equalsIgnoreCase("y"))
			{
				System.out.println(h);
				System.out.print("Continue y or n? ");
				contYorN = userInput.nextLine();
				h++;
				// dummy comment to test egit.
			}
		}

	}

}
