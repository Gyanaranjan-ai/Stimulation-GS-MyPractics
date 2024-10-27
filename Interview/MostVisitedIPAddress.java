package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostVisitedIPAddress {
	public static void main(String[] args) {
        String[] logs = {"10.0.0.1 Sathish", "10.0.0.2 Vinay", "10.0.0.1 Mahesh"};
       List<String> asList = Arrays.asList(logs);
        
       Map<String, Long> collect = asList.stream().flatMap(e->Arrays.stream(e.split(" "))).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       System.out.println(collect);
       System.out.println(collect.entrySet());
       
       for(Map.Entry<String, Long> entry:collect.entrySet())
    	   if(entry.getValue()>1) {
    	   System.out.println(entry.getKey()+":"+entry.getValue());
    	   }
	}
}
