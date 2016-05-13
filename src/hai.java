import java.io.IOException;
import java.util.List;


public class hai {

	public static void main(String[] args) throws IOException {
		Test3 t= new Test3();
		List<Test> list =t.getData();
		//System.out.println("t.getData()"+t.getData());
		for(Test test:list){
			System.out.println(test.getUsername());
			System.out.println(test.getPassword());
		}
		
		
	}
}
