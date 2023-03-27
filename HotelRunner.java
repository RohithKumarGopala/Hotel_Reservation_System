package com.hotelReservation;
import java.util.Scanner;
import java.text.ParseException;
public class HotelRunner {
    Scanner scanner = new Scanner(System.in);
    CheapestHotel hotelObj = new CheapestHotel();

    public static void main (String[] args) throws ParseException {

        System.out.println("Welcome to Hotel Reservation System");

        Runner application = new Runner();
        application.provideUserOption();
    }

    public void provideUserOption() throws ParseException {
        while(true) {
            System.out.println("Choose Options " +
                    "\n1. Add Hotel" +
                    "\n2. Find Cheapest Hotel " );
            String userOption = scanner.next();
            switch (userOption) {
                case "1" :
                    addHotel();
                    break;
                case "2":
                    findCheapestHotel();
                case "10" :
                    System.exit(0);
            }
        }
    }

    public void addHotel() {
        HotelReservationSystem hotel = new HotelReservationSystem();
        System.out.println("Enter Hotel Name");
        String name = scanner.next();
        System.out.println("Enter weekday rate ");
        float rate = scanner.nextFloat();
        System.out.println("Enter weekend rate");
        float weekendRate = scanner.nextFloat();
        hotel.setHotelName(hotel.getHotelName());
        hotel.setRates(hotel.getRates());
        hotel.setWeekendRate(hotel.getWeekendRate());
        hotelObj.hotelList.add(hotel);
        System.out.println(hotelObj.hotelList);
    }

    public void findCheapestHotel() throws ParseException {
        System.out.println("Enter check-In Date : (dd/mm/yyyy)");
        String checkInDate = scanner.next();
        System.out.println("Enter check-Out Date : (dd/mm/yyyy)");
        String checkOutDate = scanner.next();

        String Day1 = CheapestHotel.findDayOfWeek(checkInDate);
        String Day2 = CheapestHotel.findDayOfWeek(checkOutDate);

        int days = CheapestHotel.findDateDifference(checkInDate, checkOutDate);
        System.out.println("Number of days stying in hotel " + days);

        HotelReservationSystem cheapestHotel = CheapestHotel.findCheapestHotel(days);
        float totalRate = cheapestHotel.getRates() * days;

        HotelReservationSystem cheapestHote2 = CheapestHotel.findCheapestHotel(days);
        float totalWeekendRate = cheapestHotel.getWeekendRate() * 2;

        if (Day1.equalsIgnoreCase("Saturday") | Day1.equalsIgnoreCase("Sunday") | Day2.equalsIgnoreCase("Saturday") | Day2.equalsIgnoreCase("Sunday")) {
            System.out.println("Best hotel availble on weekend  " + cheapestHotel.getHotelName() + " having rate $" + totalWeekendRate);
        } else {
            System.out.println("Cheapest hotel is " + cheapestHotel.getHotelName() + " having rate $" + totalRate);
        }
    }
}

