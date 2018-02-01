package gnu.kawa.xml;

import gnu.lists.FString;
import gnu.mapping.CharArrayOutPort;
import gnu.mapping.Procedure1;
import gnu.xml.XMLPrinter;
import java.io.Writer;

public class OutputAsXML extends Procedure1 {
    public int numArgs() {
        return 4097;
    }

    public Object apply1(Object arg) {
        Writer port = new CharArrayOutPort();
        XMLPrinter out = new XMLPrinter(port);
        out.writeObject(arg);
        out.flush();
        return new FString(port.toCharArray());
    }
}
