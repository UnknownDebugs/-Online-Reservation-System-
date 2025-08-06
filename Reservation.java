import java.util.Scanner;

public class Main {

    public static void printCalendar(String monthName, int startDayOfWeek, int daysInMonth, String unavailableDates) {
        System.out.println("┌────────────────────────────────────┐");
        System.out.println("│ Mon │ Tue │ Wed │ Thu │ Fri │ Sat │ Sun │");
        System.out.println("├────────────────────────────────────┤");

        for (int i = 1; i < startDayOfWeek; i++) {
            System.out.print("│     ");
        }

        int dayOfWeek = startDayOfWeek;
        for (int day = 1; day <= daysInMonth; day++) {
            String dayString = String.valueOf(day);
            if (unavailableDates.contains(" " + dayString + " of " + monthName)) {
                System.out.printf("│  ❌ ");
            } else {
                System.out.printf("│ %2d  ", day);
            }

            if (dayOfWeek == 7) {
                System.out.println("│");
                System.out.println("├────────────────────────────────────┤");
                dayOfWeek = 1;
            } else {
                dayOfWeek++;
            }
        }

        while (dayOfWeek > 1) {
            System.out.print("│     ");
            dayOfWeek++;
            if (dayOfWeek > 7) {
                System.out.println("│");
            }
        }
        System.out.println("└────────────────────────────────────┘");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String unavailableDates = "";

        do {
            System.out.println(" ◜━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━◝");
            System.out.println("            ( Online Reservation System )         ");
            System.out.println(" 🌟 Thanks for coming in Sweeties Lambingan Hotel! 🌟");
            System.out.println(" ◞━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━◟");
            System.out.println("┌───────────────────────────────────┐");
            System.out.println("│           ✧  Main Menu   ✧            │");
            System.out.println("│   Please check it so you have an idea  │");
            System.out.println("├────┬──┴────────────────────┴──────┤");
            System.out.println("│ (1) │ Reservation   (Room reservation) │");
            System.out.println("├────┼──────────────────────────────┤");
            System.out.println("│ (2) │ About us     (Owner information) │");
            System.out.println("├────┼──────────────────────────────┤");
            System.out.println("│ (3) │ View             (Hotel details) │");
            System.out.println("├────┼──────────────────────────────┤");
            System.out.println("│ (4) │ Exit              (Out in hotel) │");
            System.out.println("└────┴──────────────────────────────┘");

            System.out.println("┌───────────────────────┐");
            System.out.print("│ Enter your choice:  ");
            String mainMenuChoice = input.nextLine();
            System.out.println("└───────────────────────┘");

            System.out.println("                                                                                 ");

            switch (mainMenuChoice) {
                case "1":
                    boolean backToMain = false;
                    while (!backToMain) {
                        System.out.println("┌───────────────────────────┐");
                        System.out.println("│ Please choose your schedules  │");
                        System.out.println("│   you would like preferred.   │");
                        System.out.println("└───────────────────────────┘");
                        System.out.println("┌──────────────────────────────────┐");
                        System.out.println("│ ☰ input (A}-for reservation          │");
                        System.out.println("├──────────────────────────────────┤");
                        System.out.println("│ ⟲ Input (B)-Back                     │");
                        System.out.println("└──────────────────────────────────┘");

                        String view = "";
                        while (true) {
                            System.out.println("┌───────────────────────┐");
                            System.out.print("│ Enter your choice:  ");
                            view = input.nextLine();
                            System.out.println("└───────────────────────┘");
                            System.out.println("                                                                                 ");
                            if (view.equalsIgnoreCase("A")) {
                                break;
                            } else if (view.equalsIgnoreCase("B")) {
                                backToMain = true;
                                break;
                            } else {
                                System.out.println("Invalid type.");
                            }
                        }

                        if (backToMain) {
                            break;
                        }

                        boolean backToView = false;
                        while (!backToView) {
                            System.out.println("┌─────────────────────────────────────┐");
                            System.out.println("│            🟢 ROOM DETAILS 🟢             │");
                            System.out.println("│  Choose the room number you would like    │");
                            System.out.println("├─────────────────────────────────────┤");
                            System.out.println("│ (1) ➜ NORMAL ROOM           ₱950 / Night │");
                            System.out.println("│                                           │");
                            System.out.println("│ Includes:                                 │");
                            System.out.println("│ • Single bed                              │");
                            System.out.println("│ • Electric fan                            │");
                            System.out.println("│ • Shared bathroom                         │");
                            System.out.println("│ • Basic toiletries (upon request)         │");
                            System.out.println("│ ========================================  │");
                            System.out.println("│ (2) ➜ STANDARD ROOM      ₱1,500 / Night  │");
                            System.out.println("│                                           │");
                            System.out.println("│ Includes:                                 │");
                            System.out.println("│ • Double bed                              │");
                            System.out.println("│ • Air-conditioning                        │");
                            System.out.println("│ • Private bathroom (hot & cold)           │");
                            System.out.println("│ • Cable TV and free Wi-Fi                 │");
                            System.out.println("│ ========================================  │");
                            System.out.println("│ (3) ➜ LUXURY ROOM        ₱2,800 / Night  │");
                            System.out.println("│                                           │");
                            System.out.println("│ Includes:                                 │");
                            System.out.println("│ • Queen size bed with clean lines         │");
                            System.out.println("│ • Full air-conditioned                    │");
                            System.out.println("│ • Private bathroom with toiletries        │");
                            System.out.println("│ • Free bottled water and coffee           │");
                            System.out.println("│ ========================================  │");
                            System.out.println("│ (4) ➜ VIP ROOM           ₱4,500 / Night  │");
                            System.out.println("│                                           │");
                            System.out.println("│ Includes:                                 │");
                            System.out.println("│ • King size bed                           │");
                            System.out.println("│ • Sofa set and living area                │");
                            System.out.println("│ • 55\" Smart TV in living area             │");
                            System.out.println("│ • Mini bar                                │");
                            System.out.println("├─────────────────────────────────────┤");

                            String roomChoice = "";
                            String roomName = "";
                            int roomPrice = 0;
                            boolean validRoom = false;

                            while (!validRoom) {
                                System.out.println("┌────────────────────────────┐");
                                System.out.println("│ Input room number (1,2,3,or 4) │");
                                System.out.println("├────────────────────────────┤");
                                System.out.println("│ ⟲ Input (B)-Back               │");
                                System.out.println("└────────────────────────────┘");
                                System.out.println("┌──────────────────────────┐");
                                System.out.print("│ Enter your preferred room: ");
                                roomChoice = input.nextLine();
                                System.out.println("└──────────────────────────┘");
                                System.out.println("                                                                                 ");

                                if (roomChoice.equalsIgnoreCase("B")) {
                                    backToView = true;
                                    break;
                                }

                                switch (roomChoice) {
                                    case "1":
                                        roomName = "NORMAL ROOM";
                                        roomPrice = 950;
                                        validRoom = true;
                                        break;
                                    case "2":
                                        roomName = "STANDARD ROOM";
                                        roomPrice = 1500;
                                        validRoom = true;
                                        break;
                                    case "3":
                                        roomName = "LUXURY ROOM";
                                        roomPrice = 2800;
                                        validRoom = true;
                                        break;
                                    case "4":
                                        roomName = "VIP ROOM";
                                        roomPrice = 4500;
                                        validRoom = true;
                                        break;
                                    default:
                                        System.out.println("Invalid room choice. Please enter a number from 1 to 4.");
                                }
                            }

                            if (backToView) {
                                break;
                            }
                            
                            System.out.println("===================================================");
                            System.out.println("You have selected: " + roomName + " at ₱" + roomPrice + " per night.");
                            System.out.println("===================================================");
                            System.out.println("                                                                                 ");

                            boolean backToRoom = false;
                            while (!backToRoom) {
                                System.out.println("┌─────────────────────────────────┐");
                                System.out.println("│⬇️ Choose the number you would like ⬇️│");
                                System.out.println("├─────────────────────────────────┤");
                                System.out.println("│  August    │ September  │  October   │");
                                System.out.println("│     1      │     2      │     3      │");
                                System.out.println("├─────────────────────────────────┤");
                                System.out.println("│  November  │  December  │    Year:   │");
                                System.out.println("│     4      │     5      │    2025    │");
                                System.out.println("└─────────────────────────────────┘");

                                System.out.println("┌──────────────────────────────────┐");
                                System.out.println("│ ☰ Choose month number (1,2,3,4,5)    │");
                                System.out.println("├──────────────────────────────────┤");
                                System.out.println("│ ⟲ Input (B)-Back                     │");
                                System.out.println("└──────────────────────────────────┘");
                                System.out.println("┌───────────────────────┐");
                                System.out.print("│ Enter your choice:  ");
                                String month = input.nextLine();
                                System.out.println("└───────────────────────┘");

                                if (month.equalsIgnoreCase("B")) {
                                    backToRoom = true;
                                    break;
                                }

                                String monthName = "";
                                boolean validMonth = false;
                                String days = "";
                                int startDayOfWeek = 0;
                                int daysInMonth = 0;

                                if (month.equals("1") || month.equals("2") || month.equals("3") || month.equals("4") || month.equals("5")) {
                                    validMonth = true;

                                    System.out.println("                                                                                 ");
                                    switch (month) {
                                        case "1":
                                            monthName = "August";
                                            startDayOfWeek = 5;
                                            daysInMonth = 31;
                                            System.out.println("=================================");
                                            System.out.println("You have selected: August 2025");
                                            System.out.println("=================================");
                                            System.out.println("                                                                                 ");
                                            printCalendar(monthName, startDayOfWeek, daysInMonth, unavailableDates);
                                            days = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31";
                                            break;
                                        case "2":
                                            monthName = "September";
                                            startDayOfWeek = 1;
                                            daysInMonth = 30;
                                            System.out.println("================================");
                                            System.out.println("You have selected: September 2025");
                                            System.out.println("================================");
                                            System.out.println("                                                                                 ");
                                            printCalendar(monthName, startDayOfWeek, daysInMonth, unavailableDates);
                                            days = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30";
                                            break;
                                        case "3":
                                            monthName = "October";
                                            startDayOfWeek = 3;
                                            daysInMonth = 31;
                                            System.out.println("================================");
                                            System.out.println("You have selected: October 2025");
                                            System.out.println("================================");
                                            System.out.println("                                                                                 ");
                                            printCalendar(monthName, startDayOfWeek, daysInMonth, unavailableDates);
                                            days = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31";
                                            break;
                                        case "4":
                                            monthName = "November";
                                            startDayOfWeek = 6;
                                            daysInMonth = 30;
                                            System.out.println("==================================");
                                            System.out.println("You have selected: November 2025");
                                            System.out.println("==================================");
                                            System.out.println("                                                                                 ");
                                            printCalendar(monthName, startDayOfWeek, daysInMonth, unavailableDates);
                                            days = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30";
                                            break;
                                        case "5":
                                            monthName = "December";
                                            startDayOfWeek = 1;
                                            daysInMonth = 31;
                                            System.out.println("===================================");
                                            System.out.println("You have selected: December 2025");
                                            System.out.println("===================================");
                                            System.out.println("                                                                                 ");
                                            printCalendar(monthName, startDayOfWeek, daysInMonth, unavailableDates);
                                            days = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31";
                                            break;
                                    }
                                } else {
                                    System.out.println("Invalid input month.");
                                    continue;
                                }

                                boolean backToMonth = false;
                                while (!backToMonth) {
                                    String day = "";
                                    boolean validDay = false;
                                    String selectedWeekday = "";
                                    String[] weekdays = {"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

                                    while (!validDay) {
                                        System.out.println("┌──────────────────────────────────┐");
                                        System.out.println("│ ☰ Choose your day preferred          │");
                                        System.out.println("├──────────────────────────────────┤");
                                        System.out.println("│ ⟲ Input (B)-Back                     │");
                                        System.out.println("└──────────────────────────────────┘");
                                        System.out.println("┌───────────────────────┐");
                                        System.out.print("│ Enter your choice:  ");
                                        day = input.nextLine();
                                        System.out.println("└───────────────────────┘");

                                        if (day.equalsIgnoreCase("B")) {
                                            backToMonth = true;
                                            break;
                                        }

                                        if ((" " + days + " ").contains(" " + day + " ") && !unavailableDates.contains(" " + day + " of " + monthName)) {
                                            validDay = true;
                                            int dayNumber = Integer.parseInt(day);
                                            int weekdayCounter = startDayOfWeek;

                                            for (int i = 1; i < dayNumber; i++) {
                                                weekdayCounter++;
                                                if (weekdayCounter > 7) {
                                                    weekdayCounter = 1;
                                                }
                                            }

                                            selectedWeekday = weekdays[weekdayCounter];
                                            System.out.println("                                                                                 ");
                                         
                                            System.out.println("======================================");
                                            System.out.println("You selected: " + monthName + " " + day + " " + selectedWeekday + ", 2025");
                                            System.out.println("======================================");
                                            System.out.println("                                                                                 ");
                                                                       
                                        } else {
                                            System.out.println("Invalid day or day is unavailable.");
                                        }
                                    }

                                    if (backToMonth) {
                                        break;
                                    }

                                    unavailableDates += " " + day + " of " + monthName;

                                    System.out.println("┌───────────────────────────────────┐");
                                    System.out.println("│          Input your details.           │");
                                    System.out.println("│            Input (B)-back.             │");
                                    System.out.println("├───────────────────────────────────┤");

                                    String name = "";
                                    boolean backToDay = false;
                                    while (true) {
                                        System.out.print(" (B)│➜ Name: ");
                                        name = input.nextLine();

                                        if (name.equalsIgnoreCase("B")) {
                                            unavailableDates = unavailableDates.replace(" " + day + " of " + monthName, "");
                                            backToDay = true;
                                            break;
                                        }
                                        if (!name.isEmpty()) {
                                            break;
                                        }
                                        System.out.println("Invalid input.");
                                    }
                                    if (backToDay) {
                                        continue;
                                    }

                                    String date = monthName + " " + day + " " + selectedWeekday;
                                    System.out.println(" Date: " + monthName + " " + day + " " + selectedWeekday + ", 2025");

                                    int pax = 0;
                                    boolean backToName = false;
                                    while (true) {
                                        System.out.print(" (B)│➜ Pax (Number of Guests): ");
                                        String paxInput = input.nextLine();

                                        if (paxInput.equalsIgnoreCase("B")) {
                                            unavailableDates = unavailableDates.replace(" " + day + " of " + monthName, "");
                                            backToName = true;
                                            break;
                                        }

                                        try {
                                            pax = Integer.parseInt(paxInput);
                                            if (pax > 0) {
                                                break;
                                            } else {
                                                System.out.println("Invalid input. Pax must be at least 1.");
                                            }
                                        } catch (NumberFormatException e) {
                                            System.out.println("Invalid input. Please enter a number.");
                                        }
                                    }
                                    if (backToName) {
                                        continue;
                                    }

                                    String contact = "";
                                    boolean backToPax = false;
                                    while (true) {
                                        System.out.print(" (B)│➜ Contact Number: ");
                                        contact = input.nextLine();

                                        if (contact.equalsIgnoreCase("B")) {
                                            unavailableDates = unavailableDates.replace(" " + day + " of " + monthName, "");
                                            backToPax = true;
                                            break;
                                        }

                                        if (!contact.isEmpty() && contact.matches("\\d+")) {
                                            break;
                                        }

                                        System.out.println("Invalid input. Please enter numbers only.");
                                    }
                                    if (backToPax) {
                                        continue;
                                    }

                                    String email = "";
                                    boolean backToContact = false;
                                    while (true) {
                                        System.out.print(" (B)│➜ Email Address: ");
                                        email = input.nextLine();
                                        System.out.println("└───────────────────────────────────┘");

                                        if (email.equalsIgnoreCase("B")) {
                                            unavailableDates = unavailableDates.replace(" " + day + " of " + monthName, "");
                                            backToContact = true;
                                            break;
                                        }
                                        if (!email.isEmpty()) {
                                            break;
                                        }
                                        System.out.println("Invalid input.");
                                    }
                                    if (backToContact) {
                                        continue;
                                    }
                                    
                                    System.out.println("                                                                                 ");
                                    System.out.println("=======================");
                                    System.out.println(" Reserved successful!");
                                    System.out.println("======================");
                                    System.out.println("                                                                                 ");
                                    System.out.println("┌────────────────────────────┐");
                                    System.out.println("│ Input 'B' to show your receipt. │");
                                    System.out.println("└────────────────────────────┘");

                                    String viewReceipt = "";
                                    while (true) {
                                        System.out.print("Input: ");
                                        viewReceipt = input.nextLine();
                                        if (viewReceipt.equalsIgnoreCase("B")) {
                                            break;
                                        }
                                        System.out.println("Invalid input");
                                    }

                                    System.out.println("┌─────────────────────────────┐");
                                    System.out.println("        Hotel Reservation      ");
                                    System.out.println("             Receipt           ");
                                    System.out.println("├─────────────────────────────┤");
                                    System.out.println(" Name: " + name);
                                    System.out.println(" Date:" + date + ", 2025");
                                    System.out.println(" Price:₱ " + roomPrice + ".00");
                                    System.out.println(" Pax: " + pax);
                                    System.out.println(" Contact: " + contact);
                                    System.out.println(" Email: " + email);
                                    System.out.println("└─────────────────────────────┘");

                                    String receipt = "";
                                    boolean choices = true;
                                    while (choices) {
                                        System.out.println("┌───────────────────────────────┐");
                                        System.out.println("│➜ Input '1' to cancel reservation ✖│");
                                        System.out.println("├───────────────────────────────┤");
                                        System.out.println("│➜ Input '2' to saved reservation ✓ │");
                                        System.out.println("└───────────────────────────────┘");
                                        System.out.print("Input: ");
                                        receipt = input.nextLine();

                                        String reserved = " " + day + " of " + monthName;

                                        switch (receipt) {
                                            case "1":
                                                System.out.println("Your reservation has been cancelled.");
                                                unavailableDates = unavailableDates.replace(reserved, "");
                                                choices = false;
                                                break;
                                            case "2":
                                                System.out.println("Thank you! Your reservation is saved.");
                                                choices = false;
                                                break;
                                            default:
                                                System.out.println("Invalid input.");
                                        }
                                    }
                                    backToMonth = true;
                                }
                            }
                            if(backToRoom) {
                                continue;
                            }
                            backToView = true;
                        }
                    }
                    break;
                case "2":
                    System.out.println("┌───────────────────────────────────┐");
                    System.out.println("│               ABOUT US                 │");
                    System.out.println("├───────────────────────────────────┤");
                    System.out.println("│       Stay a while, feel at home —     │");
                    System.out.println("│       Sweeties Hotel welcomes you.     │");
                    System.out.println("│                                        │");
                    System.out.println("│      👤 Sweeties Hotel                 │");
                    System.out.println("│      📍 Tayuman 199, San Carlos        │");
                    System.out.println("│      📞 0994-613-3680                  │");
                    System.out.println("│      📩 sweetiesgroup4@email.com       │");
                    System.out.println("│                                        │");
                    System.out.println("│           Develop by Group 4           │");
                    System.out.println("│          Agripa, Apdua, Basco          │");
                    System.out.println("│          Cari, Duron, De Leon          │");
                    System.out.println("│             Medina, Monday             │");
                    System.out.println("└───────────────────────────────────┘");
                    
                    String backInput2;
                    do {
                        System.out.print("Input 'back' to return to the main menu: ");
                        backInput2 = input.nextLine();
                        if (!backInput2.equalsIgnoreCase("back")) {
                            System.out.println("Invalid input. Please type 'back'.");
                        }
                    } while (!backInput2.equalsIgnoreCase("back"));
                    break;
                case "3":
                    System.out.println("┌─────────────────────────────────────┐");
                    System.out.println("│            🟢 ROOM DETAILS 🟢             │");
                    System.out.println("├─────────────────────────────────────┤");
                    System.out.println("│ (1) ➜ NORMAL ROOM           ₱950 / Night │");
                    System.out.println("│                                           │");
                    System.out.println("│ Includes:                                 │");
                    System.out.println("│ • Single bed                              │");
                    System.out.println("│ • Electric fan                            │");
                    System.out.println("│ • Shared bathroom                         │");
                    System.out.println("│ • Basic toiletries (upon request)         │");
                    System.out.println("│ ========================================  │");
                    System.out.println("│ (2) ➜ STANDARD ROOM      ₱1,500 / Night  │");
                    System.out.println("│                                           │");
                    System.out.println("│ Includes:                                 │");
                    System.out.println("│ • Double bed                              │");
                    System.out.println("│ • Air-conditioning                        │");
                    System.out.println("│ • Private bathroom (hot & cold)           │");
                    System.out.println("│ • Cable TV and free Wi-Fi                 │");
                    System.out.println("│ ========================================  │");
                    System.out.println("│ (3) ➜ LUXURY ROOM        ₱2,800 / Night  │");
                    System.out.println("│                                           │");
                    System.out.println("│ Includes:                                 │");
                    System.out.println("│ • Queen size bed with clean lines         │");
                    System.out.println("│ • Full air-conditioned                    │");
                    System.out.println("│ • Private bathroom with toiletries        │");
                    System.out.println("│ • Free bottled water and coffee           │");
                    System.out.println("│ ========================================  │");
                    System.out.println("│ (4) ➜ VIP ROOM           ₱4,500 / Night  │");
                    System.out.println("│                                           │");
                    System.out.println("│ Includes:                                 │");
                    System.out.println("│ • King size bed                           │");
                    System.out.println("│ • Sofa set and living area                │");
                    System.out.println("│ • 55\" Smart TV in living area             │");
                    System.out.println("│ • Mini bar                                │");
                    System.out.println("");
                    System.out.println("│ (B) │ Input 'B' to return                 │");
                    System.out.println("└─────────────────────────────────────┘");
                    
                    String backInput3;
                    do {
                        System.out.print("Input 'back' to return to the main menu: ");
                        backInput3 = input.nextLine();
                        if (!backInput3.equalsIgnoreCase("back")) {
                            System.out.println("Invalid input. Please type 'back'.");
                        }
                    } while (!backInput3.equalsIgnoreCase("back"));
                    break;
                case "4":
                    System.out.println("Thank you for choosing Sweeties Hotel. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        } while (true);
    }
}
