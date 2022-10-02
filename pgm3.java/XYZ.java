import java.util.Scanner;

class Faculty{

int facultyid;
int salary;
Scanner input = new Scanner(System.in);

}

class FullTimeFaculty extends Faculty{

int basic;
int allowance;

void fullTimeInput(){
System.out.println("Enter Full-time facultyId: ");
facultyid=input.nextInt();
System.out.println("Enter  basic salary: ");
basic=input.nextInt();
System.out.println("Enter allowance: ");
allowance=input.nextInt();

}



void fullTimeOutput(){
salary=basic+allowance;
System.out.println(" total salary of full-time faculty with id: "+facultyid+" basic salary: "+basic+" allowance: "+allowance+" is :"+salary);

}

}



class PartTimeFaculty extends Faculty{

int hour;
int rate;
void partTimeInput(){
System.out.println("Enter Part time facultyId: ");
facultyid=input.nextInt();
System.out.println("Enter worktime in hours: ");
hour=input.nextInt();
System.out.println("Enter hourly rate: ");
rate=input.nextInt();

}




void partTimeOutput(){
salary=hour*rate;
System.out.println(" Total salary of parttime faculty with id: "+facultyid+" working hour: "+hour+" hourly rate: "+rate+" is :"+salary);

}


}


class XYZ{

public static void main(String[] args){



FullTimeFaculty f1 = new FullTimeFaculty();
PartTimeFaculty p1= new PartTimeFaculty();
FullTimeFaculty f2 = new FullTimeFaculty();
PartTimeFaculty p2= new PartTimeFaculty();

f1.fullTimeInput();
p1.partTimeInput();

f1.fullTimeOutput();
p1.partTimeOutput();


f2.fullTimeInput();
p2.partTimeInput();

f2.fullTimeOutput();
p2.partTimeOutput();



}

}