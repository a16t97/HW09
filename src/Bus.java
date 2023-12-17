public class Bus extends LandTrans {
    private type type;
    public Bus(String name, int capacity, int yearEnding, boolean isAvailable) {
        super(name, capacity, yearEnding, isAvailable);
        type = type.bus;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "type=" + type +
                "} " + super.toString();
    }
}