package com.prowings.interview_asked_questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_From_Map_In_Java_8 {

	public static void main(String[] args) {
		
		Map<String,Integer> scores = new HashMap<>();
		scores.put("Alice",95);
		scores.put("Bob",88);
		scores.put("Charlie",92);
		
		List<String> highScorers = scores.entrySet().stream()
													.filter(entry -> entry.getValue() > 90)
													.map(Map.Entry::getKey)
													.collect(Collectors.toList());
		System.out.println(highScorers);
	}
}
