import java.awt.*;
import java.applet.*;
import java.awt.*;
/*
<applet code="screen.class" width="300" height="200">
</applet>
*/
class circle extends Thread
{
  public int x,y,r;
  public int inc;
  public int dir;
  public screen s1;
  public void draw(Graphics g)
  {
    g.fillOval(x,y,r,r);
  }
  public circle(int xx,int yy,int rr,int d,int l,screen s)
  {
    x=xx;y=yy;r=rr;
    dir=d;
    s1=s;
    inc=l;
    start();
  }
  public void run()
  {
    for(;;)
    {
      if(y>=300)
      {
        if(dir==1)
        {
          dir=2;
        }
        if(dir==-2)
        {
          dir=-1;
        }
      }
      if(y<=0)
      {
        if(dir==-1)
        {
          dir=-2;
        }
        if(dir==2)
        {
          dir=1;
        }
      }
      if(x>=600)
      {
        if(dir==1)
        {
          dir=2;
        }
        if(dir==2)
        {
          dir=-1;
        }
      }
      if(x<0)
      {
        if(dir==-1)
        {
          dir=2;
        }
        if(dir==-2)
        {
          dir=1;
        }
      }
      if(dir==1)
      {
        x=x+inc;
        y=y+inc;
      }
      else if(dir==2)
      {
        y=y-inc;
        x=x+inc;
      }
      else if(dir==-1)
      {
        x=x-inc;
        y=y-inc;
      }
      else if(dir==-2)
      {
        y=y+inc;
        x=x-inc;
      }
      s1.repaint();
      try
      {
        sleep(50);
      }
      catch(Exception e){
      }
    }
  }
}
public class screen extends Applet
{
  public circle c1,c2,c3,c4;
  public screen(){}
  public void init()
  {
    c1=new circle(0,300,20,1,10,this);
    c2=new circle(400,300,20,2,5,this);
    c3=new circle(400,0,20,-1,10,this);
    c4=new circle(400,300,20,-2,5,this);
  }
  public void start(){}
  public void stop(){}
  public void paint(Graphics g)
  {
    setBackground(Color.white);
    c2.draw(g);
    c1.draw(g);
    c3.draw(g);
    c4.draw(g);
  }
}
