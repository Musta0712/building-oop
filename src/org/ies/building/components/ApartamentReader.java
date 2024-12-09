package org.ies.building.components;

import org.ies.building.model.Apartament;
import org.ies.building.model.Owner;

import java.util.Scanner;

public class ApartamentReader {
    private final Scanner scanner;
    private final OwnerReader ownerReader;

    public ApartamentReader(Scanner scanner, OwnerReader ownerReader) {
        this.scanner = scanner;
        this.ownerReader = ownerReader;
    }

    public Apartament read(){
        System.out.println("Introduce los datos del apartamento");
        System.out.println("Introduce el planta: ");
        int tier = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce la puerta: ");
        String doorway = scanner.nextLine();
        System.out.println("Cuantos propietarios hay: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        Owner[] owners = new Owner[size];
        for (int i = 0; i < owners.length; i++) {
            owners[i] = ownerReader.read();

        }

        return new Apartament(
                tier,
                doorway,
                owners
        );
    }
}
