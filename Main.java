public class Main {

    public static String tinhHocPhi(int L, int B) {
        if (B < 1)
            return "Invalid error";
        long hocphi = 0;
        switch (L) {
            case 1:
                if (B <= 5) {
                    hocphi = 250 * B;
                } else if (B <= 10) {
                    hocphi = 250 * 5 + 230 * (B - 5);
                } else if (B <= 15) {
                    hocphi = 250 * 5 + 230 * 5 + 220 * (B - 10);
                } else {
                    hocphi = 250 * 5 + 230 * 5 + 220 * 5 + 200 * (B - 15);
                }
                break;
            case 2:
                if (B <= 15) {
                    hocphi = 200 * B;
                } else {
                    hocphi = 200 * 15 + 150 * (long) (B - 15);
                }
                break;
            case 3:
                hocphi = 150 * B;
                break;
            default:
                return "Invalid error";
        }
        return hocphi + "k";
    }
    public static void main(String[] args) {

    }
}