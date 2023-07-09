import java.io.BufferedReader;
import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Main_jFrame extends JFrame {
         
    // ATTRIBUTES
    
    public MyHashTable theHT;
    
    // CONSTRUCTORS
    
    //Creates new form MainJFrame
    public Main_jFrame() {
        initComponents();
        
        theHT = new MyHashTable(10); // initializes an instance of the hash table in which employees are stored       
    }
    
    
    // METHODS   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(693, 632));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton2.setText("Display all employees");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayPressed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton3.setText("Add an employee");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPressed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton5.setText("Save employees to text file");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePressed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton6.setText("Load employees from text file");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel1.setText("AASHA EMPLOYEE MANAGEMENT SYSTEM");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton1.setText("Remove an employee");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePressed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton4.setText("Get an employee's info");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPressed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton7.setText("Edit an employee's info");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /* Triggered when the "Display" button is pressed. If there are employees in the hash table, an instance of the 
       display JFrame is opened. If there aren't employees, a popup explaining this to the user is shown. */
    private void displayPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayPressed
        // TODO add your handling code here:
        // Display employees
        
        if (theHT.totalEmployeeCount > 0) {
            
            DisplayAllEmps_jFrame theDAEJFrame = new DisplayAllEmps_jFrame();
            theDAEJFrame.setTitle("Display Employees!");
            theDAEJFrame.setVisible(true);
            theDAEJFrame.setMainHT(theHT);  // Have theSeparateJFrame mainHT point to the real HT.
        }
        
        else {
            
            JOptionPane.showMessageDialog(this, "There are currently no employees in the"
            + " system, so this function cannot be performed.", "No Employees!", JOptionPane.
            WARNING_MESSAGE);
        }
    }//GEN-LAST:event_displayPressed

    //Triggered when the "Add" button is pressed. An instance of the add jFrame is opened.
    private void addPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPressed
        // TODO add your handling code here:
        // Add an employee
        
        AddNewEmployee_jFrame theANEJFrame = new AddNewEmployee_jFrame();
        theANEJFrame.setTitle("Add An Employee");
        theANEJFrame.setVisible(true);
        theANEJFrame.setMainHT(theHT);
    }//GEN-LAST:event_addPressed

    //Triggered when the "Save" button is pressed. Opens a file-chooser that allows the user to save the employees in the system.
    private void savePressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePressed
        // TODO add your handling code here:
        // Save employees to text file
        
        // Here, I need code that walks through the entire hash table
        // and writes the attribute values for each employee to a
        // text file (by using say buffered writer).

        int empCount = theHT.totalEmployeeCount;
        
        if (empCount > 0) {
        
            BufferedWriter bw = null;

            JFileChooser fileChooser = new JFileChooser("C:\\Users\\arjun\\OneDrive\\Desktop");
            fileChooser.setFileFilter(new FileNameExtensionFilter("*.txt", "txt"));

            int fileChosen = fileChooser.showSaveDialog(null);

            if (fileChosen == JFileChooser.APPROVE_OPTION) {

                String file_path = fileChooser.getSelectedFile().getAbsolutePath();

                try {

                    if (!file_path.contains(".txt")) {
                        file_path = fileChooser.getSelectedFile().getAbsolutePath() + ".txt";
                    }

                    File file = new File(file_path);
                    file.createNewFile();

                    FileWriter fw = new FileWriter(file);
                    bw = new BufferedWriter(fw);

                    for (int i = 0; i < 10; i++) {

                        for (int j = 0; j < theHT.buckets[i].size(); j++) {

                            EmployeeInfo currentEmp = theHT.buckets[i].get(j);

                            if (currentEmp instanceof PTE) {

                                PTE PTEmp = (PTE) currentEmp;

                                bw.write("Part-Time " + PTEmp.firstName + " " + PTEmp.lastName +
                                " " + (PTEmp.empNum) + " " + (PTEmp.deductRate) + " " +
                                (PTEmp.hourlyWage) + " " + (PTEmp.hoursPerWeek) + " " +
                                (PTEmp.weeksPerYear));
                                bw.newLine();
                            }

                            else {

                                FTE FTEmp = (FTE) currentEmp;

                                bw.write("Full-Time " + FTEmp.firstName + " " + FTEmp.lastName
                                + " " + (FTEmp.empNum) + " " + (FTEmp.deductRate) 
                                + " " + (FTEmp.yearlySalary));
                                bw.newLine();
                            }
                        }
                    }
                } 

                catch (IOException ioe) {

                    JOptionPane.showMessageDialog(this, "There are issues with"
                    + " saving a text file with your info right now.!", "Technical Difficulties!",
                    JOptionPane.WARNING_MESSAGE);
                }

                finally {

                    try {
                        bw.close();
                    } 

                    catch (IOException ex) {
                        Logger.getLogger(Main_jFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        
        else {
            
            JOptionPane.showMessageDialog(this, "There are currently no employees in the"
            + " system, so this function cannot be performed.", "No Employees!", JOptionPane.
            WARNING_MESSAGE);
        }
    }//GEN-LAST:event_savePressed

    //Triggered when the "Load" button is pressed. Opens a file-chooser that allows the user to load employees into the system.
    private void loadPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadPressed
        // TODO add your handling code here:
        // Load employees from text file
        
        // Here, I need code that reads the attribute values for the employee
        // data stored in a text file (by say using buffered reader) and adding
        // each of those employees to the hash table.

        JFileChooser fileChooser = new JFileChooser("C:\\Users\\arjun\\OneDrive\\Desktop");
        fileChooser.setFileFilter(new FileNameExtensionFilter("*.txt", "txt"));
        BufferedReader br;
        int ctr = 0;

        int fileChosen = fileChooser.showOpenDialog(null);

        if (fileChosen == JFileChooser.APPROVE_OPTION) {

            String file_path = fileChooser.getSelectedFile().getAbsolutePath();

            try {

                File file = new File(file_path);
                file.createNewFile();

                FileReader fr = new FileReader(file);
                br = new BufferedReader(fr);
                
                while (true) {
                    
                    ctr = 0;
                    
                    try {
                        
                        String currentLine = br.readLine();

                        if (currentLine != null) {
                            String[] empInfo = currentLine.split(" ");

                            String firstName = empInfo[1];
                            String lastName = empInfo[2];
                            int empNum = Integer.parseInt(empInfo[3]);
                            int targetBucket = theHT.calcBucket(empNum);
                            
                            for (int i = 0; i < theHT.buckets[targetBucket].size(); i++) {
                                if (theHT.buckets[targetBucket].get(i).empNum == empNum) {
                                    ctr++;
                                    break;
                                }
                            }
                            
                            if (ctr > 0) {
                                
                                continue;
                            }
                            
                            double deductionRate = Double.parseDouble(empInfo[4]);

                            if (empInfo[0].equals("Part-Time")) {

                                double hourlyWage = Double.parseDouble(empInfo[5]);
                                double hoursPerWeek = Double.parseDouble(empInfo[6]);
                                double weeksPerYear = Double.parseDouble(empInfo[7]);

                                PTE thePTE = new PTE(empNum, firstName, lastName,
                                deductionRate, hourlyWage, hoursPerWeek, weeksPerYear);
                                theHT.addEmployee(thePTE);
                            } 
                            
                            else {

                                double yearlySalary = Double.parseDouble(empInfo[5]);

                                FTE theFTE = new FTE(empNum, firstName, lastName,
                                deductionRate, yearlySalary);
                                theHT.addEmployee(theFTE);
                            }
                        } 
                        
                        else {
                            break;
                        }
                        
                    }
                    
                    catch (RuntimeException e) {
                        JOptionPane.showMessageDialog(this, "Your text file is not formatted"
                        + " correctly. Please correct it.", "Invalid Input Format!",
                        JOptionPane.WARNING_MESSAGE);
                        break;
                    }
                }
                
                br.close();

            } catch (IOException ioe) {
                JOptionPane.showMessageDialog(this, "There was a problem with"
                + " opening your file. Please make sure you chose the right one.", 
                "File Not Opened!",JOptionPane.WARNING_MESSAGE);
            }
        }
        
        if (ctr > 0) {
            JOptionPane.showMessageDialog(this, "At least one of the employees"
            + " in your text file already exist in the system!.", "Duplicate!",
            JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_loadPressed

    /* Triggered when the "Remove" button is pressed. If there are employees in the hash table, an instance of the 
       remove JFrame is opened. If there aren't employees, a popup explaining this to the user is shown. */
    private void removePressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePressed
        // TODO add your handling code here:
        // Remove an employee
        
        if (theHT.totalEmployeeCount > 0) {
            
            RemoveAnEmployee_jFrame theRAEJFrame = new RemoveAnEmployee_jFrame();
            theRAEJFrame.setTitle("Remove An Employee");
            theRAEJFrame.setVisible(true);
            theRAEJFrame.setMainHT(theHT);
        }
        
        else {
            
            JOptionPane.showMessageDialog(this, "There are currently no employees in the"
            + " system, so this function cannot be performed.", "No Employees!", JOptionPane.
            WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_removePressed

    /* Triggered when the "Remove" button is pressed. If there are employees in the hash table, an instance of the 
       remove JFrame is opened. If there aren't employees, a popup explaining this to the user is shown. */
    private void getPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPressed
        // TODO add your handling code here:
        // Get an employee's info
        
        if (theHT.totalEmployeeCount > 0) {
            
            GetEmployeeInfo_jFrame theGEIJFrame = new GetEmployeeInfo_jFrame();
            theGEIJFrame.setTitle("Get Employee Info");
            theGEIJFrame.setVisible(true);
            theGEIJFrame.setMainHT(theHT);
        }
        
        else {
            
            JOptionPane.showMessageDialog(this, "There are currently no employees in the"
            + " system, so this function cannot be performed.", "No Employees!", JOptionPane.
            WARNING_MESSAGE);
        }
    }//GEN-LAST:event_getPressed

    /* Triggered when the "Edit" button is pressed. If there are employees in the hash table, an instance of the 
       edit JFrame is opened. If there aren't employees, a popup explaining this to the user is shown. */
    private void editPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPressed
        // TODO add your handling code here:
        // Edit an employee's info
        
        if (theHT.totalEmployeeCount > 0) {
            
            EditEmployeeInfo_jFrame theEEIJFrame = new EditEmployeeInfo_jFrame();
            theEEIJFrame.setTitle("Edit Employee Info");
            theEEIJFrame.setVisible(true);
            theEEIJFrame.setMainHT(theHT);
        }
        
        else {
            
            JOptionPane.showMessageDialog(this, "There are currently no employees in the"
            + " system, so this function cannot be performed.", "No Employees!", JOptionPane.
            WARNING_MESSAGE);
        }
    }//GEN-LAST:event_editPressed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_jFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}