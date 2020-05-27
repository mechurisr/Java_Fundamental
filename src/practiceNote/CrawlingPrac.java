package practiceNote;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingPrac {
	public static void main(String[] args) {
		String url = "http://www.imbc.com/";
		
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("성공...");
		Elements elements = doc.select(".notice-list li");
		
		for(int i = 0; i < elements.size();i++) {
			Element liElement = elements.get(i);
			System.out.println(liElement.text());
		}
	}

}
