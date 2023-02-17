package OnlineBankMagementSystem;

import java.awt.Choice;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class OBC extends JFrame
{
	
    public static void main(String[] args) 
    {
    	
 //   	SwingUtilities.invokeLater(new Runnable() 
  //  	{
			
//			public void run() 
//			{
				
//				OBC o=new OBC();
//				o.OBC();
				
//			}
//		}
    	
  //  			);
    	
    	
    	try
    	{
    	
    		Class.forName("com.mysql.jdbc.Driver");
    	    
    		Connection co=DriverManager.getConnection
    				("jdbc:mysql://localhost:3306/banks", "root", "1234");
    		
    		Statement st=co.createStatement();
    		
    //		st.executeUpdate("create table obc(Account_No int(10) auto_increment, "
    //				+ "Name varchar(30)not null, Email_ID varchar(20)not null, "
    //				+ "Address varchar(50)not null, "
    //				+ "Mobile_No varchar(10)not null, Amount numeric(10)not null, "
    //				+ "primary key(Account_No), unique key(Name, Email_ID, Mobile_No))");
    		
    //		st.executeUpdate("alter table obc auto_increment=1110000001");
    		
   // 		st.executeUpdate("alter table obc add constraint check_Amount check(Amount>=500)");
    		
    //		System.out.println("alter");
    		
    //		st.executeUpdate("insert into obc(Name, Email_ID, Address, Mobile_No, "
    //				+ "Amount) values('Amit Sharma', 'amit@gmail.com', "
    //				+ "'Delhi', '9068658766', '2000')");
    		
    //		st.executeUpdate("insert into obc(Name, Email_ID, Address, Mobile_No, " 
    //				+ "Amount) values('Deepika Singh', 'deepu@gmail.com', "
    //				+ "'Meerut', '9068659875', '5000')");
    		
    //		st.executeUpdate("insert into obc(Name, Email_ID, Address, Mobile_No, " 
    //	            + "Amount) values('Ranvir', 'ranvir@gmail.com', "
    //				+ "'Mumbai', '9068652376', '10000')");
    		
    //		st.executeUpdate("insert into obc(Name, Email_ID, Address, Mobile_No, " 
    //				+ "Amount) values('Shalini', 'shalu@gmail.com', "
    //				+ "'Noida', '9068654400', '50000')");
    		
    //		st.executeUpdate("insert into obc(Name, Email_ID, Address, Mobile_No, "
    //				+ "Amount) values('Mamta', 'mamta@gmail.com', "
    //				+ "'Faridabad', '9068658756', '25000')");
    		
    		st.close();
    		
    		System.out.println("Data Inserted");
    		
    	}
    	catch(Exception e)
    	{
    		
    		System.out.println(e);
    		
    	}
    	
    	
		
	}

	 JFrame ba;

	 JLabel jl;

	 JTextField tf1, tf2, tf3, tf4, tf5;

	 JButton b1, b2, b3, b4, b5, b6, b7, b8;

	public void OBC()
	{
		
		ba=new JFrame("Oriental Bank of Commerce");
		
		ba.setResizable(!true);
		
		jl=new JLabel(" ORIENTAL BANK OF COMMERCE ");
		jl.setBounds(350, 80, 800, 70);
		ba.add(jl);
		Font fl=new Font("", Font.BOLD, 45);
		jl.setFont(fl);
				
		b1=new JButton("New Account");
		b1.setBounds(200, 250, 300, 50);
		ba.add(b1);
		Font f5 = new Font("", Font.BOLD, 30);
		b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
		b1.setFont(f5);

		b2=new JButton("Open Account");
		b2.setBounds(600, 250, 300, 50);
		ba.add(b2);
		Font f6 = new Font("", Font.BOLD, 30);
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		b2.setFont(f6);

		
		b3=new JButton("Deposit");
		b3.setBounds(1000, 250, 300, 50);
		ba.add(b3);
		Font f7 = new Font("", Font.BOLD, 30);
		b3.setForeground(Color.WHITE);
		b3.setBackground(Color.BLACK);
		b3.setFont(f7);

		b4=new JButton("Withdraw Amount");
		b4.setBounds(200, 400, 300, 50);
		ba.add(b4);
		Font f8 = new Font("", Font.BOLD, 30);
		b4.setForeground(Color.WHITE);
		b4.setBackground(Color.BLACK);
		b4.setFont(f8);

		b5=new JButton("Check Balance");
		b5.setBounds(600, 400, 300, 50);
		ba.add(b5);
		Font f9= new Font("", Font.BOLD, 30);
		b5.setForeground(Color.WHITE);
		b5.setBackground(Color.BLACK);
		b5.setFont(f9);

		
		b6=new JButton("Fund Transfer");
		b6.setBounds(1000, 400, 300, 50);
		ba.add(b6);
		Font f10 = new Font("", Font.BOLD, 30);
		b6.setForeground(Color.WHITE);
		b6.setBackground(Color.BLACK);
		b6.setFont(f10);

		
		b7=new JButton("Delete Account");
		b7.setBounds(400, 550, 300, 50);
		ba.add(b7);
		Font f11 = new Font("", Font.BOLD, 30);
		b7.setForeground(Color.WHITE);
		b7.setBackground(Color.BLACK);
		b7.setFont(f11);
       
	        
		b1.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent ae1) 
			{
				
				if(ae1.getSource()==b1)
				{
					
				    NewAccountO n=new NewAccountO();
				    n.Newo();
					
				}
			}
		}
		
				);
		b2.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent ae2) 
			{
				
				if(ae2.getSource()==b2)
				{
					
					OpenAccountO o=new OpenAccountO();
					o.openo();
					
				}
						
			}
			
		}
		
				);
		
		b3.addActionListener(new ActionListener()
		{
			
				public void actionPerformed(ActionEvent ae3) 
			    {
					
					if(ae3.getSource()==b3)
	                  {
	                	  
	                	  DepositO d=new DepositO();
	                	  d.deposito();
	                	  
	                  }

					
			    }
		}
		
				);
		
		
		b4.addActionListener(new ActionListener()
		{
			
				public void actionPerformed(ActionEvent ae4) 
				{
								
		                  if(ae4.getSource()==b4)
		                  {
		                	  
		                	  WithdrawO w=new WithdrawO();
		                	  w.withdrawo();
		                	  
		                  }
						
					}

		} 
		
				);
		
     b5.addActionListener(new ActionListener()
		
		{
			
			public void actionPerformed(ActionEvent ae5) 
			{
				
				if(ae5.getSource()==b5)
				{
					
					CheckBalanceO b=new CheckBalanceO();
					b.Balanceo();
					
				}
					
			}
		}
     
    		 );
		
		
     b6.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent ae6) 
			{
				
				if(ae6.getSource()==b6)
				{
					
					FundTransferO f=new FundTransferO();
					f.Transfero();
				}
			
			}
			
		}
     
    		 );
	
     
     b7.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent ae7) 
			{
				
				if(ae7.getSource()==b7)
				{
					
					DeleteAccountO da=new DeleteAccountO();
					da.Deleteo();
					
				}
				
			}
		}
		
				);

        ba.setBounds(100, 100, 1500, 800);
	
	    ba.setLayout(null);
		
		ba.setVisible(true);
	
		ba.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		System.out.println("End of Application");
	
	}
  
}

