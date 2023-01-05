/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author antonio
 */
public class ShowFruits {
    public int id,  Quantity;
    public String name;
    public double price;
    public ShowFruits(int id, int qua,String name,double price){
        this.id=id;
        this.Quantity=qua;
        this.name=name;
        this.price=price;
    }
    public int getId(){
        return this.id;
    }
    public String getname(){
        return this.name;
    }
    public double getprice(){
        return this.price;
    }
    public int getquantity(){
        return this.Quantity;
    }
    
}
