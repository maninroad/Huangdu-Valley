package huangduValley.Workshop.ConcreteMachine;


import huangduValley.Workshop.Machine;
import huangduValley.Workshop.Product.Product;
import huangduValley.Workshop.Product.RoughProduct;
import huangduValley.Workshop.Visitor;
import huangduValley.farm.storage.Ingredients;
import huangduValley.farm.storage.Items;

import java.util.Vector;

/**
 *
 * @author Leepaangsang
 * @version 2019/10/31
 */
public class RoughProMachine extends Machine {
    private String name;

    /**
     *
     * @param name
     * Name of machine.
     */
    public RoughProMachine(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void switchOn(){
        System.out.println("RoughProMachine on!");
    }

    @Override
    public void stop(){
        System.out.println("RoughProMachine off!");
    }

    /**
     * The material processing operations
     * @param materialVector
     * Vector of materials to be processed
     * @return
     * Products produced by the rough processing machine
     * @throws Exception
     */
    @Override
    public Vector<Items> run(Vector<Items> materialVector) throws Exception {
        System.out.println("RoughProMachine is running!");
        Vector<Items> productVector = new Vector<>();
        for(Items items:materialVector){
            Thread.sleep(100*items.getCount());
            productVector.add(new RoughProduct(items.getName(), items.getCount()));
            System.out.println(String.format("Rough processing machine produces %d %s",items.getCount(),items.getName()));
        }
        return productVector;
    }

    @Override
    public Vector<Items> accept(Visitor v) throws Exception {
        return v.visit(this);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("Clone a rough processs machine");
        return super.clone();
    }
}
