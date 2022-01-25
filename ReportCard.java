    package CourseManagementSystem;
    //importing all the necessary packages
    import javax.swing.*;
    import javax.swing.ImageIcon;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.io.FileNotFoundException;
    import java.io.FileWriter;

    /**
     * Creates a frame
     * Generates a result
     * Write student name, course name, student id, and marks obtained with the help of file named MarksObtainedByStudents.txt in the all the eight modules
     * If a student score less than 40 in any module select fail and not graduated and click on submit
     * A JOption pane is displayed saying file opened successfully click on ok
     * It displays all the entered data in a screen
     * Entered data are also stored in a file named ReportCard.txt
     * */

    public class ReportCard extends  JFrame implements ActionListener {

        /**
         * JLabel for writing name,studentID, courseSelected, Modules, Marks,grade, result, remark
         * JTextField for typing in name,studentID, courseSelected, eight modulesName, MarksObtained in that modules and grade,
         * JRadioButton for Result to choose whether the student passed or failed and remark to select if Graduated or not Graduated
         * JTextArea for displaying whatever is written within the frame
         * FileWrite to store the records of the result input by the user into a file named ReportCard.txt*/
        JLabel label1, label2, label3, label4, label5, label6,label7,label8;
        JButton Submit;
        JTextField textField1, textField2, textField3, textField4, textField5, textField6,textField7,textField8,textField9
                ,textField10,textField11,moduleField1,moduleField2,moduleField3,moduleField4,moduleField5,moduleField6
                ,moduleField7,moduleField8,gradeField1,gradeField2,gradeField3,gradeField4,gradeField5,gradeField6,
                 gradeField7,gradeField8;
        JRadioButton Pass,Fail,Graduated,NotGraduated;
        JTextArea screen;
        FileWriter fileWriter;

        ReportCard(){
            /**
             * textField with named ModuleField write the name of modules in GUI
             * textField with the named textField from 4 to 11 write the marks obtained in that modules
             * textFiled with the named gradeField write the grades obtained if scored between or equal to 80 to 100 grade A
             * if scored equal to 60 and between 60 to 79 garde B and equal to 40 and between 40 to 59 grade C and D for all
             * other marks scored*/
            //It helps in adding component in JFrame
            Container e= getContentPane();
            e.setLayout(null);

            label1= new JLabel("Name");/*creates label1 and writes Name on it*/
            label1.setBounds(20,50,300,20);
            e.add(label1);//adding label1

            textField1 = new JTextField();/*creates a text field besides Name*/
            textField1.setBounds(300,60,150,20);
            e.add(textField1);//adding textField1

            label2= new JLabel("Course");/*creates label2 and writes course on it*/
            label2.setBounds(20,100,300,20);
            e.add(label2);//adding label2

            textField2 = new JTextField();/*creates a text field besides Course*/
            textField2.setBounds(300,100,150,20);
            e.add(textField2);//adding textField2

            label3 = new JLabel("Student ID");/*creates label3 and writes Student ID*/
            label3.setBounds(20,150,300,20);
            e.add(label3);//adding label3

            textField3 = new JTextField();/*creates a text field besides Student ID*/
            textField3.setBounds(300, 150, 150, 20);
            e.add(textField3);//adding textField

            label4 = new JLabel("Modules");/*creates a label4 and writes Modules */
            label4.setBounds(20,200,250,20);
            e.add(label4);//adding label4

            moduleField1= new JTextField();
            moduleField1.setBounds(20,220,250,20);
            e.add(moduleField1);

            label5=new JLabel("Marks");/*creates a label5 besides Modules*/
            label5.setBounds(300,200,100,20);
            e.add(label5);//adding label5

            textField4 = new JTextField();
            textField4.setBounds(300,220,80,20);
            e.add(textField4);

            label6=new JLabel("Grade");/*creates a label besides marks*/
            label6.setBounds(400,200,300,20);
            e.add(label6);//adding label6

            gradeField1=new JTextField();
            gradeField1.setBounds(400,220,50,20);
            e.add(gradeField1);

            moduleField2= new JTextField();
            moduleField2.setBounds(20,270,250,20);
            e.add(moduleField2);

            textField5 = new JTextField() ;
            textField5.setBounds(300,270,80,20);
            e.add(textField5);

            gradeField2=new JTextField();
            gradeField2.setBounds(400,270,50,20);
            e.add(gradeField2);

            moduleField3= new JTextField();
            moduleField3.setBounds(20,320,250,20);
            e.add(moduleField3);

            textField6 = new JTextField();
            textField6.setBounds(300,320,80,20);
            e.add(textField6);

            gradeField3=new JTextField();
            gradeField3.setBounds(400,320,50,20);
            e.add(gradeField3);

            moduleField4= new JTextField();
            moduleField4.setBounds(20,370,250,20);
            e.add(moduleField4);

            textField7 = new JTextField();
            textField7.setBounds(300,370,80,20);
            e.add(textField7);

            gradeField4=new JTextField();
            gradeField4.setBounds(400,370,50,20);
            e.add(gradeField4);

            moduleField5= new JTextField();
            moduleField5.setBounds(20,420,250,20);
            e.add(moduleField5);

            textField8 = new JTextField();
            textField8.setBounds(300,420,80,20);
            e.add(textField8);

            gradeField5=new JTextField();
            gradeField5.setBounds(400,420,50,20);
            e.add(gradeField5);

            moduleField6= new JTextField();
            moduleField6.setBounds(20,470,250,20);
            e.add(moduleField6);

            textField9 = new JTextField();
            textField9.setBounds(300,470,80,20);
            e.add(textField9);

            gradeField6=new JTextField();
            gradeField6.setBounds(400,470,50,20);
            e.add(gradeField6);

            moduleField7= new JTextField();
            moduleField7.setBounds(20,520,250,20);
            e.add(moduleField7);

            textField10 = new JTextField();
            textField10.setBounds(300,520,80,20);
            e.add(textField10);

            gradeField7=new JTextField();
            gradeField7.setBounds(400,520,50,20);
            e.add(gradeField7);

            moduleField8= new JTextField();
            moduleField8.setBounds(20,570,250,20);
            e.add(moduleField8);

            textField11 = new JTextField();
            textField11.setBounds(300,570,80,20);
            e.add(textField11);

            gradeField8=new JTextField();
            gradeField8.setBounds(400,570,50,20);
            e.add(gradeField8);

            label7=new JLabel("Result");/*creates label7 and writes Result*/
            label7.setBounds(20,620,100,20);
            e.add(label7);//adding label7

            Pass=new JRadioButton("Passed");
            Fail=new JRadioButton("Failed");


            Pass.setBounds(300,620,80,20);
            Fail.setBounds(390,620,80,20);
            Pass.setSelected(true);//by default pass is selected

            e.add(Pass);
            e.add(Fail);


            ButtonGroup Result= new ButtonGroup();
            Result.add(Pass);
            Result.add(Fail);

            label8=new JLabel("Remark");/*create label 8 and writes remark*/
            label8.setBounds(20,670,100,20);
            e.add(label8);//adding label8

            Graduated= new JRadioButton("Graduated");
            NotGraduated= new JRadioButton("Not Graduated");

            Graduated.setBounds(300,670,100,20);
            NotGraduated.setBounds(300,700,130,20);
            Graduated.setSelected(true);//by default graduated is selected

            e.add(Graduated);
            e.add(NotGraduated);

            ButtonGroup Remark=new ButtonGroup();//
            Remark.add(Graduated);
            Remark.add(NotGraduated);

            Submit= new JButton("Submit");//creating a button named Submit
            Submit.setBounds(300,750,80,20);
            e.add(Submit);//adds submit button

            Submit.addActionListener(this);
            //makes the button functional since it is implementing action listener interface

            screen= new JTextArea();
            screen.setBounds(500,50,600,300);
            e.add(screen);


            setVisible(true);//it makes the Frame visible
        }
        //Main
        public static void main(String[] args) throws FileNotFoundException {
            //object of the class
            ReportCard frame = new ReportCard();//creating a frame
            frame.setTitle("Report Card");//sets title of frame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exits out of application
            frame.setResizable(false);//prevent frame from being resized
            frame.setSize(1000,900);//sets x-dimensions, y-dimensions of frame



            ImageIcon icon = new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\myJavaproject\\src\\CourseManagementSystem\\HeraldLogo.jpg");//creating an ImageIcon
            frame.setIconImage(icon.getImage());//changing icon of the frame
            frame.getContentPane().setBackground(Color.white);//changing Background colour
        }


        public void actionPerformed(ActionEvent e) {
            //makes the JButton listen to the events
            if (e.getActionCommand()== Submit.getActionCommand()) {
                try{
                    /**creating a text file named ReportCard.txt
                     * writing in the file
                     * true= appends (adds new data everytime)
                    */
                    fileWriter = new FileWriter("ReportCard.txt",true);
                    fileWriter.write("\n"+"Name"+":"+textField1.getText()+"\n");
                    fileWriter.write("Course"+":"+textField2.getText()+"\n");
                    fileWriter.write("Student ID"+":"+textField3.getText()+"\n");
                    fileWriter.write(moduleField1.getText()+":"+textField4.getText()+"="+gradeField1.getText()+"\n");
                    fileWriter.write(moduleField2.getText()+":"+textField5.getText()+"="+gradeField2.getText()+"\n");
                    fileWriter.write(moduleField3.getText()+":"+textField6.getText()+"="+gradeField3.getText()+"\n");
                    fileWriter.write(moduleField4.getText()+":"+textField7.getText()+"="+gradeField4.getText()+"\n");
                    fileWriter.write(moduleField5.getText()+":"+textField8.getText()+"="+gradeField5.getText()+"\n");
                    fileWriter.write(moduleField6.getText()+":"+textField9.getText()+"="+gradeField6.getText()+"\n");
                    fileWriter.write(moduleField7.getText()+":"+textField10.getText()+"="+gradeField7.getText()+"\n");
                    fileWriter.write(moduleField8.getText()+":"+textField11.getText()+"="+gradeField8.getText()+"\n");
                    fileWriter.close();
                    //opens a dialog box after the file is created successfully and click on to ok button
                    JOptionPane.showMessageDialog(null,"File Written Successfully");
                    /**
                     * displaying the input data in the JArea */
                String Name = textField1.getText();
                String Course = textField2.getText();
                String StudentID = textField3.getText();
                String Sub1 = textField4.getText();
                String subNam1=moduleField1.getText();
                String grade1=gradeField1.getText();
                String Sub2 = textField5.getText();
                String subNam2=moduleField2.getText();
                String grade2=gradeField2.getText();
                String Sub3 = textField6.getText();
                String subName3=moduleField3.getText();
                String grade3=gradeField3.getText();
                String Sub4 = textField7.getText();
                String subNam4=moduleField4.getText();
                String grade4=gradeField4.getText();
                String Sub5 = textField8.getText();
                String subNam5=moduleField5.getText();
                String grade5=gradeField5.getText();
                String Sub6 = textField9.getText();
                String subNam6=moduleField6.getText();
                String grade6=gradeField6.getText();
                String Sub7 = textField10.getText();
                String subNam7=moduleField7.getText();
                String grade7=gradeField7.getText();
                String Sub8 = textField11.getText();
                String subNam8=moduleField8.getText();
                String grade8=gradeField8.getText();
                String Result = "Passed";
                /**
                 * select passed and graduated if a student has 40 marks atLeast in every modules with grade C
                 * select Failed and not graduated if a student has less than 40 marks in any of the modules with grade D*/
                //helps you select failed if the student is failed
                if (Fail.isSelected()) {
                    Result = "Failed";
                }//if student passed and graduated this message gets displayed
                String Remark = "Congratulations!! You have graduated.Keep doing better:)";
                if (NotGraduated.isSelected()) /*if not graduated is selected this message gets displayed */{
                    Remark = "You have failed subject as you have scored below 40. Sorry to say you haven't graduated" +"\n"
                           + " You have to appear for the reset examination.";
                }
                //printing the data in a meaning full manner
                    screen.setText("Name : " + Name + "\n" + "Course: " + Course + "\n" + "Student ID :" + StudentID + "\n"
                            + subNam1+":" + Sub1+"="+grade1+"\n" + subNam2+":" + Sub2 +"="+grade2+"\n" +  subName3+":" +Sub3
                            +"="+grade3+"\n" + subNam4+":" + Sub4 +"="+grade4+ "\n" + subNam5+":" + Sub5 +"="+grade5+ "\n" +
                            subNam6+":"+ Sub6 +"="+grade6+ "\n" + subNam7+":" + Sub7+"="+grade7 + "\n" +subNam8+ ":" + Sub8
                            +"="+grade8+ "\n" + "Result :" + Result + "\n" + "Remark:" + Remark);

            }catch (Exception ae){
                    JOptionPane.showMessageDialog(null,ae+"Error in finding file");
                }
            }
        }
    }
