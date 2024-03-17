public class BinOps {
    public String sum(String a, String b) {
        int fig1 = Integer.parseInt(a, 2);
        int fig2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(fig1 + fig2);
    }

    public String mult(String a, String b) {
        int fig1 = Integer.parseInt(a, 2);
        int fig2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(fig1 * fig2);
    }
}
