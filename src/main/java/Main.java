import java.io.File;
import java.io.IOException;

import fish.payara.micro.BootstrapException;
import fish.payara.micro.PayaraMicro;

/**
 * Simple Payara Micro launcher for Heroku.
 * 
 * @author Toshiki Iga
 */
public class Main {
	public static void main(final String[] args) throws BootstrapException, IOException {
		final File file = new File("myapp.war");
		if (file.exists() == false) {
			System.err.println("[Payara Micro launcher] error: target war file missing: " + file.getAbsolutePath());
		}

		PayaraMicro.getInstance() //
				.setHttpPort(Integer.parseInt(System.getenv("PORT"))) // from-Heroku
				.addDeployment(file.getAbsolutePath()) // deploy-war
				.bootStrap();

		System.err.println("[Payara Micro launcher] Payara Micro started successfully.");
	}
}
