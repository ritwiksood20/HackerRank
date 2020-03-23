import java.util.*;

public class StringConstruction {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String s = in.next();
            Set<Character> character = new HashSet<>();
            for(char c : s.toCharArray())
            {
                character.add(c);
            }
            System.out.println(character.size());
        }
    }
}