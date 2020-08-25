package mainjava2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithObjectsClass {

	public static void main(String[] args) {
		StreamWithObjects obj1=new StreamWithObjects("Amit", 35);
		StreamWithObjects obj2=new StreamWithObjects("Preeti", 33);
		StreamWithObjects obj3=new StreamWithObjects("Sagar", 34);
		StreamWithObjects obj4=new StreamWithObjects("Shalaka", 28);
		
		//System.out.println(obj1.getName());//Amit
	//	obj1.setName("Amitmodified");
		//System.out.println(obj1.getName());//Amitmodified
		
		ArrayList<StreamWithObjects> objects=new ArrayList<StreamWithObjects>();
		objects.add(obj1);
		objects.add(obj2);
		objects.add(obj3);
		objects.add(obj4);
		
		//Print Everything
		Iterator<StreamWithObjects> itrobj=objects.iterator();
		while(itrobj.hasNext()) {
			Object obj=itrobj.next();
			System.out.println(((StreamWithObjects) obj).getAge() +" "+((StreamWithObjects) obj).getName() );
		}
		
		
		
		//Get name when its only Amit
		List<StreamWithObjects> objfiltered=objects.stream().filter(name->"Amit".equals(name.getName())).collect(Collectors.toList());
		for (StreamWithObjects ob:objfiltered) {
			System.out.println("used for each here "+ob.getName()+" "+ob.getAge()); //used for each here Amit 35
		}
		
		
		String nameFiltered=objects
				.stream()
				.filter(name->"Amit".equals(name.getName()))
				.map(StreamWithObjects::getName).findAny().orElse(null);
		System.out.println("used filter map here: "+nameFiltered);//used filter map here: Amit
			
	}

}
