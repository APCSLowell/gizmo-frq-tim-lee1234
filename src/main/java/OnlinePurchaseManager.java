import java.util.ArrayList;
public class OnlinePurchaseManager
{
  /** An ArrayList of purchased Gizmo objects,
  * instantiated in the constructor.
  */
  private ArrayList<Gizmo> purchases;
  
  /** Returns the number of purchased Gizmo objects that are electronic
  * whose manufacturer is maker, as described in part (a).
  */
  public int countElectronicsByMaker(String maker)
  {
     int count = 0;
    for (int i = 0; i< purchases.size(); i++)
      {
        Gizmo gizmo = purchases.get(i);
        if (gizmo.getMaker().equals(maker))
          count++;
      }
    return count;
  }
  
  /** Returns true if any pair of adjacent purchased Gizmo objects are
  * equivalent, and false otherwise, as described in part (b).
  */
  public boolean hasAdjacentEqualPair()
  {
 for (int i = 0; i< purchases.size()-1; i++)
      {
        Gizmo gizmo1 = purchases.get(i);
        Gizmo gizmo2 = purchases.get(i+1);
        if(gizmo1.equals(gizmo2))
          return true;
      }
    return false;
  }
    
    
  public OnlinePurchaseManager()
  {
    purchases = new ArrayList <Gizmo>();
  }
  public void add(Gizmo g)
  {
    purchases.add(g);
  }
}
