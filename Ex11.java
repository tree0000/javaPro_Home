package days23;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/**
 * @author kenik
 * @date 2024. 1. 31. - 오후 5:05:26
 * @subject
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {
		/*
		String userDir = System.getProperty("user.dir");
		// E:\Class\SS20Class\Workspace\JavaClass\javaPro
		System.out.println( userDir );
		*/
		
		Properties  p = System.getProperties();		
		Set<Entry<Object, Object>> es = p.entrySet();
		
		Iterator<Entry<Object, Object>> ir = es.iterator();
		
		while (ir.hasNext()) {
			Entry<Object, Object> entry = ir.next();
			String key =  (String) entry.getKey();
			String value =  (String) entry.getValue();
			
			System.out.printf("%s:%s \n", key, value);
			
		}
		

		
	} // main

} // class





