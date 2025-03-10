public class StudentGradeManagerTester {
    public static void main(String[] args) {
        StudentGradeManager st1 = new StudentGradeManager();
        StudentGradeManager st2 = new StudentGradeManager();
        st1.student("A");
        st1.student(100);
        st1.student(80);
        st1.student(100);
        st1.student(100);
        st1.averageGrade();
        st2.student("B");
        st2.student(100);
        st2.student(80);
        st2.student(100);
        st2.student(100);
        st2.averageGrade();


    }
}
