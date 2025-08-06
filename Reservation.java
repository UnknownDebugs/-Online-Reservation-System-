import java.util.Scanner;

public class Main {

    // Helper method to print the calendar with unavailable dates
    public static void printCalendar(String monthName, int startDayOfWeek, int daysInMonth, String unavailableDates) {
        System.out.println("┌────────────────────────────────────┐");
        System.out.println("│ Mon │ Tue │ Wed │ Thu │ Fri │ Sat │ Sun │");
        System.out.println("├────────────────────────────────────┤");

        // Print leading spaces
        for (int i = 1; i < startDayOfWeek; i++) {
            System.out.print("│     ");
        }

        int dayOfWeek = startDayOfWeek;
        for (int day = 1; day <= daysInMonth; day++) {
            String dayString = String.valueOf(day);
            // Check if the date is unavailable
            if (unavailableDates.contains(" " + dayString + " of " + monthName)) {
                System.out.printf("│ × "); // Print 'X' if unavailable
            } else {
                System.out.printf("│ %2d  ", day); // Print the day number
            }

            if (dayOfWeek == 7) {
                System.out.println("│");
                System.out.println("├────────────────────────────────────┤");
                dayOfWeek = 1;
            } else {
                dayOfWeek++;
            }
        }

        // Print trailing spaces for the last week
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
            // Main menu
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
                    // Reservation process
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
                            // Display room details before month selection
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

                            // Get room choice from user
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
                       
