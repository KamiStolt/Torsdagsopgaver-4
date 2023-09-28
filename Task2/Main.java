import java.util.Scanner;
class Main{
	
public static void main(String [] args){

System.out.println(" please type your name");

Scanner scan = new Scanner(System.in);
String name = scan.nextLine();

System.out.println(" Hi " + name + " please type your age. ");

int age = Integer.parseInt(scan.nextLine());

System.out.println("YOUR AGE:");
System.out.println(" ");
System.out.println(age);

int retire= 67-age;
if(age<67) {


System.out.println(" then you have " + retire + " years to go");
} else {

	System.out.println("you are already retired! ");
}
}
}