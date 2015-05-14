import java.util.*;
import java.awt.*;
import java.applet.*;
public class bubblesort extends Applet
{
  public void init()// bubblesort()
     {
       setBackground(Color.BLACK);
       //setSize(1000,1000);
       setVisible(true);
      }
    public void paint(Graphics e)
       {
	   int p=1;
        try
       {
	   if(p==1)
	   {
	     Graphics2D g2 = (Graphics2D) e;
		  g2.setStroke(new BasicStroke(5));
	      e.setColor(Color.white);
		  e.setFont(new Font("TimesRoman", Font.PLAIN, 15));
		  e.drawString("BUBBLE SORT",400,100);
		  e.setFont(new Font("TimesRoman", Font.PLAIN, 10));
		  e.drawString("(Ascending order)",420,130);
		  e.setFont(new Font("TimesRoman", Font.PLAIN, 15));
		  Thread.sleep(1000);
		  e.setColor(Color.pink);
                      e.fillRect(580,200,100,100);
                      e.drawRect(580,200,100,100);
					  e.setColor(Color.BLACK);
		   e.drawString("2",630,250);
		    e.setColor(Color.pink);
					   e.fillRect(220,200,100,100);
                      e.drawRect(220,200,100,100);
					  e.setColor(Color.BLACK);
		   e.drawString("5",270,250);
		    e.setColor(Color.pink);
					   e.fillRect(340,200,100,100);
                      e.drawRect(340,200,100,100);
					  e.setColor(Color.BLACK);
		   e.drawString("3",390,250);
		    e.setColor(Color.pink);
					   e.fillRect(460,200,100,100);
                      e.drawRect(460,200,100,100);
					  e.setColor(Color.BLACK);
		   e.drawString("1",510,250);
		   Thread.sleep(1000);
		   e.setColor(Color.yellow);
		g2.drawLine(270,150,270,180);
		g2.drawLine(270,180,260,175);
		g2.drawLine(270,180,280,175);
		 Thread.sleep(500);
		e.setColor(Color.green);
		g2.drawLine(630,320,630,350);
		g2.drawLine(630,320,620,325);
		g2.drawLine(630,320,640,325);
		//e.drawString("3 is",510,450);
		 
		Thread.sleep(1000);
		e.setColor(Color.BLACK);
		g2.drawLine(630,320,630,350);
		g2.drawLine(630,320,620,325);
		g2.drawLine(630,320,640,325);
		Thread.sleep(500);
		e.setColor(Color.green);
		g2.drawLine(510,320,510,350);
		g2.drawLine(510,320,500,325);
		g2.drawLine(510,320,520,325);
	Thread.sleep(1000);
		    for(int i=0;i<=100;i=i+10)
          {
          e.setColor(Color.BLACK);
                      e.fillRect(460,200,i,i);
                      e.drawRect(460,200,i,i);
					  e.fillRect(340,200,i,i);
                      e.drawRect(340,200,i,i);
					  Thread.sleep(100);
          }
		  for(int i=0;i<=100;i=i+10)
          {
          e.setColor(Color.pink);
                      e.fillRect(460,200,i,i);
                      e.drawRect(460,200,i,i);
					  e.fillRect(340,200,i,i);
                      e.drawRect(340,200,i,i);
					  Thread.sleep(100);
          }
		  e.setColor(Color.BLACK);
		  e.drawString("1",390,250);
		  e.drawString("3",510,250);
		  Thread.sleep(1000);
		       e.setColor(Color.BLACK);
		g2.drawLine(510,320,510,350);
		g2.drawLine(510,320,500,325);
		g2.drawLine(510,320,520,325);
		    Thread.sleep(500);
			e.setColor(Color.green);
		g2.drawLine(390,320,390,350);
		g2.drawLine(390,320,380,325);
		g2.drawLine(390,320,400,325);
	           Thread.sleep(1000);
		    for(int i=0;i<=100;i=i+10)
          {
          e.setColor(Color.BLACK);
                      e.fillRect(220,200,i,i);
                      e.drawRect(220,200,i,i);
					  e.fillRect(340,200,i,i);
                      e.drawRect(340,200,i,i);
					  Thread.sleep(100);
          }
		  for(int i=0;i<=100;i=i+10)
          {
          e.setColor(Color.pink);
                      e.fillRect(220,200,i,i);
                      e.drawRect(220,200,i,i);
					  e.fillRect(340,200,i,i);
                      e.drawRect(340,200,i,i);
					  Thread.sleep(100);
          }
		  e.setColor(Color.BLACK);
		  e.drawString("1",270,250);
		  e.drawString("5",390,250);
		  Thread.sleep(1000);
		   e.setColor(Color.BLACK);
		g2.drawLine(270,150,270,180);
		g2.drawLine(270,180,260,175);
		g2.drawLine(270,180,280,175);
		  g2.drawLine(390,320,390,350);
		g2.drawLine(390,320,380,325);
		g2.drawLine(390,320,400,325);
		Thread.sleep(1000);
		   e.setColor(Color.yellow);
		g2.drawLine(390,150,390,180);
		g2.drawLine(390,180,380,175);
		g2.drawLine(390,180,400,175);
		Thread.sleep(1000);
		e.setColor(Color.green);
		g2.drawLine(630,320,630,350);
		g2.drawLine(630,320,620,325);
		g2.drawLine(630,320,640,325);
		Thread.sleep(1000);
		  for(int i=0;i<=100;i=i+10)
          {
          e.setColor(Color.BLACK);
                      e.fillRect(460,200,i,i);
                      e.drawRect(460,200,i,i);
					  e.fillRect(580,200,i,i);
                      e.drawRect(580,200,i,i);
					  Thread.sleep(60);
          }
		  for(int i=0;i<=100;i=i+10)
          {
          e.setColor(Color.pink);
                      e.fillRect(460,200,i,i);
                      e.drawRect(460,200,i,i);
					  e.fillRect(580,200,i,i);
                      e.drawRect(580,200,i,i);
					  Thread.sleep(60);
          }
		   e.setColor(Color.BLACK);
		  e.drawString("2",510,250);
		  e.drawString("3",630,250);
		  Thread.sleep(1000);
		  e.setColor(Color.BLACK);
		g2.drawLine(630,320,630,350);
		g2.drawLine(630,320,620,325);
		g2.drawLine(630,320,640,325);
		Thread.sleep(500);
		e.setColor(Color.green);
		g2.drawLine(510,320,510,350);
		g2.drawLine(510,320,500,325);
		g2.drawLine(510,320,520,325);
		Thread.sleep(1000);
		 for(int i=0;i<=100;i=i+10)
          {
          e.setColor(Color.BLACK);
                      e.fillRect(460,200,i,i);
                      e.drawRect(460,200,i,i);
					  e.fillRect(340,200,i,i);
                      e.drawRect(340,200,i,i);
					  Thread.sleep(100);
          }
		  for(int i=0;i<=100;i=i+10)
          {
          e.setColor(Color.pink);
                      e.fillRect(460,200,i,i);
                      e.drawRect(460,200,i,i);
					  e.fillRect(340,200,i,i);
                      e.drawRect(340,200,i,i);
					  Thread.sleep(100);
          }
		   e.setColor(Color.BLACK);
		  e.drawString("5",510,250);
		  e.drawString("2",390,250);
		  Thread.sleep(1000);
		  e.setColor(Color.BLACK);
		g2.drawLine(510,320,510,350);
		g2.drawLine(510,320,500,325);
		g2.drawLine(510,320,520,325);
		g2.drawLine(390,150,390,180);
		g2.drawLine(390,180,380,175);
		g2.drawLine(390,180,400,175);
		Thread.sleep(1000);
		 e.setColor(Color.yellow);
		g2.drawLine(510,150,510,180);
		g2.drawLine(510,180,500,175);
		g2.drawLine(510,180,520,175);
		Thread.sleep(500);
		 e.setColor(Color.green);
		g2.drawLine(630,320,630,350);
		g2.drawLine(630,320,620,325);
		g2.drawLine(630,320,640,325);
		Thread.sleep(1000);
		 for(int i=0;i<=100;i=i+10)
          {
          e.setColor(Color.BLACK);
                      e.fillRect(460,200,i,i);
                      e.drawRect(460,200,i,i);
					  e.fillRect(580,200,i,i);
                      e.drawRect(580,200,i,i);
					  Thread.sleep(60);
          }
		  for(int i=0;i<=100;i=i+10)
          {
          e.setColor(Color.pink);
                      e.fillRect(460,200,i,i);
                      e.drawRect(460,200,i,i);
					  e.fillRect(580,200,i,i);
                      e.drawRect(580,200,i,i);
					  Thread.sleep(60);
          }
		   e.setColor(Color.BLACK);
		  e.drawString("3",510,250);
		  e.drawString("5",630,250);
		  Thread.sleep(1000);
		e.setColor(Color.BLACK);
		g2.drawLine(510,150,510,180);
		g2.drawLine(510,180,500,175);
		g2.drawLine(510,180,520,175);
		g2.drawLine(630,320,630,350);
		g2.drawLine(630,320,620,325);
		g2.drawLine(630,320,640,325);
		Thread.sleep(1000);
		e.setColor(Color.white);
		e.drawString("SORTED COMPLETELY",500,500);
	}
	p++;
	}
		catch(Exception r)
		{
		}
		}
		/*public  static void  main(String argf[])
		{
		new bubblesort();
		}*/
}
		