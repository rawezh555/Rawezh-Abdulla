import java.util.Scanner;
public class Rawezh{
  public static void main (String[]args){

    Scanner lion = new Scanner(System.in);


    System.out.println("Nawakat Chan Pita");
	int rooster = lion.nextInt();

	String[]rabbit = new String[rooster];
	int a;
	for(a=0; a<rooster; a++){
	System.out.println("pity nawakat" + (a+1));
	rabbit[a] = lion.next();
	}

     lion.close();

    System.out.print("ama nawakata:");
	for(a=0; a<rooster; a++){
	System.out.print(rabbit[a]);
	}

	System.out.println(" ");



 }
 }
