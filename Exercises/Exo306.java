import java.util.HashMap;
 
public class Exo306{
    Forme[] arrFormes = {
        new Cercle(new HashMap<>(){{put(Diemnsions.RAYON, 4.0);}}),
        new Triangle(new HashMap<>(){{put(Diemnsions.BASE, 4.0);}}),
        new Rectangle(new HashMap<>(){{put(Diemnsions.BASE, 4.0);}})
    };
}
enum Dimensions{
    BASE,
    HAUTEUR,
    RAYON
}
 
class Forme{
    HashMap<Dimensions, Double> dimensions;
 
    public void setDimensions(HashMap<Dimensions, Double> dimensions) {
        this.dimensions = dimensions;
    }
 
    public Forme(HashMap<Dimensions, Double> dimensions) {
        this.dimensions = dimensions;
    }
    
    public double getArea(){
        return 0;
    }
}
 
class Cercle extends Forme{
    public Cercle(HashMap<Dimensions, Double> dimensions){
        super(dimensions);
    }
 
    @Override
    public double getArea() {
        return Math.PI * Math.pow(dimensions.get(Dimensions.RAYON),2);
    }
 
    
}
class Rectangle extends Forme{
    public Rectangle(HashMap<Dimensions, Double> dimensions){
        super(dimensions);
    }
 
    @Override
    public double getArea() {
        return Math.PI * dimensions.get(Dimensions.HAUTEUR) * dimensions.get(Dimensions.BASE);
    }
}
class Triangle extends Forme{
    public Triangle(HashMap<Dimensions, Double> dimensions){
        super(dimensions);
    }
 
    @Override
    public double getArea() {
        return Math.PI * dimensions.get(Dimensions.HAUTEUR) * dimensions.get(Dimensions.BASE) / 2;
    }
}
 