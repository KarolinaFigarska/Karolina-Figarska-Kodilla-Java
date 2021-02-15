package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector  {

    private Shape shape;
    private List<Shape> list = new ArrayList<>();

    public void addFigure(Shape shape) {
        list.add(shape);
    }

    public void removeFigure(Shape shape) {
        if (list.contains(shape)) {
            list.remove(shape);
        }
    }


    public Shape getFigure(int n) {
        if (n >= 0 && n < list.size()) {
            return list.get(n);
        }
        return null;
    }

    public String showFigures() {
        String shapeName ="";
        for ( int i =0; i<list.size(); i++) {
            shapeName = shapeName + list.get(i).getShapeName();
            if((list.size()-1)!=i) {
                shapeName = shapeName + " ";
            }
        }
        return shapeName;
    }

    public int getFiguresQuantity() {
        return list.size();
    }
}
