package exam3;

import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private List<Passenger> passengers = new ArrayList<>();
    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;


    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public Boat getBoat() {
        return boat;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public LocalDate getSailing()
    {
        return sailing;
    }

    public List<Passenger> getPassengers() {
        return new ArrayList<>(passengers);
    }


    public void bookPassenger(Passenger passenger) {
        if (boat.getMaxPassengers() > passengers.size()) {
            passengers.add(passenger);
        } else {
            throw new IllegalArgumentException();
        }

    }


    public double getPriceForPassenger(Passenger passenger) {
        return basicPrice * passenger.getCruiseClass().getMultiplier();
    }

    public Passenger findPassengerByName(String name) {
        for (Passenger passenger: passengers) {
            if (name.equals(passenger.getName())) {
                return passenger;
            }
        }
        return null;
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> al = new ArrayList<>();
        for (Passenger p: passengers) {
            al.add(p.getName());
        }
        Collections.sort(al);
        return al;
    }

    public double sumAllBookingsCharged() {
        double chargedAmount = 0.0;
        for (Passenger p: passengers) {
            chargedAmount += basicPrice * p.getCruiseClass().getMultiplier();
        }
        return chargedAmount;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        EnumMap<CruiseClass, Integer> m = new EnumMap<>(CruiseClass.class);
        for (Passenger p: passengers) {
            CruiseClass cc = p.getCruiseClass();
            if (!m.containsKey(cc)) {
                m.put(cc, 1);
            } else {
                m.put(cc, m.get(cc) + 1);
            }
        }
        return m;
    }
}
