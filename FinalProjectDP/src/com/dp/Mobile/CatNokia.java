/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dp.Mobile;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author irfan
 */
public class CatNokia {
    List<IMobile> NokiaList = new ArrayList<>();
    public CatNokia(){
        NokiaList.add(new Nokia2());
        NokiaList.add(new NokiaS());
       NokiaList.add(new NokiaX());
    }
}
