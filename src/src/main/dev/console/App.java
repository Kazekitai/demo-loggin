package src.main.dev.console;

import src.main.dev.service.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	private static final Logger LOG = LoggerFactory.getLogger("logger2");

	public static void main(String[] args) {
	LOG.info("Bonjour Slf4J !");
	LOG.info("Implémentation Logback");
	new AppService().executer("valeur 1"); 

	}

}
