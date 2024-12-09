package org.ies.building.model;

import java.util.Arrays;
import java.util.Objects;

public class Building {
    private String address;
    private String town;
    private Apartament[] apartaments;

    public Building(String address, String town, Apartament[] apartaments) {
        this.address = address;
        this.town = town;
        this.apartaments = apartaments;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Apartament[] getApartaments() {
        return apartaments;
    }

    public void setApartaments(Apartament[] apartaments) {
        this.apartaments = apartaments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(address, building.address) && Objects.equals(town, building.town) && Objects.deepEquals(apartaments, building.apartaments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, town, Arrays.hashCode(apartaments));
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", town='" + town + '\'' +
                ", apartaments=" + Arrays.toString(apartaments) +
                '}';
    }
}
