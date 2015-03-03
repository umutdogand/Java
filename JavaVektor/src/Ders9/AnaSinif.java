/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ders9;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vektorel
 */
public class AnaSinif {
    public static void main(String[] args) {
        Map<Integer,String> mp=new HashMap<Integer, String>();
        DB dataBase=new DB();
        mp=dataBase.selectFunc();
        for (String string : mp.values()){
            System.out.println(string);
        }
    }
}
