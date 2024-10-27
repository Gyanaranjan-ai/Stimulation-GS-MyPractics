package list;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmpMain {
	public static void main(String[] args) {
        List<Emp> employees = Arrays.asList(
                new Emp(1, "John Doe", "Org1"),
                new Emp(2, "Jane Smith", "Org2"),
                new Emp(2, "Michael Brown", "Org1"),
                new Emp(4, "James Wilson", "Org3"),
                new Emp(5, "James Wilson", "Org2")
        );
        
        //get the organisation & List of employee
        Map<String, List<Emp>> organizationEmployeeMap = employees.stream()
                .collect(Collectors.groupingBy(Emp::getOrganization));
        
      Map<String,List<Emp>> l= employees.stream()
                .collect(Collectors.groupingBy(e->e.getOrganization()));

        	System.out.println(l);
        	
        	//get Id & get List<Name>
        	Map<Integer, List<String>> collect = employees.stream()
        			.collect(Collectors.groupingBy(e->e.getId(),Collectors.mapping(e->e.getName(), Collectors.toList())));
        	System.out.println(collect);
        	
        	Map<Integer, Set<String>> collect2 = employees.stream().collect(Collectors.groupingBy(e->e.getId(),Collectors.mapping(Emp::getName, Collectors.toSet())));
        	System.out.println(collect2);
        	
        	
        	//use hastable
        	Hashtable<Integer, Set<String>> collect3 = employees.stream().collect(Collectors.groupingBy(e->e.getId(),Hashtable::new,Collectors.mapping(Emp::getName, Collectors.toSet())));
        	System.out.println(collect3);
        	
        	
        	Hashtable<Integer, Set<String>> collect34 = employees.stream().collect(Collectors.groupingBy(e->e.getId(),()->new Hashtable<>(),Collectors.mapping(Emp::getName, Collectors.toSet())));
        	System.out.println(collect34);
        	
//        organizationEmployeeMap.forEach((org, empList) -> {
//            System.out.println("Organization: " + org);
//            empList.forEach(System.out::println);
//        });
    }

}
