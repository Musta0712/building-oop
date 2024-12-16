package org.ies.building.model;

import java.util.Arrays;
import java.util.Objects;

public class Building {
    private String address;
    private String city;
    private Apartament[] apartaments;

    public Building(String address, String city, Apartament[] apartaments) {
        this.address = address;
        this.city = city;
        this.apartaments = apartaments;
    }

    public void showInfo(){
        System.out.println("Dirección: " + address + " Municipio: " + city + "Nº de Apartamentos: ");
        for (var apartament: apartaments){
            showInfo();
        }
    }

    // Dado una planta y una puerta devuelve el apartamento de esa planta y puerta. Si no
    // existe dicho apartamento devuvle null.

    public Apartament findAppartment (int floor, String doorway){
        for (var appartment : apartaments){
            if (appartment.getFloor() == (floor) && appartment.getDoorway().equals(doorway)) {
                return appartment;
            }
        }
        return null;
    }

    //showFloorApartments(int floor): Dado un número de planta, muestra los
    //apartamentos de esa planta

    public void showFloorAppartments(int floor){
        for (var apartament : apartaments){
            if (apartament.getFloor() == floor){
                apartament.showInfo();
            }
        }
    }

    //findOwners(int floor, String door): Dado una planta y una puerta, devuelve
    //  los propietarios del apartamento de esa puerta y planta. Si no existe dicho
    //  apartamento devuelve null.

    public Owner[] findAppartmentOwners(int floor, String doorway){
        var appartment = findAppartment(floor, doorway);
        if(appartment == null){
            return null;
        }else {
            return appartment.getOwners();
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTown() {
        return city;
    }

    public void setTown(String town) {
        this.city = town;
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
        return Objects.equals(address, building.address) && Objects.equals(city, building.city) && Objects.deepEquals(apartaments, building.apartaments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, city, Arrays.hashCode(apartaments));
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", town='" + city + '\'' +
                ", apartaments=" + Arrays.toString(apartaments) +
                '}';
    }
}
