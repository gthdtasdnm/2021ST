public class Triangle {
    private int x;
    private int y;
    private int z;

    public Triangle(){
        new Triangle(0,0,0);
    }
    public Triangle(int x, int y, int z){
        //Z darf nur 1 oder 0 sein damit die Koordinate gültig ist.
        if(z != 1 && z!= 0){
            throw new IllegalArgumentException("");
        }
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    //Hier Override und Object o, da Java sonst beim Test eine eigene equals methode benutzt, welche den test nicht durchlaufen lässt,
    //da diese die Objekt IDs vergleicht und nicht die Werte darin
    @Override
    public boolean equals(Object o){
        Triangle t = (Triangle) o;
        if(x == t.getX() && y == t.getY() && z == t.getZ()){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "("+x+", "+y+", "+z+")";
    }

    @Override
    public int hashCode(){
        return 31*x+17*y+z;
    }

    public Triangle getRight(){
        if(z == 0){
            return new Triangle(x,y+1,1);
        }else{
            return new Triangle(x+1,y-1,0);
        }
    }

}
