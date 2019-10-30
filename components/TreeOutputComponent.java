import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.BasicStroke;
import java.awt.RenderingHints;

import javafx.scene.effect.Light.Point;

import java.awt.Graphics2D;
import java.util.Stack;
import java.awt.geom.Point2D;

public class TreeOutputComponent extends JPanel {
    static class Constants {
        static int NODE_SPACING = 50;
    }
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    AbstractTree tree = null;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (tree == null) { return; }
        Graphics2D g2 = (Graphics2D)g;
        RenderingHints rh = new RenderingHints(
                 RenderingHints.KEY_ANTIALIASING,
                 RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHints(rh);
        drawTree(g2, tree);
    }

    void setTree(AbstractTree tree) {
        this.tree = tree;

        this.repaint();
    }

    void drawTree(Graphics2D g, AbstractTree tree) {
        if (tree.root == null) { return; }
        walkTreeNode(tree.root, g);
    }

    void walkTreeNode(TreeNode node, Graphics2D g) {
        int height = TreeNode.height(node);
        double baseCount = Math.pow(2, height) - 1;
        double baseWidth = baseCount * Constants.NODE_SPACING;
        Main.println("Node(" + node.val + ")" , "Height=", height, ", baseCount=",baseCount, baseWidth);

        Point2D.Double anchor = new Point2D.Double(baseWidth / 2.0, 0.0);

        if (node.left != null) {
            Point2D pivot = new Point2D.Double(
                anchor.getX() - (baseWidth / 4.0), Constants.NODE_SPACING
            );
            drawVertex(anchor, pivot, g);
            walkTreeNode(
                node.left, 
                pivot,
                1,
                g
            );
        }
        if (node.right != null) {
            Point2D pivot = new Point2D.Double(
                anchor.getX() + (baseWidth / 4.0), Constants.NODE_SPACING
            );
            drawVertex(anchor, pivot, g);
            walkTreeNode(
                node.right, 
                pivot,
                1,
                g
            );
        }
        drawNode(tree.root, anchor, g);
    }

    void walkTreeNode(TreeNode node, Point2D pivot, int level, Graphics2D g) {
        int height = TreeNode.height(node);
        double baseCount = Math.pow(2, height) - 1;
        double baseWidth = baseCount * Constants.NODE_SPACING;
        Main.println("Node(" + node.val + ")" , "Height=", height, ", baseCount=",baseCount, baseWidth / 2.0);

        if (node.left != null) {
            Point2D anchor = new Point2D.Double(
                pivot.getX() - (baseWidth / 2.0), pivot.getY() + Constants.NODE_SPACING
            );
            drawVertex(anchor, pivot, g);
            walkTreeNode(
                node.left, 
                anchor,
                level + 1,
                g
            );
        }
        if (node.right != null) {
            Point2D anchor = new Point2D.Double(
                pivot.getX() + (baseWidth / 2.0), pivot.getY() + Constants.NODE_SPACING
            );
            drawVertex(anchor, pivot, g);
            walkTreeNode(
                node.right, 
                anchor,
                level + 1,
                g
            );
        }
        drawNode(node, pivot, g);
    }

    void drawNode(TreeNode node, Point2D origin, Graphics2D g) {
        Main.println(node.val, origin);
        g.setColor(Color.BLACK);
        g.fillRoundRect((int) origin.getX(), (int)origin.getY(), 40, 40, 40, 40);
        g.setColor(Color.WHITE);
        g.drawString("" + node.val, (int) origin.getX() + 15, (int) origin.getY() + 15);
    }

    void drawVertex(Point2D p1, Point2D p2, Graphics2D g) {
        g.setColor(Color.WHITE);
        BasicStroke stroke = new BasicStroke(2.0f);
        g.setStroke(stroke);
        g.setColor(Color.BLUE);
        g.drawLine((int) p1.getX() + 20, (int) p1.getY() + 20, (int) p2.getX() + 20, (int) p2.getY() + 20);
    }

}