class NewAccountO extends JFrame implements ActionListener
{
	JFrame na;
	JLabel l, la, l1, l2, l3, l4, l5;
	JTextField tf1;
	JTextField tf2;
	JTextField tf3;
    JTextField tf4;
	JTextField tf5;
	JTextField tf6;
	JButton b;
	JButton b1;
	
	int Account_No;
	Connection co=null;
	PreparedStatement pst=null; 
	
	public void Newo()
	{
		
		na=new JFrame("Oriental Bank of Commerce");
		
		na.setResizable(!true);
		
		la=new JLabel("Create Your Account");
		la.setBounds(200, 70, 500, 70);
		na.add(la);
		Font fa = new Font("", Font.BOLD, 30);
		la.setForeground(Color.black);
		la.setFont(fa);

		
		l=new JLabel("Name");
		l.setBounds(100, 200, 200, 40);
		na.add(l);
		Font f = new Font("", Font.BOLD, 25);
		l.setForeground(Color.black);
		l.setFont(f);
		
		
		l1=new JLabel("Email_ID");
		l1.setBounds(100, 250, 200, 40);
		na.add(l1);
		Font f1 = new Font("", Font.BOLD, 25);
		l1.setForeground(Color.black);
		
     	l1.setFont(f1);
		
		l2=new JLabel("Mobile_Number");
		l2.setBounds(100, 300, 200, 40 );
	    na.add(l2);
		Font f2 = new Font("", Font.BOLD, 25);
		l2.setForeground(Color.black);
		l2.setFont(f2);
		
		l4=new JLabel("Address");
		l4.setBounds(100, 350, 200, 40);
		na.add(l4);
		Font lf=new Font("", Font.BOLD, 25);
		l4.setFont(lf);

		
		l3=new JLabel("Amount");
		l3.setBounds(100, 400, 200, 40);
		na.add(l3);
		Font f3 = new Font("", Font.BOLD, 25);
		l3.setForeground(Color.black);
		l3.setFont(f3);

		tf1=new JTextField();
		tf1.setBounds(350, 200, 350, 40);
		Font ft1=new Font("", Font.ITALIC, 20);
		tf1.setFont(ft1);
		na.add(tf1);

		tf2=new JTextField();
		tf2.setBounds(350, 250, 350, 40);
		Font ft2=new Font("", Font.ITALIC, 20);
		tf2.setFont(ft2);
		na.add(tf2);
		
		tf3=new JTextField();
		tf3.setBounds(350, 300, 350, 40);
		Font ft3=new Font("", Font.ITALIC, 20);
		tf3.setFont(ft3);
		na.add(tf3);
		
		tf4=new JTextField();
		tf4.setBounds(350, 350, 350, 40);
		Font ft4=new Font("", Font.ITALIC, 20);
		tf4.setFont(ft4);
		na.add(tf4);
		
		tf5=new JTextField();
		tf5.setBounds(350, 400, 350, 40);
		Font ft5=new Font("", Font.ITALIC, 20);
		tf5.setFont(ft5);
		na.add(tf5);
		
	    b=new JButton("Create");
	    b.setBounds(600, 550, 200, 40);
		Font ft8=new Font("", Font.BOLD, 25);
		b.setFont(ft8);
	    na.add(b);
	    b.setForeground(Color.WHITE);
		b.setBackground(Color.BLACK);
		
		b.addActionListener(new ActionListener()
				{
			
			public void actionPerformed(ActionEvent ae) 
			{
				
				if(ae.getSource()==b)
				{
							
				     try
				     {
				    	 
				    	 Class.forName("com.mysql.jdbc.Driver");
				    	 
				    	 co=DriverManager.getConnection("jdbc:mysql://localhost:3306/banks", "root", "1234");
		
				    	 String data="INSERT INTO obc(Name, Email_ID, Address, Mobile_No, "
				    	 		+ "Amount) values(?, ?, ?, ?, ?)";
				    	 
	      		    	 pst=co.prepareStatement(data, Statement.RETURN_GENERATED_KEYS);
	      		  	     
	      		    	 
	      		    	 pst.setString(1, tf1.getText());
	      				 
	      		  	     pst.setString(2, tf2.getText());
	      				 
	      		  	     pst.setString(3, tf3.getText());
	      			     
	      		  	     pst.setString(4, tf4.getText());
	      				
	      			     pst.setString(5, tf5.getText());

				    	 ResultSet rst=pst.getGeneratedKeys();
				    	 
				    	 while(rst.next())
				    	 {
				    		 
				    		 String s="rst.getInt(1)";
				    		 
				    		 tf6.setText(rst.getString(s)); 
				    		 
				    	 }
				    	 
	                     pst.executeUpdate();
	                     
				    	 JOptionPane.showMessageDialog(null, "Account Created Successfully");
				    	 
				    	 System.out.println("Created");
				    	 
				     }
				     catch(Exception e)
				     {
				    	 
				    	 e.printStackTrace();
				    	 
				     }
	                     
				}
			}
			
			}
		
		);		
	    
		b1=new JButton("Back");
		b1.setBounds(900, 550, 100, 40);
		na.add(b1);
		Font fb=new Font("", Font.BOLD, 25);
		b1.setFont(fb);
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		
		b1.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e)
			{
				
				if(e.getSource()==b1)
				{
					
					OBC o=new OBC();
					o.OBC();
					na.dispose();
					
				}
				
			}
		}
		
				);
		
		na.setBounds(100, 50, 1500, 800);
		
		na.setLayout(null);
		
		na.setVisible(true);
		
		na.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
		
}

