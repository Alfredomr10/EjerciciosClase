package Vehiculos;

public class TestCase {
public static void main(String[]args) {
System.out.println("*******************************************");
System.out.println("             <<DAM Alfredo>>               ");
System.out.println("*                                         *");
System.out.println("*******************************************");
System.out.println();
System.out.println("------------Clase padre vehiculo-----------");
Vehiculo mivehiculo = new Vehiculo();
mivehiculo.nombrevehiculo="El gran transportador";
System.out.println("usando mivehiculo, nombrevehiculo : "+mivehiculo.nombrevehiculo);
System.out.println("usando mivehiculo llama a: "+mivehiculo.transportar());
System.out.println("-------------------------------------------");
System.out.println();

System.out.println("---<< subclase hija acuatico extiende de vehiculo>>---");
Acuatico miacuatico= new Acuatico();
miacuatico.nombreacuatico="el navegante";
System.out.println("usando miacuatico, nombrevehiculo : "+miacuatico.nombreacuatico);
System.out.println("usando miacuatico llama a : "+miacuatico.transportar());
System.out.println("usando miacuatico llama a : "+miacuatico.navegar());
System.out.println("-------------------------------------------");
System.out.println();

System.out.println("---<< subclases hijas extiende de la subclase padre acuatico>>---");
barco mibarco= new barco();
mibarco.nombrevehiculo="titanic";
System.out.println("usando mibarco, nombrevehiculo : "+mibarco.nombrevehiculo);
System.out.println("usando mibarco llama a : "+mibarco.transportar());
System.out.println("usando mibarco llama a : "+mibarco.navegar());
System.out.println("usando mibarco llama a : "+mibarco.prendermotor());
System.out.println("-------------------------------------------");
System.out.println();

velero mivelero= new velero();
mivelero.nombrevehiculo="tormenta";
System.out.println("usando mivelero, nombrevehiculo : "+mivelero.nombrevehiculo);
System.out.println("usando mivelero llama a : "+mivelero.transportar());
System.out.println("usando mivelero llama a : "+mivelero.navegar());
System.out.println("usando mivelero llama a : "+mivelero.hizarvelas());
System.out.println("-------------------------------------------");
System.out.println();

System.out.println("---<< subclase hija aereo extiende de vehiculo>>---");
Aereo miaereo= new Aereo();
miaereo.nombrevehiculo="el volador";
System.out.println("usando miaereo, nombrevehiculo : "+miaereo.nombrevehiculo);
System.out.println("usando miaereo llama a : "+miaereo.transportar());
System.out.println("usando miaereo llama a : "+miaereo.volar());
System.out.println("-------------------------------------------");
System.out.println();

System.out.println("---<< subclases hijas extiende de la subclase padre aereo>>---");
Avion miavion= new Avion();
miavion.nombrevehiculo="el condor";
System.out.println("usando miavion, nombrevehiculo : "+miavion.nombrevehiculo);
System.out.println("usando miavion llama a : "+miavion.transportar());
System.out.println("usando miavion llama a : "+miavion.volar());
System.out.println("usando miavion llama a : "+miavion.bajartrendeaterrizaje());
System.out.println("-------------------------------------------");
System.out.println();

helicoptero mihelicoptero= new helicoptero();
mihelicoptero.nombrevehiculo="el condor";
System.out.println("usando mihelicpoptero, nombrevehiculo : "+mihelicoptero.nombrevehiculo);
System.out.println("usando mihelicpoptero llama a : "+mihelicoptero.transportar());
System.out.println("usando mihelicpoptero llama a : "+mihelicoptero.volar());
System.out.println("usando mihelicpoptero llama a : "+mihelicoptero.encenderhelices());
System.out.println("-------------------------------------------");
System.out.println();

System.out.println("--<<Propiedad de la clase vehiculo usada por todas las clases hijas>>--");
System.out.println("nombre vehiculo :"+ mivehiculo.nombrevehiculo);
System.out.println("nombre acuatico :" +miacuatico.nombreacuatico );
System.out.println("nombre aereo :"+ miaereo.nombrevehiculo);
System.out.println("nombre barco :"+ mibarco.nombrevehiculo);
System.out.println("nombre velero :"+ mivelero.nombrevehiculo);
System.out.println("nombre avion :"+ miavion.nombrevehiculo);
System.out.println("nombre helicoptero :"+ mihelicoptero.nombrevehiculo);
System.out.println("-------------------------------------------");


}
}
