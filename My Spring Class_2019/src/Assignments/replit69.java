package Assignments;
import java.util.*;

public class replit69 {

	

	public static void main(String[] args) {	  
		    //DO NOT CHANGE
		    double premium = 0;
				int accidentsAmount = 0;
				int daysDrivenToWorkOrSchool = 0;
				int milesToWorkOrSchool = 0;
				String vehicleOwnership = "";
				String vehicleUsage = "";
				String continuousInsurance = "";
				String education = "";
				String name = "";
				String referenceNumber = "";
				Scanner scan = new Scanner(System.in);
				System.out.println("Welcome to the CountyFarm car insurance!");
		    //WRITE YOUR CODE HERE

				  System.out.println("Enter your name");
					name = scan.nextLine();
					System.out.println("Do you have a US driver license?");

					String dl = scan.next();
					if (dl.equalsIgnoreCase("No")) {
						System.out.println("Invalid data!");
						System.exit(0);
					}
						System.out.println("Enter your zip code");
						int zipcode = scan.nextInt();
					
						
						
						if (zipcode == 20910 && zipcode == 20740) {
							premium += 30;
						} else {
							premium += 50;
						}
						System.out.println("Is this vehicle Owned, Financed, or Leased?");

						vehicleOwnership = scan.next();

						if (vehicleOwnership.equalsIgnoreCase("Owned")) {
							premium += 10;
						} else if(vehicleOwnership.equalsIgnoreCase("Financed")&& vehicleOwnership.equalsIgnoreCase("Leased")){
							premium += 20;
						}else {
							System.out.println("Invalid ownership");
							System.exit(0);
						}

						System.out.println("How is this vehicle primarily used?");

						vehicleUsage = scan.next();
						if (vehicleUsage.equalsIgnoreCase("Business")) {
							premium += 50;
						} else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
							premium += 10;
						} else if (vehicleUsage.equalsIgnoreCase("Commute")) {

							premium += 20;

							System.out.println("Days Driven To Work And/Or School");
							daysDrivenToWorkOrSchool = scan.nextInt();
							if (daysDrivenToWorkOrSchool >= 1 && daysDrivenToWorkOrSchool <= 7) {
								premium += daysDrivenToWorkOrSchool * 5;
							} else {
								System.out.println("invalid days");
							}
							System.out.println("Miles Driven To Work And/Or School");
							milesToWorkOrSchool = scan.nextInt();

							if (milesToWorkOrSchool >= 0) {
								premium += milesToWorkOrSchool * 1;
							}
						}else {
								System.out.println("Invalid Usage");
								System.exit(0);

						}
						System.out.println("How old are you?");
						int age = scan.nextInt();
						if (age < 16) {
							System.out.println("Invalid data!");
							System.exit(0);
						} else if (age >= 16 && age < 18) {
							premium = premium * 20;

						} else if (age >= 18 && age <= 21) {
							premium = premium * 6;

						} else if (age > 21 && age < 25) {
							premium = premium * 2;

						}
						System.out.println("How many years you've been driving?");
						int experience = scan.nextInt();
						int result = age - experience;
						if (experience > 0 && result >= 16) {
							premium -= experience * 5;
						} else {
							System.out.println("Invalid data!");
							System.exit(0);
						}

						System.out.println("Have you had any accidents in the last 5 years?");
						String accid = scan.next();
						if (accid.equalsIgnoreCase("Yes")) {
							System.out.println("How many?");
							accidentsAmount = scan.nextInt();
							if (accidentsAmount > 0) {
								premium += premium * 0.2 * accidentsAmount;
							}
						}

						System.out.println("Have you had continuous insurance for the past 12 months?");
						continuousInsurance = scan.next();

						if (continuousInsurance.equalsIgnoreCase("No")) {
							premium = premium * 2;
						}
					
						System.out.println("What is the highest level of education you have completed?");

						education = scan.next();

						if (education.equalsIgnoreCase("PhD") && education.equalsIgnoreCase("Bachelors")
								&& education.equalsIgnoreCase("Masters")) {

							premium -= premium * 0.05;

						} else if (education.equalsIgnoreCase("Doctors")) {

							premium -= premium * 0.1;
						} else if (education.equalsIgnoreCase("Less Than Hihg School")) {

							premium = premium * 1.05;
						}

						System.out.println(name + ", here's your quote!");

						System.out.println("Start Your Policy Today For: $" + premium);

						int count = name.length();
						name = name.toUpperCase();

						education = education.toUpperCase();
						String trim = education.trim();
						referenceNumber = "" + name.substring(0, 2) + age + name.substring(count - 2, count) + zipcode + trim;

						System.out.println("Reference number: " + referenceNumber);
						scan.close();
	      
					
					
	}
}

		