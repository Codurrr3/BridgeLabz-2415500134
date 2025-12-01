package assignment14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class CourseType {
    public abstract String getType();
}

class ExamCourse extends CourseType {
    @Override
    public String getType() {
        return "Exam";
    }
}

class AssignmentCourse extends CourseType {
    @Override
    public String getType() {
        return "Assignment";
    }
}

class ResearchCourse extends CourseType {
    @Override
    public String getType() {
        return "Research";
    }
}

class Course<T extends CourseType> {
    private final String name;
    private final T type;

    Course(String name, T type) {
        this.name = name;
        this.type = type;
    }

    public String description() {
        return name + "-" + type.getType();
    }
}

public class CourseManagementDemo {
    public static void printCourses(List<? extends CourseType> courseTypes) {
        for (CourseType type : courseTypes) {
            System.out.println(type.getType());
        }
    }

    public static void main(String[] args) {
        List<Course<?>> catalog = new ArrayList<>();
        catalog.add(new Course<>("Math", new ExamCourse()));
        catalog.add(new Course<>("AI", new ResearchCourse()));
        catalog.forEach(course -> System.out.println(course.description()));
        printCourses(Arrays.asList(new ExamCourse(), new AssignmentCourse()));
    }
}
