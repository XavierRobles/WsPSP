package videojuegoconHilos;
public class Healer extends Personaje{
	private int sabiduria;

	
	@Override
	public void atacar(Personaje p) {
		int dañoTotal;
		if (this.getArma() instanceof Rezo) {
			 dañoTotal = getArma().usar() + sabiduria;
			 int curacion = (int)Math.round(dañoTotal * 0.1);
			 this.setSalud(this.getSalud()+ curacion);
			 System.out.println("Healer se cura "+ dañoTotal);
			
		}else {
			dañoTotal = getArma().usar();
		}
		
		dañoTotal += getNivel()*2;
		System.out.println("Healer hace "+ dañoTotal);
		p.setSalud(p.getSalud() - dañoTotal);
	}


	public int getSabiduria() {
		return sabiduria;
	}


	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}


	
	
}
