public class for4{

public static void main(String[] args) {
// TODO Auto-generated method stub
System.out.print("prime nos. between 10 and 99 are: \n");

for(int n=10;n<=99;n++)
{
	boolean flag=true;
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
{
flag=false;
break;
}
}
if(flag)
{
System.out.println(n);
}
}

}
}