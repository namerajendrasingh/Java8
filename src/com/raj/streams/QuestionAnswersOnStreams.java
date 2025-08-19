package com.raj.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
		
		
				
	}

	private static void infiniteStreamIntoFinitStream() {
     Stream<Integer> infiniteStream = Stream.iterate(0, n->n+2);	
     //Now making stream finit stream 
     infiniteStream.limit(10).forEach(System.out::println);
	}

	private static void mergeTwoStreams() {
		Stream<String> stream1 = Stream.of("a","b");
		Stream<String> stream2 = Stream.of("c","d");
		Stream<String> mergeTwoStreams = Stream.concat(stream1, stream2);
		mergeTwoStreams.forEachOrdered(e->System.out.println(e));// TODO Auto-generated method stub
		
	}

}
