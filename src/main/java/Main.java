import java.io.File;
import java.io.IOException;

import fish.payara.micro.BootstrapException;
import fish.payara.micro.PayaraMicro;
import fish.payara.micro.PayaraMicroRuntime;

public class Main {
	public static void main(String[] args) throws BootstrapException, IOException {
		final File file = new File("myapp.war");
		if (file.exists() == false) {
			System.out.println("File not found: " + file.getAbsolutePath());
		}
		final PayaraMicroRuntime instance = PayaraMicro.getInstance()
				.setHttpPort(Integer.parseInt(System.getenv("PORT"))).bootStrap();
		instance.deploy(file);
	}
}
