package backend.model.PluginTest;

import ro.fortsoft.pf4j.Extension;
import backend.model.result.SimpleResult;
import backend.model.service.ServiceEntity;
import backend.model.serviceprovider.GenericServiceProvider;

@Extension
public class PluggedInService2 extends ServiceEntity<SimpleResult>{
	
	public PluggedInService2()
	{
		commonName("Plugged In Service 2 - " + this.getClass().getPackage().getName());
	}
	@Override
	public void execute() {
		try {
			GenericServiceProvider provider = serviceProviderRepository().serviceProvider("b80b17302e4da7adc8599b9fb302a3b48cbee13e");
			System.out.println(provider.commonName());
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
