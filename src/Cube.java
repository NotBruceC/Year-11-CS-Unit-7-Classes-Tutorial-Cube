public class Cube {
    private int side;

    public Cube() {
        side = 1;

    }
    public Cube(int side) {
        if(side <= 1){
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        else this.side = side;
    }
    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        if(side <= 1){
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }else this.side = side;
    }
    public int calculateSurfaceArea() {
        return side * side * 6;
    }
    public int calculateVolume() {
        return (side * side * side);
    }

    public String toString() {
        return "Cube{side=" + side + "}";
    }


}
