import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class Opdracht2_6 extends JFrame 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{ // TODO Auto-generated method stub
		Opdracht2_6 opdr = new Opdracht2_6();
	}
	
	public Opdracht2_6()
	{
		super("line");
        setSize(600, 600);
        setTitle("2D Line");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new BorderLayout()); 
		JPanel topPanel = new JPanel(new FlowLayout());
		panel.add(topPanel, BorderLayout.NORTH);
		panel.setBackground(Color.WHITE);
		JLabel statusLabel = new JLabel("Draw a Line");
        topPanel.add(statusLabel);
        
        JPanel centerPanel = new Opdracht2_6a();
        panel.add(centerPanel, BorderLayout.CENTER);
        
        JPanel bottomPanel = new JPanel(new FlowLayout());
        panel.add(bottomPanel, BorderLayout.SOUTH);
        
        setContentPane(panel);
        setVisible(true);
	}
	
	

	public class Opdracht2_6a extends JPanel 
	{
		public Opdracht2_6a()
		{
			setPreferredSize(new Dimension(600, 400));
			setBackground(Color.white);
		}
		
		
		public void paintComponent(Graphics g) 
		{
		    Graphics2D g2 = (Graphics2D) g;
		    
		    g2.drawArc(100, 100, 400, 400, 0, 360);
		    g2.fillArc(100, 100, 400, 400, 270, 180);
		    
		    g2.drawArc(200, 300, 200, 200, 90, 180);
		    g2.fillArc(200, 300, 200, 200, 90, 180);
		    		    	    
		    g2.drawArc(200, 100, 200, 200, 270, 180);
		    g2.setColor(Color.white);
		    g2.fillArc(200, 100, 200, 200, 270, 180);	    
		    
		    g2.drawArc(300,400,20,20,0,360);
		    g2.fillArc(300,400,20,20,0,360);
		    
		    g2.setColor(Color.black);
		    g2.drawArc(300,200,20,20,0,360);
		    g2.fillArc(300,200,20,20,0,360);		   
		}
	}

}


