

public class StudentGradeManager {
    public String name;
    public double[] grade = new double [5];
    int i = 0;
    public void student(String name){
        this.name = name;
    }
    public void student(int grade){
        if(i < this.grade.length){
            this.grade[i] = grade;
            i ++;
        }
        else{
            System.out.println("Error");
        }
    }
    public void averageGrade(){
        double sum = 0;
        double average = 0;
        for(int i = 0; i < grade.length; i ++){
            sum = sum + grade[i];
        }
        average = sum / grade.length;
        System.out.println(name + " Average grades: " + average);
    }
}
