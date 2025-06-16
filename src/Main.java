public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        CompositeTriangle t = new CompositeTriangle(-2,4,3);
        for(Triangle g: t){
            System.out.println(g);
        }
    }
}