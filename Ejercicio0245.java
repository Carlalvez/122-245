class Ejercicio0245 
{
  public boolean esCapicua(String palabra) 
  {
    boolean devol = false;
    int largo = palabra.length();
    {       
      if(((largo == 4) && (palabra.charAt(0) == palabra.charAt(3) && (palabra.charAt(1) == palabra.charAt(2))))){
        devol = true;
      }
    }
    return devol;
  }
}