package StringManipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateChar {
	
	public void countDupChars(String str)
	{
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		char[] chars = str.toCharArray();
		System.out.println(chars);
		
		for(Character ch:chars)
		{
			System.out.println(ch);
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else 
			{
				map.put(ch,1);
			}
			//System.out.println(map);
		}
		
		Set<Character> keys = map.keySet();
		//System.out.println(keys);
		
		for(Character ch:keys)
		{
			if(map.get(ch)>1)
			{
				System.out.println(map);
				
				System.out.println("Char "+ch+" "+map.get(ch));
			}


			
			
		}
		
				
	}

	public static void main(String[] args) {
		
		
		FindDuplicateChar obj = new FindDuplicateChar();
		obj.countDupChars("BeginnersBook.com"); 
				
	}

}
