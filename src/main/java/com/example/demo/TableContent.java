package com.example.demo;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.net.URL;

public class TableContent {

    public static String getTable() throws Exception {
        String url =  "http://www.ynet.co.il/Integration/StoryRss2.xml";
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {

            String html_table = "<table>" +
                    "  <tr>" +
                    "    <th>תאריך</th>" +
                    "    <th>קישור </th>" +
                    "    <th>מבזק</th>" +
                    "    <th>כותרת</th>" +
                    "  </tr>";
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new URL(url).openStream());

            // optional, but recommended
            // http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();

            NodeList list = doc.getElementsByTagName("item");
            for (int i = 0; i < list.getLength(); i++) {
                Node item = list.item(i);
                Element element = (Element) item;
                String title = element.getElementsByTagName("title").item(0).getTextContent();
                String desc = element.getElementsByTagName("description").item(0).getTextContent();
                String link = element.getElementsByTagName("link").item(0).getTextContent();
                String date = element.getElementsByTagName("pubDate").item(0).getTextContent();
                html_table += "  <tr style=\"text-align: right\">" +
                        "    <td>" + date +"</td>" +
                        "    <td>" + link  +"</td>" +
                        "    <td>" + desc +"</td>" +
                        "    <td>" + title +"</td>" +

                        "  </tr>";

            }
            html_table += "</table>";
            return html_table;
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }


}
