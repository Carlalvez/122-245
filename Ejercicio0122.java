class Ejercicio0122 
{
    public String invertirPalabrasDe4Letras(String palabra) {
        String aDevolver="";
        if (palabra.length() == 4){
            aDevolver = "" + palabra.charAt(3)+ palabra.charAt(2) + palabra.charAt(1)+ palabra.charAt(0);

        }
       
        return aDevolver;
    }

}