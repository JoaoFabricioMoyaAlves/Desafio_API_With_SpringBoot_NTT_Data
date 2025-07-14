package ghost.api_produto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
public class ApiProdutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiProdutoApplication.class, args);
	}

}

@RestController
@RequestMapping("produto")

class ProdutoController{

	@GetMapping
	public String produto() {
		return "Produto{2,33,44}";
	}
	
	
}
