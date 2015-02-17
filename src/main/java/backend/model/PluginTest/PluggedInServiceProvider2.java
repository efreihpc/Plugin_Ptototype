package backend.model.PluginTest;

import ro.fortsoft.pf4j.Extension;
import backend.model.serviceprovider.GenericServiceProvider;

@Extension
public class PluggedInServiceProvider2 extends GenericServiceProvider {
	
	public PluggedInServiceProvider2()
	{
		commonName("Plugged In ServiceProvider 2");
	}
}
