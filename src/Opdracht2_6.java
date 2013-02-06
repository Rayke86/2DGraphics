
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;

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
		//panel.setBackground(Color.black);
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
		private GeneralPath myShape = new GeneralPath();
		
		public Opdracht2_6a()
		{
			setPreferredSize(new Dimension(600, 600));					
		
			myShape = new GeneralPath();
			myShape.moveTo(0f, -1f);
			myShape.curveTo(0, -1, -2.5, 0, 0, 1);
			myShape.moveTo(0f, 1f);
			myShape.quadTo(-1, 0, 0, -1);
		
		}
		
		public void paintComponent(Graphics g) 
		{
			super.paintComponents(g);
		    Graphics2D g2 = (Graphics2D) g;
		    AffineTransform tr = new AffineTransform();
			tr.setToScale(100, 100);
		    Shape sh = tr.createTransformedShape(myShape);
			g2.translate(300, 200);
			
			g2.setColor(Color.black);
			//g2.fill(sh);
			g2.draw(sh);
		    
		    		   
		}
	}

}



