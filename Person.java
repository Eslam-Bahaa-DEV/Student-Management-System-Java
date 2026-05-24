class Person extends User{ 
 
    private String name; 
    private int age; 
 
    public Person(String name, int age, String role){ 
        super(role); 
        this.name = name; 
        this.age = age; 
    } 
 
    public void setName(String name){  
            this.name = name;} 
         
    public String getName(){  
           return name;} 
    
    
   public void setAge(int age){  
  
            this.age = age;} 
 
    public int getAge(){ 
            return age;} 
         
    
    public void displayDetails(){ 
        System.out.println("Name: " + name +  
                           " Age: " + age);} 
                             
 
    @Override 
    public void showInfo() { 
        System.out.println("Role: " + role +  
                           " Name: " + name);} 
}
