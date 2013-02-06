import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class Opdracht2_2 extends JFrame 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{ // TODO Auto-generated method stub
		Opdracht2_2 opdr = new Opdracht2_2();
	}
	
	public Opdracht2_2()
	{
		super("line");
        setSize(600, 600);
        setTitle("2D Line");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new BorderLayout()); 
		JPanel topPanel = new JPanel(new FlowLayout());
		panel.add(topPanel, BorderLayout.NORTH);
		
		JLabel statusLabel = new JLabel("Draw a Line");
        topPanel.add(statusLabel);
        
        JPanel centerPanel = new Opdracht2_2a();
        panel.add(centerPanel, BorderLayout.CENTER);
        
        JPanel bottomPanel = new JPanel(new FlowLayout());
        panel.add(bottomPanel, BorderLayout.SOUTH);
                        
        setContentPane(panel);
        setVisible(true);
	}
	
	

	public class Opdracht2_2a extends JPanel 
	{
		public Opdracht2_2a()
		{
			setPreferredSize(new Dimension(600, 400));
		}
		
		
		public void paintComponent(Graphics g,int t) 
		{
		    Graphics2D g2 = (Graphics2D) g;
		    
		    if(t <= 8 && t >= 0)
		    {
		    	int x = (int)((20 * t) * (Math.cos(t)));
		    	int y = (int)((20 * t) * (Math.sin(t)));
		    			    	
		        g2.drawOval(x, y, 200, 100);    
		    }
		    else
		    	System.out.println("kan niet");
		}
	}

}

