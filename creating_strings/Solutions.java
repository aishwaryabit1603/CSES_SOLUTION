import java.util.*;

public class Solutions {

    public static String swap(String s, int i, int j) {
        StringBuilder str = new StringBuilder(s);
        char ch = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, ch);
        return str.toString();
    }

    public static void create_string(String s, int i, int n, HashSet<String> hs,
            ArrayList<String> ans) {
        if (i == n - 1) {
            if (!hs.contains(s)) {
                hs.add(s);
                ans.add(s);
            }
            return;
        }
        for (int j = i; j < n; j++) {
            s = swap(s, i, j);
            create_string(s, i + 1, n, hs, ans);
            s = swap(s, i, j);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<String> hs = new HashSet<>();
        ArrayList<String> ans = new ArrayList<>();
        create_string(s, 0, s.length(), hs, ans);
        Collections.sort(ans);
        System.out.println(ans.size());
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
        sc.close();
    }
}
