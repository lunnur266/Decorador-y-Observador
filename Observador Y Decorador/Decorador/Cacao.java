public class extends DecoradorBebida{
  private Bebida bebida;
  
  public Cacao(Bebida bebida){
    This.bebida = bebida;
  }
  public String getDescripcion(){
    return bebida.getDescription() + ", Cacao en Polvo";
  }
  public int getCosto(){
    return bebida.getCosto() + 700;
  }
}
