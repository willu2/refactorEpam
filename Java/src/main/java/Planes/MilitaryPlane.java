package planes;

import entity.Plane;
import models.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane {

    private MilitaryType militaryType;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType type) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.militaryType = type;
    }

    public MilitaryType getMilitaryType() {
        return militaryType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", militaryType=" + militaryType +
                '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MilitaryPlane)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        MilitaryPlane that = (MilitaryPlane) o;

        return militaryType == that.militaryType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), militaryType);
    }
}
