public class Replace {
    public static void main(String[] args) {
        String str = "oooooo-hhhh-oooooo";
        String rs = str.replace("h", "s");
        System.out.println(rs);
        rs = rs.replace("s", "h");
        System.out.println(rs);
    }
}
