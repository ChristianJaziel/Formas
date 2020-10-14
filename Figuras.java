package Figuras;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

	public class Figuras extends JPanel {
		// ventana
		 private JFrame ventana;
		    // contenedor
		    private Container contenedor;
		
		public Figuras() {
			
			// inicializar la ventana
			        ventana = new JFrame("Dibujando icono");
			        // definir tamaño a ventana
			        ventana.setSize(1280, 720);
			        ventana.setVisible(true);
			        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        ventana.setResizable(false);
			        
			        contenedor = ventana.getContentPane();
			        contenedor.setSize(1280, 720);
			        // agregar la ventana en el contenedor
			        contenedor.add(this, BorderLayout.CENTER);
		}
	   
		@Override
		protected void paintComponent (Graphics g) {
			super.paintComponent(g);
			
			//Dibujando lineas
			g.setColor(Color.magenta);
			g.drawLine(100, 50, 200, 50);
			g.drawLine(200, 50, 200, 100);
			g.drawLine(100, 50, 100, 100);
			g.drawLine(100, 100, 200, 100);
			
			g.setColor(Color.magenta);
			g.drawLine(130, 100, 130, 70);
			g.drawLine(130, 70, 160, 70);
			g.drawLine(160, 100, 160, 70);
			
			g.setColor(Color.magenta);
			g.drawLine(130, 100, 80, 140);
			g.drawLine(160, 100, 100, 155);
			
			
			g.setColor(Color.magenta);
			g.drawLine(100, 50, 150, 20);
			g.drawLine(200, 50, 150, 20);
			
			//Dibujando rectangulos
	        g.setColor(Color.magenta);
	        g.drawRect(280, 40, 20, 70);
	        g.drawRect(250, 50, 20, 60);
	        g.drawRect(310, 30, 20, 80);
	        g.drawRect(340, 20, 20, 90);
	        g.drawRect(370, 10, 20, 100);
	        
			
	      //trazo de circulos
	        g.setColor(Color.red);
	        g.drawOval(530, 50, 20, 80);
	        g.setColor(Color.magenta);
	        g.drawOval(520, 55, 40, 25);
	        g.setColor(Color.magenta);
	        g.drawOval(500, 70, 80, 30);
	        
			//Dibujando Circulos
	        g.setColor(Color.magenta);
			g.drawOval(100, 200, 120, 120);
			g.drawOval(125, 230, 30, 30);
			g.drawOval(165, 230, 30, 30);
			g.fillOval(135, 240, 10, 10);
			g.fillOval(175, 240, 10, 10);
			g.drawOval(140, 265, 40, 40);
			
			//Dibujando triangulos
			g.setColor(Color.magenta);
			g.drawLine(450, 300, 550, 300);
			g.drawLine(450, 300, 500, 250);
			g.drawLine(550, 300, 500, 250);
			g.drawLine(500, 250, 500, 230);
			g.drawLine(500, 250, 550, 250);
			g.drawLine(500, 230, 550, 250);
			
			g.drawLine(400, 250, 400, 200);
			g.drawLine(400, 250, 450, 250);
			g.drawLine(400, 200, 450, 250);
			
			
			
			
		}
		
		
	}
