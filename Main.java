class Main {
    private static Farmer farmer;
    private static User user;
    private static Admin admin;

    public static void main(String[] args) {

System.out.println(Person.GREEN+Person.BLINK+"###  ###   ######   #####     ###    ##   ##           ##     ##    ###    ######   ### ###  #######   # ### # "+Person.RESET);
System.out.println(Person.GREEN+Person.BLINK+" ##  ##      ##    ##   ##   ## ##   ###  ##           ###   ###   ## ##    ##  ##   ## ##    ## ##   ## ## ## "+Person.RESET);
System.out.println(Person.GREEN+Person.BLINK+" ## ##       ##    ##       ##   ##  #### ##           #### ####  ##   ##   ##  ##   ####     ##         ##    "+Person.RESET);
System.out.println(Person.GREEN+Person.BLINK+" ## #        ##     #####   ##   ##  #######           ##  #  ##  ##   ##   #####    ###      ####       ##    "+Person.RESET);
System.out.println(Person.GREEN+Person.BLINK+" ## ##       ##         ##  #######  ## ####           ##     ##  #######   ## ##    ####     ##         ##    "+Person.RESET);
System.out.println(Person.GREEN+Person.BLINK+" ##  ##      ##    ##   ##  ##   ##  ##  ###           ##     ##  ##   ##   ## ##    ## ##    ##  ##     ##    "+Person.RESET);
System.out.println(Person.GREEN+Person.BLINK+"###  ###   ######   #####   ##   ##  ##   ##           ###   ###  ##   ##  #### ##  ### ###  #######    ####   "+Person.RESET);
        while (true) {
            System.out.println(Person.GREEN+"\n--- Main Menu ---");
            System.out.println(Person.YELLOW+"1. Register Admin");
            System.out.println(Person.YELLOW+"2. Login Admin");
            System.out.println(Person.YELLOW+"3. Register Farmer");
            System.out.println(Person.YELLOW+"4. Login Farmer");
            System.out.println(Person.YELLOW+"5. Register User");
            System.out.println(Person.YELLOW+"6. Login User");
            System.out.println(Person.YELLOW+"7. View Activity Log (Admin)");
            System.out.println(Person.YELLOW+"8. Exit");
            System.out.print(Person.PURPLE+"Choose an option: ");
            int choice = Person.sc.nextInt();
            Person.sc.nextLine(); 
            switch (choice) {
                case 1 -> registerAdmin();
                case 2 -> loginAdmin();
                case 3 -> registerFarmer();
                case 4 -> loginFarmer();
                case 5 -> registerUser();
                case 6 -> loginUser();
                case 7 -> viewActivityLog();
                case 8 -> {
			
                    System.out.println(Person.YELLOW+"Exiting the system...");
for(int i=1;i<=1;i++){
System.out.println(Person.PURPLE+Person.BOLD+"               .-+##%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%#+=:             ");
System.out.println(Person.PURPLE+Person.BOLD+"            -*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#+.         ");
System.out.println(Person.PURPLE+Person.BOLD+"         -#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%+.      ");
System.out.println(Person.PURPLE+Person.BOLD+"       -%@@@@@@@#+-:.                                                 ..:-=@@@@@@@@.    ");
System.out.println(Person.PURPLE+Person.BOLD+"                                                                             :*@@@@@@@-   ");
System.out.println(Person.PURPLE+Person.BOLD+"                  *                                                            +@@@@@@+  ");
System.out.println(Person.PURPLE+Person.BOLD+"                 .+++-                                         =+++.             .#@@@@@+ ");
System.out.println(Person.PURPLE+Person.BOLD+"-@@@@@@@@@@@@@@* =@@@=                                         @@@@                #@@@@@:");
System.out.println(Person.PURPLE+Person.BOLD+"+%%%%%@@@@%%%%%= #@@@                                         -@@@*                .@@@@@*");
System.out.println(Person.PURPLE+Person.BOLD+"     :@@@*       @@@% .-==:       .-==:  :::   :::  :-==:     +@@@-    ::::         %@@@@%");
System.out.println(Person.PURPLE+Person.BOLD+"     *@@@-      :@@@%#@@@@@@=   .#@@@@@%+@@#  :@@%-%@@@@@@:   #@@@   =@@@%:         *@@@@%");
System.out.println(Person.PURPLE+Person.BOLD+"     @@@@       +@@@@-  -@@@@  -@@@%-:=@@@@-  +@@@@+ -#@@@*   @@@# :%@@%-           *@@@@%");
System.out.println(Person.PURPLE+Person.BOLD+"    :@@@#       @@@@-   .@@@@  @@@%    %@@@   @@@%    :@@@*   -@@@@@@+             *@@@@%");
System.out.println(Person.PURPLE+Person.BOLD+"    =@@@+      .@@@@    -@@@* =@@@-    %@@#  :@@@+    +@@@-  *@@@@@@@=              *@@@@%");
System.out.println(Person.PURPLE+Person.BOLD+"    *@@@-      =@@@+    +@@@: #@@@    .@@@=  *@@@-    @@@@.   @@@@@%@@@.             *@@@@%");
System.out.println(Person.PURPLE+Person.BOLD+"    @@@@       *@@@:    #@@@   #@@@   +@@@:  @@@@.   .@@@%   :@@@%: %@@%             *@@@@%");
System.out.println(Person.PURPLE+Person.BOLD+"   :@@@#       %@@%     @@@*   +@@@: -@@@@: :@@@%    -@@@+   =@@@+  :@@@*            *@@@@%");
System.out.println(Person.PURPLE+Person.BOLD+"   +@@@-      .@@@+    -@@@:    @@@@@%@@@@  =@@@+    *@@@.   #@@@.   =@@@=           *@@@@%");
System.out.println(Person.PURPLE+Person.BOLD+"   ::::        :::     .:::     .-==.  :==: .:::     .:::   ::::     ::::           *@@@@%");
System.out.println(Person.PURPLE+Person.BOLD+"                                                                                    *@@@@%");
System.out.println(Person.PURPLE+Person.BOLD+"                                  ===.     -==-   -=++==.     ===.   .===           *@@@@%");
System.out.println(Person.PURPLE+Person.BOLD+"  :-----                          @@@#    =@@%. +@@@%%@@@#.  =@@@.   +@@@           *@@@@%");
System.out.println(Person.PURPLE+Person.BOLD+"  +@@@@@.                         =@@@.  .@@%. *@@%.  :@@@+  #@@%    #@@+           *@@@@%");
System.out.println(Person.PURPLE+Person.BOLD+"  +@@@@@.                          @@@= .@@@: :@@@.    %@@*  @@@+    @@@.           *@@@@%");
System.out.println(Person.PURPLE+Person.BOLD+"  +@@@@@.                          *@@# #@@-  *@@%     @@@+ -@@@:   -@@@            *@@@@%");
System.out.println(Person.PURPLE+Person.BOLD+"  +@@@@@.                          -@@%-@@+   #@@#    +@@@: +@@%    #@@*            *@@@@%");
System.out.println(Person.PURPLE+Person.BOLD+"  =@@@@@:                           @@@@@*    +@@@-..+@@@=  *@@@-:-#@@@=            #@@@@%");
System.out.println(Person.PURPLE+Person.BOLD+"  -@@@@@=                           @@@%      *@@@@@@@@-   -@@@@@@%@@:            @@@@@#");
System.out.println(Person.PURPLE+Person.BOLD+"   @@@@@%                           +@@@:       .-=+=-:      .===-. :--            =@@@@@=");
System.out.println(Person.PURPLE+Person.BOLD+"   -@@@@@#                      :=+#@@#.                                          :@@@@@% ");
System.out.println(Person.PURPLE+Person.BOLD+"    +@@@@@@-                    @@%-                                           *@@@@@%. ");
System.out.println(Person.PURPLE+Person.BOLD+"     =@@@@@@#-                                                                .+@@@@@@%.  ");
System.out.println(Person.PURPLE+Person.BOLD+"      :#@@@@@@@+-.                                                         .=#@@@@@@@=    ");
System.out.println(Person.PURPLE+Person.BOLD+"        -#@@@@@@@@@%#*+-                                  =++++++++++++++#%@@@@@@@@@+      ");
System.out.println(Person.PURPLE+Person.BOLD+"          .=%@@@@@@@@@@@@@@@@@@@@@@@@@@+              +@@@@@@@@@@@@@@@@@@@@@@@@@*-        ");
System.out.println(Person.PURPLE+Person.BOLD+"              -+#%@@@@@@@@@@@@@@@@@@@@@=            -%@@@@@@@@@@@@@@@@@@@@@%*=:           ");
System.out.println(Person.PURPLE+Person.BOLD+"                    .:::::::::::=@@@@@%            #@@@@@@#:::::::::::::.                  ");
System.out.println(Person.PURPLE+Person.BOLD+"                                %@@@@@-         .+@@@@@@%-                                 ");
System.out.println(Person.PURPLE+Person.BOLD+"                               +@@@@@#        :*@@@@@@@+                                   ");
System.out.println(Person.PURPLE+Person.BOLD+"                              -@@@@@#      :+@@@@@@@%=                                     ");
System.out.println(Person.PURPLE+Person.BOLD+"                             -@@@@@%    :+%@@@@@@@#-                                       ");
System.out.println(Person.PURPLE+Person.BOLD+"                            +@@@@@@..-*@@@@@@@@%+.                                         ");
System.out.println(Person.PURPLE+Person.BOLD+"                          -@@@@@@@%@@@@@@@@@%+:                                            ");
System.out.println(Person.PURPLE+Person.BOLD+"                        :#@@@@@@@@@@@@@@@#=.                                               ");
System.out.println(Person.PURPLE+Person.BOLD+"                      :%@@@@@@@@@@@@@#+:                                                   ");
System.out.println(Person.PURPLE+Person.BOLD+"                      @@@@@@@@@@=.                                                      "+Person.RESET);
}


                    return;
                }
                default -> System.out.println(Person.RED+"Invalid choice. Please try again.");
            }
        }
    }
    private static void registerAdmin() {
        System.out.println(Person.YELLOW+"   ##     ####     ##   ##   ####    ##  ##  ");
        System.out.println(Person.YELLOW+"  ####    ## ##    ### ###    ##     ### ##  ");
        System.out.println(Person.YELLOW+" ##  ##   ##  ##   #######    ##     ######  ");
        System.out.println(Person.YELLOW+" ######   ##  ##   ## # ##    ##     ######  ");
        System.out.println(Person.YELLOW+" ##  ##   ##  ##   ##   ##    ##     ## ###  ");
        System.out.println(Person.YELLOW+" ##  ##   ## ##    ##   ##    ##     ##  ##  ");
        System.out.println(Person.YELLOW+" ##  ##   ####     ##   ##   ####    ##  ##  "+Person.RESET);
        System.out.print(Person.WHITE+"\nEnter Admin Name: ");
        String name = Person.sc.nextLine();
        System.out.print(Person.WHITE+"Enter Mobile Number: ");
        String mobileNumber = Person.sc.nextLine();
        System.out.print(Person.WHITE+"Enter Password: ");
        String password = Person.sc.nextLine();
        admin = new Admin(name, mobileNumber, password);
        admin.register();

        }

    private static void loginAdmin() {
        if (admin == null) {
            System.out.println(Person.YELLOW+"No admin registered yet. Please register first.");
            return;
        }
        if (admin.login()) {                    
        } 
         else {
            System.out.println(Person.RED+"Login failed. Please check your credentials.");
        }
    }

    private static void registerFarmer() {
System.out.println(Person.YELLOW+Person.BOLD+"        						  	  @@");
System.out.println(Person.YELLOW+Person.BOLD+"    						   	         %@%");
System.out.println(Person.GREEN+Person.BLINK+"       		 	 FARMER"+Person.RESET+Person.YELLOW+Person.BOLD+" 	   		         @@*");
System.out.println(Person.YELLOW+Person.BOLD+"     						   	         @@#=");
System.out.println(Person.YELLOW+Person.BOLD+"         							  @@*");
System.out.println(Person.YELLOW+Person.BOLD+"       					         *## 		 *@@@@@");
System.out.println(Person.YELLOW+Person.BOLD+"       				                *@@@@%- 	 =%@@@%# ");
System.out.println(Person.YELLOW+Person.BOLD+"           			 	        :%@@@@%- 	*#@@@@@@@");
System.out.println(Person.YELLOW+Person.BOLD+"              			               .-%@@@%##%%@@%%%@@%%@@@@%");
System.out.println(Person.YELLOW+Person.BOLD+"              			              ##@@@@@@@*             @@@*");
System.out.println(Person.YELLOW+Person.BOLD+"                		  *#%@@@@@@%%%####@@@@@@ 	    %@@@ ");
System.out.println(Person.YELLOW+Person.BOLD+"             		##@%%%@@@@@@%%#*	 =@@@@@@-	  :*@@@##");
System.out.println(Person.YELLOW+Person.BOLD+"              	 *##@@@@@@@#%#		         *@@@@@@	   @@@  ");
System.out.println(Person.YELLOW+Person.BOLD+"						 #@@@@@@*	  @   ");
System.out.println(Person.YELLOW+Person.BOLD+"						 #@@@@@%	 ");
System.out.println(Person.YELLOW+Person.BOLD+"						 %@@@@@ 		");
System.out.println(Person.YELLOW+Person.BOLD+"						%@@@@@@ 		");
System.out.println(Person.YELLOW+Person.BOLD+"						@@@@@@@@#	"+Person.RESET);
        System.out.print(Person.WHITE+"\nEnter Farmer Name: ");
        String name = Person.sc.nextLine();
        System.out.print(Person.WHITE+"Enter Mobile Number: ");
        String mobileNumber = Person.sc.nextLine();
        System.out.print(Person.WHITE+"Enter Password: ");
        String password = Person.sc.nextLine();
        farmer = new Farmer(name, mobileNumber, password);
        farmer.register();

      admin.logActivity("Farmer " + name + " registered.");
      }

    private static void loginFarmer() {
        if (farmer == null) {
            System.out.println(Person.RED+"No farmer registered yet. Please register first.");
            return;
        }
        if (farmer.login()) {
                     admin.logActivity("Farmer " + farmer.name + " logged in.");

             while (true) {
                System.out.println(Person.CYAN+"\n--- Farmer Menu ---");
                System.out.println(Person.PURPLE+"1. Sell Crops");
                System.out.println(Person.PURPLE+"2. Add Bank Account Details");
                System.out.println(Person.PURPLE+"3. Logout");
                System.out.print(Person.BLUE+"Choose an option: ");
                int option = Person.sc.nextInt();

                switch (option) {
                    case 1 -> {
                        farmer.sellCrops();
                        admin.logActivity("Farmer " + farmer.name + " sold crops.");
                    }
                    case 2 -> {
                        farmer.addBankDetails();
                        admin.logActivity("Farmer " + farmer.name + " added bank details.");
                    }
                    case 3 -> {
                        System.out.println("Logging out...");
                        admin.logActivity("Farmer " + farmer.name + " logged out.");
                        return;
                    }
                    default -> System.out.println(Person.RED+"Invalid option. Please try again.");
                }
            }
        }
    }

    private static void registerUser() {
System.out.println(Person.BLUE+Person.BLINK+"                   _          _       __      ");
System.out.println(Person.BLUE+Person.BLINK+"    //   / /     //   ) )     //   /    /   ) ) ");
System.out.println(Person.BLUE+Person.BLINK+"   //   / /     ((           //_      // //  ");
System.out.println(Person.BLUE+Person.BLINK+"  //   / /        \\\\        / __      / _ (    ");
System.out.println(Person.BLUE+Person.BLINK+" //   / /           ) )    //        //   | |    ");
System.out.println(Person.BLUE+Person.BLINK+"((   / /     ((    / /    //_/ /  //    | |   "+Person.RESET);
        System.out.print(Person.WHITE+"\nEnter User Name: ");
        String name = Person.sc.nextLine();
        System.out.print(Person.WHITE+"Enter Mobile Number: ");
        String mobileNumber = Person.sc.nextLine();
        System.out.print(Person.WHITE+"Enter Password: ");
        String password = Person.sc.nextLine();
        user = new User(name, mobileNumber, password);
        user.register();

             admin.logActivity("User " + name + " registered.");
    }

    private static void loginUser() {
        if (user == null) {
            System.out.println(Person.RED+"No user registered yet. Please register first.");
            return;
        }
        if (user.login()) {
            // Log login activity in the Admin's activity log
            admin.logActivity("User " + user.name + " logged in.");

                while (true) {
                System.out.println(Person.CYAN+"\n--- User Menu ---");
                System.out.println(Person.YELLOW+"1. Buy Crops");
                System.out.println(Person.YELLOW+"2. Logout");
                System.out.print(Person.BLUE+"Choose an option: ");
                int option = Person.sc.nextInt();

                switch (option) {
                    case 1 -> {
                        if (farmer == null) {
                            System.out.println(Person.RED+"No farmer available to buy crops from.");
                        } else {
                            user.buyCrops(farmer);
                            // Log crop buying activity
                            admin.logActivity("User " + user.name + " bought crops from Farmer " + farmer.name + ".");
                        }
                    }
                    case 2 -> {
                        System.out.println("Logging out...");
                        admin.logActivity("User " + user.name + " logged out.");
                        return;
                    }
                    default -> System.out.println(Person.RED+"Invalid option. Please try again.");
                }
            }
        }
    }

    private static void viewActivityLog() {
        System.out.println(Person.BLUE+"\n--- Admin Activity Log ---");
        admin.viewActivityLog();
    }
}