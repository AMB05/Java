package pertemuan_11_abstract_2;

public abstract class shape //class abstract (class induk / implements)
{
    String color;
    
    void setColor(String color){
        this.color = color;
    }
    
    String getColor(){
        return this.color;
    }
    
    abstract float getArea(); //method abstract
}
