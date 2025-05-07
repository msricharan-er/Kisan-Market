import java.util.*;

class User extends Person {
    public User(String name, String mobileNumber, String password) {
        super(name, mobileNumber, password);
    }

    void register() {
        while (!validateMobileNumber(mobileNumber)) {
            System.out.print(RED + "Invalid mobile number. Please enter a valid 10-digit number starting with 9, 8, 7, or 6: ");
            mobileNumber = sc.nextLine();
        }

        while (!validatePassword(password)) {
            System.out.print(RED + "Invalid password. Please enter a password (8-15 characters) that starts with a capital letter, contains lowercase letters, special characters, and numbers: ");
            password = sc.nextLine();
        }

        String otp = generateOTP();
        System.out.println(GREEN + "OTP for registration is: " + otp);

        while (true) {
            System.out.print(YELLOW + "Enter OTP to complete registration: ");
            String enteredOtp = sc.nextLine();

            if (enteredOtp.equals(otp)) {
                System.out.println(GREEN + "User registered successfully.");
                break;
            } else {
                System.out.println(RED + "Invalid OTP. Generating new OTP...");
                otp = generateOTP();
                System.out.println(GREEN + "New OTP: " + otp);
            }
        }
    }

    boolean login() {
        while (true) {
            System.out.print(WHITE + "Enter Mobile Number: ");
            String enteredMobile = sc.nextLine();
            System.out.print(WHITE + "Enter Password: ");
            String enteredPassword = sc.nextLine();

            if (enteredMobile.equals(mobileNumber) && enteredPassword.equals(password)) {
                System.out.println(GREEN + "User logged in successfully.");
                return true;
            } else {
                System.out.println(RED + "Invalid mobile number or password. Please try again.");
            }
        }
    }

    public void buyCrops(Farmer farmer) {
        double totalCost = 0;
        Map<String, Double> farmerCrops = farmer.getAvailableCrops();
       System.out.println(CYAN + "\n--- Crop Buying Menu ---");
        while (true) {
            		System.out.println(BLUE + "Enter the crop you want to buy (or type 'exit' to leave): ");

              String selectedCrop = sc.nextLine();

            if (selectedCrop.equalsIgnoreCase("exit")) {
                System.out.println(YELLOW + "Exiting the crop buying menu...");
                break;
            }

            if (farmerCrops.containsKey(selectedCrop)) {
                System.out.print(BLUE + "Enter quantity: ");
                double quantity = sc.nextDouble();
                sc.nextLine();

                double pricePerUnit = farmerCrops.get(selectedCrop);
                totalCost += pricePerUnit * quantity;

                System.out.println(GREEN + "You selected " + quantity + " of " + selectedCrop + " at " + pricePerUnit + " Rs per unit.");
            } else {
    
                System.out.println(CYAN + "Available crops:");
                displayAvailableCrops(farmerCrops);
		

            }
        }

        if (totalCost > 0) {
            System.out.println(GREEN + "\nTotal cost for the selected crops: " + totalCost + " Rs");
	    System.out.println(CYAN + "\n--- Farmer's Bank Details for Payment ---");
           farmer.displayBankDetails();

            while (true) {
                System.out.print(YELLOW + "Enter farmer's bank account number for payment: ");
                String enteredAccountNumber = sc.next();
                System.out.print(YELLOW + "Enter farmer's bank name: ");
                String enteredBankName = sc.next();

                if (enteredAccountNumber.equals(farmer.getBankAccountNumber()) &&
                        enteredBankName.equalsIgnoreCase(farmer.getBankName())) {
                    System.out.println(GREEN + "Payment successful. Thank you for your purchase!");
                    break;
                } else {
                    System.out.println(RED + "Incorrect bank details. Please try again.");
                }
            }
        } else {
            System.out.println(YELLOW + "No crops purchased.");
        }
    }

    public void displayAvailableCrops(Map<String, Double> crops) {
        for (Map.Entry<String, Double> entry : crops.entrySet()) {
            System.out.println(YELLOW + entry.getKey() + " - " + entry.getValue() + " Rs per unit");
        }
    }
}