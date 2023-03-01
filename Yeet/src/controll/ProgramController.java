package controll;


import model.List;


/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute


    // Referenzen
    private List <Token> tokenList;
    public Token aktuellesToken;
    public boolean fehler;


    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param viewController das viewController-Objekt des Programms
     */

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen.
     * Sie erstellt die leeren Datenstrukturen, zu Beginn nur eine Queue
     */
    public void startProgram(){

    }

    /*public void scanner(){
        char erster, zweiter;
        int pos = 0;
        while(eingabe.charAt(pos) != ´#´){
            erster = eingabe.charAt(pos);
            zweiter = eingabe.charAt(pos+1);
            if(erster == '1' && 'a'){
                aktuellesToken = new Token ("Egal", "la");
            }else if( erster = "1" && zweiter = "e"){
                aktuellesToken = new Token ("EGAL", "le");
            }else if( erster = "1" && zweiter = "u"){
                aktuellesToken = new Token ("ENDE", "lu");
            }else{
                fehler = true;
                break;
            }
        }
        pos = pos + 2;
        tokenList.append(aktuellesToken);
    }*/
    public boolean pruefeS(){
        if(tokenList.hasAccess() && aktuellesToken.getType()== "EGAl" || aktuellesToken.getType() == "ENDE"){
            tokenList.next();
            return pruefeA();
        }else{
            return false;
        }
    }
    public boolean pruefeA(){
        if(tokenList.hasAccess() && aktuellesToken.getType()== "EGAl" || aktuellesToken.getType() == "ENDE"){
            tokenList.next();
            return pruefeB();
        }else{
            return true;
        }
    }
    public boolean pruefeB(){
        if(tokenList.hasAccess() && aktuellesToken.getType()== "EGAl" || aktuellesToken.getType() == "ENDE"){
            return true;
        }else{
            return false;
        }
    }
    public boolean parrse(){
        if (tokenList.hasAccess()  && pruefeS() ){
            return true;
        }else{
            return false;
        }
    }
    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt){

    }
}
