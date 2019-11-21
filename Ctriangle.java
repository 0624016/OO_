class CTriangle extends CShape
{
  protected double a,b,c;
  public CTriangle(double n,m,s)
  {
    a=n;
    b=m;
    c=s;
  }
  public void show()
  {
    System.out.print("color="+color+",  ");
    System.out.println("area="+a*b*0.5);
  }
}

public static void main(String args[])
{
  CShape tri=new CTriangle(3,4,5);
  tri.setColor("Red");
  tri.show();
}
