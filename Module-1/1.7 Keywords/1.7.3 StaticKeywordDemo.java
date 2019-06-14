package com.fundamentals;
class Count
{
	static int cnt;
	Count()
	{
		cnt++;
		System.out.println("Count:"+cnt);
	}
}

class College
{
	static int cunt;
	int stdid;
	String sname;
	double per;
	static String college_name="MR college";
	public College(int stdid,String sname,double per ){
		cunt++;
		this.stdid=stdid;
		this.sname=sname;
		this.per=per;		
	}
	static String get_college()
	{
		return college_name;
	}
	void dispstud()
	{
		System.out.println("stdid:"+stdid);
		System.out.println("sname:"+sname);
		System.out.println("per:"+per);
		System.out.println("College:"+College.get_college());
	}
}
public class StaticKeywordDemo {
static
{
	System.out.println("This is static block");
}
{
   System.out.println("This is non static block/Instance initializer block");
}
	public static void main(String[] args) {
		System.out.println("This is main() block");
		Count c1=new Count();
		Count c2=new Count();
		Count c3=new Count();
		
		//College s1=new College(11,"Nivedita",78.86);
		//s1.dispstud();
		
		
		//College s2=new College(222,"Suyog",60.86);
		//s2.dispstud();
		
		StaticKeywordDemo obj=new StaticKeywordDemo();
	}

}
