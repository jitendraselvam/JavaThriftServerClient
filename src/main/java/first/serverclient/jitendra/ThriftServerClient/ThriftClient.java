package first.serverclient.jitendra.ThriftServerClient;

import java.util.ArrayList;
import java.util.List;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * Hello world!
 *
 */
public class ThriftClient 
{
    public static void main( String[] args )
    {
    	TTransport transport;
        try {
            transport = new TSocket("localhost", 9903);
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            HelloWorldService.Client client = new HelloWorldService.Client(protocol);
            System.out.println(client.hello("Jitendra"));
            	
            transport.close();
            
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        }
    }
}
