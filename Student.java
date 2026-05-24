class Student extends Person { 
 
    private int id , grade ; 
 
    public Student(int id, String name, int age, int grade) { 
        super(name, age, "Student"); 
        this.id = id; 
        this.grade = grade; 
    } 
 
    public void setId(int id){  
        this.id = id; 
    } 
 
    public int getId(){  
        return id; 
    } 
 
    public void setGrade(int grade){  
        this.grade = grade; 
    } 
 
    public double getGrade(){  
        return grade; 
    } 
 
    @Override 
    public void displayDetails() { 
         
        System.out.println("Student Details:"); 
        System.out.println("Name: " + getName()); 
        System.out.println("ID: " + id); 
        System.out.println("Age: " + getAge()); 
        System.out.println("Grade: " + grade + 
"\n========================="); 
    } 
 
    @Override 
    public void showInfo() { 
        System.out.println("Student Info ID: " + id + 
                           ", Name: " + getName() + 
                           ", Role: " + role); 
    } 
}
