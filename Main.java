import java.util.Scanner; 
public class Main { 
    public static void main(String[] args) { 
 
        boolean flag =true ; 
        int choice ; 
        Scanner input = new Scanner(System.in) ; 
         
        for ( int i = 0 ; flag ; i ++ ) 
        { 
            System.out.println( "===== Student Managament System 
=====" ); 
            System.out.println( "1 : Add Student" ); 
            System.out.println( "2 : Display All Students" ); 
            System.out.println( "3 : Serach Student" ); 
            System.out.println( "4 : Update Student" ); 
            System.out.println( "5 : Exit " ); 
            System.out.print( "           ============     \nPlease 
Enter a Choice: " ); 
            choice = input.nextInt() ; 
            System.out.println("           ============"); 
 
            if ( choice == 1 ) 
                addStudent(); 
            else if ( choice == 2) 
                displayStudents(); 
            else if ( choice == 3 ) 
                searchStudent(); 
            else if ( choice == 4 ) 
                updateStudent(); 
            else if ( choice == 5 ) 
                return ; 
            else  
                System.out.println( "Invalid Choice" ); 
        } 
 
 
 
    } 
        static Student[] Students = new Student[100] ; 
        static int count = 0 ; 
 
        public static boolean isAlreadyExisting(int id) 
        { 
            for (int i = 0 ; i < count ; i++) 
          { 
                if ( Students[i].getId() == id  ) 
                {     
                    return true ; 
                }     
          } 
 
                    return false ; 
 
        } 
 
        public static void addStudent () 
        { 
 
            Scanner input = new Scanner(System.in) ; 
 
            int id , age , grade  ;  
            String name ;  
 
          System.out.print( "Enter Your Name: "); 
          name = input.next(); 
 
          System.out.print( "Enter ID: " ); 
          id = input.nextInt() ; 
 
          if( isAlreadyExisting(id) == true )  
          { 
             System.out.println("This ID Is Already Exists Please 
Enter Unique ID");  
             return ; 
          } 
 
          System.out.print( "Enter Your Age: " ); 
          age = input.nextInt() ; 
 
          if ( age < 4 || age > 18 )  
          { 
                System.out.println( "You Aren't Elgible To 
Register" ); 
                return ; 
          } 
 
          System.out.print( "Enter Your Grade: " ); 
          grade = input.nextInt(); 
 
          if ( grade < 1 || grade > 12 ) 
          { 
                System.out.println("Please Enter Valid Grade between 1 
to 12"); 
                return ; 
          } 
 
          Students[count] = new Student(id, name, age, grade); 
          count++; 
 
          System.out.println("Student Has Been Added Successuflly" + 
"\n====================================="); 
 
           
 
        } 
 
        public static void displayStudents() 
        { 
            if ( count == 0 ) 
                System.out.println("No Student Yet"); 
            else  
            { 
                for ( int i = 0 ; i < count ; i++  ) 
                {     
                    Students[i].displayDetails() ; 
                }     
            } 
        } 
 
        public static void searchStudent() 
        { 
            Scanner input = new Scanner(System.in) ; 
 
            int id ; 
 
            System.out.print("Enter Your ID: "); 
            id = input.nextInt(); 
 
            System.out.println("           ============"); 
 
            for ( int i = 0 ; i< count ; i++ ) 
            { 
                if ( Students[i].getId() == id ) 
                { 
                    Students[i].displayDetails(); 
                    return ; 
                } 
            }     
                 
                 
                System.out.println("Not Found"); 
                return ; 
                 
             
        } 
 
        public static void updateStudent() 
        { 
 
            Scanner input = new Scanner(System.in) ; 
 
            int id_2 , choice = 0 ; 
 
            System.out.print("Enter Your ID: "); 
            id_2 = input.nextInt(); 
 
            for ( int i = 0 ; i < count ; i++) 
            { 
                if ( Students[i].getId() == id_2 ) 
                { 
                    System.out.println( "1 : Update Name" ); 
                    System.out.println( "2 : Update ID" ); 
                    System.out.println( "3 : Update Age" ); 
                    System.out.println( "4 : Update Grade" ); 
                    System.out.println( "5 : Return" ); 
                    System.out.print( "           ============     \n" 
+ "Enter A Choice: " ); 
                    choice = input.nextInt() ; 
                    System.out.println("           ============"); 
 
 
                    if ( choice == 1 ) 
                    { 
                        String name_1 ; 
                        System.out.print( "Update Your Name: " ); 
                        name_1 = input.next(); 
                        Students[i].setName(name_1); 
                        System.out.println( "Your Name Has Been 
Updated Successfully" ); 
                        System.out.println("           ============"); 
                        return ; 
                    } 
 
                    else if ( choice == 2 ) 
                    { 
                        int id_1 ; 
                        System.out.print( "Update Your ID: " ); 
                        id_1 = input.nextInt(); 
 
                        if ( isAlreadyExisting(id_1) == true ) 
                        { 
                            System.out.println("This ID Is Already 
Exists Please Enter Unique ID");  
                            return ; 
                        } 
 
                        Students[i].setId(id_1); 
                        System.out.println( "Your ID Has Been Updated 
Successfully" ); 
                        System.out.println("           ============"); 
                        return ; 
                    } 
 
                    else if ( choice == 3 ) 
                    { 
                        int age_1 ; 
                        System.out.print( "Update Your Age: " ); 
                        age_1 = input.nextInt(); 
 
                        if ( age_1 < 4 || age_1 > 18 )  
                        { 
                            System.out.println( "You Aren't Elgible To 
Register" ); 
                            return ; 
                        } 
 
                        Students[i].setAge(age_1); 
                        System.out.println( "Your Age Has Been Updated 
Successfully" ); 
                        System.out.println("           ============"); 
                        return ; 
                    } 
 
                    else if ( choice == 4 ) 
                    { 
                        int grade_1 ; 
                        System.out.print( "Update Your Grade: " ); 
                        grade_1 = input.nextInt(); 
 
                        if ( grade_1 < 1 || grade_1 > 12 )  
                        { 
                            System.out.println("Enter Valid Grade 
Betweem 1 to 12"); 
                            return ; 
                        } 
 
                        Students[i].setGrade(grade_1); 
                        System.out.println( "Your Grade Has Been 
Updated Successfully" ); 
                        System.out.println("           ============"); 
                        return ; 
                    } 
 
                    else if ( choice == 5 ) 
                    { 
                        return ;             
                    } 
                        
 
                    else  
                    { 
                        System.out.println("Wrong Choice"); 
                        System.out.println("           ============"); 
                        return ; 
                    } 
                } 
                    
            } 
 
                    System.out.println("This ID Isn't Existing"); 
                    System.out.println("           ============"); 
                    return ; 
             
        } 
}
