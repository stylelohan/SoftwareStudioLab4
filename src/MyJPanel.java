
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;


public class MyJPanel extends JPanel implements MouseMotionListener{
	
	private Square square = new Square(100);
	
	public MyJPanel(){
		addMouseMotionListener(this);
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawSquare(15, 15, 20, 20);
		// TODO Draw square and fill it with random color decided by method getRandomColor()
		// You should use fillRect()
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Get mouse dragged position and change suqare's position
		centerX = e.getX();
		centerY = e.getY();
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// No need to implement
	}
}
