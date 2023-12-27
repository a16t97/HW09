import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.stream.Stream;

public class Main {
    private static final String fileName = "resources/transport.csv";

    static String[] readFileUsingBufferedReader(String filename) {
        ArrayList<String> data = new ArrayList<String>();
        FileReader reader;

        try {
            reader = new FileReader(filename);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        var br = new BufferedReader(reader);
        String newLine;

        try {
            while ((newLine = br.readLine()) != null) {
                data.add(newLine);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Arrays.copyOf(data.toArray(), data.size(), String[].class);
    }

    private static List<LandTrans> createTransportObject(String[] data) {
        List<LandTrans> trans = new Vector<>();
        getTransportData(data, trans);
        return trans;
    }

    private static void getTransportData (String[] data, List<LandTrans> trans) {
        for (int c = 1; c < data.length; c++) {
            var pieces = data[c].split(";"); // method split - щоб "побити" строку на підстроку
            LandTrans transport = null;
            switch (pieces[1].toLowerCase()) {
                case "bus":
                    transport = new Bus(Integer.parseInt(pieces[0]), pieces[2], Integer.parseInt(pieces[3]), Integer.parseInt(pieces[4]), Boolean.parseBoolean(pieces[5]));
                    break;
                case "car":
                    transport = new Car(Integer.parseInt(pieces[0]), pieces[2], Integer.parseInt(pieces[3]), Integer.parseInt(pieces[4]), Boolean.parseBoolean(pieces[5]));
                    break;
                case "bike":
                    transport = new Bike(Integer.parseInt(pieces[0]), pieces[2], Integer.parseInt(pieces[3]), Integer.parseInt(pieces[4]), Boolean.parseBoolean(pieces[5]));
                    break;
                default:
                    transport = new LandTrans(Integer.parseInt(pieces[0]), pieces[2], Integer.parseInt(pieces[3]), Integer.parseInt(pieces[4]), Boolean.parseBoolean(pieces[5])) {
                    };
                    break;
            }
            trans.add(transport);
        }
    }

    interface MyFunctionalInterface {
        void doSomething();
    }
    static MyFunctionalInterface myFunctionalInterface = () -> {
        System.out.println("Hello!");
    };
    public static void main(String[] args) throws IOException{
        List<LandTrans> trans = new Vector<>();
        String[] data = readFileUsingBufferedReader(fileName);
        trans = createTransportObject(data);
        Stream<LandTrans> stream = trans.stream();

        stream
                .sorted((d1, d2) -> (int) (d2.getCapacity() - d1.getCapacity()))
                .skip(5)
                .limit(21)
                .forEach(System.out::println);

        myFunctionalInterface.doSomething();
    }
}
