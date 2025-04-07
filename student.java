


// Student.Subclass
public class student extends person {
    private String gradeLevel;
 
    public student(String name, int id, String gradeLevel) {
        super(name, id);
        this.gradeLevel = gradeLevel;
    }
    // Overriding the display method
    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Grade Level: " + this.gradeLevel);
    }
}
 