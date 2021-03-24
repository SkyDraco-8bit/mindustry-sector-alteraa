
package mindustry.content;

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
public class UnitTypes implements ContentList{
    //region definitions

    //(the wall of shame - should fix the legacy stuff eventually...)

    //mech
    public static @EntityDef({Unitc.class, Mechc.class}) UnitType mace, dagger, crawler, fortress, scepter, reign;

    //mech
    public static @EntityDef(value = {Unitc.class, Mechc.class}, legacy = true) UnitType nova, pulsar, quasar;

    //mech
    public static @EntityDef({Unitc.class, Mechc.class}) UnitType vela;

    //legs
    public static @EntityDef({Unitc.class, Legsc.class}) UnitType corvus, atrax;

    //legs
    public static @EntityDef(value = {Unitc.class, Legsc.class}, legacy = true) UnitType spiroct, arkyid, toxopid;

    //worm
    public static @EntityDef(value = {Unitc.class, Wormc.class}, legacy = true) UnitType sandworm, testworm;

    //air
    public static @EntityDef({Unitc.class}) UnitType flare, eclipse, horizon, zenith, antumbra;

    //air
    public static @EntityDef(value = {Unitc.class}, legacy = true) UnitType mono;

    //air
    public static @EntityDef(value = {Unitc.class}, legacy = true) UnitType poly;

    //air + payload
    public static @EntityDef({Unitc.class, Payloadc.class}) UnitType mega;

    //air + payload
    public static @EntityDef(value = {Unitc.class, Payloadc.class}, legacy = true) UnitType quad;

    //air + payload + ammo distribution
    public static @EntityDef({Unitc.class, Payloadc.class, AmmoDistributec.class}) UnitType oct;

    //air
    public static @EntityDef(value = {Unitc.class}, legacy = true) UnitType alpha, beta, gamma;

    //water
    public static @EntityDef({Unitc.class, WaterMovec.class}) UnitType risso, minke, bryde, sei, omura;

    //special block unit type
    public static @EntityDef({Unitc.class, BlockUnitc.class}) UnitType block;

    //endregion
