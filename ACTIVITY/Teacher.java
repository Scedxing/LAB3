public class Teacher extends Person {
    private String subject;

    Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject); 
    }

    public static void main(String[] args) {
        Teacher t = new Teacher("Annix", 1085447, "Mathematics");
        t.displayInfo();  //This will call both Persons/teachers info

        
  
    }
}
