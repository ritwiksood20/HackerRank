public class isUnique {
    public static void main(String[] args) {
        String str="asdfghjklqwrett";
        System.out.println(uniqueornot(str)?"YES":"NO");

    }
    static boolean uniqueornot(String str){
        if(str.length()>128)
            return false;
        boolean[] charset=new boolean[128];
        for(int i=0;i<str.length();i++){
            int val=str.charAt(i);
            if(charset[val]){
                return false;
            }
            charset[val]=true;
        }
        return true;
    }
}
