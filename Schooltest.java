public class Schooltest {
    public static void main(String[] args) {


        //Student Information
        System.out.println("₊✩‧₊˚౨ৎ˚₊✩‧₊");
        System.out.println("Students Information");
        Students student = new Students("SANY GRACE BAYANGAN", 1081472, "1st year College");
        student.displayInfo();
        System.out.println("\n");

        //For teacher Information
        System.out.println("₊✩‧₊˚౨ৎ˚₊✩‧₊");
        System.out.println("Teacher Information");
        System.out.println("\n");
        Teacher MaamChona = new Teacher("PHEVY CHONA SONGYO", 1075228, "Ethics");
        MaamChona.displayInfo();

        //Staff Information
        System.out.println("\n");
        System.out.println("₊✩‧₊˚౨ৎ˚₊✩‧₊");
        System.out.println("Staff Information");
        System.out.println("\n");
        Staff worker = new Staff("MARK JUSTINE PULIDO", 1111111, "SACE");
        worker.displayInfo();


        
    }

}