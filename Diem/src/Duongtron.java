
public class Duongtron extends Diem
{
   public float bankinh;
   Duongtron(float x, float y, float r)
   {
	   super(x,y);
	   this.bankinh = r;
   }
   public static final float PI = 3.14f;
   public static float chuvi(float r) 
   {
	   return r*2*PI;   
   }
   public static float dientich(float r) 
   {
	 return PI*r*r;  
   }
   public static void main(String[] args) 
   {
	   Diem A = new Diem(5,6);
	   A.in();
	   System.out.println("chu vi duong tron la: "+ Duongtron.chuvi(7));
	   System.out.println("dien tich duong tron la: "+ Duongtron.dientich(7));
	   
	   
   }
}
