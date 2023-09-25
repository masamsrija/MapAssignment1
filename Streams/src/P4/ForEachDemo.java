package P4;
import java.util.stream.Stream;

public class ForEachDemo {
	public static void main(String[] args) {
		{
			Stream.of("sss","xcv","qwe")
			.forEach((x)-> {
				String t = x+"sss";	
				System.out.println(t);
				
			});
			String arr[] = {"sss","xcv","qwe"};
			for(String p: arr) {
				System.out.println(p);
			}
			
		}
	}

}
