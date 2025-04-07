public class person {
    private String name;
    private int id;
     
    //CONSTRUCTOR
    public person(String name, int id) {
        this.name = name;
        this.id = id;
        //METHOD CALLS
    }
    public String getName() {
        return this.name;
    }
    public int getid() {
        return this.id;
    }
    //DISPLAY METHOD
    public void displayinfo() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
    }
 
    public static void main(String[] args) {
            student student = new student("Go, Miguel", 2024000, "1st Year");
            teacher teacher = new teacher("Fabro Jr,  Junnie", 2024001, "1st Year Math");
            staff staff = new staff("Pansit, Bato", 2024002, "Janitor");
   
            System.out.println("Student Info:");
            student.displayinfo();
            System.out.println();
   
            System.out.println("Teacher Info:");
            teacher.displayinfo();
            System.out.println();
   
            System.out.println("Staff Info:");
            staff.displayinfo();
        }
   
   
 
}
 