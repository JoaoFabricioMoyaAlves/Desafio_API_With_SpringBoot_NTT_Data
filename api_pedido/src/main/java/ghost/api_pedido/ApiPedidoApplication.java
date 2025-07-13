package ghost.api_pedido;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
public class ApiPedidoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPedidoApplication.class, args);
	}

}

@RestController
@RequestMapping("pedido")

 class pedidoController{

	@GetMapping
	public String pedido() {
		return "sei lá deu 10 conto";
	}

}