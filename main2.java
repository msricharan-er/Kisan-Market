import java.util.*;

class Farmer extends Person {
    private String bankAccountNumber;
    private String bankName;
    private Map<String, Double> availableCrops;

    public Farmer(String name, String mobileNumber, String password) {
        super(name, mobileNumber, password);
        this.availableCrops = new HashMap<>();
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
                System.out.println(GREEN + "Farmer registered successfully.");
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
                System.out.println(GREEN + "Farmer logged in successfully.");
                return true;
            } else {
                System.out.println(RED + "Invalid mobile number or password. Please try again.");
            }
        }
    }

    public void sellCrops() {
        double totalCost = 0;

        while (true) {
            System.out.println(CYAN + "\n--- Crop Selling Menu ---");
            System.out.println(YELLOW + "1. Commercial Crops");
            System.out.println(YELLOW + "2. Vegetables");
            System.out.println(YELLOW + "3. Exit");
            System.out.print(BLUE + "Choose a category to sell crops: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                System.out.println(CYAN + "\n--- Commercial Crops ---");
                System.out.println(YELLOW + "1. Paddy - 2000 Rs per quintal");
                System.out.println(YELLOW + "2. Cotton - 7000 Rs per quintal");
                System.out.println(YELLOW + "3. Maize - 2500 Rs per quintal");
                System.out.print(WHITE + "Choose the crop to sell: ");
                int cropChoice = sc.nextInt();
                System.out.print(WHITE + "Enter quantity in quintals: ");
                double quantity = sc.nextDouble();
                String cropName = "";
                double pricePerQuintal = 0;
                switch (cropChoice) {
                    case 1 -> {
                        cropName = "paddy";
                        pricePerQuintal = 2000;
                    }
                    case 2 -> {
                        cropName = "cotton";
                        pricePerQuintal = 7000;
                    }
                    case 3 -> {
                        cropName = "Maize";
                        pricePerQuintal = 2500;
                    }
                    default -> System.out.println(RED + "Invalid crop choice. Please try again.");
                }

                if (!cropName.isEmpty()) {
                    availableCrops.put(cropName, pricePerQuintal);
                    totalCost += pricePerQuintal * quantity;
                    System.out.println(GREEN + "You added " + quantity + " quintals of " + cropName + " to your inventory.");
                }
            } else if (choice == 2) {
                System.out.println(CYAN + "\n--- Vegetables ---");
                System.out.println(YELLOW + "1. Carrot - 30 Rs per kg");
                System.out.println(YELLOW + "2. Brinjal - 40 Rs per kg");
                System.out.println(YELLOW + "3. Potato - 45 Rs per kg");
                System.out.println(YELLOW + "4. Tomato - 25 Rs per kg");
                System.out.print(WHITE + "Choose the vegetable to sell: ");
                int vegetableChoice = sc.nextInt();
                System.out.print(WHITE + "Enter quantity in kilograms: ");
                double vegetableQuantity = sc.nextDouble();
                String vegetableName = "";
                double pricePerKg = 0;
                switch (vegetableChoice) {
                    case 1 -> {
                        vegetableName = "Carrot";
                        pricePerKg = 30;
                    }
                    case 2 -> {
                        vegetableName = "Brinjal";
                        pricePerKg = 40;
                    }
                    case 3 -> {
                        vegetableName = "Potato";
                        pricePerKg = 45;
                    }
                    case 4 -> {
                        vegetableName = "Tomato";
                        pricePerKg = 25;
                    }
                    default -> System.out.println(RED + "Invalid vegetable choice. Please try again.");
                }

                if (!vegetableName.isEmpty()) {
                    availableCrops.put(vegetableName, pricePerKg);
                    totalCost += pricePerKg * vegetableQuantity;
                    System.out.println(GREEN + "You added " + vegetableQuantity + " kg of " + vegetableName + " to your inventory.");
                }
            } else if (choice == 3) {
                System.out.println(YELLOW + "Exiting the crop selling menu...");
                break;
            } else {
                System.out.println(RED + "Invalid choice. Please try again.");
            }
        }

        System.out.println(GREEN + "\nTotal cost for the selected crops: " + totalCost + " Rs");
    }

    public Map<String, Double> getAvailableCrops() {
        return availableCrops;
    }

    public void addBankDetails() {
        while (true) {
            System.out.println(WHITE + "Enter your bank Account Number: ");
            bankAccountNumber = sc.next();
            if (bankAccountNumber.isEmpty()) {
                continue;
            }

            if (!bankAccountNumber.matches("\\d{12}")) {
                System.out.println(RED + "Invalid bank account number. Please enter a valid 12-digit number.");
                continue;
            }

            System.out.println(WHITE + "Enter your bank name: ");
            bankName = sc.next();
            if (bankName.isEmpty()) {
                continue;
            }
            if (!bankName.matches("[a-zA-Z\\s]+")) {
                System.out.println(RED + "Invalid bank name. Please enter a valid name (letters and spaces only).");
                continue;
            }

            System.out.println(GREEN + "Bank details added successfully.");
            break;
        }
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public String getBankName() {
        return bankName;
    }
public void displayBankDetails() {
    System.out.println(CYAN + "\n--- Farmer's Bank Details ---");
    if (bankAccountNumber != null && bankName != null) {
        System.out.println(YELLOW + "Bank Account Number: " + bankAccountNumber);
        System.out.println(YELLOW + "Bank Name: " + bankName);
    } else {
        System.out.println(RED + "Bank details are not available.");
    }
}
}