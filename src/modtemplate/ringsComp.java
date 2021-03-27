package alteraa.entities.comp;

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

import alteraa.content.*;

@Component
abstract class ringsComp implements Posc, Rotc, Hitboxc, Flyingc, Unitc{
  @Import float x, y;
  @Import unitType type;
  
  transient Ring[] = ring = {};
  
  public void add(){
    resetWorm();
  }
    
  public void resetWorm(){
    this.ring = new Ring[Count];
    float ringSpacement = wormLenght/ringCount;
    
    for(int i = ringCount ){
      
      Ring 1 = new Ring(x, y - i * ringSpacement);

    }
  }
    
  @Override
  public void update(){
        //make the head move like a naval unit



        if ring(x, y) = balisei(X, Y){
            ringRot = balise(headRot);

        }

        if EndRing(x, y) = balisei(X, Y){
            EndRingRot = balisei(headRot);
            clear balisei;
        }

    }
  }




  
