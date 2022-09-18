package solutions;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;


/* TASK
 * Implement the studentsThatPass method, that takes a Stream<Student> and and int passingScore, 
 * and returns a list of the students names that have score greater then or equal to passingScore in order of highest to lowest.
 */

public class TestResults
{
    public static class Student implements Comparable<Student> {
        private String name;
        private int score;
        
        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
              
        public int getScore() {
            return score;
        }
        
        public String getName() {
            return name;
        }
     
        @Override
        public int compareTo(Student another)
        {
            return another.getScore() - this.score;
        }
    }
    
    public static List<String> studentsThatPass(Stream<Student> students, int passingScore) {       
        return students.filter(s -> s.getScore() >= passingScore).sorted().map(Student::getName).collect(Collectors.toList());
    }
    
    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Mike", 80));
        students.add(new Student("James", 57));
        students.add(new Student("Alan", 21));
        students.add(new Student("Ivan", 7));
        students.add(new Student("Zlatko", 100));

        studentsThatPass(students.stream(), 50).forEach(System.out::println);        
    }
}