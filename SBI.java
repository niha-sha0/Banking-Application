package OnlineBankMagementSystem;

		
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class SBI extends JFrame
{
	
	 public static void main(String[] args) 
	    {
//		    SwingUtilities.invokeLater(new Runnable() 
//		    {
				
//				public void run() 
//				{
								
//					SBI s=new SBI();
//					s.SBI();
					
//				}
//			}
		    
//		    		);
		 
	    	try
	    	{
	    		
	    		Class.forName("com.mysql.jdbc.Driver");
	    	    
	    		Connection co=DriverManager.getConnection
	    				("jdbc:mysql://localhost:3306/banks", "root", "1234");
	    		
	    		Statement st=co.createStatement();
	    		
	 //   		st.executeUpdate("create table bnk(Account_No int(10)auto_increment, "
	  //  				+ "Name varchar(30), Email_ID varchar(20), "
	    //				+ "Address varchar(50), "
	    //				+ "Mobile_No varchar(10), Amount numeric(10), "
	    //				+ "primary key(Account_No), unique key(Name, Email_ID, Mobile_No))");
	    
	    //		st.executeUpdate("alter table sbi auto_increment=1000000001");
	    		
	    //		st.executeUpdate("alter table sbi add constraint check_Amount check(Amount>=1000)");
	    		
	    //		System.out.println("Altered");
	    		
	  // 		st.executeUpdate("insert into bnk(Name, Email_ID, "
	   //				+ "Address, Mobile_No, Amount) values('Niharika', 'niha2@gmail.com', "
	    //				+ "'Meerut', '8826121257', '2000')");
	    		
	   // 		st.executeUpdate("insert into bank values('11112', 'Anuja', 'anuja@gmail.com', "
	   // 				+ "'Delhi', '8826121290', '5000')");
	    		
	   // 		st.executeUpdate("insert into bank values('11113', 'Priyaa', 'priyaa@gmail.com', "
	   // 				+ "'Meerut','8826121278', '10000')");
	    		
	   // 		st.executeUpdate("insert into bank values('370047176999', 'Shivangi', 'shivangi@gmail.com', "
	   // 				+ "'Meerut','8826121245', '50000')");
	    		
	    //		st.executeUpdate("insert into bank values('370047176990', 'Vinay', 'vinay@gmail.com', "
	    //				+ "'Noida', '8826121287', '25000')");
	    		
	  //  		Scanner sc=new Scanner(System.in);
	   // 		Scanner sc1=new Scanner(System.in);
	    		
	   // 		double Account_No = sc.nextDouble();
	    		
	   // 		String Name=sc1.nextLine();
	    		
	   // 		String Email_ID=sc1.nextLine();
	    		
	   // 		String Address=sc.nextLine();
	    		
	   // 		double Mobile_No=sc.nextDouble();
	    		
	   // 		double Amount=sc.nextDouble();
	    		
	    		
	    		
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
 
	public void SBI()
	{
		
		ba=new JFrame("State_Bank_Of_India ");
		
		ba.setResizable(!true);
		
		jl=new JLabel(" STATE BANK OF INDIA ");
		jl.setBounds(350, 80, 800, 70);
		ba.add(jl);
		Font fl=new Font("", Font.BOLD, 45);
		jl.setFont(fl);
				
		b1=new JButton("New Account");
		b1.setBounds(200, 250, 300, 50);
		ba.add(b1);
		Font f5 = new Font("", Font.ITALIC, 30);
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		b1.setFont(f5);

		b2=new JButton("Open Account");
		b2.setBounds(600, 250, 300, 50);
		ba.add(b2);
		Font f6 = new Font("", Font.ITALIC, 30);
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		b2.setFont(f6);

		
		b3=new JButton("Deposit");
		b3.setBounds(1000, 250, 300, 50);
		ba.add(b3);
		Font f7 = new Font("", Font.ITALIC, 30);
		b3.setForeground(Color.WHITE);
		b3.setBackground(Color.BLACK);
		b3.setFont(f7);

		b4=new JButton("Withdraw Amount");
		b4.setBounds(200, 400, 300, 50);
		ba.add(b4);
		Font f8 = new Font("", Font.ITALIC, 30);
		b4.setForeground(Color.WHITE);
		b4.setBackground(Color.BLACK);
		b4.setFont(f8);

		b5=new JButton("Check Balance");
		b5.setBounds(600, 400, 300, 50);
		ba.add(b5);
		Font f9= new Font("", Font.ITALIC, 30);
		b5.setForeground(Color.WHITE);
		b5.setBackground(Color.BLACK);
		b5.setFont(f9);

		
		b6=new JButton("Fund Transfer");
		b6.setBounds(1000, 400, 300, 50);
		ba.add(b6);
		Font f10 = new Font("", Font.ITALIC, 30);
		b6.setForeground(Color.WHITE);
		b6.setBackground(Color.BLACK);
		b6.setFont(f10);

		
		b7=new JButton("Delete Account");
		b7.setBounds(400, 550, 300, 50);
		ba.add(b7);
		Font f11 = new Font("", Font.ITALIC, 30);
		b7.setForeground(Color.WHITE);
		b7.setBackground(Color.BLACK);
		b7.setFont(f11);
		
		JButton b8=new JButton("Back");
		b8.setBounds(800, 550, 300, 50);
		ba.add(b8);
		Font f12=new Font("", Font.BOLD, 30);
		b8.setFont(f12);
		b8.setForeground(Color.WHITE);
		b8.setBackground(Color.BLACK);
        
		b1.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent ae1) 
			{
				
				if(ae1.getSource()==b1)
				{
					
					NewAccountS n=new NewAccountS();
					n.news();
					ba.dispose();
					
				}
				
			}
		
		}
				);
	
		
		
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) 
			{
				
				OpenAccountS o=new OpenAccountS();
			    o.opens();
			    ba.dispose();
				
			}
		
		}
				);
		b3.addActionListener(new ActionListener() 
		{
			
			
			public void actionPerformed(ActionEvent ae3) 
			{
				
			     if(ae3.getSource()==b3)
			     {
			    	 
			    	 DepositS d=new DepositS();
			    	 d.deposits();
			    	 ba.dispose();
			    	 
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
                	  
                	  WithdrawS w=new WithdrawS();
                	  w.withdraws();
                	  ba.dispose();
                	  
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
					
					CheckBalanceS b=new CheckBalanceS();
					b.Balances();
					ba.dispose();

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
					
					FundTransferS f=new FundTransferS();
					f.Transfers();
		          	ba.dispose();

					
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
					
					DeleteAccountS da=new DeleteAccountS();
					da.Deletes();
					ba.dispose();

				}
				
			}
		
		}
		
				);
		
		b8.addActionListener(new ActionListener()
		{
			
	     	public void actionPerformed(ActionEvent ae8)
	     	{
	     		
	             Choice ch=new Choice();
	             ch.Choice();
	             ba.dispose();
			
			}
	     	
		}
		
				);

		ba.setBounds(100, 50, 1500, 800);
		  
	    ba.setLayout(null);
		
		ba.setVisible(true);
	
		ba.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		System.out.println("End of Application");
	}
	
}

