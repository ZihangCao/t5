import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import com.example.myschema.RssItem;

import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class reader{
	public static void main(String args[]) {
		JAXBContext jc = JAXBContext.newInstance("nz.ac.massey.cs.sdc.jaxb");
		Unmarshaller parser=jc.createUnmarshaller();
		File file = new File("nzhrsscid_000000005.xml");
		RssItem rssItem = (RssItem) parser.unmarshal(file);
		List<RssItem> list = rssItem.getTitleOrDescriptionOrLink();
		for(int i =0; i<lists.size; i++)
		{
			System.out.println("title: " + list.get(0)
					+ "\nlink: " + list.get(1)
			        + "\ndescription: " + list.get(2));
		}		
	}
}