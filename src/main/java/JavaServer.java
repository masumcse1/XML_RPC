
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.webserver.WebServer;



public class JavaServer {

	public static void main(String[] args) {

		try {

			System.out.println("Attempting to start XML-RPC Server...");

			WebServer ws = new WebServer(8741);
			PropertyHandlerMapping handlerMapping = new PropertyHandlerMapping();
			handlerMapping.addHandler("SERVER", JavaServer.class);
			ws.getXmlRpcServer().setHandlerMapping(handlerMapping);
			ws.start();

			System.out.println("Started successfully.");
			System.out.println("Accepting requests. (Halt program to stop.)");

		} catch (Exception exception) {
			System.err.println("JavaServer: " + exception);
		}
	}
	
	
	public String echo(String msg) {
		System.out.println(msg);
		return "Yes,Reply:"+msg;
	}
}