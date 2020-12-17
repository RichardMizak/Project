package Parsing;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLREADER {

        public static void main(String argv[])
        {
            try
            {

                File file = new File("C:\\Users\\rmiza\\OneDrive\\Plocha\\XMLFile.xml");

                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

                DocumentBuilder db = dbf.newDocumentBuilder();
                Document doc = db.parse(file);
                doc.getDocumentElement().normalize();
                System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
                NodeList nodeList = doc.getElementsByTagName("bill");

                for (int itr = 0; itr < nodeList.getLength(); itr++)
                {
                    Node node = nodeList.item(itr);
                    System.out.println("\nNode Name :" + node.getNodeName());
                    if (node.getNodeType() == Node.ELEMENT_NODE)
                    {
                        Element eElement = (Element) node;
                        System.out.println(eElement.getElementsByTagName("date").item(0).getTextContent());
                        System.out.println(eElement.getElementsByTagName("time").item(0).getTextContent());
                        System.out.println(eElement.getElementsByTagName("items count").item(0).getTextContent());
                        System.out.println(eElement.getElementsByTagName("item type").item(0).getTextContent());
                        System.out.println(eElement.getElementsByTagName("name").item(0).getTextContent());
                        System.out.println(eElement.getElementsByTagName("weight").item(0).getTextContent());
                        System.out.println(eElement.getElementsByTagName("pricePerKg").item(0).getTextContent());
                        System.out.println(eElement.getElementsByTagName("price unit").item(0).getTextContent());
                        System.out.println(eElement.getElementsByTagName("count").item(0).getTextContent());
                        System.out.println(eElement.getElementsByTagName("Price").item(0).getTextContent());
                        System.out.println(eElement.getElementsByTagName("totalPrice").item(0).getTextContent());


                    }
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

