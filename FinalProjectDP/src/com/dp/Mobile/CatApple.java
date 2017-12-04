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
public class CatApple {
    List<IMobile> AppleList = new ArrayList<>();
    public CatApple(){
        AppleList.add(new Iphone8());
        AppleList.add(new Iphone7());
       AppleList.add(new IphoneMax());
    }
}
