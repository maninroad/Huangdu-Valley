package huangduValley.farm.test;

import huangduValley.farm.fence.FenceShape;
import huangduValley.farm.fence.RectangleAdapter;

public class Test_Adapter {
    public static void main(String[] args){
        FenceShape fenceShape=new RectangleAdapter();
        fenceShape.display(1, 1, 2, 2);
    }
}
