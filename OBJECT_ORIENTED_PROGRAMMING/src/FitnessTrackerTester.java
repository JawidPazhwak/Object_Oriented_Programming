public class FitnessTrackerTester {
    public static void main(String [] args){
        System.out.println("Fitness Tracker");
        FitnessTracker f1 = new FitnessTracker("A", "123", 186, 110);
        f1.updatePassword("123", "123abc");
        f1.details();
        f1.updateWorkoutType("Running", 3.9);
        f1.duration(90);
        f1.workoutSummery();
    }

}
