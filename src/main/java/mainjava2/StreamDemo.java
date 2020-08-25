package mainjava2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	
	
	public static void main(String[] args) {
		
		
		List<String> names=Arrays.asList("Sagar","Dimple","Advait","Himani");
		List<Object> filteredNames=names.stream().filter(name->name!="Dimple").collect(Collectors.toList());
		System.out.println(names);//[Sagar, Dimple, Advait, Himani]
		System.out.println(filteredNames);//[Sagar, Advait, Himani]
		
	}

}
