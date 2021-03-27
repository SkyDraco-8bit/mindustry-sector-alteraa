package alteraa.type;

import mindustry.content.*;
import mindustry.type.*;
import arc.*;
import arc.audio.*;
import arc.func.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.scene.ui.*;
import arc.scene.ui.layout.*;
import arc.struct.*;
import arc.util.*;
import mindustry.*;
import mindustry.ai.types.*;
import mindustry.annotations.Annotations.*;
import mindustry.content.*;
import mindustry.core.*;
import mindustry.ctype.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.units.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.ui.*;
import mindustry.world.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.meta.*;
import mindustry.world.meta.values.*;

import static mindustry.Vars.*;

import alteraa.content.*;
import alteraa.entities.*;

@Override
public class AlteraaUnitType extends UnitType{
    public int ringCount = 8;
    public float wormLength = 10, wormBalancement = 0.5f;
    public TextureRegion baseRegion, legRegion, region, shadowRegion, cellRegion,
        softShadowRegion, jointRegion, footRegion, legBaseRegion, baseJointRegion, headRegion, ringRegion, ringEndRegion, clawRegion, outlineRegion;
    public TextureRegion[] wreckRegions;
    
    @CallSuper
    @Override
    public void load(){

        headRegion = Core.atlas.find(name + "-head");
        ringRegion = Core.atlas.find(name + "-ring");
        ringEndRegion = Core.atlas.find(name + "-ring-end");

    }



    @Replace
    public void drawMech(Mechc mech){
        Unit unit = (Unit)mech;

        int baliseNumber = 0;
        baliseNumber = baliseNumber + 1;

        public void balise(unit.x, unit.y);

        balise() = new balise[baliseNumber];


        if(floor.isLiquid){
            Draw.color(Color.white, floor.mapColor, 0.5f);
        }

        Draw.rect(headRegion, unit.x, unit.y);


        for(int i = ringCount){
            Draw.rect(ringRegion,
            unit.x,
            unit.y + i * ringCount);

            }
        }


        Draw.rect(baseRegion, unit, mech.baseRotation() - 90);

        Draw.mixcol();
    }


}
