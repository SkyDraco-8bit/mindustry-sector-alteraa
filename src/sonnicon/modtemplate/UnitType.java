package exdustry.content

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

@Override
public class UnitType extends UnlockableContent{
    public int ringCount = 8
    public float wormLength = 10, wormBalancement = 0.5f, ringBalancement = 0.1f
    public TextureRegion baseRegion, legRegion, region, shadowRegion, cellRegion,
        softShadowRegion, jointRegion, footRegion, legBaseRegion, baseJointRegion, ringRegion, ringEndRegion, clawRegion, outlineRegion;
    public TextureRegion[] wreckRegions;
    
    @CallSuper
    @Override
    public void load(){
        weapons.each(Weapon::load);
        region = Core.atlas.find(name);
        legRegion = Core.atlas.find(name + "-leg");
        jointRegion = Core.atlas.find(name + "-joint");
        baseJointRegion = Core.atlas.find(name + "-joint-base");
        footRegion = Core.atlas.find(name + "-foot");
        legBaseRegion = Core.atlas.find(name + "-leg-base", name + "-leg");
        baseRegion = Core.atlas.find(name + "-base");
        ringRegion = Core.atlas.find(name + "-ring");
        ringEndRegion = Core.atlas.find(name + "-ring-end");
        
        cellRegion = Core.atlas.find(name + "-cell", Core.atlas.find("power-cell"));
        softShadowRegion = Core.atlas.find("circle-shadow");
        outlineRegion = Core.atlas.find(name + "-outline");
        shadowRegion = icon(Cicon.full);
        

        wreckRegions = new TextureRegion[3];
        for(int i = 0; i < wreckRegions.length; i++){
            wreckRegions[i] = Core.atlas.find(name + "-wreck" + i);
        }
    }

}