class OpenAccountO extends JFrame implements ActionListener
{
	
	JFrame op;
	JLabel l1, l2, l7, l3, l4, l5, l6;
	JTextField tf1, tf2, tf3, tf4, tf5, tf6;
	JButton b, b1;
	
	public void openo()
	{
		
		op=new JFrame("Oriental Bank of Commerce");
		
		op.setResizable(false);
		
		l7=new JLabel("Open Your Account Details");
		l7.setBounds(200, 70, 600, 70);
		Font fl=new Font("", Font.BOLD, 30);
		l7.setFont(fl);
		op.add(l7);
		
		l1=new JLabel("Account_No");
		l1.setBounds(100, 200, 200, 40);
		Font f=new Font("", Font.BOLD, 25);
		l1.setFont(f);
		op.add(l1);
		
		l2=new JLabel("Name");
		l2.setBounds(100, 250, 200, 40);
		Font f1=new Font("", Font.BOLD, 25);
		l2.setFont(f1);
		op.add(l2);

		l3=new JLabel("Email_ID");
		l3.setBounds(100, 300, 200, 40);
		Font f2=new Font("", Font.BOLD, 25);
		l3.setFont(f2);
		op.add(l3);

		l4=new JLabel("Address");
		l4.setBounds(100, 350, 200, 40);
		Font f3=new Font("", Font.BOLD, 25);
		l4.setFont(f3);
		op.add(l4);

		l5=new JLabel("Mobile_No");
		l5.setBounds(100, 400, 200, 40);
		Font f4=new Font("", Font.BOLD, 25);
		l5.setFont(f4);
		op.add(l5);

		l6=new JLabel("Amount");
		l6.setBounds(100, 450, 200, 40);
		Font f5=new Font("", Font.BOLD, 25);
		l6.setFont(f5);
		op.add(l6);

		tf1=new JTextField();
		tf1.setBounds(350, 200, 350, 40);
		Font f6=new Font("", Font.ITALIC, 20);
		tf1.setFont(f6);
		op.add(tf1);
		
		tf2=new JTextField();
		tf2.setBounds(350, 250, 350, 40);
		Font f7=new Font("", Font.ITALIC, 20);
		tf2.setFont(f7);
		tf2.setEditable(false);
		op.add(tf2);
		
		tf3=new JTextField();
		tf3.setBounds(350, 300, 350, 40);
		Font f8=new Font("", Font.ITALIC, 20);
		tf3.setFont(f8);
		tf3.setEditable(false);
		op.add(tf3);

		tf4=new JTextField();
		tf4.setBounds(350, 350, 350, 40);
		Font tf=new Font("", Font.ITALIC, 20);
		tf4.setFont(tf);
		tf4.setEditable(false);
		op.add(tf4);

		tf5=new JTextField();
		tf5.setBounds(350, 400, 350, 40);
		Font f9=new Font("", Font.ITALIC, 20);
		tf5.setFont(f9);
		tf5.setEditable(false);
		op.add(tf5);

		tf6=new JTextField();
		tf6.setBounds(350, 450, 350, 40);
		Font f10=new Font("", Font.ITALIC, 20);
		tf6.setFont(f10);
		tf6.setEditable(false);
		op.add(tf6);

		b=new JButton("Open");
		b.setBounds(500, 550, 100, 40);
		Font f11=new Font("", Font.BOLD, 25);
		b.setFont(f11);
		op.add(b);
		b.setForeground(Color.WHITE);
		b.setBackground(Color.BLACK);

		b.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent ae) 
			{
					
				if(ae.getSource()==b)
				{
					
					try
					{
						
						Class.forName("com.mysql.jdbc.Driver");
						
						Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/banks", "root", "1234");
				
						System.out.println("select");
						
						String s=tf1.getText();
						
						PreparedStatement ps=co.prepareStatement("select * from obc where Account_No=?");
						
						ps.setString(1, s);
						
						System.out.println("execute");
						
						ResultSet rs=ps.executeQuery();
						if(rs.next())
						{		
							
							String s1=rs.getString(2);
							String s2=rs.getString(3);
							String s3=rs.getString(4);
							String s4=rs.getString(5);
							String s5=rs.getString(6);
							
							tf2.setText(s1);
							tf3.setText(s2);
							tf4.setText(s3);
							tf5.setText(s4);
							tf6.setText(s5);
							
						}
						
					}
					
					catch(ClassNotFoundException | SQLException e)
					{
						
						System.out.println(e);
						
					}
					
				}
				
			}
		}
		
				);

		b1=new JButton("Back");
		b1.setBounds(900, 550, 100, 40);
		op.add(b1);
		Font fb=new Font("", Font.BOLD, 25);
		b1.setFont(fb);
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		
		b1.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e)
			{
				
				if(e.getSource()==b1)
				{
					
					OBC o=new OBC();
					o.OBC();
					op.dispose();
					
				}
				
			}
		}
		
				);
		

		
		op.setBounds(100, 100, 1500, 800);
		
		op.setLayout(null);
		
		op.setVisible(true);
		
		op.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}


