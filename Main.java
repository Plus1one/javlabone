package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Node Obj = new Node();
        //Obj.delElem(1);
        Obj.addElem("f", 2);
        Obj.addElem("4", 2);
        //Obj.addElem("5",2);
        //Obj.addElem("6",3);
        Obj.displayInfo();
        //System.out.println(Obj.getCount());

        System.out.println(Obj.getElem(2));
        Obj.delElem(6);
        //Obj.DelElem(2);
        //Obj.DelElem(1);

        //Obj.displayInfo();
        //System.out.println(Obj.getElem(7));
        //Obj.delElem(23);
        //Obj.delElem(13);
    }

}
