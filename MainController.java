import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
@RestController
public class MainController {
	
	@GetMapping(path= "articles/", produces = MediaType.APPLICATION_JSON_VALUE)
	List <ArticleDto> allArticles() {
		return articles;
	}
	
	@PostMapping(path = "articles/")
	
	void newArticle(@RequestBodyArticleDto articleDto) {
		articles.add(articleDto);
	}
	
	

}
