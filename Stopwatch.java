package day6;
import java.util.*;
public class Stopwatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sw=new Scanner(System.in);
System.out.println("Starting Time");
long starttimer=sw.nextLong();
starttimer=System.currentTimeMillis();
System.out.println("Ending Time");
long stoptimer=sw.nextLong();
stoptimer=System.currentTimeMillis();
long elapsed=stoptimer-starttimer;
System.out.println("elapsed time:"+elapsed);
System.out.println();
System.out.println("Ending Time in sec:"+(1/1000));
	}

}
