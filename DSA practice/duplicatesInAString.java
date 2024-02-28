public class duplicatesInAString {
    public static void removeDuplicates(String str, StringBuilder newStr, boolean map[], int index)
    {  //base case
       if(index == str.length())
       {
        System.out.println(newStr);
        return;
       }

       //kaam
       char currChar = str.charAt(index);
       if(map[currChar -'a'] ==true)
       {
           removeDuplicates(str, newStr, map, index+1);
       }
       else{
           map[currChar - 'a'] = true;
           removeDuplicates(str, newStr.append(currChar), map, index+1);

       }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicates(str, new StringBuilder(""), new boolean[26], 0);
    }
}
