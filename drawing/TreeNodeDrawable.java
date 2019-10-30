import java.awt.Graphics2D;

import java.awt.Shape;
import java.awt.geom.*;

public class TreeNodeDrawable extends Drawable {
    @Override
    void draw(Graphics2D g) {
        g.fill(new Rectangle2D(0.0, 0.0, 50.0, 50.0));
    }
}