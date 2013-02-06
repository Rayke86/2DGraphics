import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.nio.file.Path;

import javax.swing.*;


public class Opdracht2_1 extends JFrame 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{ // TODO Auto-generated method stub
		Opdracht2_1 opdr = new Opdracht2_1();
	}
	
	public Opdracht2_1()
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
        
        JPanel centerPanel = new Opdracht2_1a();
        panel.add(centerPanel, BorderLayout.CENTER);
        
        JPanel bottomPanel = new JPanel(new FlowLayout());
        panel.add(bottomPanel, BorderLayout.SOUTH);
        
               
        
                
        setContentPane(panel);
        setVisible(true);
	}
	
	

	public class Opdracht2_1a extends JPanel 
	{
		public Opdracht2_1a()
		{
			setPreferredSize(new Dimension(600, 400));
		}
		
		
		public void paintComponent(Graphics g) 
		{
			Graphics2D g2 = (Graphics2D) g;
		    
		    
		    g2.translate(getWidth()/2, getHeight()/2);
		    
		    int x1 = 0;
    		int y1 = 0;
    		
    		g2.drawLine(-300, -0, 300, 0);
		    g2.drawLine(0, -300, 0, 300);
		    
		    for(double t = -8; t < 8; t++)
		    {   	
		    				
		    	int x = (int)Math.pow(t, 2);
		    	int y = (int)Math.pow(t, 3);
		    	g2.drawLine(x1, y1, x, y);
		    	
		    	x1 = x;
		    	y1 = y;
		    	
		    	//try{Thread.sleep(1000L);
		    		//}catch(Exception e){}
		    }
		}
	}

}
