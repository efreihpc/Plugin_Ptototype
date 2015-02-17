package backend.model.PluginTest;
import backend.model.result.SimpleResult;
import backend.model.service.ServiceEntity;
import backend.model.serviceprovider.GenericServiceProvider;
import ro.fortsoft.pf4j.Extension;
import ro.fortsoft.pf4j.Plugin;
import ro.fortsoft.pf4j.PluginWrapper;


public class Plugin1 extends Plugin{

	public Plugin1(PluginWrapper wrapper) {
		super(wrapper);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Extension
	public static class PluggedInServiceProvider extends GenericServiceProvider{

		public PluggedInServiceProvider()
		{
			commonName("Plugged In Service Provider");
		}
	}
	
	@Extension
	public static class PluggedInService extends ServiceEntity<SimpleResult> {

		public PluggedInService()
		{
			commonName("Plugged In Service");
		}
		
		@Override
		public void execute() {
			
		}

	}

}
