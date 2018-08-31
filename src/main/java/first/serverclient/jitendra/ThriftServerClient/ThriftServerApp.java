package first.serverclient.jitendra.ThriftServerClient;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

public class ThriftServerApp {
	public static void main(String[] a)
	{
		try
		{
			ThriftServer hwserver = new ThriftServer();
			HelloWorldService.Processor processor = new HelloWorldService.Processor(hwserver);
			TServerTransport serverTransport = new TServerSocket(9903);
			TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));
			System.out.println("Starting server");
			server.serve();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
