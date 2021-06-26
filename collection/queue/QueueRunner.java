package com.archa.workspace.collection.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

//giving priority based on length.
class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {

		return Integer.compare(value1.length(), value2.length());
	}

}
public class QueueRunner {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
		queue.addAll(List.of("Apple", "Ornage", "cat"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}

}
