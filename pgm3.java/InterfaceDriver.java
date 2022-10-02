import java.util.InputMismatchException;
import java.util.Scanner;




interface StudentFee{
abstract void getFee() throws InvalidFeeException;
}



class InvalidFeeException extends Exception
{
public InvalidFeeException(String s)
{
super(s);
}
}


class Student implements StudentFee{
String name;
int fees;
Scanner scanner = new Scanner(System.in);
public void getName(){                                     
System.out.println("\nEnter student name:");
this.name = scanner.next();
}

public void getFee() throws InvalidFeeException,InputMismatchException            
{
System.out.println("\nEnter the fees: ");
this.fees = scanner.nextInt();
if(this.fees<0){
throw new InvalidFeeException("Fees amount should be above zero");                   
}
}


public void displayStudent(){
System.out.println("\nStudent name: "+name+" fees: "+fees);                                 
}
}




class InterfaceDriver{

public static void main(String[] args){

Student s1 = new Student();
s1.getName();

try{

s1.getFee();
s1.displayStudent();
}
catch(InvalidFeeException e1)         
{
System.out.println("\nException Handled");
System.out.println(e1.toString());
}
catch(InputMismatchException e2)
{
System.out.println("\nException Handled");
System.out.println("\nFees should be an integer");
System.out.println(e2.toString());
}
finally{
System.out.println("The ended.");
}

}
}