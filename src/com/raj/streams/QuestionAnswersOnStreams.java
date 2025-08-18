package com.raj.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Raj Singh
 */
public class QuestionAnswersOnStreams {

	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("a","b");
		Stream<String> stream2 = Stream.of("c","d");
		Stream<String> mergeTwoStreams = Stream.concat(stream1, stream2);
		mergeTwoStreams.forEachOrdered(e->System.out.println(e));
				
	}

}
