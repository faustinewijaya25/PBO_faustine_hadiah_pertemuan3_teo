import java.util.Scanner;
public class TestAritmetika {
	public static void main(String[] args) {
		int aa = 5;
		int bb = 6;
		double cc = 0.5;
		String nama = "  ";
	    String alamat = "  ";
	    String umur = "     ";
	    
		System.out.println("aa = " + aa);
		System.out.println("bb = " + bb);
		System.out.println("cc = " + cc);
	
		System.out.println("aa + bb = " + (aa + bb  ));

		System.out.println("aa * bb * cc  = " + (aa * bb * cc ));
		
		System.out.println("bb / cc = " + (bb / cc ));
	    Scanner masukan = new Scanner(System.in);	
	      
	       
	      System.out.print("masukkan nama:");
	      	nama = masukan.next();
	      System.out.print("masukkan alamat:");
	        alamat = masukan.next();
	      System.out.print("masukkan  umur:");
	        umur = masukan.next();
	       System.out.println();
	       
	    System.out.println("saudara = " + nama);
		System.out.println("tinggal = " + alamat);
		System.out.println("berumur = " + umur + "tahun");
  }
}

	       
	      

	       
	  
		
						