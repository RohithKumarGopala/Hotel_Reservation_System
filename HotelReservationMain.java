package com.hotelReservation;
import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservationMain {
    public  static void addHotelInformation() {
        ArrayList<HotelReservationSystem> List = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hotel name");
        String HotelName = scanner.next();
        System.out.println("Enter Hotel rates");
        int HotelRates = scanner.nextInt();

        HotelReservationSystem hotelReservation = new HotelReservationSystem(HotelName, HotelRates);
        List.add(hotelReservation);
        System.out.println(List);
    }

    public static void main(String[] args) {
        addHotelInformation();
    }
}
