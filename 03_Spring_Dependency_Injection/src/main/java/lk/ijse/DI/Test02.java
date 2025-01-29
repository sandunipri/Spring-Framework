package lk.ijse.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test02 implements DIInterface{
//    @Autowired
    DI test01;

  /*  public Test02( DI test01) {
        this.test01 = test01;

    }*/
/*  @Autowired
    public void setter(DI test01){
        this.test01 = test01;
    }*/

    public void display() {
        test01.SayHello();
    }

    @Autowired
    @Override
    public void setInject(DI di) {
        this.test01 = di;
    }
}
