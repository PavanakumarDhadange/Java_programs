public class AnagramExample {

  public static int sherlockAndAnagrams(String s) {
        int res = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            for(int j=i;j<s.length();j++) {
                char[] subChar = s.substring(i, j+1).toCharArray();
                Arrays.sort(subChar);
                String cString = new String(subChar);
                if(map.containsKey(cString)) {
                    int count = map.get(cString);
                    res = res + count;
                    map.put(cString, ++count);
                } else {
                    map.put(cString, 1);
                }
            }
        }
        
        return res;
    }
  
}

/* Explaination
Sample Input 0

2
abba
abcd
Sample Output 0

4
0

Sample Input 1

2
ifailuhkqq
kkkk
Sample Output 1

3
10

Sample Input 2

1
cdcd
Sample Output 2

5
*/
