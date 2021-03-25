
package mindustry.entities.comp;

import arc.math.*;
import arc.math.geom.*;
import arc.util.*;
import mindustry.*;
import mindustry.ai.*;
import mindustry.annotations.Annotations.*;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.entities.EntityCollisions.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.blocks.environment.*;


@Component
abstract class ringsComp implements Posc, Rotc, Hitboxc, Flyingc, Unitc{
  @Import float x, y;
  @Import unitType type;
  @Import wormLength, wormBalancement, ringBalancement, ringCount;
  
  transient Ring[] = ring = {};
  
  public void add(){
    resetWorm();
  }
    
  public void resetWorm(){
    this.ring = new Ring[Count];
    float ringSpacement = wormLenght/ringCount;
    
    for(int i = 0){
      
      Ring 1 = new Ring();
      
      rings[i] = 1;
    }
    
    @Override
    public void update(){
      
      int headx = 
      
      
  }
  
