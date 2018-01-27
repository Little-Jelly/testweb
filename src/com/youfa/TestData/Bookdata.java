package com.youfa.TestData;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import com.youfa.Entity.Book;

public class Bookdata {
	private static Map<String, Book> books = new LinkedHashMap<String, Book>();
	static {
		books.put("1", new Book("javaweb", "19.9", "computer"));
		books.put("2", new Book("oracle", "1000", "computer"));
		books.put("3", new Book("php", "50", "computer"));
		books.put("4", new Book("c", "20", "computer"));
	}
	public static Collection<Book> getAll(){
		return books.values();
	}
	public static Book getBook(String id){
		return books.get(id);
	}
}
