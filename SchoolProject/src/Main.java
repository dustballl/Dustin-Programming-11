import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //create School
        School school = new School("Lord Byng", true, "Vancouver");

        //initialize arrays of Subjects, Students, and Teachers
        String[] subjects = {
                "English",
                "Math",
                "Physics",
                "Computer Programming",
                "French",
                "Strings",
                "Fitness",
                "Socials"
        };

        String[] studentNames = {
                "Dustin Wang",
                "David Yao",
                "Johnny Mao",
                "Alex Zhou",
                "Brandon Yeung",
                "Toyota Kida",
                "William Davis",
                "Cindy Cao",
                "Conor McGregor",
                "Leonardo Liang"
        };

        String[] teacherNames = {
                "Ruth Anderson",
                "Eric Chen",
                "Peterson Young"
        };

        //set the School's courses as the subjects (Array turned into arraylist)
        school.setCourses(new ArrayList<>(Arrays.asList(subjects)));

        //create a random class for later
        Random r = new Random();

        //iterates through students and adds it to the school
        //first and last name are parsed by splitting it at the [space]
        //assign student random grade from 1 - 12
        for(String studentName : studentNames) {
            school.addStudent(new Student(
                    studentName.split(" ")[0],
                    studentName.split(" ")[1],
                    r.nextInt(12) + 1
            ));
        }

        //same for the teachers
        for(String teacherName : teacherNames) {
            school.addTeacher(new Teacher(
                    teacherName.split(" ")[0],
                    teacherName.split(" ")[1],
                    subjects[r.nextInt(8)]
            ));
        }

        // Original
        school.printInfo();

        // Remove students + teachers
        school.removeStudent(school.getStudents().get(r.nextInt(school.getStudents().size())));
        school.removeStudent(school.getStudents().get(r.nextInt(school.getStudents().size())));
        school.removeTeacher(school.getTeachers().get(r.nextInt(school.getTeachers().size())));

        System.out.println("Removed 2 Students and 1 Teacher");

        // After
        school.printInfo();
    }
}