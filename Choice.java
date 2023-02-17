package OnlineBankMagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.sun.javafx.property.adapter.PropertyDescriptor.Listener;
import com.sun.javafx.scene.control.SelectedCellsMap;

public class Choice extends JFrame
{
 	JFrame f;
 	JButton jb;
 	JLabel jl;
 	JComboBox cb;
 
 	public static void main(String[] args) 
	{
 		
 		SwingUtilities.invokeLater(new Runnable()
 				{
 			
 			        public void run()
 			        {
 			        	
 			        	try
 			        	{
 			        		
 			        		Choice c=new Choice();
 			        		c.Choice();
 			        		
 			        	}
 			        	
 			        	catch(Exception e)
 			        	{
 			        		
 			        		e.printStackTrace();
 			        		
 			        	}
 			        	
 			        }
 			
 				}
 				
 				);
						  
	}
	
	public void Choice()
 	{
 		
 		f=new JFrame("Online Banking");
 		
 		f.setResizable(!true);
 		
 		
 	    jl=new JLabel("Select your Bank");
 		jl.setBounds(300, 150, 300, 40);
 		f.add(jl);
 		Font cf=new Font("", Font.BOLD, 25); 
 		jl.setForeground(Color.black);
 		jl.setFont(cf);
 		
 		jb=new JButton("Ok");
 		jb.setBounds(800, 300, 70, 40);
 		f.add(jb);
 		
 		Font cf1=new Font("", Font.BOLD, 25); 
 		jb.setForeground(Color.WHITE);
 		jb.setBackground(Color.BLACK);
 		jb.setFont(cf1);
 		
 		String bank[]= {"State_Bank_of_India", "Punjab_National_Bank", "Housing_Development_Finance_"
 				+ "Corporation_Limited", "Oriental_Bank_of_Commerce", "Allahabad_Bank"};
 		
 	    JComboBox cb=new JComboBox(bank);
 		cb.setSelectedIndex(0);
 		
 		cb.setBounds(600, 150, 500, 40);
 		
 		JScrollPane sp=new JScrollPane(cb);
 		
 		
 		f.add(cb);
 		Font cf2=new Font("", Font.BOLD, 25); 
 		cb.setForeground(Color.black);
 		cb.setFont(cf2);
 		
 		JPanel pn=new JPanel();
	    pn.setBorder(new TitledBorder(new LineBorder(new Color(250, 128, 114), 2), "Bank-Name", 
	    		TitledBorder.LEADING,  TitledBorder.TOP, null, new Color(220, 20, 60)));
	    pn.setBounds(50, 50, 1400, 680);
	    pn.setBackground(Color.WHITE);
	    f.add(pn);

 		
 		f.setLayout(null);
 		
 		f.setBounds(100, 50, 1500, 800);
 		
 		f.setVisible(true);
 		
 	    f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
 	 
 	    jb.addActionListener(new ActionListener()
 	    		{

					
					public void actionPerformed(ActionEvent ae) 
					{
					
						if(ae.getSource()==jb)
						{
						
						Object ob=cb.getSelectedItem();
						if(ob.toString().equals("State_Bank_of_India"))
						
						{
							
							SBI s=new SBI();
							s.SBI();
							f.dispose();
							
						}
					
						else if(ob.toString().equals("Punjab_National_Bank"))
						{
							
							PNB p=new PNB();
							p.PNB();
							f.dispose();
							
						}
					
						else if(ob.toString().equals("Housing_Development_Finance_Corporation_Limited"))
						{
							
							HDFC h =new HDFC();
							h.HDFC();
							f.dispose();
							
						}
						
						else if(ob.toString().equals("Oriental_Bank_of_Commerce"))
						{
							
							OBC o=new OBC();
							o.OBC();
							f.dispose();
							
						}

				     	else
						{
							
							AB a=new AB();
							a.AB();
							f.dispose();
							
						}
				
					}
 	    	
 	    		}
 	    		
 	    		}
 	    		
 	    		);
 	    
 	}
	
		
}
