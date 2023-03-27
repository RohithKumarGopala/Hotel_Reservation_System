package com.hotelReservation;
import java.util.Scanner;
import java.text.ParseException;
public class HotelRunner {
    Scanner scanner = new Scanner(System.in);
    CheapestHotel hotelObj = new CheapestHotel();

    public static void main (String[] args) throws ParseException {

        System.out.println("Welcome to Hotel Reservation System");

        HotelRunner application = new HotelRunner();
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
        int days = CheapestHotel.findDateDifference(checkInDate, checkOutDate);
        System.out.println("Number of days stying in hotel " +days);
        HotelReservationSystem cheapestHotel = HotelReservationSystem.findCheapestHotel(days);
        float totalRate = cheapestHotel.getRates() * days;
        System.out.println("Cheapest hotel is " + cheapestHotel.getHotelName() + " having rate $ " + totalRate);
    }
}

