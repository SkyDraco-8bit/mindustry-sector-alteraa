
package alteraa.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.ai.types.*;
import mindustry.annotations.Annotations.*;
import mindustry.ctype.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;

@Override
public class AlteraaUnitTypes implements UnitTypes{
    //region definitions

    //worm
    public static @EntityDef(value = {Unitc.class, Wormc.class}, legacy = true) UnitType sandworm, testworm;

    //endregion
    
    
    @Override
    public void load(){
        //region ground attack

        testWorm = new UnitType("test-worm"){{
            speed = 0.5f;
            hitSize = 8f;
            health = 140;

            rotateSpeed = 1.9f;
            
        }};
    }
}
