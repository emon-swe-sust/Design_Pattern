import FlyingBehaviours.HillFly;
import FlyingBehaviours.IFlying;
import FlyingBehaviours.SkyFly;
import QuackingBehaviours.CityQuack;
import QuackingBehaviours.IQuacking;
import QuackingBehaviours.UrbanQuack;

class Duck{
    IFlying IF;
    IQuacking IQ;
    public Duck(IFlying IF,IQuacking IQ){
        this.IF = IF;
        this.IQ = IQ;
    }
    public void fly(){
        IF.fly();
    }
    public void quack(){
        IQ.quack();
    }
}

public class DuckDuckGo {
    public static void main(String[] args) {
        Duck a = new Duck(new SkyFly(),new CityQuack());
        Duck b = new Duck(new SkyFly(),new UrbanQuack());
        Duck c = new Duck(new HillFly(),new CityQuack());
        Duck d = new Duck(new HillFly(),new UrbanQuack());

        a.quack();
        a.fly();
        b.quack();
        b.fly();
    }
}
