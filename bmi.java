package nazansonal_211805027_lab3;

public class bmi {
	 private String name;
	 private int age;
	 private double weight; 
	 private double height; 
	 public static final double KILOGRAMS_PER_POUND = 0.45359237;
	 public static final double METERS_PER_INCH = 0.0254;
	
  public bmi (){
	  name = "John Black";
      age = 25;
      weight = 100;
      height = 50;
  }
   public bmi (String name, double weight, double height) {
	   setName(name);
       setAge(20);
       setWeight(weight);
       setHeight(height);
       }
   public bmi (String name, int age, double weight, double height) {
	   setName(name);
       setAge(age);
       setWeight(weight);
       setHeight(height);
   }
   public double getBMI() {
	   double bmi = weight * KILOGRAMS_PER_POUND / 
	   ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
	    return Math.round(bmi * 100) / 100.0;
	   }
   public String getStatus() {
	    double bmi = getBMI();
	    if (bmi < 18.5)
	    return "Underweight";
	   else if (bmi < 25)
	    return "Normal";
	    else if (bmi < 30)
	    return "Overweight";
	    else
	    return "Obese";
	  }
	  
	    public String getName() {
	    return name;
	   }
	    public void setName(String name1) {
	        name = name1;
	    }
	    public void setAge(int age1) {
	        age = age1;
	    }
	    public int getAge() {
	    return age;
	    }
	    public void setWeight(double weight1) {
	        weight = weight1;
	    }
	   
	    public double getWeight() {
	    return weight;
	    }
	   
	    public double getHeight() {
	  return height;
}
	    public void setHeight(double height1) {
	        height = height1;
	    }
	    
}

