import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

import javax.print.DocFlavor.STRING;

import list.Emp;

public class MapFlatMap {
	public static void main(String[] args) {
		Integer arr[]= {2,1,3,4,5,99};
		List<Integer> asList = Arrays.asList(arr);
		
		List<Integer> collect = asList.stream().map(e->e+10).collect(Collectors.toList());
		System.out.println(collect);
		
		//FlatMap
		List<Integer> asList4 = Arrays.asList(1,22,3);
		List<Integer> asList3 = Arrays.asList(2,3,4);
		List<Integer> asList2 = Arrays.asList(32,2,3,2);
		
		List<List<Integer>> asList5 = Arrays.asList(asList2,asList3,asList4);
		
		List<Integer> collect2 = asList5.stream().flatMap(e->e.stream()).collect(Collectors.toList());
		System.out.println(collect2);
		
		List<Integer> collect3 = asList5.stream().flatMap(e->e.stream()).map(n->n+10).collect(Collectors.toList());
		System.out.println(collect3);
		
		
		List<String> asList6 = Arrays.asList("Mulu","Gyana","Ranjan");
		
		List<String> asList7=Arrays.asList("Ram","Laxman","Sita");
		
		List<String> asList8=Arrays.asList("Jitu","Rabi");
		
		List<List<String>> asList9 = Arrays.asList(asList6,asList7,asList8);
		List<String> collect4 = asList9.stream().flatMap(e->e.stream()).sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());
		System.out.println("__________");
		Collections.sort(collect4);
		System.out.println(collect4);
		System.out.println("__________");

		System.out.println(collect4);
		
		
		
		//before java 8 fetaure
		for(List<String> list :asList9){
			for(String name:list) {
				System.out.println(name);
			}
		}
		
		List<Student> l = new ArrayList<Student>();
		l.add(new Student("Gyana", 12, 'A'));
		l.add(new Student("Milu", 122, 'C'));
		l.add(new Student("Ranjan", 1112, 'B'));
		l.add(new Student("Sahoo", 22, 'D'));
		Collections.sort(l,Comparator.comparing(Student::getName,String.CASE_INSENSITIVE_ORDER));
		
		List<Student> l1 = new ArrayList<Student>();
		l1.add(new Student("Ram", 121, 'E'));
		l1.add(new Student("Laxman", 122, 'C'));
		l1.add(new Student("Ranjan", 11121, 'B'));
		l1.add(new Student("Jiban", 2, 'Y'));
		
//		List<Student> asList12 = Arrays.asList(new Student("milu", 4, 't'),new Student("gyane", 3, 't'));
		
		List<List<Student>> asList10 = Arrays.asList(l,l1);
		
		l1.sort((a,b)->a.getName().compareToIgnoreCase(b.getName()));
		Collections.sort(l1,(a,b)->Integer.compare(a.getSid(), b.getSid()));
		for(Student k:l) {
		}
		
		List<Student> collect7 = asList10.stream().flatMap(e->e.stream()).sorted((a,b)->Integer.compare(a.getSid(), b.getSid())).collect(Collectors.toList());
		for(Student s:collect7) {
			System.out.println(s);
		}
		System.out.println(collect7+"'----");
		List<Integer> collect5 = asList10.stream().flatMap(e->e.stream()).map(e->e.sid).collect(Collectors.toList());
		
		Collections.sort(collect5);
		System.out.println(collect5+"__");
			
		//Before java 8 feature
		for(List<Student> listst: asList10) {
			for(Student st :listst) {
				System.out.println(st.grade);
			}
		}
		
		
		//Only using map
		
		List<List<Student>> asList11 = Arrays.asList(l);
		List<String> collect6 = asList11.stream().flatMap(e->e.stream()).map(e->e.name).collect(Collectors.toList());
		System.out.println(collect6);
	}

}

class Student{
	String name;
	int sid;
	char grade;
	public Student(String name, int sid, char grade) {
		super();
		this.name = name;
		this.sid = sid;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", sid=" + sid + ", grade=" + grade + "]";
	}
	
	
}
