package Reflect;

interface fruit1{
    public abstract void eat();
}
 
class Apple1 implements fruit{
    public void eat(){
        System.out.println("Apple");
    }
}
 
class Orange1 implements fruit{
    public void eat(){
        System.out.println("Orange");
    }
}
 
class Factory1{
    public static fruit getInstance(String ClassName){
        fruit f=null;
        try{
            f=(fruit)Class.forName(ClassName).newInstance();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}

public class hello19 {
	public static void main(String[] a){
        fruit f=Factory1.getInstance("Reflect.Apple");
        if(f!=null){
            f.eat();
        }
    }
}
