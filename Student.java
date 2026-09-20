//Student Result Management System. 
  import java.util.Scanner;
  public class Student {
  static String[] names = new String[10];
  static int [] subjectcount=new int[10];
  static int[][] marks = new int[10][10]; 
  static int[] total=new int[10];
  static Scanner sc=new Scanner (System.in);
  static int count=0;


//ADD STUDENTS
  public static void Addstudent(){
      if(count>=10){
         System.out.println("Student limit reached");
         return;
      }

      int i, j;
      System.out.println("Enter student name");
      names[count]=sc.next();
      
       System.out.println("enter the number of subject.");
       int n=sc.nextInt();
       subjectcount[count]=n;
      
         System.out.println("Entet marks of  "+n+" subjects");  
          for( i=count;i==count;i++){
              for(j=0;j<n;j++){
                   int m=j+1;
                   System.out.println("marks["+m+"]");
                    marks[i][j]=sc.nextInt();
                }       
      }
      count++;
} 



//DISPLAY STUDENT 
    public static void display (){
      int i, j;

      if(count==0){
         System.out.println("NO student is available");
         return;
      }

      for (i=0;i<count;i++){
          System.out.println("Name:"+names[i]);
          
          //display marks
               for(j=0;j<subjectcount[i];j++){
                 if(marks[i][j] > 0){                 
                     int m=j+1;
                     System.out.println("marks"+m+":"+marks[i][j]);
                    }
                }
            }
        
    }


//SEARCH STUDENT 
    public static void searchstudent(){
        int i,j;

         if(count==0){
         System.out.println("NO student is available");
         return;
      }

        boolean found=false;
          System.out.println("enter student name to be searched:");
          String nav=sc.next();
         for(i=0;i<count;i++){
             if(nav.equals(names[i])){
                found=true;
                System.out.println("student is found");
                System.out.println("Name:"+names[i]);
                for(j=0;j<subjectcount[i];j++){
                 if(marks[i][j] != 0){
                     int m=j+1;
                     System.out.println("marks"+m+":"+marks[i][j]);
                    }
                }
            }
         }
         if(!found)
            System.out.println("Student not found");
    }


// FIND TOPPER 
    public static void topper(){
       int i,j;

       if(count==0){
        System.out.println("No stuednt is available");
        return;
       }

        for(i=0;i<count;i++){
        total[i]=0;
        for(j=0;j<subjectcount[i];j++){
            if(marks[i][j] != 0)                     
            total[i]=total[i]+marks[i][j];
         }
        }


        int max =0;  // max ix the indext of the tooper 
        for(i=0;i<count;i++){
           if (total[i]>total[max]){
               max=i;
             }
          }
        
         System.out.println("Topper is "+ names[max]);

        for(j=0;j<subjectcount[max];j++){
            if(marks[max][j] != 0){
                int m=j+1;
                System.out.println("marks"+m+":"+marks[max][j]);
            }
        }
         for(i=0;i<count;i++){
        if(names[i] != null)
        System.out.println("Name: "+names[i]);    
       System.out.println("Total marks: "+total[i]);
    }
    
    }
  

//EXIT OPTION    
    public static void Exit(){
      System.out.println("project is executed succesfully");
      System.out.println("EXIT");
   
                 
    }
   
 
//MAIN FUNCTION 
    public static void main(String[] args) {
      int i,button; 
       System.out.println("==================================");
      System.out.println("    Student Management System");
      System.out.println("==================================");
   
       System.out.println("  1.Add student");
       System.out.println("  2.Display all students");
       System.out.println("  3.Search student");
       System.out.println("  4.Find topper");
       System.out.println("  5.Exit");
       
       do{
          System.out.print("Enter the choice :");
          button=sc.nextInt() ;
       
         switch (button){
           case 1: Addstudent();
                   break;
            case 2: display();
                   break;
            case 3: searchstudent();
                   break; 
            case 4: topper();
                   break;
            case 5: Exit();
                   break;                      
           default:
              System.out.println("Invalid choice");
            }
        }while(button<5);
           sc.close();
    }  
}
