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
public class CatSamsung {
     List<IMobile> SamsungList = new ArrayList<>();
    public CatSamsung(){
        SamsungList.add(new Iphone8());
        SamsungList.add(new Iphone7());
        SamsungList.add(new IphoneMax());
}}
