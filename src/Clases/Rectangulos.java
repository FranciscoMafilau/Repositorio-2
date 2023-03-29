package Clases;

public class Rectangulos {
    public int base;
    public int altura;

    public Rectangulos(){
     
        
    }
    public int area(int base, int altura){
      this.base =base;          //son variables locales, solo se puede utilizar en éste método
      this.altura = altura;
      return this.base* this.altura;
    }
    public int Perimetro(int altura, int base){
        this.base = base;
        this.altura = altura;
        return 2* (this.base+this.altura);
    }
}
