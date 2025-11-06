public class LechedeCoco extends DecoradorBebida{
  private Bebida bebida;
  
  public LechedeCoco(Bebida bebida){
    this.bebida = bebida;
  }
  public String getDescripion(){
    return bebida.getDescripcion() + ",Leche de Coco";
  }
  public int getCosto(){
    return bebida.getCosto() + 1000;
  }
}
