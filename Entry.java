public class Entry {
    public static void main(String... args){
        OverLoadingExample A = new OverLoadingExample(50,"A");
        A.studentResult();

        OverRidingExample B = new OverRidingExample(60, "B");
        B.studentResult();
    }

    
}
