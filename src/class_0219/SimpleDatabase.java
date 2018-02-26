package class_0219;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// dbfile.txt 파일의 내용을 읽어서 맵에 저장
// 메일주소 = 이름

public class SimpleDatabase {

	private Map<String, String> map = new HashMap<String, String>();
	private static Pattern dataPattern = Pattern.compile("([^=]+)=(.*)");
	/**
	 * (				group(1)
	 * 		[^=]+		"="를 제외한 문자가 1개 이상 반복
	 * )  
	 * =
	 * (
	 * 		.*		  	임의의 문자가 0개 이상 반복
	 * **/
	
	
// CASE1. 인덴트가 너무많다  = 로직이 복잡하다
/*	public SimpleDatabase(Reader r1) throws IOException {
		BufferedReader r2 = new BufferedReader(r1);
		boolean flag = false;
		String tmp;
		while(!flag){
			tmp = r2.readLine();
			if(tmp == null){
				flag = true;
			}else{
				boolean flag2 = true;
				// s1(flag2=true) = 이메일주소, s2(flag2=false) = 이름
				StringBuffer s1 = new StringBuffer();
				StringBuffer s2 = new StringBuffer();
				for(int i = 0; i< tmp.length(); i++){
					char tmp2 = tmp.charAt(i);
					if(flag2){
						if(tmp2 == '='){
							flag2 = false;
						}else{
							s1.append(tmp2);
						}
					}else{
						s2.append(tmp2);
					}
				}
				String ss1 = s1.toString();
				String ss2 = s2.toString();
				map.put(ss1, ss2);
			}
		}
	}
*/

// CASE2. 간단하게 refactor(alr+shift+R) 의미있는 변수로 변경, 제어플래그 삭제
	public SimpleDatabase(Reader reader) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(reader);
		String line;
		while(true){
			line = bufferedReader.readLine();
			if(line == null)
				break;

// CASE2.1 정규식으로 전환 전 
/*			// equals를 찾는거
			int equalIndex = line.indexOf("=");
			if(equalIndex > 0 ){
				String key = line.substring(0, equalIndex);
				String value = line.substring(equalIndex+1);
				map.put(key, value);
			}
*/			
// CASE2.2 pattern
			Matcher matcher = dataPattern.matcher(line);
			if(matcher.matches()){
				String key = matcher.group(1);
				String value = matcher.group(2);
				map.put(key, value);
			}
			
		}
	}
	
	
	
	public Iterator<String> iterator(){
		return map.keySet().iterator();
	}
	
	public String getValue(String key) {
		return map.get(key);
	}

	
}