class DepositO extends JFrame implements ActionListener
{
	
	JFrame depos;
	JLabel l1, l2, l3, l4;
	JTextField tf1, tf2, tf3;
	JButton b, b1;
	
	Connection co=null;
	Statement st=null;
	
	public void deposito()
	{
		
		depos=new JFrame("Oriental Bank of Commerce");
		
		depos.setResizable(false);
		
		l1=new JLabel("Deposit Amount In Your Account");
		l1.setBounds(200, 100, 1000, 40);
		Font f=new Font("", Font.BOLD, 30);
		l1.setFont(f);
		depos.add(l1);
		
		l2=new JLabel("Account Holder Name");
		l2.setBounds(170, 200, 350, 40);
		Font f2=new Font("", Font.BOLD, 25);
		l2.setFont(f2);
		depos.add(l2);

		l3=new JLabel("Account No.");
		l3.setBounds(170, 250, 350, 40);
		Font f3=new Font("", Font.BOLD, 25);
		l3.setFont(f3);
		depos.add(l3);
		
		l4=new JLabel("Deposit Amount");
		l4.setBounds(170, 300, 350, 40);
		Font f4=new Font("", Font.BOLD, 25);
		l4.setFont(f4);
		depos.add(l4);
		
		tf1=new JTextField();
		tf1.setBounds(650, 200, 300, 40);
		Font f5=new Font("", Font.ITALIC, 25);
		tf1.setFont(f5);
		depos.add(tf1);

		tf2=new JTextField();
		tf2.setBounds(650, 250, 300, 40);
		Font f6=new Font("", Font.ITALIC, 25);
		tf2.setFont(f6);
		depos.add(tf2);

		tf3=new JTextField();
		tf3.setBounds(650, 300, 300, 40);
		Font f7=new Font("", Font.ITALIC, 25);
		tf3.setFont(f7);
		depos.add(tf3);

		b=new JButton("Deposit Amount");
		b.setBounds(250, 400, 350, 40);
		Font f8=new Font("", Font.BOLD, 25);
		b.setFont(f8);
		depos.add(b);
		b.setForeground(Color.WHITE);
		b.setBackground(Color.BLACK);

		b.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent ae) 
			{
				
				if(ae.getSource()==b)
				{
				
				try
				{
					
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/banks", "root", "1234");
					
					String s=tf2.getText();
					
					String amoun=tf3.getText();
					
					int accoun=Integer.parseInt(amoun);

					PreparedStatement pst=co.prepareStatement("select * from obc where Account_No=? ");
					
					pst.setString(1, s);
										
					System.out.println("a");
										
	                ResultSet rs=pst.executeQuery();
	                
                    int dataamount=0;
					
					System.out.println("b");

	                if(rs.next())
	                {
	                	
	                	dataamount=accoun+rs.getInt(6);
	                	System.out.println("d");
	                	
	                }

	                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banks", "root", "1234");
	                
					PreparedStatement st=con.prepareStatement("update obc set Amount=? where Account_No='"+s+"' ");
					
					st.setInt(1, dataamount);
					
					st.executeUpdate();    
					
		//		   	JOptionPane.showInputDialog(dataamount, "totaldataamount");
						
			     	JOptionPane.showMessageDialog(null, "Amount increased");
				
				    System.out.println("amount updated");
				
	     		    st.close();
					
				}
		        catch(Exception e)
				{
		        	
		        	System.out.println(e);
		        	
				}
			    
				}
		
			}
			
		}	
				);	

		b1=new JButton("Back");
		b1.setBounds(700, 400, 150, 40);
		Font f9=new Font("", Font.BOLD, 25);
		b1.setFont(f9);
		depos.add(b1);
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);

		b1.setActionCommand("Back");
		
		b1.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent ae) 
			{
				
				if(ae.getSource()==b1)
				{

					OBC o=new OBC();
					o.OBC();
					depos.dispose();
					
				}
						
			}
		}
		
				);
	
		depos.setBounds(100, 100, 1500, 800);
		
		depos.setLayout(null);
		
		depos.setVisible(true);
		
		depos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
	
}


