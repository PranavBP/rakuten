package com.rakuten.prj.client;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaExample {

	public static void main(String[] args) {
		Function<Integer, Double> f1 = new Function<Integer, Double>() {

			@Override
			public Double apply(Integer t) {

				return t / 2.0;
			}

		};
		System.out.println(f1.apply(5));

		BiFunction<Integer, Integer, Integer> f2 = (Integer t, Integer u) -> {
			return t + u;
		};
		
		System.out.println(f2.apply(5, 4));

		// for multiplication
		BiFunction<Integer, Integer, Integer> f3 = (t, u) -> t * u;

		System.out.println(f3.apply(5, 4));

		
		//lambda expressions short form
		BiFunction<Integer, Integer, Integer> f4 = (t, u) -> t + u;

		System.out.println(f4.apply(5, 4));
	}

}
