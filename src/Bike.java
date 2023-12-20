public class Bike extends LandTrans {
    private type type;
    public Bike(int id, String name, int capacity, int yearEnding, boolean isAvailable) {
        super(id, name, capacity, yearEnding, isAvailable);
        type = type.bike;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "type=" + type +
                "} " + super.toString();
    }
}
