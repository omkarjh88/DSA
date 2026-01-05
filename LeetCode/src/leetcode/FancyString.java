package leetcode;

public class FancyString {
    public static void makeFancyString(String s){
        char[] ch=s.toCharArray();
        int n=ch.length;
        String s1=s.substring(0,2);
        for(int i=2;i<n;i++){
            if(ch[i]==ch[i-1]&&ch[i]==ch[i-2]){
                continue;
            }
            s1=s1+s.charAt(i);
        }
        System.out.println(s1);
    }
    public static String makeFancyString1(String s){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int len = sb.length();
            // keep char if less than 2 chars added OR it doesn't create a triple
            if (len < 2 ) {
                sb.append(s.charAt(i));
                continue;
            }
            if((s.charAt(i) == s.charAt(i-1) && s.charAt(i) == s.charAt(i - 2))){

            }else{
                sb.append(s.charAt(i));;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeFancyString1("aabbaaaan"));
    }
}
