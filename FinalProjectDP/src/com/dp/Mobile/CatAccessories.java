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
public class CatAccessories {
    List<IAccessories> AccessoriesList = new ArrayList<>();
    public CatAccessories(){
        AccessoriesList.add(new VRBox());
        AccessoriesList.add(new SelfieStick());
      
    }
}
