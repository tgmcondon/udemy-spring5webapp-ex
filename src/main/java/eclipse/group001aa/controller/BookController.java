package eclipse.group001aa.controller;

import java.util.jar.Attributes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import eclipse.group001aa.repo.BookRepo;

@Controller
public class BookController {

	private BookRepo bookRepo;
	
	public BookController(BookRepo inBookRepo) {
		this.bookRepo = inBookRepo;
	}
	
	@RequestMapping("/books")
	public String getBooks(Model inModel) {
		inModel.addAttribute("books", bookRepo.findAll());
		
		return "books";
	}
}
