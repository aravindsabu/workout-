import java.util.Scanner;






class Student {

protected int rollno;
protected double percentage;

public Student() {
rollno = 0; 
percentage = 0.0;
}

public Student(int roll, double percent) {
this.rollno = roll; 
this.percentage = percent;
}

public void show() {
System.out.println("\nRollNo: " + rollno + " Percentage: " + percentage + " of the Student.\n");
}
}




class CollegeStudent extends Student {

protected int semester;

public CollegeStudent() {
rollno = 0;
percentage = 0.0;
semester = 0;
}

public CollegeStudent(int roll, double percent, int sem) {
this.rollno = roll;
this.percentage = percent;
this.semester = sem;
}

public void show() {
System.out.println("\nRollNo: " + rollno + " Percentage " + percentage + " of the College Student in semester "+ semester + "\n");
        
}

}






//class SchoolStudent
class SchoolStudent extends Student {

protected int classname;

public SchoolStudent() {
rollno = 0;
percentage = 0;
classname = 0;
}

public SchoolStudent(int roll, double percent, int classname) {
this.rollno = roll;
this.percentage = percent;
this.classname = classname;
}

public void show() {
System.out.println("\nRollNo: " + rollno + " Percentage " + percentage + " of the School Student in " + classname + "th\n");
}

}






class StudentDriver {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);





Student[] st;

CollegeStudent[] cs;

SchoolStudent[] ss;





ss = new SchoolStudent[3];

cs = new CollegeStudent[2];




ss[0] = new SchoolStudent(1, 59 , 11);
ss[1] = new SchoolStudent(2, 91 , 12);
ss[2] = new SchoolStudent(3, 71 , 8);

cs[0] = new CollegeStudent(11, 40, 3);
cs[1] = new CollegeStudent(12, 81, 5); 





System.out.println("\n The student details stored in arrays.\n");

for(int i=0;i<ss.length;i++){    
ss[i].show();
}

for(int i=0;i<cs.length;i++){
cs[i].show();
}




System.out.println("\nThe students with A grade in College and School.\n");
int count = 0;
for (CollegeStudent c : cs) { // using foreach loop
if (c.percentage > 75.0) {
System.out.println("\nCollege Student  RollNO: " + c.rollno + " percentage: " + c.percentage + " in semester: "+ c.semester + " have A grade.");
count++;
            }
}
for (SchoolStudent s : ss) {// using foreach loop
if (s.percentage > 75.0) {
System.out.println("\nSchool Student  RollNO: " + s.rollno + " percentage: " + s.percentage + " in class: "+ s.classname + " have A grade.");
count++;
            }
}
System.out.println("\nTotal number of Students in college and School who have A grade is \n" + count);







count =0;//using above used count to view message if rollnumber is not present

System.out.print("\nEnter rollNumber to check whether the student is a college student or school student: ");
int rollNumber = scanner.nextInt();

for (int i = 0; i < cs.length; i++) {
if (rollNumber == cs[i].rollno) {
System.out.println("\nThis is a college Student, RollNumber: " + cs[i].rollno + " percentage: "+ cs[i].percentage + " in semester: " + cs[i].semester + "\n");
count++;
}
}
for (int i = 0; i < ss.length; i++) {
if (rollNumber == ss[i].rollno) 
{
System.out.println("\nThis is a School Student, RollNumber: " + ss[i].rollno + " percentage: "+ ss[i].percentage + " in class: " + ss[i].classname);
count++;
}
}

if(count==0) System.out.println("\nThis rollnumber is not present in the record\n"); 

}
}