package com.hotelReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservationMain {
    Scanner scanner = new Scanner(System.in);
    public  static void addHotelInformation() {
        ArrayList<HotelReservationSystem> List = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hotel name");
        String HotelName = scanner.next();
        System.out.println("Enter Hotel rates");
        int HotelRates = scanner.nextInt();
        System.out.println("Enter the WeekendRate");
        float Weekendrates = scanner.nextFloat();

        HotelReservationSystem hotelReservation = new HotelReservationSystem(HotelName, HotelRates,Weekendrates);
        (HotelName, HotelRates,Weekendrates);
        List.add(hotelReservation);
        System.out.println(List);
    }

    public static void main(String[] args) {
        addHotelInformation();
    }
}
