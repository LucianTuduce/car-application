package com.fortech.service;


import javax.ejb.Stateless;

@Stateless
public class MarketRuleService {
	
	public String printCeva(){
		System.out.println("INJECTTTTTTT");
		return "inject";
	}
}
