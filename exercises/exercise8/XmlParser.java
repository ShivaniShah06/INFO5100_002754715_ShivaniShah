package exercises.exercise8;

//importing required packages
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;

public class XmlParser {

    // Creating function for reading the XML file

    public static Document getDocument(String filePath) throws Exception {
        // Creating object of File that reads xml file at mentioned location
        File inputFile = new File(filePath);
        // Parsing XML document
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document document = dBuilder.parse(inputFile);
        return document;
    }

    // Creating function to print XML document content

    public static void printXmlDocument(Document document) {
        // Getting root element and printing it
        System.out.println("Root Element: " + document.getDocumentElement().getNodeName());
        // Getting nodes by using their tag name
        NodeList nodeList = document.getElementsByTagName("Book");
        System.out.println("**************************************************");

        // For loop to run for all the nodes recursively
        for (int temp = 0; temp < nodeList.getLength(); temp++) {
            Node nNode = nodeList.item(temp);
            System.out.println("\nCurrent Element: " + nNode.getNodeName());

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                Element element = (Element) nNode;
                System.out.println("Book Serial number: " + element.getAttribute("serialno"));
                System.out.println("Title: " + element.getElementsByTagName("title").item(0).getTextContent());
                System.out.println("Year published: "
                        + element.getElementsByTagName("publishedYear").item(0).getTextContent());
                System.out.println("Number of pages: "
                        + element.getElementsByTagName("numberOfPages").item(0).getTextContent());
                System.out.println("Author: " + element.getElementsByTagName("authors").item(0).getTextContent());

            }
        }
    }

    // Main program
    public static void main(String args[]) {

        try {
            // Calling function `getDocument()` and storing in variable document of type
            // Document
            Document document = getDocument(
                    "C:\\Users\\Niralis Envy\\OneDrive\\Documents\\GitHub\\INFO5100_002754715_ShivaniShah\\exercises\\exercise8\\InputFile.xml");

            document.getDocumentElement().normalize();
            System.out.println(
                    "=========================Printing the already existing XML file=========================");
            // Calling the function `printXmlDocument()` to print the XML file content using
            // document returned from the `getDocument()` function as an argument
            printXmlDocument(document);

            System.out.println(
                    "\n=========================Adding new element to the file and printing the content again=========================");

            // Calling function `getDocument()` again to update it
            document = getDocument(
                    "C:\\Users\\Niralis Envy\\OneDrive\\Documents\\GitHub\\INFO5100_002754715_ShivaniShah\\exercises\\exercise8\\InputFile.xml");

            // Getting root element
            Element root = document.getDocumentElement();

            // Adding book element
            Element book = document.createElement("Book");
            root.appendChild(book);
            // Adding Attribute `serialno` to book element
            Attr attribute = document.createAttribute("serialno");
            attribute.setValue("4");
            book.setAttributeNode(attribute);
            // Adding sub-elements:
            // title:
            Element title = document.createElement("title");
            title.appendChild(document.createTextNode("Da Vinci Code"));
            book.appendChild(title);
            // publishedYear:
            Element publishedYear = document.createElement("publishedYear");
            publishedYear.appendChild(document.createTextNode("2003"));
            book.appendChild(publishedYear);
            // numberOfPages:
            Element numberOfPages = document.createElement("numberOfPages");
            numberOfPages.appendChild(document.createTextNode("689"));
            book.appendChild(numberOfPages);
            // authors:
            Element authors = document.createElement("authors");
            authors.appendChild(document.createTextNode("Dan Brown"));
            book.appendChild(authors);

            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(
                    "C:\\Users\\Niralis Envy\\OneDrive\\Documents\\GitHub\\INFO5100_002754715_ShivaniShah\\exercises\\exercise8\\InputFile.xml"));
            transformer.transform(source, result);
            document.getDocumentElement().normalize();

            // Calling `printXmlDocument()` function to print the updated XML file
            printXmlDocument(document);

            // Catch block for exception handling
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}