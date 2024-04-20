import java.rmi.ServerError;

public class Main {
    public static void main(String[] args) {
        Deserialization ds = new Deserialization("data/start2.csv");
        for (Student s : ds.students()) {
            System.out.println(s);
        }
        Serialization s = new Serialization(ds.students());
        s.convertToJson();
    }
}