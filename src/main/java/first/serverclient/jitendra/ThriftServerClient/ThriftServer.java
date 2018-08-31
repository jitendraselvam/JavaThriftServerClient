package first.serverclient.jitendra.ThriftServerClient;

import org.apache.thrift.TException;

public class ThriftServer implements HelloWorldService.Iface{
		public String hello(String name) throws TException {
			return "Hello " + name;
		}
}
