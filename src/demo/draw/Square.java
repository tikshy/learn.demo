package demo.draw;

import demo.Paintable.Paintable;

public class Square extends  Quadrangle implements Paintable {
    public  void draw(){
        System.out.println("绘制正方形");
    }
}
