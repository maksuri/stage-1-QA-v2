package cleanCode.planes;

import cleanCode.models.ClassificationLevel;
import cleanCode.models.ExperimentalTypes;

import java.util.Objects;

public class ExperimentalPlane extends Plane {

    private ExperimentalTypes type;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes type, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel) {
        this.classificationLevel = classificationLevel;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof ExperimentalPlane)) return false;
        if (!super.equals(object)) return false;
        ExperimentalPlane experimentalPlane = (ExperimentalPlane) object;
        return type == experimentalPlane.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + type + ",classificationLevel" + getClassificationLevel() +
                        '}');
    }
}
