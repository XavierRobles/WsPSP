package videojuegoconHilos;
public class Healer extends Personaje{
	private int sabiduria;

	
	@Override
	public void atacar(Personaje p) {
		int da�oTotal;
		if (this.getArma() instanceof Rezo) {
			 da�oTotal = getArma().usar() + sabiduria;
			 int curacion = (int)Math.round(da�oTotal * 0.1);
			 this.setSalud(this.getSalud()+ curacion);
			 System.out.println("Healer se cura "+ da�oTotal);
			
		}else {
			da�oTotal = getArma().usar();
		}
		
		da�oTotal += getNivel()*2;
		System.out.println("Healer hace "+ da�oTotal);
		p.setSalud(p.getSalud() - da�oTotal);
	}


	public int getSabiduria() {
		return sabiduria;
	}


	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}


	
	
}
