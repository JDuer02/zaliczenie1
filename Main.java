class Main {
  public static void main(String[] args) {

    String text = "bf.b,,dat.";
    char[] textarray=text.toCharArray();

    int licznik=0;
    int i=0;
    for(; i<text.length();i++)
      {
        if(textarray[i]==',' || textarray[i]=='.')
          licznik++;
      }
    System.out.println("Ilosc znakow interpunkcyjnych: "+licznik);
  }
}