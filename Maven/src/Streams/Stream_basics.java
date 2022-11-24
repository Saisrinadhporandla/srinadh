package Streams;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;
public class Stream_basics {
	
    @Test
	public void Test()
	{
    	List<String> s=new ArrayList<String>();
    	s.add("sai");
    	s.add("hii");
    	s.add("shii");
    	long a=s.stream().filter(i->i.startsWith("s")).count();
    	System.out.println(a);
		
	}

}
