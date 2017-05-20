public class Pemanggilan{
	public static void main(String []args){
	TurunanMotor a = new TurunanMotor();
	System.out.println("Ini Untuk Abstraction");
	System.out.println("=====");
	a.printJenis();
	a.printMerk();
	
	Motor1 pgl = new Motor1();
    pgl.setCc(150);
    pgl.setMerk("CBR");     
	System.out.println();
	System.out.println("Ini Untuk Encapsulation");
	System.out.println("=====");
    System.out.println("Cc Motor  = "+pgl.getCc());
    System.out.println("Merk Motor  = "+pgl.getMerk());
	}
}