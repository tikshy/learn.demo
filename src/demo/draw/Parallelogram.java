package demo.draw;

import demo.Paintable.Paintable;
//平行四边形类，继承四边形类，并实现了可绘制接口
public class Parallelogram  extends  Quadrangle implements Paintable {
    public void  draw(){
        System.out.println("绘制平行四边形");
    }

}
