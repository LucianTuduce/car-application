package com.fortech.service;


import javax.ejb.Stateless;

@Stateless
public class MarketRuleService {

//	@PersistenceContext
//	private EntityManager entityManager;
	
	public String printCeva(){
		System.out.println("INJECTTTTTTT");
		return "inject";
	}
}
