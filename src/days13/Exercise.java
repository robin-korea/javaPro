package days13;

import java.util.Arrays;

public class Exercise {

	public static void main(String[] args) {
		
//      10. 아래 두 문자열의 대소문자 구분 없이, 순서 상관 없이 같은 문자여부를 체크하는 코딩을 하세요. 
		
      String n = "keNik";    
      String m = "kKnie";     
      
      char [] nLower = n.toLowerCase().toCharArray();
      char [] mLower = m.toLowerCase().toCharArray();
      
      Arrays.sort(nLower);
      Arrays.sort(mLower);
      
      if(Arrays.equals(nLower, mLower)) {
    	  System.out.println("두 문자열은 같다");
      }else {
    	  System.out.println("두 문자열은 다르다");
      }
      
	}
}
