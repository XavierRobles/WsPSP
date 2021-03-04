package recursos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entidad.Movil;




public class PintarTablaHTML {

	public static String crearTabla(List<Movil> lista_movil) {
	
		String html="<table><tr><th>Foto</th><th>Descripcion</th><th>Precio</th></tr>";
		for (Movil m: lista_movil) {
			html +="<tr><td><img src ='"+m.getUrl()+"'</td><td>"+m.getDescripcion()+"</td>"+
					"<td>"+m.getPrice()+"</td></tr>";
			
		}
		html +="</table>";
		html="<html><head></head><body>" + html + "</body></html>";
		
		
		File f = new File("C:\\Users\\xavie\\pruebasmenu\\documentp.html");
		try {
			FileWriter fw = new FileWriter(f);
			
			fw.write(html);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return html;
		
		
		
		
		
	}
	
	

}