public interface ShapeInterface {
    
    public double surfaceArea();
    
    default void display() {
            System.out.println(surfaceArea());
        }

}