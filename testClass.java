
import java.util.ArrayList;

public class testClass {
    public static void main(String[] args) {
        ArrayList<GeometricObject> objectArrayList = new ArrayList<>(5);

        // Creating an arraylist of GeometricObject and adding 3 objects of Circle class.

        objectArrayList.add(new Circle(5));
        objectArrayList.add(new Circle(4));
        objectArrayList.add(new Circle(3));

        // Now creating 2 objects of Resizable class.

        objectArrayList.add(new ResizableCircle(9));
        objectArrayList.add(new ResizableCircle(10));

        for (int i = 0; i < objectArrayList.size(); i++) {
            System.out.println("The Area of element " + "[" + i + "]" + objectArrayList.get(i).getArea());
            System.out.println("The Perimeter of element " + "[" + i + "]" + objectArrayList.get(i).getPerimeter()+"\n");
        }

        // Now creating individual arrays of circle and resizable circles.......

        System.out.println("NOW PRINTING USING CIRCLE AND RESIZEABLE CIRCLE ARRAYS..........!\n\n\n");

        Circle[] circles = new Circle[10];
        ResizableCircle[] resizableCircles = new ResizableCircle[10];

       for (int i = 0; i<objectArrayList.size(); i++){
           if (objectArrayList.get(i) instanceof Circle){
               circles[i] = (Circle) objectArrayList.get(i);
               System.out.println("Area of Circle at index " + "["+i+"}"+circles[i].getArea());
               System.out.println("Perimeter of Circle at index " + "["+i+"}"+circles[i].getPerimeter()+"\n");
           }
           else{
               resizableCircles[i] = (ResizableCircle) objectArrayList.get(i);
               resizableCircles[i].getArea();
               System.out.println("Area of Resizeable Circle at index " + "["+i+"}"+resizableCircles[i].getArea());
               System.out.println("Perimeter of Resizeable Circle at index " + "["+i+"}"+resizableCircles[i].getPerimeter()+"\n");
           }
       }


    }
}