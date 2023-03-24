package com.hotelReservation;

public class HotelReservationSystem {
    private String hotelName;
    private int rates;

    public HotelReservationSystem(String hotelName, int rates) {
        this.hotelName = hotelName;
        this.rates = rates;
    }

    public HotelReservationSystem() {

    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRates() {
        return rates;
    }


    public void setRates(int rates) {
        this.rates = rates;
    }

    public int compareTo(HotelReservationSystem h) {
        return (this.rates - h.rates);
    }


    @Override
    public String toString() {
        return "HotelReservation{" +
                "hotelName='" + hotelName + '\'' +
                ", rates=" + rates +
                '}';
    }
}
