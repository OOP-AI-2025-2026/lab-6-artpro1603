package ua.opnu.model;

import java.awt.*;

/*
 * Клас "Фігура для малювання".
 * Клас містить початкову та кінцеву точку, а також різні методи
 */
public abstract class DrawShape {


    // Константи для типів фігур
    public static final int SHAPE_RECTANGLE = 0;
    public static final int SHAPE_ROUNDED_RECT = 1;
    public static final int SHAPE_ELLIPSE = 2; // новий тип фігури

    // Початкова та кінцева точки
    private Point startPoint;
    private Point endPoint;

    // Конструктор без параметрів
    public DrawShape() {
        this(new Point(0, 0), new Point(0, 0));
    }

    // Конструктор з початковими координатами
    public DrawShape(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public abstract Shape getShape(Point startPoint, Point endPoint);

    public Shape getShape() {
        return getShape(startPoint, endPoint);
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public static DrawShape newInstance(int shapeType) {
        return switch (shapeType) {
            case SHAPE_RECTANGLE -> new Rectangle();
            case SHAPE_ROUNDED_RECT -> new RoundedRectangle();
            case SHAPE_ELLIPSE -> new Ellipse();
            default -> null;
        };
    }
}
