import java.util.Scanner;
class Matrixaddition
{
public static void main (String args[])
{
int i,j,m,n;
Scanner sc=new Scanner(System.in);
System.out.println("Matrix Addition");
System.out.println("Enter no of rows and column");
m=sc.nextInt();
n=sc.nextInt();
int first[][]=new int[m][n];
int second[][]=new int[m][n];
int sum[][]=new int[m][n];
System.out.println("First matrix");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
first[i][j]=sc.nextInt();
}
}
System.out.println("Second matrix");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
second[i][j]=sc.nextInt();
}
}
System.out.println("Matrix Addition");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
sum[i][j]=first[i][j]+second[i][j];
System.out.println(sum[i][j]+"  ");
}
System.out.println("\n");
}
int transpose[][]=new int[m][n];
System.out.println("transpose of first matrix");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
transpose[i][j]=first[j][i];
System.out.println(transpose[i][j]);
}
}
int flag=0;
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
if(transpose[i][j]!=first[i][j])
{
flag=1;
break;
}
}
}
if(flag==0)
System.out.println("Symmetric");
else
System.out.println("Not Symmetric");
}
}