import java.io.Serializable;
import java.util.Objects;

public class Lesson implements Serializable {

    private String lessonName;

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + lessonName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson subject = (Lesson) o;
        return Objects.equals(lessonName, subject.lessonName);
    }


    public Lesson(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonName() {
        return lessonName;
    }

}
