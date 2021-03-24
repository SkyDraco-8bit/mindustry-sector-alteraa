
@Component
abstract class LegsComp implements Posc, Rotc, Hitboxc, Flyingc, Unitc{
  @Import float x, y;
  @Import unitType type;
  
  transient Ring[] = ring = {};
}
