    package CourseManagementSystem;
    //importing all the necessary packages
    import java.io.File;
    import java.io.FileNotFoundException;
    import java.io.FileOutputStream;
    import java.io.PrintWriter;
    import java.util.Scanner;

    /**
     * has access to some method of CourseAdministrator
     * Views assignedModules to each Instructor with their names and assigned module names
     * Views student information
     * Write marks obtained by students in different modules in a file
     */


    public class Instructor {
        //extending with the class CourseAdministrator to make some methods available
        //String instructorPhNum;
        public Instructor() throws FileNotFoundException {

            //calling methods and running it
            viewAssignedModule();
            StudInformation();
            MarksObtained();
            NewAssignModule();

        }
        //method to view the assigned modules to each instructor prepared by CourseAdministrator from a file
        public void viewAssignedModule () throws FileNotFoundException {
            System.out.println("***View Assigned Modules of each Instructor***");
            //opening a file named AssignModules.txt to read the content in it
            File file = new File("AssignedModules.txt");
            Scanner scanner = new Scanner(file);
            //reading the content in the file line by line
            while (scanner.hasNextLine()) {
                //displaying the content in the file
                System.out.println(scanner.nextLine());
            }
        }
        //method to view more modules assigned to the instructor those who aren't assigned with four modules
        public void NewAssignModule() throws FileNotFoundException {
            System.out.println("***More Assigned Modules***");
            //opening a file named ModuleAssigned.txt to read the content in it
            File file2 = new File("ModulesAssigned.txt");
            Scanner scanner1 = new Scanner(file2);
            //reading the content in the file line by line
            while (scanner1.hasNextLine()){
                //displaying the content in the file
                System.out.println(scanner1.nextLine());
            }
            
        }
       //to view the student information from a file prepared by student
        public void StudInformation() throws FileNotFoundException {
            System.out.println("***View Students information student Name ID and CourseSelected***");
            //opening a file named StudentInfo.txt to read the content in it
            File file = new File("StudentInfo.txt");
            Scanner scanner = new Scanner(file);
            //reading the content in the file line by line
            while (scanner.hasNextLine()) {
                //displaying the content in the file
                System.out.println(scanner.nextLine());
            }

        }
           /*method to write the marks obtained by the students in different modules
           and store it in the file named MarksObtainedByStudents.txt*/
           public void MarksObtained() throws FileNotFoundException {
               System.out.println("\n****");
               //creating a file named MarksObtainedByStudents.txt and adding data to it true = append data
               FileOutputStream file = new FileOutputStream("MarksObtainedByStudents.txt",true);
               PrintWriter printWriter = new PrintWriter(file);
               //writing data in the file
               printWriter.println("\n*****Marks Obtained in Different Modules*****");

               Scanner StdName= new Scanner(System.in);
               //user input the student name
               System.out.println("Enter the name of the student:");
               String studentName = StdName.nextLine();

               Scanner a= new Scanner(System.in);
               //user inputs the marks in different modules
               System.out.println("Enter the marks obtained in Introduction for web Technologies:");
               Integer IntroductionToWebTechnologies= a.nextInt();

               Scanner b= new Scanner(System.in);
               System.out.println("Enter the marks obtained in Introduction to programming 1:");
               Integer IntroductionToProgramming1=b.nextInt();

               Scanner c=new Scanner(System.in);
               System.out.println("Enter the marks obtained in Personal Development Skills for computing:");
               Integer PersonalDevelopmentSkillsForComputing=c.nextInt();

               Scanner d=new Scanner(System.in);
               System.out.println("Enter the marks obtained in Computing Mathematics and Digital Logic:");
               Integer ComputingMathematicsAndDigitalLogic=d.nextInt();

               Scanner e=new Scanner(System.in);
               System.out.println("Enter the marks obtained in Introduction to programming 2:");
               Integer IntroductionToProgramming2=e.nextInt();

               Scanner f=new Scanner(System.in);
               System.out.println("Enter the marks obtained in Introduction to Database System:");
               Integer IntroductionToDatabaseSystem=f.nextInt();

               Scanner g=new Scanner(System.in);
               System.out.println("Enter the marks obtained in Software Engineering:");
               Integer SoftwareEngineering=g.nextInt();

               Scanner h=new Scanner(System.in);
               System.out.println("Enter the marks obtained in Artificial Intelligence and Machine Learning:");
               Integer ArtificialIntelligenceAndMachineLearning=h.nextInt();

               //displaying the name of the student with marks obtained in different modules
               printWriter.println("\n"+studentName);
               printWriter.println("1. Introduction to Web Technologies:"+IntroductionToWebTechnologies);
               printWriter.println("2. Introduction to programming 1:"+IntroductionToProgramming1);
               printWriter.println("3. Personal Development Skills in computing:"+PersonalDevelopmentSkillsForComputing);
               printWriter.println("4. Introduction to Programming 2:"+IntroductionToProgramming2);
               printWriter.println("5. Computing Mathematics and Digital Logic:"+ComputingMathematicsAndDigitalLogic);
               printWriter.println("6. Introduction to Database System:"+IntroductionToDatabaseSystem);
               printWriter.println("7. Software Engineering:"+SoftwareEngineering);
               printWriter.println("8. Artificial Intelligence and Machine Learning:"+ArtificialIntelligenceAndMachineLearning);
               //closing the file
               printWriter.close();
        }


       //main
        public static void main(String[] args) throws FileNotFoundException {
            Instructor info = new Instructor();
            //creating the object of the class Instructor
        }

    }
