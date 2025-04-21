public class APLine
{
  private double aa;
  private double bb;
  private double cc;
  public APLine(int a, int b, int c){
    aa = a;
    bb = b;
    cc = c;
  }
  public double getSlope(){
    return -aa / bb;
  }
  public boolean isOnLine(int x, int y){
    return (x*aa) + (y*bb) + cc == 0;
  }
}
