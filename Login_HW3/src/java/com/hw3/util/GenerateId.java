/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hw3.util;

import java.util.Date;

/**
 *
 * @author Zhixiang
 */
public class GenerateId {
    private static Date date = new Date();
    private static int seq = 0;
	  private static final int MaxUserNumber = 99999;
	  public static synchronized long next(){
	    if (seq > MaxUserNumber) seq = 0;
	    date.setTime(System.currentTimeMillis());
	    String str = String.format("%1$tY%1$tm%1$td%1$tk%1$tM%1$tS%2$05d", date, seq++);
	    return Long.parseLong(str);
	}
}
