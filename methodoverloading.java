
//* declear a class
class stu
{
//*declear variable type as per requirment
int a=8;
float e=20.4f;
String s="IBM";

//*Declear a method
void govind(int x,int b)

{
System.out.println((x+b));
System.out.println((x*b));
//*difination of method or function(what we want to take output)
System.out.println("hello world"+ a*e+s);
System.out.println("Good Morning");
}
}
//* define another class
class student
{
//* Define a main method (this methos will be use in over all in this program)
public static void main(String [] arg)
{
//*Create a object
nxg obj=new nxg();
//*call a method through object 
obj.govind();
obj.govind(10,30);
//*obj.govind(6,2);
}
}
 //*create a new class and inherit the stu class   
class nxg extends stu
{
//*Declear a new method for this class(nxg)
void govind()
{
//*define what you want to take output
System.out.println((a+e));

}
	}







