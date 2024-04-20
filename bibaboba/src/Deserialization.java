import java.io.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Deserialization {
    private String filepath;
    ArrayList<String> inputData = new ArrayList<>();
    String line;

    private final String delimiter = ",";
    ArrayList<Student> students = new ArrayList<>();



    public Deserialization(String filepath) {
        this.filepath = filepath;
    }

    private ArrayList<String> readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(
                filepath))) {

/*          int count = 0;
            while ((line = reader.readLine()) != null) {
                if (count == 0){
                    count++;
                    continue;
                }
                inputData.add(line);
            }*/
            reader.lines()
                    .skip(1)
                    .forEach(line -> inputData.add(line));

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return inputData;
    }

    public ArrayList<Student> students(){
        /*for (String s : readFile()){
            String[] parts = s.split(delimiter);
            students.add(new Student(parts[0], new Teacher(parts[1]), new Lesson(parts[2]), new Lesson(parts[3])));
            return students;
        }*/
         readFile().stream()
                .map(line -> line.split(delimiter))
                .map(parts -> new Student(parts[0], new Teacher(parts[1]), new Lesson(parts[2]), new Lesson(parts[3])))
                .forEach(students::add);
         return students;
    }





}