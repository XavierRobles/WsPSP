
public class Mago extends Personaje{
private int inteligencia;
	@Override
	public void atacar(Personaje p) {
		int da�oTotal;
		if (this.getArma() instanceof Hechizo) {
			 da�oTotal = getArma().usar() + inteligencia;
			
		}else {
			da�oTotal = getArma().usar();
		}
		
		da�oTotal += getNivel()*2;
		System.out.println("Mago hace "+ da�oTotal);
		p.setSalud(p.getSalud() - da�oTotal);
	}
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	
}
