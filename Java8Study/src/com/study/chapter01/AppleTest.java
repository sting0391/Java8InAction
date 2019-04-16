package com.study.chapter01;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

	public static List<Apple> filterGreenApples(List<Apple> inventory){
		
		List<Apple> result = new ArrayList<Apple>();
		for(Apple apple : inventory) {
			if("Green".equals(apple.getColor())) {
				result.add(apple);
			}
		}
		
		return result;
	}
	
	public static List<Apple> filterHeavyApples(List<Apple> inventory){
		List<Apple> result = new ArrayList<Apple>();
		
		for(Apple apple : inventory) {
			if(apple.getWeight() > 150) {
				result.add(apple);
			}
		}
		
		return result;
	}

	public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p){
		List<Apple> result = new ArrayList<Apple>();
		for(Apple apple : inventory) {
			if(p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<Apple> inventory = new ArrayList<Apple>();
		List<Apple> result = filterApples(inventory, Apple::isGreenApple);
	}
}
