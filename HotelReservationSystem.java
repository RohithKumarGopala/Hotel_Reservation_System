package com.hotelReservation;

public class HotelReservationSystem {
    private String hotelName;
    private int rates;
    private float weekendRate;

    public float getWeekendRate() {
        return weekendRate;
    }

    public void setWeekendRate(float weekendRate) {
        this.weekendRate = weekendRate;
    }

    public HotelReservationSystem(String hotelName, int rates, float weekendRate) {
        this.hotelName = hotelName;
        this.rates = rates;
        this.weekendRate = weekendRate;
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

