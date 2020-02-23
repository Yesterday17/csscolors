import moe.mmf.csscolors.Color;
import org.junit.Test;

public class TestColor {
    @Test
    public void TestFromHex() {
        Color c;

        // #rgb
        String _4 = "#abc";
        c = Color.fromHex(_4);
        assert (c != null);
        assert (c.toHex().equals("#AABBCC"));

        // #rgba
        String _5 = "#abcd";
        c = Color.fromHex(_5);
        assert (c != null);
        assert (c.toHex(true).equals("#AABBCCDD"));

        // #rrggbb
        String _7 = "#9999ff";
        c = Color.fromHex(_7);
        assert (c != null);
        assert (c.toHex().equals("#9999FF"));

        // #rrggbbaa
        String _9 = "#12345678";
        c = Color.fromHex(_9);
        assert (c != null);
        assert (c.toHex(true).equals("#12345678"));

        // invalid
        String _senpai = "1145141919810";
        c = Color.fromHex(_senpai);
        assert (c == null);
    }

    @Test
    public void TestFromRGB() {
        Color c;

        // #rgb1
        String rgb1 = "rgb(123,123,123)";
        c = Color.fromString(rgb1);
        assert (c != null);
        assert (c.toHex().equals("#7B7B7B"));

        // #rgb2
        String rgb2 = "rgb(.1,.1,.1)";
        c = Color.fromString(rgb2);
        assert (c != null);
        assert (c.toHex().equals("#191919"));
    }
}
