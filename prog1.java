import java.util.*;
class Vector
{
private int arr[];
public Vector(int a[])
{
arr= new int[a.length];
for(int i=0;i<a.length;i++)
arr[i]=a[i];
}
public Vector(Vector obj)
{
int n=this.arr.length;
for(int i=0;i<n;i++)
this.arr[i]=obj.arr[i];
}
public void set(int index, double value)
{
this.arr[index]=value;
}
public double get(int index)
{
return this.arr[index];
}
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.println("Enter the size of the size of the array");
int n;
n=in.nextInt();
int arr=new int[n];
System.out.println("Enter the array elements");
for(int i=0;i<n;i++)
{
arr[i]=in.nextInt();
}
Vector object1 = new Vector(arr);

double val1 = object1.get(2);
System.out.println(val1);
Vector object2=new Vector(object1);
int val2 = object2.get(2);
System.out.println(val2);
}
}
