package class_0219;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

// 1. 필요로 하는 기능을 먼저 구현
// 2. 실제 기능을 작성
public class SimpleDatabaseMain {
	static String filePath = "./src/class_0219/dbfile.txt";
	
	public static void main(String[] args){
		SimpleDatabase db;
		try {
			db = new SimpleDatabase(new FileReader(filePath));
		
		Iterator<String> it = db.iterator();
		while (it.hasNext()){
			String key = it.next();
			System.out.println("KEY : " + key);
			System.out.println("VALUE : " + db.getValue(key) + "\n");
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
