
public class CSE extends Course{
	 int credit;
	    String course_title, course_name;
	    public void setall(int a,String b,String c)
	    {
	    	credit=a;
	    	course_title=b;
	    	course_name=c;
	    }
	    public void getCredit(int c)
	    {
	    	credit=c;
	        System.out.println("Credit : " +credit);
	    }
	    public void getall()
	    {
	    System.out.println("Name : " +course_name);
	    System.out.println("Title : " +course_title);
	    System.out.println("Credit : " +credit);
	    }

}
