
package familybudget;






import java.lang.ArrayIndexOutOfBoundsException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel; 


public class DB extends javax.swing.JFrame 
{   

  
   private Connection con;
   private  Statement s;
   private  ResultSet rs;
   private  ResultSetMetaData rsmd;
   private static Object[][] ob;
   private static Object[] header;
  
   
    public DB() 
    {
      initComponents();
    }

   

 
   
   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addData = new javax.swing.JButton();
        show = new javax.swing.JButton();
        disconnect = new javax.swing.JButton();
        dbBudget = new javax.swing.JTextField();
        dbActual = new javax.swing.JTextField();
        dbResult = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dbMonth = new javax.swing.JTextField();
        monthLabel = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        testCon = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        connection = new javax.swing.JButton();
        backToBudgetSelections = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        addData.setText("Add Data");
        addData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDataActionPerformed(evt);
            }
        });

        show.setText("Show Data");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        disconnect.setText("Disconnect");
        disconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnectActionPerformed(evt);
            }
        });

        jLabel1.setText("Budget");

        jLabel2.setText("Actual");

        jLabel3.setText("Result");

        monthLabel.setText("Month");

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        testCon.setText("Test Connection");
        testCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testConActionPerformed(evt);
            }
        });

        jLabel4.setText("Enter Month Number");

        connection.setText("Connect");
        connection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectionActionPerformed(evt);
            }
        });

        backToBudgetSelections.setText("Budget Selections");
        backToBudgetSelections.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToBudgetSelectionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(connection, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disconnect, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(testCon, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addData, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(backToBudgetSelections, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dbBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dbResult, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dbActual, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(monthLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dbBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dbActual, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dbResult, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testCon, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(connection, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(disconnect, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addData, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(backToBudgetSelections, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void disconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnectActionPerformed
        disconnect();
    }//GEN-LAST:event_disconnectActionPerformed

    private void addDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDataActionPerformed

       
           addData(con);
       
         
    }//GEN-LAST:event_addDataActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed

    
  getData();
    
    }//GEN-LAST:event_showActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        delete();
    }//GEN-LAST:event_deleteActionPerformed

    private void testConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testConActionPerformed
       testCon(con);
       testRS(rs);
    }//GEN-LAST:event_testConActionPerformed

    private void connectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectionActionPerformed
      conn();
    }//GEN-LAST:event_connectionActionPerformed

    private void backToBudgetSelectionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToBudgetSelectionsActionPerformed
       if(con != null)
       {
           this.disconnect();
           this.testCon(con);
       }
       FamilyBudget fb = new FamilyBudget();
       fb.setContentPane(new Selections());
       fb.setVisible(true);
       
       this.dispose();
       
    }//GEN-LAST:event_backToBudgetSelectionsActionPerformed
  
   
         private Connection conn() 
         {
           
                    String url = "jdbc:derby:Budget";
                    String user = null;
                    String password = null;
            
                    try 
                    {
                        con = DriverManager.getConnection(url,user,password);
                        //s = con.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_SENSITIVE);
                        // create table s.execute("Create TABLE Phone(ID  Integer, Months Varchar(20),Budget Double,Actual Double,Result Double, Primary Key(ID) )");
                        //rs = s.executeQuery("Select * From Phone");
                       // System.out.println("Open");
                       JOptionPane.showMessageDialog(this, "The connection  is open");
                 
                    }
           
                    catch(SQLException ex)
                    {
                        String e = "No suitable driver found for jdbc:derby:Budget";
                        if(ex.getMessage().equals(e))
                        {
                            try
                            {      
                               Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
                               con = DriverManager.getConnection(url,user,password);
                              
                                 JOptionPane.showMessageDialog(this, "The connection  is open");
                            }
                            
                            catch (InstantiationException ex1) 
                            {
                               System.out.println(ex1.getMessage());

                            }
                            catch (IllegalAccessException ex1)
                            {
                                System.out.println(ex1.getMessage());
                            }
                            catch (ClassNotFoundException ex1)
                            {
                                System.out.println(ex1.getMessage());
                            } 
                            catch (SQLException ex1) 
                            {
                                System.out.println("NOT HAPPY HERE");
                                System.out.println(ex1.getMessage());
                            }
                         return null; 
                        }
                       
                     } 
                     
                
        return con;
         
        }
