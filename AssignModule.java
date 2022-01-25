    package CourseManagementSystem;
    //importing the necessary packages
    import javax.swing.*;
    import java.io.*;
    /**
     * Displays JOptionPane to write
     *write name of the Instructor and module to assigned to them
     * Stores the entered data into a file Named ModulesAssigned.txt
     */

    public class AssignModule {

        public AssignModule() {
            //declaring tht variables
            String InstructorName = " ";
            String Module = " ";
            //in any case the program does not crash try catch is used
            try{
                //creating a file write object true=append data
                FileWriter File = new FileWriter("ModulesAssigned.txt",true);
                //printing in the file
                PrintWriter writer = new PrintWriter(File);
                /*
                 do loop will keep going if the instructor name is not empty
                 */
                do{
                    /*using JOptionPane to take user input Instructor name and Modules taught by them
                     * Please enter ok and leave the JOptionPane empty to stop*/
                    InstructorName = JOptionPane.showInputDialog("Enter the name of the Instructor.Please click ok leaving it blank if u want to stop");
                    Module = JOptionPane.showInputDialog("Enter the module you want assign to the Instructor.");
                    //if Instructor name is not empty it will print Instructor Name and Module taught by them in the txt file
                    if(!InstructorName.isEmpty()){
                        writer.println(Module+" "+"is taught by"+" "+InstructorName);
                    }
                }while (!InstructorName.isEmpty());
                writer.close();//closing the file
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) throws FileNotFoundException {
            AssignModule assign = new AssignModule();
            //since CourseAdministrator is responsible for assigning the modules to the instructor
            CourseAdministrator AssignModule = new CourseAdministrator();
            AssignModule.AssignModule();

        }
    }
