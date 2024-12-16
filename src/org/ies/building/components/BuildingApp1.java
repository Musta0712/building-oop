package org.ies.building.components;

import java.util.Scanner;

public class BuildingApp1 {
    private final BuildingReader buildingReader;
    private final Scanner scanner;

    public BuildingApp1(BuildingReader buildingReader, Scanner scanner) {
        this.buildingReader = buildingReader;
        this.scanner = scanner;
    }
    public void run(){
        var building = buildingReader.read();
        System.out.println("Consulta un apartamento");
        System.out.println("Ingresa un piso: ");
        int floor = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingresa una puerta: ");
        String doorway = scanner.nextLine();
        var apartament = building.findAppartment(floor, doorway);

        if ( apartament == null){
            System.out.println("No se encuentra el apartamento");
        }else{
            apartament.showInfo();
        }
        building.showFloorAppartments(2);
    }
}
