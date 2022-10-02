import java.lang.Math;



class Medicine {

public void displayLabel() {
System.out.println(" \n The   MLI  (MedLabIn) \n\tBangalore\n");
}
}





class Tablet extends Medicine {

public void displayLabel() {

System.out.println("\nTablets should be kept in a cool dry place, not to be placed in direct sunlight\n");


}

}






class Syrup extends Medicine {


public void displayLabel() {
System.out.println("\nThis syrup is not for children, should be taken as informed by the physician\n");
}

}







class Ointment extends Medicine {

public void displayLabel() {
System.out.println("\nOintment is for external use only. Once used, keep the seal tightly closed\n");
}

}








class TestMedicine {
public static void main(String[] args) {

System.out.println("\nThe randomly generated objects\n");

boolean med = false, t = false, s = false, o = false;
int counter = 0;


while (counter < 4) {

int random = (int) (Math.random() * (4 - 1 + 1) + 1);

if (random == 1 && med != true) 
{
Medicine m = new Medicine();
System.out.println("\n***The Base class Medicine object created and displayLabel has been called.***\n");
m.displayLabel();
med = true;
counter++;
}
else if (random == 2 && t != true)
{
Tablet t1 = new Tablet();
System.out.println("\n***The child class Tablet object created and displayLabel has been called.***\n");
t1.displayLabel();
t = true;
counter++;
}
else if (random == 3 && s != true)
{

Syrup s1 = new Syrup();
System.out.println("\n***The child class Syrup object created and displayLabel has been called.***\n");
s1.displayLabel();
s = true;
counter++;

}
else if (random == 4 && o != true)
{
Ointment o1 = new Ointment();
System.out.println("\n***The child class Ointment object created and displayLabel has been called.***\n");
o1.displayLabel();
o = true;
counter++;
}


}

}
}