import java.util.ArrayList;
import java.util.List;
import java.awt.Graphics2D;


public abstract class Drawable {
    List<Drawable> drawables = new ArrayList<>();

    abstract void draw(Graphics2D g);
}