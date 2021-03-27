
package alteraa.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.content.*;
import mindustry.graphics.g3d.*;
import mindustry.type.*;
import alteraa.maps.planets.*;

public class VanillaPlanets implements ContentList{
    public static Planet
    cuantum, cuantumStar, nortum,
    xariex;

    @Override
    public void load(){
        sector1 = new Planet("alteraa", Planets.sun, 3, 0.8f){{
            generator = new AlteraaPlanetGenerator();
            meshLoader = () -> new HexMesh(this, 5);
            atmosphereColor = Color.valueOf("6BFF92");
            atmosphereRadIn = 0.07f;
            atmosphereRadOut = 0.5f;
            startSector = 23;
        }};
    }
}