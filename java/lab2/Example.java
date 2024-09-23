public class Example {
    public static void main(String[] args) {
        // Создание экземпляра Point2d
        Point2d point2d = new Point2d(3, 4);
        System.out.println("Point2d: (" + point2d.getX() + ", " + point2d.getY() + ")");

        // Создание экземпляра Point3d
        Point3d point3d = new Point3d(1, 2, 3);
        System.out.println("Point3d: (" + point3d.getX() + ", " + point3d.getY() + ", " + point3d.getZ() + ")");

        // Изменение координат
        point3d.setX(5);
        point3d.setY(6);
        point3d.setZ(7);
        System.out.println("Updated Point3d: (" + point3d.getX() + ", " + point3d.getY() + ", " + point3d.getZ() + ")");
    }
}
