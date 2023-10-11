public class OverLoadingExample extends PerantClass {

    public OverLoadingExample(int studentMarks, String studentName) {
        super(studentMarks, studentName);
        //TODO Auto-generated constructor stub
    }

    public void studentResult(){

        System.out.println("Marks = " + getStudentMarks());
        System.out.println("Name:-" + getStudentName());
    }

    

    
}
