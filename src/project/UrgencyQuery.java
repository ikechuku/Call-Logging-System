package project;



import java.awt.Color;
import static java.awt.Color.black;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.layout.BackgroundPosition.CENTER;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import static project.Search.ticket_id;



public class UrgencyQuery {
      Connection con;
      ResultSet rs;
      PreparedStatement stat;
      
      static  String ticket_id, urgency, name, phone,address, product_details, complaint, email;
      static ArrayList<String> tickets =new ArrayList<String>();
      static int row_count;


    

//   class constructor

    /**
     *
     * @param ticket_id
     */
    public UrgencyQuery(String  urg) {
              try {                        
                  Class.forName("com.mysql.jdbc.Driver");
                  con = DriverManager.getConnection("jdbc:mysql:///logger", "root", "") ;                  
                  stat = con.prepareStatement("SELECT ticket_id FROM `tickets` WHERE urgency = ? ");
                  stat.setString(1,urg);
                  rs = stat.executeQuery();   
                                                                       
                 if (rs.next()){
                     
                     while(rs.next()){
                                         
                 ticket_id = rs.getString("ticket_id");
                 tickets.add(ticket_id);
                 
                     }
 
                 //alert the user that the ticket was found
                 JOptionPane.showMessageDialog(new JDialog(),"Tickets  Found \n  View Details", "Ticket Found", JOptionPane.INFORMATION_MESSAGE);
                                     
             }
                
                else{
                JOptionPane.showMessageDialog(new JDialog(),"Ticket Does Not Exist", "No Ticket Not Found", JOptionPane.INFORMATION_MESSAGE);
                }
               }  //end try
        
          catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JDialog(),"Ticket "+ ticket_id + ex, "Ticket Error", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {        
              Logger.getLogger(UrgencyQuery.class.getName()).log(Level.SEVERE, null, ex);
          }        
              
     }
    
    public void print(){
        int rows = tickets.size();
        JPanel ticketPriorityPanel = new JPanel();
           ticketPriorityPanel.setPreferredSize(new Dimension(400,200));
           ticketPriorityPanel.setLayout(new GridLayout(rows, 2,2,2));
           
        
        
       for(int i=0; i < tickets.size();i++){
           
           
          JLabel tickLabel = new JLabel(tickets.get(i),JLabel.CENTER);
          tickLabel.setBorder(BorderFactory.createLineBorder(Color.black,1));
          JButton tickButton = new JButton("view");
          tickButton.setBorder(BorderFactory.createLineBorder(Color.black, 1 ));
          ticketPriorityPanel.add(tickLabel);
          ticketPriorityPanel.add(tickButton);
          
          /// ActionPerformed for the 'View' Button
          tickButton.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e){
                           try {                        
                  Class.forName("com.mysql.jdbc.Driver");
                  con = DriverManager.getConnection("jdbc:mysql:///logger", "root", "") ;                  
                  stat = con.prepareStatement("SELECT * FROM  tickets  WHERE ticket_id =?");
                  stat.setString(1,ticket_id);
                  rs = stat.executeQuery();   
                
                 //save the details to their corresponding static variables
                 if(rs.next()){
                 ticket_id = rs.getString("ticket_id");
                 name = rs.getString("name");
                 phone = rs.getString("phone");
                 address = rs.getString("address");
                 email = rs.getString("email");
                 product_details = rs.getString("details");
                 complaint = rs.getString("complaint");
                 urgency = rs.getString("urgency");
                 
                 //alert the user that the ticket was found
                 JOptionPane.showMessageDialog(new JDialog(),"Ticket "+ ticket_id +" Found \n  View Details", "Ticket Found", JOptionPane.INFORMATION_MESSAGE);
                 
                 // Open the dialog to display the details of the ticket ID selected
                 TicketDetails t = new TicketDetails(new JDialog(), false);
                 t.setVisible(true);
                                 
                                        
             }
                //if ticket was not found
                else{
                JOptionPane.showMessageDialog(new JDialog(),"Ticket "+ ticket_id +" Does Not Exist", "Ticket Not Found", JOptionPane.INFORMATION_MESSAGE);
                }
          

          }

          catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JDialog(),"Ticket "+ ticket_id + ex, "Ticket Error", JOptionPane.ERROR_MESSAGE);
            }     catch (ClassNotFoundException ex) {   
                      Logger.getLogger(UrgencyQuery.class.getName()).log(Level.SEVERE, null, ex);
                  }   
              }
          });
          
        }
        JDialog tk = new JDialog();
        tk.setSize(400,400);
        tk.setContentPane(ticketPriorityPanel);
        tk.setVisible(true);
        tk.setModal(true);
    }
    
  
       public static void main(String args[]) {
       
      UrgencyQuery q = new UrgencyQuery("High");
      q.print();

       }   
}
