package org.ies.building.model;

import java.util.Arrays;
import java.util.Objects;

public class Apartament {
    private int tier;
    private String doorway;
    private Owner[] owners;

    public Apartament(int tier, String doorway, Owner[] owners) {
        this.tier = tier;
        this.doorway = doorway;
        this.owners = owners;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public String getDoorway() {
        return doorway;
    }

    public void setDoorway(String doorway) {
        this.doorway = doorway;
    }

    public Owner[] getOwners() {
        return owners;
    }

    public void setOwners(Owner[] owners) {
        this.owners = owners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartament that = (Apartament) o;
        return tier == that.tier && Objects.equals(doorway, that.doorway) && Objects.deepEquals(owners, that.owners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tier, doorway, Arrays.hashCode(owners));
    }

    @Override
    public String toString() {
        return "Apartament{" +
                "tier=" + tier +
                ", doorway='" + doorway + '\'' +
                ", owners=" + Arrays.toString(owners) +
                '}';
    }
}
