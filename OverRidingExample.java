public class OverRidingExample extends PerantClass {

    public OverRidingExample(int studentMarks, String studentName) {
        super(studentMarks, studentName);
        //TODO Auto-generated constructor stub
    }

    @Override
    //this is a annotation

    public void studentInfo(){

        System.out.println("Marks = \t " + getStudentMarks());
        System.out.println("Name:- \t" + getStudentName());
    }
    
    public boolean studentResult() {
        if (super.getStudentMarks > 33.33)
            return pass;
        else
            return fail;

}
