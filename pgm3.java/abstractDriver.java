abstract class Car{

int noOfWheels;             

abstract void ignition();


public void changeGear(){
System.out.println("\n The  gear have been changed...\n");
}
}





class Sedan extends Car{
void ignition(){
System.out.println("\nThe engine have been started\n");      
}



void displayWheels(int n){
this.noOfWheels = n;
System.out.println("\nThe Sedan have "+noOfWheels+" wheels on it\n");
}

}





class abstractDriver{
public static void main(String[]  args)
{

Sedan s1 = new Sedan();     
s1.ignition();                       
s1.changeGear();
s1.displayWheels(4);           

}
}