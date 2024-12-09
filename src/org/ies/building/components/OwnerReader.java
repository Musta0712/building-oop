package org.ies.building.components;

import org.ies.building.model.Owner;

import java.util.Scanner;

public class OwnerReader {
    private final Scanner scanner;

    public OwnerReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Owner read(){
        System.out.println("Introduce los datos del propietario");
        System.out.println("Introduce el NIF: ");
        String nif = scanner.nextLine();
        System.out.println("Introduce el nombre: ");
        String name = scanner.nextLine();
        System.out.println("Introduce el apellido: ");
        String surname = scanner.nextLine();

        return new Owner(
                nif,
                name,
                surname
        );
    }
}
