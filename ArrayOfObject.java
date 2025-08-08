

class student{
  int roll;
  String name;
  int marks;
}

public class ArrayOfObject{
  public static void main(String args[]){

    student s1 = new student();
    s1.roll = 1;
    s1.name = "Sachin";
    s1.marks = 90;

    student s2 = new student();
    s2.roll = 2;
    s2.name = "Samrat";
    s2.marks = 92;

    student s3 = new student();
    s3.roll = 3;
    s3.name = "Shreyas";
    s3.marks = 95;

    student students[] = new student[3];

    students[0] = s1;
    students[1] = s2;
    students[2] = s3;


    for(int i=0;i<students.length;i++){
      System.err.println(students[i].roll + " : " +students[i].name +" : " +students[i].marks);
    }

  }
}