package matrixcalc.ui;

import matrixcalc.domain.Addition;
import matrixcalc.domain.Multiplication;
import matrixcalc.domain.Substraction;
import matrixcalc.io.MatrixScanner;
import matrixcalc.test.Test;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.DefaultXYDataset;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * Basically done with help of https://netbeans.org/kb/docs/java/quickstart-gui.html and Netbeans GUI builder.
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MatrixA = new javax.swing.JTextField();
        MatrixB = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Substract = new javax.swing.JButton();
        Multiply = new javax.swing.JButton();
        Determinant = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        multiplyTest = new javax.swing.JButton();
        javax.swing.JButton determinantTest = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        multiplyTestSize = new java.awt.Choice();
        determinantOut = new javax.swing.JTextField();
        determinantTestSize = new java.awt.Choice();
        jScrollPane1 = new javax.swing.JScrollPane();
        howTo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        consoleOut = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Matrix A");

        jLabel2.setText("Matrix B");

        MatrixA.setText("1,2,3,4");

        MatrixB.setText("3.4, 5.8, 117.3, 10");

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Substract.setText("Multiply");
        Substract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplyActionPerformed(evt);
            }
        });

        Multiply.setText("Substract");
        Multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubstractActionPerformed(evt);
            }
        });

        Determinant.setText("Determinant");
        Determinant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeterminantActionPerformed(evt);
            }
        });

        jLabel3.setText("Tests");

        multiplyTest.setText("MultiplyTest");
        multiplyTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplyTestActionPerformed(evt);
            }
        });

        determinantTest.setText("DeterminantTest");
        determinantTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeterminantTestActionPerformed(evt);
            }
        });

        jLabel4.setText("Max Size");

        howTo.setColumns(20);
        howTo.setRows(5);
        howTo.setText("1. Square matrices (double) to Matrix A and Matrix B. Row by row, delimit with \",\"\n2. Determinant uses \"Matrix A\" field\n3. Test buttons run tests with max size from menu.\n4. Can't close GUI during test runs so beware of long tests.");
        jScrollPane1.setViewportView(howTo);

        consoleOut.setColumns(20);
        consoleOut.setRows(5);
        jScrollPane2.setViewportView(consoleOut);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(MatrixB, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                                        .addComponent(MatrixA)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Determinant)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(determinantOut, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Add)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Substract)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Multiply)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(determinantTest, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(multiplyTest, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(determinantTestSize, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(multiplyTestSize, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(51, 51, 51)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(MatrixA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(MatrixB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Add)
                                .addComponent(Substract)
                                .addComponent(Multiply))
                            .addComponent(multiplyTestSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Determinant)
                            .addComponent(determinantTestSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(multiplyTest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(determinantOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(determinantTest))
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        multiplyTestSize.add("2^1");
        multiplyTestSize.add("2^2");
        multiplyTestSize.add("2^3");
        multiplyTestSize.add("2^4");
        multiplyTestSize.add("2^5");
        multiplyTestSize.add("2^6");
        multiplyTestSize.add("2^7");
        multiplyTestSize.add("2^8");
        multiplyTestSize.add("2^9");
        multiplyTestSize.add("2^10");
        multiplyTestSize.add("2^11");
        multiplyTestSize.add("2^12");
        multiplyTestSize.add("2^13");
        multiplyTestSize.add("2^14");
        multiplyTestSize.add("2^15");
        multiplyTestSize.getAccessibleContext().setAccessibleName("");
        multiplyTestSize.getAccessibleContext().setAccessibleDescription("");
        determinantTestSize.getAccessibleContext().setAccessibleName("");
        determinantTestSize.add("100");
        determinantTestSize.add("200");
        determinantTestSize.add("300");
        determinantTestSize.add("400");
        determinantTestSize.add("500");
        determinantTestSize.add("600");
        determinantTestSize.add("700");
        determinantTestSize.add("800");
        determinantTestSize.add("900");
        determinantTestSize.add("1000");
        determinantTestSize.add("1100");
        determinantTestSize.add("1200");
        determinantTestSize.add("1300");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Does an addition from user input
     */
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        consoleOut.setText(consoleOut.getText()+"ADDITION:\n");
        double[][] a = MatrixScanner.buildMatrixFromGUI(MatrixA.getText());
        double[][] b = MatrixScanner.buildMatrixFromGUI(MatrixB.getText());
        double[][] added = Addition.add(a, b);
        produceTable(added);
    }//GEN-LAST:event_AddActionPerformed
    
    /**
     * Does a substraction from user input
     */
    private void SubstractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubstractActionPerformed
        consoleOut.setText(consoleOut.getText()+"SUBSTRACTION:\n");
        double[][] a = MatrixScanner.buildMatrixFromGUI(MatrixA.getText());
        double[][] b = MatrixScanner.buildMatrixFromGUI(MatrixB.getText());
        double[][] substracted = Substraction.substract(a, b);
        produceTable(substracted);
    }//GEN-LAST:event_SubstractActionPerformed
    
    /**
     * Calculates a determinant from user input
     */
    private void DeterminantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeterminantActionPerformed
        consoleOut.setText(consoleOut.getText()+"Determinant:\n");
        double[][] a = MatrixScanner.buildMatrixFromGUI(MatrixA.getText());
        double determinant = matrixcalc.domain.Determinant.determinant(a);
        determinantOut.setText(Double.toString(determinant));
        System.out.println(determinant);
    }//GEN-LAST:event_DeterminantActionPerformed
    
    /**
     * Does a multiplication from user input
     */
    private void MultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplyActionPerformed
        consoleOut.setText(consoleOut.getText()+"MULTIPLICATION:\n");
        double[][] a = MatrixScanner.buildMatrixFromGUI(MatrixA.getText());
        double[][] b = MatrixScanner.buildMatrixFromGUI(MatrixB.getText());
        double[][] multiplied = Multiplication.multiply(a, b);
        produceTable(multiplied);
    }//GEN-LAST:event_MultiplyActionPerformed
    
    /**
     * Runs a multiplication test
     */
    private void MultiplyTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplyTestActionPerformed
        String testSize = multiplyTestSize.getSelectedItem();
        int maxSize = Integer.parseInt(testSize.substring(2));
        
        int runs = 10;
        int powerOfTwo = 1;
        
        double[][] results = new double[2][maxSize+1];
        
        consoleOut.setText(consoleOut.getText()+"MULTIPLICATION SPEED TESTS:\n");
        for(int i = 0; i<=maxSize; i++){
            results[0][i] = powerOfTwo;
            results[1][i] = Test.testMultiplicationSpeed(powerOfTwo, runs);
            consoleOut.setText(consoleOut.getText()+"Running time: " + results[1][i] + "ms. "+"with size of "+results[0][i]+"\n");
            powerOfTwo *= 2;
        }
        produceChart("Multiply", results);
    }//GEN-LAST:event_MultiplyTestActionPerformed
    
    /**
     * Runs a determinant test
     */
    private void DeterminantTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeterminantTestActionPerformed
        String testSize = determinantTestSize.getSelectedItem();
        int maxSize = 0;
        if(testSize.length()==3){
            maxSize = Integer.parseInt(testSize.substring(0,1));
        }else{
            maxSize = Integer.parseInt(testSize.substring(0,2));
        }
        
        int runsPerTest = 10;
        int size = 0;
        
        double[][] results = new double[2][maxSize+1];
        
        consoleOut.setText(consoleOut.getText()+"DETERMINANT SPEED TESTS:\n");
        for(int i = 0; i<=maxSize; i++){
            results[0][i] = size;
            results[1][i] = Test.testDeterminantSpeed(size, runsPerTest);
            consoleOut.setText(consoleOut.getText()+"Running time: " + results[1][i] + "ms. "+"with size of "+results[0][i]+"\n");
            size +=100;
        }
        produceChart("Determinant",results);
    }//GEN-LAST:event_DeterminantTestActionPerformed
    
    /**
     * Takes data name and data to produce a chart
     * @param name Name for data
     * @param results Results from tests, to be plotted
     */
    private void produceChart(String name, double[][] results){
        DefaultXYDataset ds = new DefaultXYDataset();
        ds.addSeries(name, results);
        JFreeChart chart = ChartFactory.createXYLineChart("Test Chart",
                "x", "y", ds, PlotOrientation.VERTICAL, true, true,
                false);
        ChartPanel cp = new ChartPanel(chart);
        
        JFrame frame = new JFrame("Charts");

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        
        frame.getContentPane().add(cp);
    }
    
    /**
     * Produces a table to display operation results
     * @param A Data to build table from
     */
    private void produceTable(double[][] A){
        Object[][] B = new Object [A.length][A.length];
        
        String[] columnNames = new String[A.length];
        
        for(int i = 0; i<A.length; i++){
            columnNames[i] = "";
            for(int j = 0; j<A.length; j++){
                B[i][j] = Double.toString(A[i][j]);
            }
        }
        
        JTable jTable1 = new javax.swing.JTable();
        jTable1.setModel(new javax.swing.table.DefaultTableModel(B, columnNames));
        
        JScrollPane scrollPane = new JScrollPane(jTable1);
        jTable1.setFillsViewportHeight(true);
            
        JFrame frame = new JFrame("Charts");
        
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        
        frame.getContentPane().add(scrollPane);    
    }
    
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Determinant;
    private javax.swing.JTextField MatrixA;
    private javax.swing.JTextField MatrixB;
    private javax.swing.JButton Multiply;
    private javax.swing.JButton Substract;
    private javax.swing.JTextArea consoleOut;
    private javax.swing.JTextField determinantOut;
    private java.awt.Choice determinantTestSize;
    private javax.swing.JTextArea howTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton multiplyTest;
    private java.awt.Choice multiplyTestSize;
    // End of variables declaration//GEN-END:variables
}