//*************************************************************************************************************************************************
        
   
   private boolean disconnect() 
   {
       String url = "jdbc:derby:;shutdown=true";
       String user = null;
            String password = null;
      try
      {
       con = DriverManager.getConnection(url,user,password);
       JOptionPane.showMessageDialog(this, "The connection is closed");
      }
      catch(SQLException e)
      {
         System.out.println(e.getMessage());
         return false;
      }
      return true;
    } 
 
 //*****************************************************************************************************************************************************
 
   private void addData(Connection con)
   {
     this.con = con;
        try
        {   
           
            s = con.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_SENSITIVE);
            rs = s.executeQuery("Select * From Phone");
          
             while(rs.next())
             {
                if(id.getText().length() == 0)

                {
                   JOptionPane.showMessageDialog(null,"Enter a month");
                   dbMonth.requestFocusInWindow();
                   break;
                }
                else if(Integer.parseInt(id.getText()) > 12)
                {
                     JOptionPane.showMessageDialog(null,"Enter a number that corresponds to the month you want to budget ");
                   id.requestFocusInWindow();
                   break;
                }
                else if(rs.getInt("ID") == Integer.parseInt(id.getText()))   
                {  
                    rs.updateString("Months", dbMonth.getText());
                    rs.updateDouble("Budget", Double.parseDouble(dbBudget.getText()));
                    rs.updateDouble("Actual", Double.parseDouble(dbActual.getText()));                                                
                    rs.updateDouble("Result", Double.parseDouble(dbResult.getText()));
                    rs.updateRow();
                }
              }
             
         
//************************************************************************************************************************************************
//                                          Use to fill primary key column in table phone
               
//                for(int i =1; i <= 12; i++)
//                {    
//                     rs.moveToInsertRow();
//                     rs.updateInt("ID", i);
//                     rs.insertRow();  
//                    
//                   }
//            
 //****************************************************************************************************************************************************         
        }//end try block
        catch (SQLException ex)
        { 
         
         ex.getMessage();
         System.out.println(  ex.getMessage());
        }
        catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
