package P4;
import java.util.stream.Stream;
import java.util.function.Consumer;

public class ConsumerDemo {

		public static void main(String[] args) {

			Consumer<String> con = new Consumer<String>() {

	 

				@Override

				public void accept(String t) {

					String s = t;

					System.out.println(s);

					

				}

				

			};

			String arr[] = {"sss","xcv","qwe"};

			for(String i:arr) {

				con.accept(i);

			}

		

		}

	 

	}

	