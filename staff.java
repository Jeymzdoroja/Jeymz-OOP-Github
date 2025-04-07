public class staff extends person {


    private String department;
 //Constructor
    public staff(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }
    // Overriding the display method
    @Override
    public void displayinfo() {
        super.displayinfo(); // Call the display method staff class
        System.out.println("Department: " + this.department);
    }
}