class WithdrawO extends JFrame implements ActionListener
{
	
	JFrame wi;
	JLabel l1, l2, l3, l4;
	JTextField tf1, tf2, tf3;
	JButton b, b1;

	public void withdrawo()
	{
		
		wi=new JFrame("Oriental Bank of Commerce");
		
		wi.setResizable(false);
		
		l1=new JLabel("Withdraw Amount From Your Account");
		l1.setBounds(200, 100, 1000, 40);
		Font f=new Font("", Font.BOLD, 30);
		l1.setFont(f);
		wi.add(l1);
		
		l2=new JLabel("Account Holder Name");
		l2.setBounds(170, 200, 350, 40);
		Font f2=new Font("", Font.BOLD, 25);
		l2.setFont(f2);
		wi.add(l2);

		l3=new JLabel("Account No.");
		l3.setBounds(170, 250, 350, 40);
		Font f3=new Font("", Font.BOLD, 25);
		l3.setFont(f3);
		wi.add(l3);
		
		l4=new JLabel("Withdraw Amount");
		l4.setBounds(170, 300, 350, 40);
		Font f4=new Font("", Font.BOLD, 25);
		l4.setFont(f4);
		wi.add(l4);
		
		tf1=new JTextField();
		tf1.setBounds(650, 200, 300, 40);
		Font f5=new Font("", Font.ITALIC, 25);
		tf1.setFont(f5);
		wi.add(tf1);

		tf2=new JTextField();
		tf2.setBounds(650, 250, 300, 40);
		Font f6=new Font("", Font.ITALIC, 25);
		tf2.setFont(f6);
		wi.add(tf2);

		tf3=new JTextField();
		tf3.setBounds(650, 300, 300, 40);
		Font f7=new Font("", Font.ITALIC, 25);
		tf3.setFont(f7);
		wi.add(tf3);

		b=new JButton("Withdraw Amount");
		b.setBounds(250, 400, 350, 40);
		Font f8=new Font("", Font.BOLD, 25);
		b.setFont(f8);
		wi.add(b);
		b.setForeground(Color.WHITE);
		b.setBackground(Color.BLACK);

		b.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent ae) 
			{
				
				if(ae.getSource()==b)
				{
				
				try
				{
					
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/banks", "root", "1234");
					
					String s=tf2.getText();
					
					String amoun=tf3.getText();
					
					int accoun=Integer.parseInt(amoun);

					PreparedStatement pst=co.prepareStatement("select * from obc where Account_No=? ");
					
					pst.setString(1, s);
										
					System.out.println("a");
										
	                ResultSet rs=pst.executeQuery();
	                
                    int dataamount=0;
					
					System.out.println("b");

	                if(rs.next())
	                {
	                	
	                	dataamount=rs.getInt(6)-accoun;
	                	System.out.println("d");
	                	
	                }

	                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banks", "root", "1234");
	                
					PreparedStatement st=con.prepareStatement("update obc set Amount=? where Account_No='"+s+"' ");
					
					st.setInt(1, dataamount);
					
					st.executeUpdate();    
									
			     	JOptionPane.showMessageDialog(null, "Amount Withdrawl");
				
				    System.out.println("amount decreased");
				    
	     		    st.close();
					
				}
		        catch(Exception e)
				{
		        	
		        	System.out.println(e);
		        	
				}
			    
				}
		
			}
			
		}	
				);
		
		b1=new JButton("Back");
		b1.setBounds(700, 400, 150, 40);
		Font f9=new Font("", Font.BOLD, 25);
		b1.setFont(f9);
		wi.add(b1);
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		
		b1.setActionCommand("Back");
		
		b1.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent ae) 
			{
				
				if(ae.getSource()==b1)
				{

					OBC o=new OBC();
					o.OBC();
					wi.dispose();
					
				}
						
			}
		}
		
				);
			
		wi.setBounds(100, 100, 1500, 800);
		
		wi.setLayout(null);
		
		wi.setVisible(true);
		
		wi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}	
	
