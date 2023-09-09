package java8;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class EmpStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> a1=new ArrayList<>();
		a1.add(new Emp(1,"Manya","Manager",20000));
		a1.add(new Emp(2,"Avinash","TL",38000));
		a1.add(new Emp(3,"Munna","Dev",67000));
		a1.add(new Emp(4,"Sha","Intern",22000));
		System.out.println(a1);
		a1.add(new Emp(5,"Munna","Dev",67000));
		a1.add(new Emp(6,"kal","Intern",28000));
	
		
		
		List<String> li = a1.stream().map(e -> e.toString()).collect(Collectors.toList());
		System.out.println("elements in employee list:" + li);
         
		Set<String> hs=a1.stream().map(e->e.toString()).collect(Collectors.toSet());
		System.out.println("elements in emp set:"+hs);
		
		long count =a1.stream().count();
		System.out.println(count);
		
		long c=a1.stream().filter(a->a.getEname().startsWith("M")).count();
		System.out.println(c);
		
		Stream<Emp> namestartswith=a1.stream().filter((a->a.getEname().startsWith("m")));
		System.out.println("namestartswith m:"+namestartswith.collect(Collectors.toList()));
		
		
		Object s = a1.stream().collect(Collectors.maxBy(Comparator.comparingInt(w -> w.salary)));
		System.out.println("Emp maximum salary:" + s);
		
		Object ss = a1.stream().collect(Collectors.minBy(Comparator.comparingInt(x-> x.salary)));
		System.out.println("Emp minimum salary:" + ss);
		
		Object s3 = a1.stream().collect(Collectors.averagingInt(y ->y.salary));
		System.out.println("Emp average salary:" + s3);
		
		List<String> namesofemp = a1.stream().map(n->n.ename).collect(Collectors.toList());
        System.out.println(namesofemp);
        
        List<String> namesofemp1 = a1.stream().map(n->n.designation).collect(Collectors.toList());
        System.out.println(namesofemp1);
        //object s4=a1.stream().collect(Collectors.tos
        System.out.println("Unic designationwise record");
        a1.stream().map(Emp::getDesignation).distinct().forEach(System.out::println);
        System.out.println("************************");
        
        Object s4 = a1.stream().sorted((e1,e2)->((Emp) e1).getEname().compareTo(((Emp) e2).getEname())).collect(Collectors.toList());
        
      
}}
