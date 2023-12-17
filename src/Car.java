public class Car extends LandTrans{
    private type type;
    public Car(String name, int capacity, int yearEnding, boolean isAvailable) {
        super(name, capacity, yearEnding, isAvailable);
        type = type.car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                "} " + super.toString();
    }
}