class CheckBalanceO extends JFrame implements ActionListener
{
	
	JFrame bal;
	JLabel l1, l2, l3, l4;
	JTextField tf1, tf2, tf3;
	JButton b, b1;
	
	public void Balanceo()
	{
		
	    bal=new JFrame("Oriental Bank of Commerce");
		
		bal.setResizable(false);
		
		l1=new JLabel("Check Balance Of Your Account");
		l1.setBounds(200, 100, 1000, 40);
		Font f=new Font("", Font.BOLD, 30);
		l1.setFont(f);
		bal.add(l1);
		
		l2=new JLabel("Account Holder Name");
		l2.setBounds(170, 200, 350, 40);
		Font f2=new Font("", Font.BOLD, 25);
		l2.setFont(f2);
		bal.add(l2);

		l3=new JLabel("Account No.");
		l3.setBounds(170, 250, 350, 40);
		Font f3=new Font("", Font.BOLD, 25);
		l3.setFont(f3);
		bal.add(l3);
		
		l4=new JLabel("Current Balance");
		l4.setBounds(170, 300, 350, 40);
		Font f4=new Font("", Font.BOLD, 25);
		l4.setFont(f4);
		bal.add(l4);
		
		tf1=new JTextField();
		tf1.setBounds(650, 200, 300, 40);
		Font f5=new Font("", Font.ITALIC, 25);
		tf1.setFont(f5);
		bal.add(tf1);

		tf2=new JTextField();
		tf2.setBounds(650, 250, 300, 40);
		Font f6=new Font("", Font.ITALIC, 25);
		tf2.setFont(f6);
		bal.add(tf2);

		tf3=new JTextField();
		tf3.setBounds(650, 300, 300, 40);
		Font f7=new Font("", Font.ITALIC, 25);
		tf3.setFont(f7);
		tf3.setEditable(false);
		bal.add(tf3);

		b=new JButton("Check Balance");
		b.setBounds(250, 400, 350, 40);
		Font f8=new Font("", Font.BOLD, 25);
		b.setFont(f8);
		bal.add(b);
		b.setForeground(Color.WHITE);
		b.setBackground(Color.BLACK);

		b.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent ae) 
			{
				
				if(ae.getSource()==b)
				{
					
					try
					{
						
						Class.forName("com.mysql.jdbc.Driver");
						
						Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/banks", "root", "1234");
				
						String s=tf2.getText();
						
						PreparedStatement ps=co.prepareStatement("select Amount from obc where Account_No='"+s+"' ");
						
						ResultSet rs=ps.executeQuery();
						
						if(rs.next())
						{		
								
							String s1=rs.getString(1);
						    
							tf3.setText(s1);
						
						}
						
					}
					
					catch(Exception e)
					{
						
						System.out.println(e);
						
					}
					
				}
				
			}
		}
		
				);			
			
		b1=new JButton("Back");
		b1.setBounds(900, 400, 100, 40);
		bal.add(b1);
		Font fb=new Font("", Font.BOLD, 25);
		b1.setFont(fb);
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		
		b1.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e)
			{
				
				if(e.getSource()==b1)
				{
					
					OBC o=new OBC();
					o.OBC();
					bal.dispose();
					
				}
				
			}
		}
		
				);
		
		bal.setBounds(100, 100, 1500, 800);
		
		bal.setLayout(null);
		
		bal.setVisible(true);
		
		bal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}	

