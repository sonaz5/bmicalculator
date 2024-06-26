package nazansonal_211805027_lab3;

import java.util.Scanner;

public class bmitest {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		int size = 3;
		bmi[] bmiArray = new bmi[size];
		 for (int i = 0; i < size; i++) {
	            String info = getinfo(input);
	            String[] data = separateInput(info);
	            String name = data[0];
	            int age = Integer.parseInt(data[1]);
	            double weight = Double.parseDouble(data[2]);
	            double height = Double.parseDouble(data[3]);

	            bmiArray[i] = new bmi(name, age, weight, height);
	        }
		 input.close();
		 
		  for (int i = 0; i < size; i++) {
	            System.out.print("BMI Information for Person " + (i + 1) + ":");
	            PrintbmiInfo(bmiArray[i]);
	        }
	}
	
	 public static String getinfo(Scanner input) {
	        System.out.print("Enter name, age, weight, and height (as space separated ): ");
	        return input.nextLine();
	    }
	 public static String[] separateInput(String input) {
	        String[] data = input.split(" ");
	        return data;
	    }
	 public static void PrintbmiInfo(bmi bmi) {
         System.out.println(" Name: " +bmi.getName()+" Age: "+bmi.getAge()+" Weight: " +bmi.getWeight()+" Height: "+ bmi.getHeight()+" BMI: " + bmi.getBMI()+" Status: " + bmi.getStatus());
         System.out.println();
         }
}
