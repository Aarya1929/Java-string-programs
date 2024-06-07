package String;

public class min_del {

    public static int make_pal(String s, int i, int j) {
        if (i >= j) {
            return 0;
        }

        if (s.charAt(i) == s.charAt(j)) {
            return make_pal(s, i + 1, j - 1);
        } else {
            return 1 + Math.min(make_pal(s, i + 1, j), make_pal(s, i, j - 1));
        }
    }

    public static void main(String[] args) {
        String s = "aebcbda";
        int i = 0, j = s.length() - 1;
        int res = make_pal(s, i, j);
        System.out.println(res);
    }
}
