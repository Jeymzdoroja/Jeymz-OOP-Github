//James Harrey G. Doroja

public class person {
    private String name;
    private int id;
     
    //Constructor
    public person(String name, int id) {
        this.name = name;
        this.id = id;
        //Encapsulation getter and methods
    }
    public String getName() {
        return 
        
        this.name;
    }
    public int getid() {
        return 
        
        this.id;
    }
    //Display Information
    public void displayinfo() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
    }
 
    
    public static void main(String[] args) {
            student student = new student("James Harrey Doroja", 2025003, "1st Year");
            teacher teacher = new teacher("Sr. Mendoza, Raquiren F.", 2024001, " Object Oriental Programming Adviser");
            staff staff = new staff("Mr. Squarepants", 2022098, "Registrar");
   
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

 

 
