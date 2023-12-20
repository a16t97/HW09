public class Car extends LandTrans{
    private type type;

    public Car(int id, String name, int capacity, int yearEnding, boolean isAvailable) {
        super(id, name, capacity, yearEnding, isAvailable);
        this.type = type.car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                "} " + super.toString();
    }
}
