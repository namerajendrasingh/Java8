package com.raj.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author Raj Singh
 */
public class QuestionAnswersOnStreams {

	public static void main(String[] args) {
		//Question:How to merge two streams?
		mergeTwoStreams();
		
		//Question: How to make and infinite stream into finite stream?
		infiniteStreamIntoFinitStream();
		
		/*
		 * Primitive Streams
           Specialized streams for primitives 
           (IntStream, DoubleStream, LongStream):
		 */
		
		IntStream intStream = IntStream.of(1,2,3,4);
		int sum = intStream.sum();
		System.out.println("\n Sum:"+sum);
		
		LongStream longStream = LongStream.of(1,2,3,4);
		long longSum = longStream.sum();
		System.out.println("\n Long Stream Sum:"+longSum);
		
		DoubleStream doubleStream = DoubleStream.of(1,2,3,4);
		double doubleSum = doubleStream.sum();
		System.out.println("\n Double Stream Sum:"+doubleSum);
				
	}

	private static void infiniteStreamIntoFinitStream() {
     Stream<Integer> infiniteStream = Stream.iterate(0, n->n+2);	
     //Now making stream finit stream 
     infiniteStream.limit(10).forEach(n->{System.out.print(n+",");});
	}

	private static void mergeTwoStreams() {
		Stream<String> stream1 = Stream.of("a","b");
		Stream<String> stream2 = Stream.of("c","d");
		Stream<String> mergeTwoStreams = Stream.concat(stream1, stream2);
		mergeTwoStreams.forEachOrdered(e->System.out.println(e));// TODO Auto-generated method stub
	    	
	}
}
