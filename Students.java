    package CourseManagementSystem;
    //importing all the important packages
    import java.io.*;
    import java.util.Scanner;
    /**
     *Write student name, id and enrolled year
     *Write student level
     *choose course taken by the student
     * Selects optional courses if a student is in level 6
     * Views instructor names and the modules taught by them from a file
     *  */
    public class Students{
        //declaration of variables
        private String Name;
        private String studentId;
        private Integer studentEnrolledYear;

        //Constructor to take user input enter the student name,id and enrolled year
        public Students() throws IOException {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter the student name:");
            this.Name = in.nextLine();

            System.out.println("Enter the student id:");
            this.studentId = in.nextLine();

            System.out.println("Enter the student enrolled year:");
            this.studentEnrolledYear = in.nextInt();

            //prints name,id and enrolled year of the student
            System.out.println(Name + " " +studentId + " " +studentEnrolledYear);

            //call of the method to run it
            StudentLevel();
            chooseCourse();
            selectOptCourse();
            viewInstructor();
            NewAssignModule();


    }
    //method to enter the level of the student
    public void StudentLevel(){
        Scanner level = new Scanner(System.in);
        System.out.println("1.Diploma\n 2.Advanced Diploma\n 3.Honours");
        int lvl = level.nextInt();
        System.out.println("Enter the level of the student:"+lvl);
    }

    //method to choose course
    public void chooseCourse() throws IOException {
         //String array to store the two available course
        String[] available = {"BIT", "BBA"};
        System.out.println("choose for the available courses below:");
        //loop to display the above courses
        for (int i = 0; i < available.length; i++) {
            //print the available courses
            System.out.println(available[i]);
        }
        //creating a file to store the student information in the text file name StudentInfo.txt true=append data
        FileOutputStream file = new FileOutputStream("StudentInfo.txt",true);
        //starts writing
        PrintWriter printWriter = new PrintWriter(file);
        //takes user input and starts writing in the file
        Scanner choose = new Scanner(System.in);
        String chCourse = choose.nextLine();
        //display the above information in the file
        printWriter.println("\n"+Name +" "+ studentId +" "+ "is"+ " "+"enrolled"+" "+ "in"+" "+ chCourse);
        //close the file
        printWriter.close();


        }
    //method to select the optional course
    public void selectOptCourse(){
            Scanner opt = new Scanner(System.in);
            //taking user input to select the optional course
            System.out.println("1.Level 4 2.Level 5 3.Level 6\nEnter the level of the student:");
            int studentLevel = opt.nextInt();
            /*using if else statement to if a student inputs lvl 6 it tells you to choose between two optional modules
            * and if it inputs some other level it prints every courses are mandatory */
            if(studentLevel==6){
                System.out.println("You have to choose between optional course: \n 1.Graphical Designing\n 2.PhotoShop");
                Scanner optSub = new Scanner(System.in);
                System.out.println("You have taken:");
                String std= optSub.nextLine();

            }else {
                System.out.println("Every courses are mandatory");
            }

        }
        //method to view the Instructor and modules taught by them form a file named ViewInstructor.txt
        public  void viewInstructor() throws FileNotFoundException {
            System.out.println("***View Instructor and the Modules they instructs***");
            //specifying the name of the file which needs to be read
            File file = new File("ViewInstructor.txt");
            Scanner scanner = new Scanner(file);
            //reading each and ever line present in the file
            while (scanner.hasNextLine()) {
                //displaying it
                System.out.println(scanner.nextLine());
            }
        }
        //method to view more modules assigned to the instructor those who aren't assigned with four modules
        public void NewAssignModule() throws IOException {
            System.out.println("***More Assigned Modules***");
            //opening a file named ModuleAssigned.txt to read the content in it
            File file2 = new File("ModulesAssigned.txt");
            Scanner scanner1 = new Scanner(file2);
            //reading the content in the file line by line
            while (scanner1.hasNextLine()) {
                //displaying the content in the file
                System.out.println(scanner1.nextLine());
            }
        }

       //main
        public static void main(String[] args) throws IOException {
            Students def= new Students();
            //creating object of the class Students
        }
}