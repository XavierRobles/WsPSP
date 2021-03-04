package recursos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import entidad.Movil;

public class ClasePrincipal {
	public static void main(String[] args) {
		Document amazonMoviles;
		try {
			amazonMoviles = Jsoup.connect("https://www.amazon.es/ordenadores/s?k=moviles").get();
			System.out.println(amazonMoviles.title());
			Elements documento = amazonMoviles.getElementsByClass("sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col sg-col-4-of-20");
			System.err.println(documento.size());
			List<Movil> lista_movil = new ArrayList<Movil>();
			for (Element i : documento) {
				Movil m = new Movil();

				String url = i.getElementsByAttribute("src").attr("src");
				m.setUrl(url);

				String descripcion =i.getElementsByClass("a-size-base-plus a-color-base a-text-normal").text();
				m.setDescripcion(descripcion);
				
				String price =i.getElementsByClass("a-price-whole").text();
				m.setPrice(price);
				lista_movil.add(m);

			}
			
			System.out.println(lista_movil);
			//PintarTablaHTML.crearTabla(lista_movil);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
