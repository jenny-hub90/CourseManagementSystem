  package CourseManagementSystem;
  //importing all the the necessary packages

  import java.io.File;
  import java.io.FileNotFoundException;
  import java.io.FileOutputStream;
  import java.io.PrintWriter;
  import java.util.ArrayList;
  import java.util.Scanner;

  /**
   * Write administrator name, phone number and email
   * makes courses available
   * edits(name) course remove and cancel them
   * write name of instructor and assign modules to the instructor
   * add instructors and remove them
   * edits(name) modules and remove them
   * Views the marks obtained by the students obtained in various modules prepared by the class Instructor
   * generates ReportCard in GUI
   */


  //using polymorphism to add remove course
  class  Course {
    public void addRemoveCourse(){
      ArrayList<String> Course = new ArrayList<>();
      System.out.println("****Courses****\n");
      Course.add("BIT");
      Course.add("BCA");
      Course.add("BIM");
      Course.add("BBA");
      Course.remove("BIM");
      for(int a=0;a<Course.size();a++){
        System.out.println(Course.get(a));
      }
    }
  }
  //using inheritance to use the same class to add remove module fo different available courses
  class Module extends Course {
    public void addRemoveCourse() {
      ArrayList<String> BIT = new ArrayList<>();
      System.out.println("****Modules for BIT*****\n");
      BIT.add("Introduction to programming 1");
      BIT.add("Introduction to programming 2");
      BIT.add("Computer architecture and operating System");
      BIT.add("Numerical Method and Concurrency");
      BIT.add("App development");
      BIT.remove("App development");
      for(int i=0;i<BIT.size();i++){
        System.out.println(BIT.get(i));
      }

      ArrayList<String> BCA = new ArrayList<>();
      System.out.println("****Modules for BCA****\n");
      BCA.add("Java");
      BCA.add("E-commerce");
      BCA.add("Software engineering");
      BCA.add("Computer architecture and operating system");
      BCA.remove("Java");
      for(int j=0;j<BCA.size();j++){
        System.out.println(BCA.get(j));
      }


      ArrayList<String> BBA = new ArrayList<>();
      System.out.println("****Modules for BBA****\n");
      BBA.add("Introduction to Information Technology");
      BBA.add("Introduction to Business");
      BBA.add("Foundational Statistics");
      BBA.add("Foundational Mathematics");
      BBA.add("Academic English for Undergraduate Study");
      BBA.remove("Foundational Statistics");
      for(int k=0;k<BBA.size();k++){
        System.out.println(BBA.get(k));
      }
    }
  }

  //abstract class for appointing course and module leaders
  abstract  class AppointCourseLeader{
    public void appoint() {
      System.out.println("Herald college is appointing course leaders.Please leave your CV accordingly.");
    }
    public abstract void addTeacher(); //abstract class have lists of methods and methods that have already implemented
    //this addTeacher is a abstract method because every teacher have different abilities and potential
  }

  class AppointModuleLeader extends AppointCourseLeader{
    public void addTeacher(){
      System.out.println("Modules Leaders are also appointed so eligible teachers feel free to apply.");
    }
  }


  public class CourseAdministrator extends ReportCard{
    //use of inheritance (making some of the methods available for the different class i.e. class Instructor)
    //making class ReportCard available to the CourseAdministrator to generate the results of the student
    //declaration of instance variables also known as class attributes
    //use of encapsulation
    private String Name;
    private String phoneNum;
    private String Email;

    //constructor to take user input the Name,PhoneNumber,and Email address of the CourseAdministrator
    public CourseAdministrator() throws FileNotFoundException {
      //taking user input to enter the name phone number and email of the course administrator
      Scanner in = new Scanner(System.in);

      System.out.println("Enter the name of course administrator:");
      this.Name = in.nextLine();

      System.out.println("Enter the phone number:");
      this.phoneNum = in.nextLine();
      if( phoneNum.length()==10 && phoneNum.matches("^[\\d]{10}")){//must enter 10 digit numbers
        //displaying phone number
        System.out.println("Phones is:"+phoneNum);
      }else{
        System.out.println("Please enter a valid number");
      }

      System.out.println("Enter the email:");
      this.Email = in.nextLine();

      //Call of methods
      addRemoveModuleInstructor();
      ChangeCourseNam();
      ChangeModuleName();
      viewMarksObtained();
    }

  // method to add remove module instructor
    public void addRemoveModuleInstructor(){
      //use of arraylist or collection of data
      ArrayList<String> tutor = new ArrayList<>();
      //adding of module tutors
      System.out.println("***Instructor****\n");
      tutor.add("Deepson Shrestha");
      tutor.add("Kritika Tuladhar");
      tutor.add("Sachit Shrestha");
      tutor.add("Prakash Gautam");
      tutor.add("Sachin Kafle");
      tutor.add("Subhiran Shrestha");
      tutor.add("Hemanga Gautam");
      tutor.add("Rupak koirala");
      tutor.add("Raj Shrestha");
      //printing the module tutors
      //removing of module tutor those who left
      tutor.remove("Hemanga Gautam");
      tutor.remove("Rupak Koirala");
      tutor.remove("Raj Shrestha");
      //printing the module tutors after removing those tutors who left
      for(int b=0;b<tutor.size();b++) {
        System.out.println(tutor.get(b));
      }
    }
    //method to assign modules to the instructor
    public void assignModule() throws FileNotFoundException {
      /*Writing data which containing
      *Module tutor name
      *four each module they teach with module name
      *stores data in the file name AssignModules.txt
      *can change the name of the instructor as instructor name is user input*/
      //creating a file named AssignedModules.txt in write mode true = append data
      FileOutputStream file = new FileOutputStream("AssignedModules.txt",true);
      PrintWriter printWriter = new PrintWriter(file);
      //method to write data in the file
      Scanner assign1 = new Scanner(System.in);
      System.out.println("Enter the name of the instructor: ");//insert instructor name
      String instructorName1 = assign1.nextLine();
      ArrayList<String> BITa = new ArrayList<>();//using arraylist to store the four modules taught by the instructor
      BITa.add("Introduction to Web Technologies");
      BITa.add("Introduction to Database System");
      BITa.add("Object oriented programming");
      BITa.add("Database Design and Implementation");
      //displaying all the above information in the file
      printWriter.println("\nModules taught by"+" "+instructorName1+" "+"are:");
      for(int c=0;c<BITa.size();c++) {
        printWriter.println(BITa.get(c));
      }
      /*
      * works same as mentioned above in the comments
      * */
      Scanner assign2 = new Scanner(System.in);
      System.out.println("Enter the name of the instructor: ");
      String instructorName2 = assign2.nextLine();
      ArrayList<String> BITb = new ArrayList<>();
      BITb.add("Personal Development Skills for computing");
      BITb.add("Computer Architecture and Operating System");
      BITb.add("Software Project Management");
      BITb.add("Software Engineering");
      printWriter.println("\nModules taught by"+" "+instructorName2+" "+"are:");
      for(int d=0;d<BITb.size();d++){
      printWriter.println(BITb.get(d));
      }

      Scanner assign3 = new Scanner(System.in);
      System.out.println("Enter the name of the instructor: ");
      String instructorName3 = assign3.nextLine();
      ArrayList<String> BITc = new ArrayList<>();
      BITc.add("Introductory data structure and algorithm");
      BITc.add("Computing Mathematics and Digital Logic");
      BITc.add("Current Technologies: Mobile and cloud computing");
      BITc.add("Artificial Intelligence and Machine Learning");
      printWriter.println("\nModules taught by"+" "+instructorName3+" "+"are:");
      for(int e=0;e<BITc.size();e++) {
        printWriter.println( BITc.get(e));
      }

      Scanner assign4 = new Scanner(System.in);
      System.out.println("Enter the name of the instructor: ");
      String instructorName4 = assign4.nextLine();
      ArrayList<String> BITd = new ArrayList<>();
      BITd.add("Introduction to programming 1");
      BITd.add("Introduction to programming 2");
      BITd.add("Object oriented Design and programming");
      BITd.add("Introductory Computer Networking and IT security");
      printWriter.println("\nModules taught by"+" "+instructorName4+" "+"are:");
      for(int f=0;f<BITd.size();f++) {
        printWriter.println( BITd.get(f));
      }
      Scanner assign5 = new Scanner(System.in);
      System.out.println("Enter the name of the instructor: ");
      String instructorName5 = assign5.nextLine();
      ArrayList<String> BITe = new ArrayList<>();
      BITe.add("Big Data");
      BITe.add("Research and Development Skills in Computing");
      BITe.add("System Analysis and Design");
      BITe.add("Software Engineering");
      printWriter.println("\nModules taught by"+" "+instructorName5+" "+"are:");
      for(int h=0;h<BITe.size();h++) {
        printWriter.println( BITe.get(h));
      }
      Scanner assign6 = new Scanner(System.in);
      System.out.println("Enter the name of the instructor: ");
      String instructorName6 = assign6.nextLine();
      ArrayList<String> BBA = new ArrayList<>();
      BBA.add("Introduction to Information Technology");
      BBA.add("Introduction to Business");
      BBA.add("Foundational Statics");
      BBA.add("Foundational Mathematics");
      printWriter.println("\nModules taught by"+" "+instructorName6+" "+"are:");
      for(int l=0;l<BBA.size();l++) {
        printWriter.println( BBA.get(l));
      }
     printWriter.close();//to close the file
    }

    //method to change the name of the course
    public void ChangeCourseNam() {
      //String array to store the available courses
      String[] Course = {"MBA","BCA","BSC","BHM"};
      //printing the names of the courses
      System.out.println("****Changing name of the course****\n"+Course);
      //loop to display above courses one by one
      for (int c = 0; c < Course.length; c++) {
        if (Course[c].equals("MBA")) {/*changing the Course MBA into BIM*/
          Course[c] = "BIM";
        }
        //displaying the names of the courses after removing MBA and replacing it with BIM
        System.out.println(Course[c]);
      }
    }

    //method to change the name of the module
    public void ChangeModuleName(){
      //String array to store modules
      String[]Module = {"Introduction to C-Programming","Introduction to programming 2","Big data","Introduction to Database System"};
      //printing the names of the module
      System.out.println("****Changing the name of the module****\n"+Module);
      //loop to display above modules one by one
      for(int d=0; d<Module.length;d++) {
        if (Module[d].equals("Introduction to C-Programming")) {/*changing the module Introduction to C-programming into
                                                                  Introduction to programming 1*/
          Module[d] = "Introduction to programming 1";
        }
        //displaying the names of the modules after removing Introduction to C-programming and replacing it with Introduction to programming 1
        System.out.println(Module[d]);
      }
      }

    //method to cancel course
    public void CancelCourse(){
      String[] cancel={"BIM","BCA","BSC","BHM"};
      //String array to store the courses which needs to be cancelled
      System.out.println("\n Sorry these courses are cancelled for the time being:\n"+cancel);
      //message to state that the above courses are cancelled
      for (int i = 0; i < cancel.length; i++) {
        //loop to display cancelled course one by one
        System.out.println(cancel[i]);
        //displaying the course that are cancelled
      }
      String[] available={"BIT","BBA"};
      //String array to display available course
      System.out.println("Courses we are running for the time being are:\n"+available);
      for (int i = 0; i < available.length; i++) {
        //loop to display the available course one by one
        System.out.println(available[i]);
        //displaying the course that are available
      }
    }


    /*method to view the marks obtained by the students from the file name MarksObtainedStudents.txt prepared by the class
    instructor*/
    //file opened in read mode
    public void viewMarksObtained() throws FileNotFoundException {
      System.out.println("***View Students Obtained Marks in Different Modules***");
      //opens the file MarksObtainedByStudents
      File file = new File("MarksObtainedByStudents.txt");
      Scanner scanner = new Scanner(file);
      //Reads the file line by line
      while (scanner.hasNextLine()) {
        //displays all the contents present in the file
        System.out.println(scanner.nextLine());
      }

    }



    public void  AssignModule(){ System.out.println("The assigned Module by are displayed in ModulesAssigned.txt");}
    //main
    public static void main(String[] args) throws FileNotFoundException {
      //creating the object of CourseAdministrator the main method
      CourseAdministrator abc = new CourseAdministrator();
      //creating object of course and running it
      Course course = new Course();
      course.addRemoveCourse();
      //creating object of module and running it
      Module module = new Module();
      module.addRemoveCourse();
      //running the method CancelCourse and assignModule
      abc.CancelCourse();
      abc.assignModule();

      AppointModuleLeader app = new AppointModuleLeader();
      app.appoint();
      app.addTeacher();


    }
  }