class NewAccountS extends JFrame implements ActionListener
{
	JFrame na;
	JLabel la, l, l1, l2, l3, l4, l5;
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
	
	public void news()
	{
		
		na=new JFrame("State Bank of India");
		
		na.setResizable(!true);
		
		la=new JLabel("Create Your Account");
		la.setBounds(200, 70, 200, 70);
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

//		tf1=new JTextField();
//		tf1.setBounds(350, 200, 350, 40);
//		Font ft1=new Font("", Font.ITALIC, 20);
//		tf1.setFont(ft1);
//		na.add(tf1);

		tf2=new JTextField();
		tf2.setBounds(350, 200, 350, 40);
		Font ft2=new Font("", Font.ITALIC, 20);
		tf2.setFont(ft2);
		na.add(tf2);
		
		tf3=new JTextField();
		tf3.setBounds(350, 250, 350, 40);
		Font ft3=new Font("", Font.ITALIC, 20);
		tf3.setFont(ft3);
		na.add(tf3);
		
		tf4=new JTextField();
		tf4.setBounds(350, 300, 350, 40);
		Font ft4=new Font("", Font.ITALIC, 20);
		tf4.setFont(ft4);
		na.add(tf4);
		
		tf5=new JTextField();
		tf5.setBounds(350, 350, 350, 40);
		Font ft5=new Font("", Font.ITALIC, 20);
		tf5.setFont(ft5);
		na.add(tf5);
		
		tf6=new JTextField();
		tf6.setBounds(350, 400, 350, 40);
		Font ft6=new Font("", Font.ITALIC, 20);
		tf6.setFont(ft6);
		na.add(tf6);

		
	    b=new JButton("Create");
	    b.setBounds(600, 550, 200, 40);
		Font ft8=new Font("", Font.BOLD, 25);
		b.setFont(ft8);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
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
		
				    	 String data="INSERT INTO sbi(Name, Email_ID, Address, Mobile_No, "
				    	 		+ "Amount) values(?, ?, ?, ?, ?)";
				    	 
	      		    	 pst=co.prepareStatement(data, Statement.RETURN_GENERATED_KEYS);
	      		  	     
	      		    	 
	      		    	 pst.setString(1, tf2.getText());
	      				 
	      		  	     pst.setString(2, tf3.getText());
	      				 
	      		  	     pst.setString(3, tf4.getText());
	      			     
	      		  	     pst.setString(4, tf5.getText());
	      				
	      			     pst.setString(5, tf6.getText());

				    	 ResultSet rst=pst.getGeneratedKeys();
				    	 
				    	 if(rst!=null && rst.next())
				    	 {
				    		 
				    	     System.out.println(rst.getInt(1));
				    		 
				    	 }
				   
				    	 
	                     pst.executeUpdate();
	                     
				    	 JOptionPane.showMessageDialog(null, "Account Created Successfully");
				    	 
		//		    	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banks", "root", "1234");
				    	 
		//		    	 PreparedStatement st=con.prepareStatement(null);
			    	 
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
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setFont(fb);
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		
		b1.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e)
			{
				
				if(e.getSource()==b1)
				{
					
					SBI s=new SBI();
					s.SBI();
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

class OpenAccountS extends JFrame implements ActionListener
{
	
	JFrame op;
	JLabel l1, l2, l3, l4, l5, l6, l7;
	JTextField tf1, tf2, tf3, tf4, tf5, tf6;
	JButton b, b1;
	
	public void opens()
	{
		
		op=new JFrame("State Bank of India");
		
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
		b.setBackground(Color.BLACK);
		b.setForeground(Color.WHITE);
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
						
						PreparedStatement ps=co.prepareStatement("select * from sbi where Account_No=?");
						
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
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		Font fb=new Font("", Font.BOLD, 25);
		b1.setFont(fb);
		
		b1.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e)
			{
				
				if(e.getSource()==b1)
				{
					
					SBI s=new SBI();
					s.SBI();
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


class DepositS extends JFrame implements ActionListener
{
	
	JFrame depos;
	JLabel l1, l2, l3, l4;
	JTextField tf1, tf2, tf3;
	JButton b, b1;
	
	public void deposits()
	{
		
		depos=new JFrame("State Bank of India");
		
		depos.setResizable(false);
		
		l1=new JLabel("Deposit Amount In Your Account");
		l1.setBounds(200, 100, 1000, 40);
		Font f=new Font("", Font.BOLD, 30);
		l1.setFont(f);
		depos.add(l1);
		
		l4=new JLabel("Account Holder Name");
		l4.setBounds(170, 250, 350, 25);
		Font f10=new Font("", Font.BOLD, 25);
		l4.setFont(f10);
		depos.add(l4);
		
		l2=new JLabel("Account_No");
		l2.setBounds(170, 300, 350, 40);
		Font f2=new Font("", Font.BOLD, 25);
		l2.setFont(f2);
		depos.add(l2);

		l3=new JLabel("Enter_Amount");
		l3.setBounds(170, 350, 350, 40);
		Font f3=new Font("", Font.BOLD, 25);
		l3.setFont(f3);
		depos.add(l3);
		
		tf1=new JTextField();
		tf1.setBounds(650, 250, 300, 40);
		Font f5=new Font("", Font.ITALIC, 25);
		tf1.setFont(f5);
		depos.add(tf1);

		tf2=new JTextField();
		tf2.setBounds(650, 300, 300, 40);
		Font f6=new Font("", Font.ITALIC, 25);
		tf2.setFont(f6);
		depos.add(tf2);
		
		tf3=new JTextField();
		tf3.setBounds(650, 350, 300, 40);
		Font f11=new Font("", Font.ITALIC, 25);
		tf3.setFont(f11);
		depos.add(tf3);

		b=new JButton("Deposit Amount");
		b.setBounds(250, 450, 350, 40);
		Font f8=new Font("", Font.BOLD, 25);
		b.setFont(f8);
		b.setBackground(Color.BLACK);
		b.setForeground(Color.WHITE);
		depos.add(b);
		
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
					
					String s=tf1.getText();
					
					String amoun=tf2.getText();
					
					int accoun=Integer.parseInt(amoun);

					PreparedStatement pst=co.prepareStatement("select * from sbi where Account_No=? ");
					
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
	                
					PreparedStatement st=con.prepareStatement("update sbi set Amount=? where Account_No='"+s+"' ");
					
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
		b1.setBounds(700, 450, 150, 40);
		Font f9=new Font("", Font.BOLD, 25);
		b1.setFont(f9);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		depos.add(b1);
		
		b1.setActionCommand("Back");
		
		b1.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent ae) 
			{
				
				if(ae.getSource()==b1)
				{
					
					SBI s=new SBI();
					s.SBI();
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

class WithdrawS extends JFrame implements ActionListener
{
	
	JFrame withd;
	JLabel l1, l2, l3, l4;
	JTextField tf1, tf2, tf3;
	JButton b, b1;
	
	public void withdraws()
	{
		
		withd=new JFrame("Withdraw");
		
		withd.setResizable(false);
		
		l1=new JLabel("Withdraw Amount From Your Account");
		l1.setBounds(200, 100, 1000, 40);
		Font f=new Font("", Font.BOLD, 30);
		l1.setFont(f);
		withd.add(l1);
		
		l2=new JLabel("Account Holder Name");
		l2.setBounds(170, 200, 350, 40);
		Font f2=new Font("", Font.BOLD, 25);
		l2.setFont(f2);
	    withd.add(l2);

		l3=new JLabel("Account No.");
		l3.setBounds(170, 250, 350, 40);
		Font f3=new Font("", Font.BOLD, 25);
		l3.setFont(f3);
		withd.add(l3);
		
		l4=new JLabel("Withdraw Amount");
		l4.setBounds(170, 300, 350, 40);

		Font f4=new Font("", Font.BOLD, 25);
		l4.setFont(f4);
		withd.add(l4);
		
		tf1=new JTextField();
		tf1.setBounds(650, 200, 300, 40);
		Font f5=new Font("", Font.ITALIC, 25);
		tf1.setFont(f5);
		withd.add(tf1);

		tf2=new JTextField();
		tf2.setBounds(650, 250, 300, 40);
		Font f6=new Font("", Font.ITALIC, 25);
		tf2.setFont(f6);
		withd.add(tf2);

		tf3=new JTextField();
		tf3.setBounds(650, 300, 300, 40);
		Font f7=new Font("", Font.ITALIC, 25);
		tf3.setFont(f7);
		withd.add(tf3);

		b=new JButton("Withdraw Amount");
		b.setBounds(250, 400, 350, 40);
		Font f8=new Font("", Font.BOLD, 25);
		b.setBackground(Color.BLACK);
		b.setForeground(Color.WHITE);
		b.setFont(f8);
		withd.add(b);
		
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

					PreparedStatement pst=co.prepareStatement("select * from sbi where Account_No=? ");
					
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
	                
					PreparedStatement st=con.prepareStatement("update sbi set Amount=? where Account_No='"+s+"' ");
					
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
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		withd.add(b1);
		
		b1.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent ae) 
			{
				
				if(ae.getSource()==b1)
				{
					
					SBI s=new SBI();
					s.SBI();
					withd.dispose();
					
				}
						
			}
		}
		
				);
		
		withd.setBounds(100, 100, 1500, 800);
		
		withd.setLayout(null);
		
		withd.setVisible(true);
		
		withd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}

}
	
	
class CheckBalanceS extends JFrame implements ActionListener
{
	
	JFrame cb;
	JLabel l1, l2, l3, l4;
	JTextField tf1, tf2, tf3;
	JButton b, b1;
	
	public void Balances()
	{
		
		cb=new JFrame("State Bank of India");
		
		cb.setResizable(false);
		
		l1=new JLabel("Check Balance Of Your Account");
		l1.setBounds(200, 100, 1000, 40);
		Font f=new Font("", Font.BOLD, 30);
		l1.setFont(f);
		cb.add(l1);
		
		l2=new JLabel("Account Holder Name");
		l2.setBounds(170, 200, 350, 40);
		Font f2=new Font("", Font.BOLD, 25);
		l2.setFont(f2);
		cb.add(l2);

		l3=new JLabel("Account No.");
		l3.setBounds(170, 250, 350, 40);
		Font f3=new Font("", Font.BOLD, 25);
		l3.setFont(f3);
		cb.add(l3);
		
		l4=new JLabel("Current Balance");
		l4.setBounds(170, 300, 350, 40);
		Font f4=new Font("", Font.BOLD, 25);
		l4.setFont(f4);
		cb.add(l4);
		
		tf1=new JTextField();
		tf1.setBounds(650, 200, 300, 40);
		Font f5=new Font("", Font.ITALIC, 25);
		tf1.setFont(f5);
		cb.add(tf1);

		tf2=new JTextField();
		tf2.setBounds(650, 250, 300, 40);
		Font f6=new Font("", Font.ITALIC, 25);
		tf2.setFont(f6);
		cb.add(tf2);

		tf3=new JTextField();
		tf3.setBounds(650, 300, 300, 40);
		Font f7=new Font("", Font.ITALIC, 25);
		tf3.setFont(f7);
		tf3.setEditable(false);
		cb.add(tf3);

		b=new JButton("Check Balance");
		b.setBounds(250, 400, 350, 40);
		Font f8=new Font("", Font.BOLD, 25);
		b.setFont(f8);
		b.setBackground(Color.BLACK);
		b.setForeground(Color.WHITE);
		cb.add(b);
		
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
						
						PreparedStatement ps=co.prepareStatement("select Amount from sbi where Account_No='"+s+"' ");
						
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
		b1.setBounds(700, 400, 150, 40);
		Font f10=new Font("", Font.BOLD, 25);
		b1.setFont(f10);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		cb.add(b1);
		
		b1.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent ae) 
			{
				
				if(ae.getSource()==b1)
				{
					
					SBI s=new SBI();
					s.SBI();
					cb.dispose();
					
				}
						
			}
		}
		
				);

		cb.setBounds(100, 100, 1500, 800);
			
		cb.setLayout(null);
		
		cb.setVisible(true);
		
		cb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}	


class FundTransferS extends JFrame implements ActionListener
{
	
	JFrame fund;
	JLabel l1, l2, l3, l4, l5, l6;
	JTextField tf1, tf2, tf3, tf4, tf5;
	JButton b, b1;
	
	public void Transfers()
	{
		
		fund=new JFrame("State Bank of India");
		
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
		b.setBackground(Color.BLACK);
		b.setForeground(Color.WHITE);
		fund.add(b);
		
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
						
						PreparedStatement ps=co.prepareStatement("select * from sbi where Account_No='"+s1+"' ");
						System.out.println("skdjks");
	
						ResultSet rs=ps.executeQuery();
						
						int dataamount=0;
						
						if(rs.next())
						{
							
							dataamount=accou+rs.getInt(6);
							System.out.println("kdk");
						
						}
						
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banks", "root", "1234");
						
						PreparedStatement pst=con.prepareStatement("update sbi set Amount=? where Account_No='"+s1+"' ");
						
						pst.setInt(1, dataamount);
						
					    pst.executeUpdate();	    
				
					    System.out.println("data amount - "+dataamount);
					   
					    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/banks", "root", "1234");
					    
					    PreparedStatement pstt=conn.prepareStatement("select * from sbi where Account_No='"+s+"' ");
					     
					    ResultSet rs2=pstt.executeQuery();
					    
					    int dataamount1=0;
					    
					    if(rs2.next())
					    {
					    	
					    	dataamount1=rs2.getInt(6)-accou;
					    
					    	System.out.println(dataamount1);
					    	
					    }
					    
					    Connection conne=DriverManager.getConnection("jdbc:mysql://localhost:3306/banks", "root", "1234");
					    
					    PreparedStatement psttt=conne.prepareStatement("update sbi set Amount=? where Account_No='"+s+"' ");
					    
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
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		fund.add(b1);
		
		b1.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent ae) 
			{
				
				if(ae.getSource()==b1)
				{
					
					SBI s=new SBI();
					s.SBI();
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

class DeleteAccountS extends JFrame implements ActionListener
{
	
	JFrame f;
	JLabel l1, l2, l3, l4, l5;
	JTextField tf1, tf2, tf3, tf4;
	JButton b, b1;
	
	Connection co=null;
	PreparedStatement pst=null;
	
	public void Deletes()
	{
		
		f=new JFrame("State Bank of India");
		
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
		b.setForeground(Color.WHITE);
		b.setBackground(Color.BLACK);
		f.add(b);
		
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
					
					String s1=tf2.getText();
					
					pst=co.prepareStatement("delete from sbi where Account_No='"+s1+"' ");
					
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
					
					SBI s=new SBI();
					s.SBI();
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

