package fuda.edu;

public class Main {
    public static void main(String[] args) {
        RectangularBox rectangularBox = new RectangularBox(3,5,6);
        System.out.println(rectangularBox.calculateDiagonalLengthOfRectangularBox());
        System.out.println(rectangularBox.calculateDiagonalOfARectangleBoxSurface());
        System.out.println(rectangularBox.calculateSquaredDiagonalLengthOfRectangularBox());
        System.out.println(rectangularBox.calculateSurfaceArea());
        System.out.println(rectangularBox.calculateVolumeOfRectangularBox());
        // 1) static method
        // 2) encapsulated logic to check palindrome
        // 3) logger for each method
        // 4) test for each method
        // 5) cyrillic check also implement
    }
}
