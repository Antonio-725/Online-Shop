/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author antonio
 */
public class ShowAdmin {
    public int conta;
    public String name;
    public int id;
    public int quant;
    public ShowAdmin(int cn,String nm,int id,int qu){
       this.conta=cn;
       this.id=id;
       this.name=nm;
       this.quant=qu;
    }
    public int getConta(){
        return this.conta;
    }
    public String getNm(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public int getQuant(){
        return this.quant;
    }
    
}
