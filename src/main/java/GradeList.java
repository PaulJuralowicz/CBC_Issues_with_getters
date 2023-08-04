import java.util.HashMap;

public class GradeList {
    // Grades must be 0 or greater!
    private HashMap<String, Integer> grades;
    private int testInt;

    public GradeList(){
        grades = new HashMap<>();
        testInt = 0;
    }
    // Makes sure the grade is 0 or greater!
    public boolean setGrade(String student, int grade){
        if (grade >= 0){
            grades.put(student, grade);
            return true;
        }
        return false;
    }

    public boolean setInt(int x){
        if (x >= 0){
            testInt = x;
            return true;
        }
        return false;
    }

    public int getInt(){ return testInt; }

    public HashMap<String, Integer> getGrades(){
        return grades;
    }

    public static void main(String[] args){
        GradeList a = new GradeList(); // make a new gradelist
        a.setGrade("Paul", 100); // add one student too it
        HashMap<String, Integer> map1 = a.getGrades(); // get the internal HashMap from grade list
        map1.put("Bad Guy", -100); // add a random thing to that hashmap
        HashMap<String, Integer> map2 = a.getGrades(); // get the internal HashMap again
        System.out.println("Bad Guy: " + Integer.toString(map2.get("Bad Guy"))); // see if it contains an entry for Bad Guy
        // We broke Spec!
        //What about the int?
        a.setInt(100); //set the int to a positive number
        int test1 = a.getInt(); // get the int instance variable
        test1 = -100; // set it to something else
        int test2 = a.getInt(); // get the int instance variable again
        System.out.println("Test1: " + Integer.toString(test1));
        System.out.println("Test2: " + Integer.toString(test2));
        System.out.println("Directly the int: " + Integer.toString(a.getInt()));
        //Why didn't the int instance variable change? We basically did the same thing!
    }

}
