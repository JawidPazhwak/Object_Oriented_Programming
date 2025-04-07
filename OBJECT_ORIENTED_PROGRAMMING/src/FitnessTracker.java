public class FitnessTracker {
    public String name;
    private String password;
    public int height;
    public int weight;
    public String WorkoutType;
    public int duration;
    public double met;

    public FitnessTracker(String name, String password, int height, int weight){
        this.name = name;
        this.password = password;
        this.height = height;
        this.weight = weight;
    }
    public void updatePassword(String oldPasword, String newPassword){
        if(password.equals(oldPasword)){
            password = newPassword;
            System.out.println("Password updated");
        }
        else{
            System.out.println("wrong password");
        }
    }
    public void details(){
        System.out.println("Name: " + name + "\n" + "Height: " + height + " cm" + "\n" + "Weight: " + weight + " lb" + "\n" + "Workout Type: " + WorkoutType);
    }
    public void updateWorkoutType(String workout, double met){
        WorkoutType = workout;
        this.met = met;
        System.out.println("Workout Type updated");
    }
    public void workoutSummery(){
        double caloriesBurned = met * weight * duration / 60;
        this.details();
        System.out.println("Calories Burned: " + caloriesBurned);
    }
    public void duration(int duration){
        this.duration = duration;
        System.out.println("Duration set");
    }

}