//        finally
//        {
//           try {
//               s.close();
//               con.close();
//           }
//           catch (SQLException ex) {
//               System.out.println(ex.getMessage());
//           }
//        }
       
   }
   


 //***************************************************************************************************************************************************
 
   
    
 //***************************************************************************************************************************************************  
   
    private  class DataModel extends AbstractTableModel
    {   
         
       
         private DataModel()
         {
                
         }
         
       
         int r = 1;        
         int columns;
       
      private Object[][] fetchData()
      {
           try
           { 
                
                s = con.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_SENSITIVE);
                rs = s.executeQuery("Select * FROM Phone"); 
                    
                rsmd = rs.getMetaData(); 
                header = new Object[]{rsmd.getColumnName(1),rsmd.getColumnName(2),rsmd.getColumnName(3),rsmd.getColumnName(4),rsmd.getColumnName(5)};
          
                 columns = rsmd.getColumnCount();
                 
                System.out.println(columns);
                 
                
             
            
              
                  int row = 0;
                    int i = 0;
                 ob = new Object[12][columns];
                 System.out.println(ob.length);
                  while(rs.next())
                  {  
                      row++;
                      for(i = 1; i <= columns; i++)  
                      {   
                          ob[row-1][i-1] = rs.getObject(i);
                          System.out.print(ob[row-1][i-1]);
                      }
                      System.out.println();
                   }
           }//end try block 
           catch(SQLException ex)
           {
              System.out.print(ex.getMessage());
               
    
           }
           catch(ArrayIndexOutOfBoundsException a)
           {
               System.out.print(a.getMessage());
               a.printStackTrace();
            
           }
           catch(NullPointerException npe)
           {
               System.out.print(npe.getMessage());
                npe.printStackTrace();
                 
           }
            catch(Exception e)
           {
               System.out.println(e.getMessage());
                
           }
       return ob;   
      }
         @Override
         public boolean isCellEditable(int row, int col)
         {
             return false;
         }
         @Override
         public int getRowCount()
         {
            
             return ob.length; 
         }
        @Override
        public int getColumnCount() 
        {  
           try
           { 
                
                s = con.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_SENSITIVE);
                rs = s.executeQuery("Select * FROM Phone"); 
                    
                rsmd = rs.getMetaData(); 
                header = new Object[]{rsmd.getColumnName(1),rsmd.getColumnName(2),rsmd.getColumnName(3),rsmd.getColumnName(4),rsmd.getColumnName(5)};
          
                 columns = rsmd.getColumnCount();
           }
              catch(SQLException ex)
           {
              System.out.print(ex.getMessage());
               
    
           }
           catch(ArrayIndexOutOfBoundsException a)
           {
               System.out.print(a.getMessage());
               a.printStackTrace();
                
           }
           catch(NullPointerException npe)
           {
               System.out.print(npe.getMessage());
                npe.printStackTrace();
                
           }
            catch(Exception e)
           {
               System.out.println(e.getMessage());
              
           }      
           return columns;
        }
        @Override
        public Object getValueAt(int i, int j)
        {
            
             
             
           return ob[i][j];
        }
        @Override
        public String getColumnName(int col)
        {
            return  (String) header[col];
        }
        @Override
        public void setValueAt(Object value, int rowIndex, int columnIndex) 
        {
           
        }
  
   } 
     
     
     
   private void getData() 
   {
       DB.DataModel d = new DB.DataModel();
       
       Object[][] o = d.fetchData();
       
       for(int i = 0; i < o.length; i++)
       {
           
           for(int j = 0; j < o[i].length; j++)
           {
               
               System.out.print(o[i][j]);
           }
           System.out.println();
       }
                JTable jt = new JTable(d);
                System.out.print(jt.getColumnModel());
                JScrollPane js = new JScrollPane(jt);
                JPanel jp = new JPanel();
                jp.add(js);
                JFrame jf = new JFrame();
                jf.setContentPane(jp);
                jf.setVisible(true);  
               
        
}
                 
   
        
                  

      
//********************************************************************************************************************************************       
        private void delete()
        {
                        
                try 
                {
                    s = con.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
                    rs = s.executeQuery("Select * FROM Phone");
                    int count = s.getUpdateCount();
                    if(rs.next())
                    {
                     
                       rs.deleteRow();
                      
                       
                       System.out.println("row deleted" );
                       
                    }
                    else
                    {
                        System.out.println("no more rows");
                    }
                    
                } 
                catch (SQLException ex) 
                {
                  System.out.println(ex.getMessage());
                }
        }
   
//****************************************************************************************************************************************************
       
       private boolean testCon(Connection con)
       {
           this.con = con;
       try {
                if(con.isClosed())
                {
                    System.out.println("Connection is not open");
                    return true;
                }   
                else if(!con.isClosed()) 
                {
                    System.out.println("Connection is open");
                    return false;
                }
               
           } 
           catch (SQLException ex) 
           {
            System.out.println(ex.getMessage());
              return false;
          }
          
          return true; 
       }
  
  //**************************************************************************************************************************************************
       private boolean testRS(ResultSet rs)
       {
           this.rs = rs;
            try 
            {
               if(rs.isClosed())
               {
                  System.out.println("rs is  closed"); 
               }
                else if(!rs.isClosed())
                { 
                    System.out.println("rs is not closed");
                   
                }
               return true;
            } 
            catch (SQLException ex) 
            { 
               System.out.println(ex.getMessage() + "not working ");
               
               return false;
            }
            catch(NullPointerException npe)
            {
                 System.out.println(npe.getMessage() + "not working here");
               
               return false;
            }
           
       }
  
   
   
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
        } 
        catch (ClassNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(DB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
              DB db = new DB();
             
              
              db.setVisible(true);
            
            }
        });
       
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addData;
    private javax.swing.JButton backToBudgetSelections;
    private javax.swing.JButton connection;
    protected static javax.swing.JTextField dbActual;
    protected static javax.swing.JTextField dbBudget;
    protected static javax.swing.JTextField dbMonth;
    protected static javax.swing.JTextField dbResult;
    private javax.swing.JButton delete;
    private javax.swing.JButton disconnect;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel monthLabel;
    private javax.swing.JButton show;
    private javax.swing.JButton testCon;
    // End of variables declaration//GEN-END:variables
}
