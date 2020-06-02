package cleanCode.planes;

import cleanCode.models.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane {
    private MilitaryType type;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType type) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
    }

    public MilitaryType getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + type +
                        '}');
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof MilitaryPlane)) return false;
        if (!super.equals(object)) return false;
        MilitaryPlane militaryPlane = (MilitaryPlane) object;
        return type == militaryPlane.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}

