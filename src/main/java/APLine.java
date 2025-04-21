public class APLine
{
  private int aa;
  private int bb;
  private int cc;
  public APLine(int a, int b, int c){
    aa = a;
    bb = b;
    cc = c;
  }
  public double getSlope(){
    return -a / b;
  }
  public boolean isOnLine(int x, int y){
    return (x*aa) + (y*bb) + c == 0;
  }
}