class FundTransferO extends JFrame implements ActionListener
{
	
	JFrame fund;
	JLabel l1, l2, l3, l4, l5, l6;
	JTextField tf1, tf2, tf3, tf4, tf5;
	JButton b, b1;
	
	public void Transfero()
	{
		
		fund=new JFrame("Oriental Bank of Commerce");
		
	    fund.setResizable(false);
		
		l1=new JLabel("Transfer Amount From Source To Destination");
		l1.setBounds(200, 100, 1000, 40);
		Font f=new Font("", Font.BOLD, 30);
		l1.setFont(f);
		fund.add(l1);
		
		l2=new JLabel("Account Holder Name");
		l2.setBounds(170, 200, 350, 40);
		Font f2=new Font("", Font.BOLD, 25);
		l2.setFont(f2);
		fund.add(l2);

		l3=new JLabel("Source Account No.");
		l3.setBounds(170, 250, 350, 40);
		Font f3=new Font("", Font.BOLD, 25);
		l3.setFont(f3);
		fund.add(l3);
		
		l6=new JLabel("Destination Name");
		l6.setBounds(170, 300, 380, 40);
		Font fl=new Font("", Font.BOLD, 25);
		l6.setFont(fl);
		fund.add(l6);
		
		l4=new JLabel("Destination Account No.");
		l4.setBounds(170, 350, 380, 40);
		Font f4=new Font("", Font.BOLD, 25);
		l4.setFont(f4);
        fund.add(l4);
		
		l5=new JLabel("Amount");
		l5.setBounds(170, 400, 380, 40);
		Font fly=new Font("", Font.BOLD, 25);
		l5.setFont(fly);
		fund.add(l5);
		
		tf1=new JTextField();
		tf1.setBounds(650, 200, 300, 40);
		Font f5=new Font("", Font.ITALIC, 25);
		tf1.setFont(f5);
		fund.add(tf1);

		tf2=new JTextField();
		tf2.setBounds(650, 250, 300, 40);
		Font f6=new Font("", Font.ITALIC, 25);
		tf2.setFont(f6);
		fund.add(tf2);

		tf3=new JTextField();
		tf3.setBounds(650, 300, 300, 40);
		Font f7=new Font("", Font.ITALIC, 25);
		tf3.setFont(f7);
		fund.add(tf3);
		
		tf4=new JTextField();
		tf4.setBounds(650, 350, 300, 40);
		Font f9=new Font("", Font.ITALIC, 25);
		tf4.setFont(f9);
		fund.add(tf4);

		tf5=new JTextField();
		tf5.setBounds(650, 400, 300, 40);
		Font ft=new Font("", Font.ITALIC, 25);
		tf5.setFont(ft);
		fund.add(tf5);

		
		b=new JButton("Fund Transfer");
		b.setBounds(250, 550, 350, 40);
		Font f8=new Font("", Font.BOLD, 25);
		b.setFont(f8);
		fund.add(b);
		b.setForeground(Color.WHITE);
		b.setBackground(Color.BLACK);

		b.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent ae) 
			{
				
				if(ae.getSource()==b)
				{
					
					try
					{
						
						Class.forName("com.mysql.jdbc.Driver");
						
						Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/banks", "root", "1234");
			
						String s=tf2.getText();
						
						String s1=tf4.getText();
						
						String s2=tf5.getText();
						
						int accou=Integer.parseInt(s2);
						
						PreparedStatement ps=co.prepareStatement("select * from obc where Account_No='"+s1+"' ");
						System.out.println("skdjks");
	
						ResultSet rs=ps.executeQuery();
						
						int dataamount=0;
						
						if(rs.next())
						{
							
							dataamount=accou+rs.getInt(6);
							System.out.println("kdk");
						
						}
						
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banks", "root", "1234");
						
						PreparedStatement pst=con.prepareStatement("update obc set Amount=? where Account_No='"+s1+"' ");
						
						pst.setInt(1, dataamount);
						
					    pst.executeUpdate();	    
				
					    System.out.println("data amount - "+dataamount);
					   
					    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/banks", "root", "1234");
					    
					    PreparedStatement pstt=conn.prepareStatement("select * from obc where Account_No='"+s+"' ");
					     
					    ResultSet rs2=pstt.executeQuery();
					    
					    int dataamount1=0;
					    
					    if(rs2.next())
					    {
					    	
					    	dataamount1=rs2.getInt(6)-accou;
					    
					    	System.out.println(dataamount1);
					    	
					    }
					    
					    Connection conne=DriverManager.getConnection("jdbc:mysql://localhost:3306/banks", "root", "1234");
					    
					    PreparedStatement psttt=conne.prepareStatement("update obc set Amount=? where Account_No='"+s+"' ");
					    
					    psttt.setInt(1, dataamount1);
					    
					    psttt.executeUpdate();
					    
					    JOptionPane.showMessageDialog(null, "Amount Transfered");
					  
					}
					
					catch(Exception e)
					{
						
						System.out.println(e);
						
					}
					
				}
				
			}
		}
		
				);			
		
					
		b1=new JButton("Back");
		b1.setBounds(700, 550, 150, 40);
		Font f10=new Font("", Font.BOLD, 25);
		b1.setFont(f10);
		fund.add(b1);
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		
		b1.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent ae) 
			{
				
				if(ae.getSource()==b1)
				{
					
					OBC o=new OBC();
					o.OBC();
					fund.dispose();
					
				}
						
			}
		}
		
				);
		
		fund.setBounds(100, 100, 1500, 800);
		
		fund.setLayout(null);
		
		fund.setVisible(true);
		
		fund.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}

}	

