package methods;

import classes.Classez;

public class BMI {
	
	public static String bmi(double weight, double height) {
		double bodyMassIndex = weight/ (height * height);
		  if (bodyMassIndex < 18.5 && bodyMassIndex > 10) {
			  return "You are underweight";
		  }
		  else if (bodyMassIndex <= 24.9 && bodyMassIndex > 18.5) {
			  return "You are in the healthy weight range " + Math.round(bodyMassIndex);
		  }
		  else if (bodyMassIndex <= 29.9 && bodyMassIndex > 25) {
			  return "You are in the overweight range " + Math.round(bodyMassIndex);
		  }
		  else if (bodyMassIndex <= 39.9 && bodyMassIndex > 30) {
			  return "You are in the obese range " + Math.round(bodyMassIndex);
		  }
		  else {
			  return "Invalid values";
		  }
		
		
		//below 18.5 – you're in the underweight range. 18.5 to 24.9 – you're in the healthy weight range.
//		25 to 29.9 – you're in the overweight range. 30 to 39.9 – you're in the obese range
		
		
	}

	public static void main(String[] args) {
		
		
		System.out.println(bmi(200,1.70));
		Classez.cars();
		Classez pack = new Classez();
		
		pack.text();
		
		

	}

}
