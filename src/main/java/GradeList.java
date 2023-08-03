import java.util.HashMap;

public class GradeList {

    private HashMap<String, Integer> grades;

    public GradeList(){
        grades = new HashMap<>();
    }

    public boolean setGrade(String student, int grade){
        if (grade >= 0){
            grades.put(student, grade);
            return true;
        }
        return false;
    }

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
    }

}
