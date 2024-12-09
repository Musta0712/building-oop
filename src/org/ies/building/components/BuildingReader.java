package org.ies.building.components;

import org.ies.building.model.Apartament;
import org.ies.building.model.Building;

import java.util.Scanner;

public class BuildingReader {
    private final Scanner scanner;
    private final ApartamentReader apartamentReader;

    public BuildingReader(Scanner scanner, ApartamentReader apartamentReader) {
        this.scanner = scanner;
        this.apartamentReader = apartamentReader;
    }

    public Building read(){
        System.out.println("Introduce los datos del apartamento");
        System.out.println("Introduce la dirección: ");
        String address = scanner.nextLine();
        System.out.println("Introduce el municipio: ");
        String town = scanner.nextLine();

        int size = scanner.nextInt();
        scanner.nextLine();
        Apartament[] apartaments = new Apartament[size];
        for (int i = 0; i < apartaments.length; i++) {
            apartaments[i] = apartamentReader.read();

        }


        return new Building(
                address,
                town,
                apartaments
        );
    }
}
