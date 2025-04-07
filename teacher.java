public class teacher extends person{
    private String subject;
 
    public teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }
    // Overriding the display method
    @Override
    public void displayinfo() {
        super.displayinfo(); // Call the display method of the teacher class
        System.out.println("Subject: " + this.subject);
    }
}
 
 
 