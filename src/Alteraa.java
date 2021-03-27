package alteraa;

// Arc Package
import arc.*;
import arc.util.*;
// Mindustry Package
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
// Alteraa Package
import alteraa.content.*;
// End

public class AlteraaSector extends Mod{

    public AlteraaSector(){}

    @Override
    public void loadContent(){
        new AlteraaItems().load();
        new AlteraaLiquids().load();
        new AlteraaBullets().load();
        new AlteraaUnits().load();
        new AlteraaBlocks().load();
        new AlteraaPlanets().load();
        new AlteraaSectors().load();
        new AlteraaTechTree().load();
    }
}