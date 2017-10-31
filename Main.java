class Main {
  public static void main(String[] args)
  {
    /*
    String conversion = args[0];
    String value = args[1];
    */

    /*
     * TODO
     *
     * use desired conversion here
     *
    */

    UnitConverter myConverter = new DollarToEuroConverter();
    double aLotOfDollars = 10000;
    double aLotOfEuros = myConverter.convert(aLotOfDollars);
    System.out.println(myConverter.toString() + " has converted " + aLotOfDollars + " USD to " + aLotOfEuros + " EUR!");

      UnitConverter myBConverter = new BolivianosToEuroConverter();
      double aLotOfBolis = 10000;
      double aLotOfnewEuros = myBConverter.convert(aLotOfBolis);
      System.out.println(myBConverter.toString() + " has converted " + aLotOfBolis + " BOL to " + aLotOfnewEuros + " EUR!");
  }
}
