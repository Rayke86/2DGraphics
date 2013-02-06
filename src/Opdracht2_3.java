import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class Opdracht2_3 extends JFrame 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{ // TODO Auto-generated method stub
		Opdracht2_3 opdr = new Opdracht2_3();
	}
	
	public Opdracht2_3()
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
        
        JPanel centerPanel = new Opdracht2_3a();
        panel.add(centerPanel, BorderLayout.CENTER);
        
        JPanel bottomPanel = new JPanel(new FlowLayout());
        panel.add(bottomPanel, BorderLayout.SOUTH);
                        
        setContentPane(panel);
        setVisible(true);
	}
	
	

	public class Opdracht2_3a extends JPanel 
	{
		public Opdracht2_3a()
		{
			setPreferredSize(new Dimension(600, 400));
		}
		
		
		public void paintComponent(Graphics g) 
		{
		    Graphics2D g2 = (Graphics2D) g;
		    g2.drawRect(195, 175, 200, 200);
		    g2.rotate(Math.PI/4, 400, 450);
		    g2.drawRect(100, 300, 200, 200);
		    
		}
	}

}

