package ru.napadovskiu;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CreateXML {


    public void parseAdressWithGoods() throws IOException {//) {
        System.setProperty("webdriver.chrome.driver", "D:\\tools\\chromedriver_win32\\chromedriver.exe");
        String adr = "http://hotline.ua/remont-polotencesushiteli/mario-lyuks-800x500/prices/";
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(adr);
        List<WebElement> allOffers =  driver.findElements(By.cssSelector(".offers-item"));//driver.findElements(By.className("ellipsis"));
        List<WebElement> allGoods =  driver.findElements(By.cssSelector(".black.italic"));

        //List<WebElement> allTitles =  driver.findElements(By.className("tgProductTitleText"));
        String fileText = "";

        for (WebElement author : allOffers){

//            String authorName = author.getText();
            //String Url = (String)((JavascriptExecutor)driver).executeScript("return arguments[0].innerHTML;", allTitles.get(i++));
//            int a=1;
            //String a = author.getText();

            //final Pattern pattern = Pattern.compile("title=(.+?)>");
//            final Matcher matcher = pattern.matcher(Url);
//            matcher.find();
//            String title = matcher.group(1);
//            fileText = fileText+authorName+","+title+"\n";
            int i=0;
        }

        Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("books.csv"), "utf-8"));
        writer.write(fileText);
        writer.close();

        driver.close();

//        try {
//            Document doc = Jsoup.connect(adr).get();
//            Elements catalog = doc.getElementsByTag("div");
//            for (Element element : catalog) {
//                System.out.println(element);
//            }
//
//
//            int a=1;
////            for (Element goodies : catalog) {
////                if (goodies.select("li.product-item-ad").size() == 0) {
////                    if (goodies.select("div.stick-pull").get(1).select("a[href]").text().equals("Сравнить цены")) {
////                        String link = goodies.select("div.stick-pull").get(1).select("a[href]").attr("href");
////                        arrayOfLinks.add(rootPage + link);
////                    }
////                }
////            }
//
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//

    }



    public void createXMLFile() {
//        WorkWithXMLFile workWithXMLFile = new WorkWithXMLFile();
//        File firstXmlFile = workWithXMLFile.createXmlFile(this.settings.getValue("firstXML"));

//        XMLOutputFactory output = XMLOutputFactory.newInstance();
//
//        try  (PreparedStatement pst = this.connection.prepareStatement("SELECT value FROM field;");) {
//            XMLStreamWriter writer = output.createXMLStreamWriter(new FileWriter(firstXmlFile));
//            ResultSet resultOfQuery =  pst.executeQuery();
//            writer.writeStartDocument("UTF-8", "1.0");
//
//            writer.writeStartElement("entries");
//
//            while (resultOfQuery.next()) {
//                writer.writeStartElement("entry");
//                writer.writeStartElement("field");
//                writer.writeCharacters(String.valueOf(resultOfQuery.getInt("value")));
//                writer.writeEndElement();
//                writer.writeEndElement();
//            }
//            writer.writeEndElement();
//            writer.writeEndDocument();
//            // Закрываем XML-документ
//            writer.flush();
//        } catch (SQLException | XMLStreamException | IOException e) {
//            LOG.error(e.getMessage(), e);
//        }





    }


}
