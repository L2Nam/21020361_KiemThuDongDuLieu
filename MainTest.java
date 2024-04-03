import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testDongDuLieu_1() {
        assertEquals("1050k", Main.tinhHocPhi(3, 7));
    }

    @Test
    public void testDongDuLieu_2() {
        assertEquals("Invalid error", Main.tinhHocPhi(1, -2));
    }

    @Test
    public void testDongDuLieu_3() {
        assertEquals("750k", Main.tinhHocPhi(1, 3));

    }

    @Test
    public void testDongDuLieu_4() {
        assertEquals("1940k", Main.tinhHocPhi(1, 8));
    }

    @Test
    public void testDongDuLieu_5() {
        assertEquals("3280k", Main.tinhHocPhi(1, 14));
    }

    @Test
    public void testDongDuLieu_6() {
        assertEquals("4100k", Main.tinhHocPhi(1, 18));
    }

    @Test
    public void testDongDuLieu_7() {
        assertEquals("2400k", Main.tinhHocPhi(2, 12));
    }

    @Test
    public void testDongDuLieu_8() {
        assertEquals("3300k", Main.tinhHocPhi(2, 17));
    }
}