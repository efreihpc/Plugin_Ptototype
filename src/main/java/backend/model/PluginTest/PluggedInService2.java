package backend.model.PluginTest;

import ro.fortsoft.pf4j.Extension;
import backend.model.result.SimpleResult;
import backend.model.service.ServiceEntity;

@Extension
public class PluggedInService2 extends ServiceEntity<SimpleResult>{

	@Override
	public void execute() {
		commonName("Plugged In Service 2");
		
	}

}
