import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        // there are 2 schools
        // total 5 subjects and each sub is of max 100 marks
        // max marks is 500

        //o/p: top 3 students based on marks

        List<Student> list = new ArrayList<>();
        // assuming from school1
        list.add(new Student("rahul",new int[]{90,56,34,66,23},500, "10"));
        list.add(new Student("vipin",new int[]{23,67,23,60,22},500,"9"));
        list.add(new Student("manish",new int[]{54,34,78,90,91},500, "10"));

        // assuming from school 2
        list.add(new Student("ram",new int[]{67,34,23,67,43},500, "10"));
        list.add(new Student("surya",new int[]{45,34,67,33,66},500,"11"));
        list.add(new Student("mohan",new int[]{22,77,34,54,55},500,"10"));
        list.add(new Student("kamal",new int[]{45,45,67,23,66},500,"11"));
        list.add(new Student("komal",new int[]{45,77,22,54,44},500,"10"));

        Collections.sort(list, (s1, s2)->s2.totalMarks-s1.totalMarks);


        List<Student> studentList = list.stream().filter(student -> student.getGrade().equals("10")).toList();

        System.out.println("no of 10th grade student : "+studentList.size());
        System.out.println("10th grade studentList : "+studentList);

        System.out.println("top 3 students");
//        for(int i=0;i<3 && i<studentList.size();i++){
//            System.out.println(studentList.get(i).getName()+" - total marks "+studentList.get(i).totalMarks);
//        }

        studentList.stream()
                .limit(3)
                .forEach(student -> System.out.println(student.getName() + " - total marks " + student.getTotalMarks()));

    }
}
