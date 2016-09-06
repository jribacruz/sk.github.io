#set($symbol_pound='#')#set($symbol_dollar='$')#set($symbol_escape='\')package ${package};

import java.io.IOException;

import sk.api.SkApplication;
import sk.api.annotation.ApplicationConf;

/**
 * Hello world!
 *
 */
@ApplicationConf(uuid = "${artifactId}", description = "${sk-app-description}")
public class Application implements SkApplication {

	@Override
	public void run() throws IOException {
		// TODO Application Code...
	}

}
