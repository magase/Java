import java.util.Scanner;

public class Player {
	//Atributos
	private int vida=100;
	private int suerte;
	private int x,y,z;
	private int diamante;
	private int antx, anty, antz;
    
	//Constructor
	public Player (int vida, int suerte, int diamante) {
	this.suerte=suerte;
	this.vida=vida;
	this.diamante=diamante;
    
	}
	//Getters and setters

	public int getVida() {
    	return vida;
	}

	public void setVida(int vida) {
    	this.vida = vida;
	}

	public int getSuerte() {
    	return suerte;
	}

	public void setSuerte(int suerte) {
    	this.suerte = suerte;
	}

	public int getX() {
    	return x;
	}

	public void setX(int x) {
    	this.x = x;
	}

	public int getY() {
    	return y;
	}

	public void setY(int y) {
    	this.y = y;
	}
	public int getZ() {
    	return z;
	}
	public void setZ(int z) {
    	this.z=z;
	}
	public void setDiamante(int diamante) {
    	this.diamante=diamante;
	}
	public int getDiamante() {
    	return diamante;
	}
	public void setAntx(int antx) {
		this.antx=antx;
	}
	public int getAntx() {
		return antx;
	}
	public void setAnty(int anty) {
		this.anty=anty;
	}
	public int getAnty() {
		return anty;
	}
	public void setAntz(int antz) {
		this.antz=antz;
	}
	public int getAntz() {
		return antz;
	}
	//Metodos
	Scanner sc =new Scanner (System.in);
    
	//Mover derecha
	public void mDerch() {
		this.anty=this.getAnty();
    	if ((this.x==0 && this.y==3) || (this.x==1 && this.y==3) || (this.x==2 && this.y==3)) {
        	this.setY(this.getY()+0);
        	this.setX(this.getX());
    	}
    	else {
        	this.setY(this.getY()+1);
    	}
       	 
	}
	//Mover izquierda
	public void mIzq() {
		this.anty=this.getAnty();
   	 if((this.x==0 && this.y==0) || (this.x==1 && this.y==0) || (this.x==2 && this.y==0)) {
   		 this.setY(this.getY());
   		 this.setX(this.getX());
   	 }
   	 else {
   		 this.setY(this.getY()-1);
	}
	}
	//Mover hacia delante
	public void mArriba() {
		this.antx=this.getAntx();
	if((this.x==2 && this.y==0) || (this.x==2 && this.y==1) || (this.x==2 && this.y==2) || (this.x==2 && this.y==3)) {
   	 this.setY(this.getY());
   	 this.setX(this.getX());
	}
   	 else {
    	this.setX(this.getX()+1);
	}
	}
	//Mover hacia atras
	public void mAbajo() {
		this.antx=this.getAntx();
   	 if((this.x==0 && this.y==0) || (this.x==2 && this.y==1) || (this.x==2 && this.y==2) || (this.x==2 && this.y==3)) {
   		 this.setY(this.getY());
   		 this.setX(this.getX());
    	}
   		 else {
   		 this.setX(this.getX()-1);
	}
	}
	//Subir planta
	public void mSubir() {
		this.antz=this.getAntz();
   	 if((this.z==3)) {
   		 this.setZ(this.getZ());
   	 }
   	 else {
    	this.setZ(this.getZ()+1);
	}
	}
	//Bajar planta
	public void mBajar() {
		this.antz=this.getAntz();
   	 if((this.z==0)) {
   		 this.setZ(this.getZ());
   	 }
   	 else {
    	this.setZ(this.getZ()-1);
	}
	}
	public int mostrarPosicionXInt() {
   	 return (int) x;
	}
	public int mostrarPosicionYInt() {
   	 return (int) y;
	}
	public int mostrarPosicionZInt() {
   	 return (int) z;
	}
	//Suerte
	public void suerte() {
		boolean bicho;
   	 double random= (Math.random() * 100 + 1);
    	int diamante=0;
    	if (random < suerte) {
        	this.setDiamante(this.getDiamante()+10);
    	} 
    	else { 
    		if (random > suerte) {
        	System.out.println("Ningun diamante");
    		bicho=true;
    		
    		}
	}
	}
	//Lucha
	public void lucha() {
		boolean bicho;
   	 int random= (int) (Math.random() * 100 + 1);
   	 if (random >= 70) {
   		this.setDiamante(this.getDiamante()+3);
   	 }
   	 else {
   		 vida=vida-10;
   	 }
	}
	//Huir
	public int huir() {
		boolean bicho;;
		
		if((Math.random() * 100 +1)<90) {	
		this.setAntx(antx);
		this.setAnty(anty);
		this.setAntz(antz);
		}
		else {
			vida=vida-10;
		}
		return vida;
	}
    
}
