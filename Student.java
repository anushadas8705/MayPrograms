public class Student
{
    double sub1,sub2,sub3,sub4,sub5;
    String name;
   void init(String StudentName,double marks1, double marks2 , double marks3, double marks4, double marks5) 
   {
      name= StudentName;
      sub1= marks1;
      sub2= marks2;
      sub3=marks3;
      sub4=marks4;
      sub5=marks5;
    }
    double calc()
   {
     double avg= (sub1+sub2+sub3+sub4+sub5)/5;
    return avg;
}
void Display()
{
 System.out.println(name);
}
 void Display1()
 {
     System.out.println("Stream: Science with Computer"); 
    }
    void Display2()
    {
       System.out.println("Stream: Science without Computer");
    }
    void Display3()
    {
      System.out.println("Stream: Commerce with Maths");   
    }
    void Display4()
    {
        System.out.println("Stream: Commerce without Maths");
    }
    public static void main()
    {
       Student obj= new Student();
       obj.init("Anusha",20,30,45,22,77);
       obj.Display();
       double result= obj.calc();
        System.out.println("The Average is "+ result);
        if(result>=90)
        {
            obj.Display1();
        }
        else if((result<90)||(result>=80))
        {
            obj.Display2();
        }
        else if((result<80)||(result>=70))
        {
           obj.Display3();
        }
        else
        {
         obj.Display4(); 
        }
    }
}