/**
 * 汽车工厂
 */
public class CarFactory {

    public static Car getCar(String name){
        if(name.equals("bmw")){
            return new bmw();
        }else if (name.equals("benz")){
            return new benz();
        }else {
            System.out.println("无法生产");
            return null;
        }
    }
}
