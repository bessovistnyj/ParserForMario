package ru.napadovskiu;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;


public class MainClass {

        public static void main(String[] args)  {
//            String rootPage = "http://hotline.ua";
//            String currentPage = "http://hotline.ua/remont/polotencesushiteli/322991/";//String.format("%s/%d", "http://hotline.ua/remont/polotencesushiteli/322991/");
//            int numberPage =0;
//            ArrayList<String> arrayOfLinks = new ArrayList<String>();
//            Boolean work = true;
//            while (work) {
//                try {
//                    Document doc = Jsoup.connect(currentPage).get();
//                    Elements catalog = doc.select("li.product-item");
//                    if (catalog.size() == 0) {
//                        work = false;
//                    }
//                    for (Element goodies : catalog) {
//                        if (goodies.select("li.product-item-ad").size() == 0) {
//                            if (goodies.select("div.stick-pull").get(1).select("a[href]").text().equals("Сравнить цены")) {
//                                String link = goodies.select("div.stick-pull").get(1).select("a[href]").attr("href");
//                                arrayOfLinks.add(rootPage + link);
//                            }
//                        }
//                    }
//
//                } catch (IOException e) {
//                    work = false;
//                    e.printStackTrace();
//                }
//                numberPage++;
//                if (numberPage > 0 ) {
//                    currentPage = "http://hotline.ua/remont/polotencesushiteli/322991/?p="+numberPage;
//                }
//            }
            CreateXML createXML = new CreateXML();
            try {
                createXML.parseAdressWithGoods();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
