import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompositeTriangle implements Iterable<Triangle>{
    private int x;
    private int y;
    private int k;

    public CompositeTriangle(int x, int y, int k){
        if(k < 1){
            throw new IllegalArgumentException("");
        }
        this.x = x;
        this.y = y;
        this.k = k;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getK() {
        return k;
    }

    @Override
    public Iterator<Triangle> iterator() {
        //Iterator ist dafür da, damit das Program weiß was das nächste element sein soll
        //bei zb einer for(Object o: Array) schleife
        //ich schreibe die Objekte in der richtigen reihenfolge in ein Array, damit ich den iterator von dem
        //Zurück geben kann und keine eigene mit hasNext() und Next() schreiben muss.
        List<Triangle> t = new ArrayList<>();
        Triangle temp;
        for(int i=0;i<k;i++){
            temp = new Triangle(x,y-(k-i-1),1);
            t.add(temp);
            for(int j=0;j<(k-i)*2-2;j++){
                temp = temp.getRight();
                t.add(temp);
            }
        }
        System.out.println(t);
        return t.iterator();
    }

    public boolean contains(Triangle t){
        //gucken ob ein Dreieck im Dreieck enthalten ist
        //habe kein bock auf mathe
        //gehe jedes element vom dreicke durch und gucke ob das übergebene element dabei sit
        for(Triangle ct: this){
            if(t == ct){
                return true;
            }
        }
        //sonst gebe false
        return false;
    }
}
