package Ejer3Junit;

public class Colegio {
	private Persona v[];

	public  Colegio() {
		
	}
	
	public int numPersona() {
		if (v == null) return 0;
		else return v.length;
	}
	
	public boolean insertarPersona(Persona p) {
		boolean resul = false;
		if(v==null) {
			v=new Persona[1];
			v[0]=p;
			resul = true;
		}else {
			if (buscarPersona(p.getNif()) != null){
				resul = false;
			}
			else {
				int nuevoTam=v.length+1;
				Persona vNuevo[]=new Persona[nuevoTam];
				for (int i = 0; i < v.length; i++) {
					vNuevo[i]=v[i];
				}
				int pos=nuevoTam-1;
				vNuevo[pos]=p;
				v=vNuevo;
				resul = true;
			}
		}
		return resul;
	}
	
	public void listarColegio() {
		for (int i = 0; i < v.length; i++) {
			v[i].identificate();
		}
	}

	public Persona buscarPersona(String nif) {
		// TODO Auto-generated method stub
		for (int i = 0; i < v.length; i++) {
			Persona p=v[i];
			if(p.getNif().compareTo(nif)==0) {
				return p;
			}
		}
		return null;
	}
	
	public void  borrarPersona(String nif) {
		// TODO Auto-generated method stub
		int pos = -1;
		for (int i = 0; i < v.length; i++) {
			Persona p=v[i];
			if(p.getNif().compareTo(nif)==0) {
				pos = i;
			}
		}
		
		if(pos!=-1) {
			// encontre a la persona
			int nuevoTam=v.length-1;
			Persona vNuevo[]=new Persona[nuevoTam];
			for(int i=0;i<pos;i++) {
				vNuevo[i]=v[i];
			}
			for(int i=pos+1;i<v.length;i++) {
				vNuevo[i-1]=v[i];
			}
			v=vNuevo;
		}
		
	}
	
	
}





