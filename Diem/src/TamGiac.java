
public class TamGiac extends Diem
{  
   public float chieucao; 
   TamGiac(float x, float y, float a )
   {
	  super(x,y); 
	  this.chieucao = a;
	 
   }
   
   public void hien()
   {
	   System.out.println("chieu cao tam giac la "+chieucao);
   }
   public void sosanh(Diem khac) 
   { 
	   if(this.x == khac.x || this.y == khac.y) 
	   {
		  System.out.println("hai diem nam tren mot duong thang"); 
	   }
   }
   public static void main(String[] args)
   {
	   TamGiac A=new TamGiac(5,7,7);
	   Diem B=new Diem(6,7);
	   Diem C=new Diem(6,8);
	   A.in();A.hien();
	   B.in();
	   C.in();
	   A.sosanh(B);
   }
}