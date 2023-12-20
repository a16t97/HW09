public class Bus extends LandTrans {
    private type type;

    public Bus(int id, String name, int capacity, int yearEnding, boolean isAvailable) {
        super(id, name, capacity, yearEnding, isAvailable);
        this.type = type.bus;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "type=" + type +
                "} " + super.toString();
    }
}