import java.util.Arrays;

public class Student {
    private String name;
    int sub[] = new int[5];
    int totalMarks;
    private String grade;

    public Student(String name, int[] sub, int totalMarks, String grade) {
        this.name = name;
        this.sub = sub;
        this.totalMarks = calculateTotalMarks();
        this.grade = grade;
    }
    int calculateTotalMarks(){
        int total = 0;
        for(int mark : sub){
            total = total+mark;
        }
        return  total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getSub() {
        return sub;
    }

    public void setSub(int[] sub) {
        this.sub = sub;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sub=" + Arrays.toString(sub) +
                ", totalMarks=" + totalMarks +
                ", grade='" + grade + '\'' +
                '}';
    }
}