class DeleteAccountO extends JFrame implements ActionListener
{
	
	JFrame f;
	JLabel l1, l2, l3, l4, l5;
	JTextField tf1, tf2, tf3, tf4;
	JButton b, b1;
	
	public void Deleteo()
	{
		
		f=new JFrame("Oriental Bank of Commerce");
		
		f.setResizable(false);
		
		l1=new JLabel("Permanently Delete Your Account");
		l1.setBounds(200, 100, 1000, 40);
		Font fl=new Font("", Font.BOLD, 30);
		l1.setFont(fl);
		f.add(l1);
		
		l2=new JLabel("Account Holder Name");
		l2.setBounds(170, 200, 350, 40);
		Font f2=new Font("", Font.BOLD, 25);
		l2.setFont(f2);
		f.add(l2);

		l3=new JLabel("Account No.");
		l3.setBounds(170, 250, 350, 40);
		Font f3=new Font("", Font.BOLD, 25);
		l3.setFont(f3);
		f.add(l3);
		
		tf1=new JTextField();
		tf1.setBounds(650, 200, 300, 40);
		Font f5=new Font("", Font.ITALIC, 25);
		tf1.setFont(f5);
		f.add(tf1);

		tf2=new JTextField();
		tf2.setBounds(650, 250, 300, 40);
		Font f6=new Font("", Font.ITALIC, 25);
		tf2.setFont(f6);
		f.add(tf2);

		b=new JButton("Delete Account");
		b.setBounds(250, 350, 350, 40);
		Font f8=new Font("", Font.BOLD, 25);
		b.setFont(f8);
		f.add(b);
		b.setForeground(Color.WHITE);
		b.setBackground(Color.BLACK);

		b.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent ae) 
			{
			
				if(ae.getSource()==b)
				{
					
				try
				{
					
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/banks", "root", "1234");
					
					String s1=tf2.getText();
					
					PreparedStatement pst=co.prepareStatement("delete from obc where Account_No='"+s1+"' ");
					
					pst.executeUpdate();
					
					pst.close();
					
					JOptionPane.showMessageDialog(null, "AccountDeleted");
										
				}
				catch(Exception e)
				{
					
					e.printStackTrace();
					
				} 
		
			}
		
		}
			
		}
				);			
					
			
		b1=new JButton("Back");
		b1.setBounds(700, 350, 150, 40);
		Font f9=new Font("", Font.BOLD, 25);
		b1.setFont(f9);
		f.add(b1);
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);

		b1.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent ae) 
			{
				
				if(ae.getSource()==b1)
				{
					
					OBC o=new OBC();
					o.OBC();
					f.dispose();
					
				}
						
			}
		}
		
				);
		
		f.setBounds(100, 100, 1500, 800);
	
		f.setLayout(null);
		
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}

}

