import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {


    private String nameOfStudent;
    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    private Lesson lesson;

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    private Lesson lesson2;

    public Lesson getLesson2() {
        return lesson2;
    }

    public void setLesson2(Lesson lesson2) {
        this.lesson2 = lesson2;
    }

    public Student(String nameOfStudent,Teacher teacher,  Lesson lesson, Lesson lesson2) {
        this.nameOfStudent = nameOfStudent;
        this.lesson = lesson;
        this.lesson2 = lesson2;
        this.teacher = teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;

        return Objects.equals(nameOfStudent, student.nameOfStudent)
                && Objects.equals(teacher, student.teacher) && Objects.equals(lesson, student.lesson) && Objects.equals(lesson2, student.lesson2);
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameOfStudent='" + nameOfStudent + '\'' +
                ", teacher=" + teacher +
                ", subject1=" + lesson + ", subject2=" + lesson2 +
                '}';
    }




}
