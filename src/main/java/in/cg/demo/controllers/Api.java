package in.cg.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import in.cg.demo.models.Book;

@RestController
public class Api {
	
	RestTemplate restTemplate = new RestTemplate();
	
	@PostMapping("/calculate")
	public Book calculate(@RequestBody Book book) {
		Book inBook = restTemplate.getForObject("http://localhost:8080/book/" + book.getBookId(), Book.class);
		book.setPrice(inBook.getPrice());
		book.calculateTotal();
		return book;
	}
}
