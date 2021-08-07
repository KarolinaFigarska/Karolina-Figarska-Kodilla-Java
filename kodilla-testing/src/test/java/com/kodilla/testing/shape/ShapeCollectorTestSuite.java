package com.kodilla.testing.shape;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Test Suite")
class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Tests related to resizing the list")
    class ResizeTheList {
        @Disabled
        @Test
        public void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            shapeCollector.addFigure(new Circle(2.4));
            //Then
            Assertions.assertEquals(1, shapeCollector.getFiguresQuantity());
        }

        @Test
        public void testRemoveFigure() {
            //Given
            Shape circle = new Circle(2.4);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(circle);
            //When
            shapeCollector.removeFigure(circle);
            //Then
            Assertions.assertEquals(0, shapeCollector.getFiguresQuantity());
        }
    }

    @Nested
    @DisplayName("Tests related to getting data from the list")
    class GettingData {
        @Disabled
        @Test
        public void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(3.5));
            shapeCollector.addFigure(new Triangle(2.5,5.6));
            shapeCollector.addFigure(new Square(4.0));
            //When
            Shape square = shapeCollector.getFigure(2);
            //Then
            Assertions.assertEquals(square, new Square(4.0));
        }
        @Disabled
        @Test
        public void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(3.5));
            shapeCollector.addFigure(new Triangle(2.5,5.6));
            shapeCollector.addFigure(new Square(4.0));
            //When
            String result = shapeCollector.showFigures();
            //Then
            Assertions.assertEquals(result,"Circle Triangle Square");
        }
    }
}
