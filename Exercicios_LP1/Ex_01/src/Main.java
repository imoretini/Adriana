
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));
    Balanco trimestre;//
    trimestre=new Balanco();// estanciei; criei um novo objeto
   // int dado;
    //Scanner leitor=new Scanner(System.in);
    //IO.println("Digite o valor do mes de Janeiro:");
    //dado= leitor.nextInt();
    trimestre.setJan(15);
    trimestre.setFev(23);
    trimestre.setMar(17);
    IO.println(trimestre.calcMedia());
}
