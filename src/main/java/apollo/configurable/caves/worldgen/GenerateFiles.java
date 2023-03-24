package apollo.configurable.caves.worldgen;

import apollo.configurable.caves.ConfigurableCavesMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.densityfunction.DensityFunction;
import net.minecraft.world.gen.densityfunction.DensityFunctionTypes;

public class GenerateFiles
{
    public static DensityFunction CHEESE_CAVES_ENABLED = DensityFunctionTypes.constant(ConfigurableCavesMod.CONFIG.cheeseCavesEnabled() ? 1.0 : 0.0);
    public static DensityFunction CHEESE_CAVE_ADDITIVE = DensityFunctionTypes.constant(ConfigurableCavesMod.CONFIG.cheeseCaveAdditive());;
    public static DensityFunction CHEESE_CAVE_ENTRANCES_ENABLED = DensityFunctionTypes.constant(ConfigurableCavesMod.CONFIG.cheeseCaveEntrancesEnabled() ? 1.0 : 0.0);
    public static DensityFunction CHEESE_CAVE_ENTRANCE_ADDITIVE = DensityFunctionTypes.constant(ConfigurableCavesMod.CONFIG.cheeseCaveEntranceAdditive());
    public static DensityFunction NOODLE_CAVES_ENABLED = DensityFunctionTypes.constant(ConfigurableCavesMod.CONFIG.noodleCavesEnabled() ? 1.0 : 0.0);
    public static DensityFunction NOODLE_CAVE_THRESHOLD = DensityFunctionTypes.constant(ConfigurableCavesMod.CONFIG.noodleCaveThreshold());
    public static DensityFunction NOODLE_CAVE_THICKNESS_ADDITIVE = DensityFunctionTypes.constant(ConfigurableCavesMod.CONFIG.noodleCaveThicknessAdditive());
    public static DensityFunction CAVE_PILLARS_ENABLED = DensityFunctionTypes.constant(ConfigurableCavesMod.CONFIG.cavePillarsEnabled() ? 1.0 : 0.0);
    public static DensityFunction CAVE_PILLARS_RARENESS_ADDITIVE = DensityFunctionTypes.constant(ConfigurableCavesMod.CONFIG.cavePillarRarenessAdditive());
    public static DensityFunction CAVE_PILLARS_THICKNESS_ADDITIVE = DensityFunctionTypes.constant(ConfigurableCavesMod.CONFIG.cavePillarThicknessAdditive());
    public static DensityFunction SPAGHETTI_CAVES_2D_ENABLED = DensityFunctionTypes.constant(ConfigurableCavesMod.CONFIG.spaghettiCaves2dEnabled() ? 1.0 : 0.0);
    public static DensityFunction SPAGHETTI_CAVES_2D_ELEVATION_SHIFT = DensityFunctionTypes.constant(ConfigurableCavesMod.CONFIG.spaghettiCaves2dElevationShift());
    public static DensityFunction SPAGHETTI_CAVES_3D_ENABLED = DensityFunctionTypes.constant(ConfigurableCavesMod.CONFIG.spaghettiCaves3dEnabled() ? 1.0 : 0.0);
    
    public static void register() {
        Registry.register(BuiltinRegistries.DENSITY_FUNCTION, new Identifier("configurable-caves", "cheese_caves/enabled"), CHEESE_CAVES_ENABLED);
        Registry.register(BuiltinRegistries.DENSITY_FUNCTION, new Identifier("configurable-caves", "cheese_caves/additive"), CHEESE_CAVE_ADDITIVE);
        Registry.register(BuiltinRegistries.DENSITY_FUNCTION, new Identifier("configurable-caves", "cheese_cave_entrances/enabled"), CHEESE_CAVE_ENTRANCES_ENABLED);
        Registry.register(BuiltinRegistries.DENSITY_FUNCTION, new Identifier("configurable-caves", "cheese_cave_entrances/additive"), CHEESE_CAVE_ENTRANCE_ADDITIVE);
        Registry.register(BuiltinRegistries.DENSITY_FUNCTION, new Identifier("configurable-caves", "noodle_caves/enabled"), NOODLE_CAVES_ENABLED);
        Registry.register(BuiltinRegistries.DENSITY_FUNCTION, new Identifier("configurable-caves", "noodle_caves/threshold"), NOODLE_CAVE_THRESHOLD);
        Registry.register(BuiltinRegistries.DENSITY_FUNCTION, new Identifier("configurable-caves", "noodle_caves/thickness_additive"), NOODLE_CAVE_THICKNESS_ADDITIVE);
        Registry.register(BuiltinRegistries.DENSITY_FUNCTION, new Identifier("configurable-caves", "cave_pillars/enabled"), CAVE_PILLARS_ENABLED);
        Registry.register(BuiltinRegistries.DENSITY_FUNCTION, new Identifier("configurable-caves", "cave_pillars/rareness_additive"), CAVE_PILLARS_RARENESS_ADDITIVE);
        Registry.register(BuiltinRegistries.DENSITY_FUNCTION, new Identifier("configurable-caves", "cave_pillars/thickness_additive"), CAVE_PILLARS_THICKNESS_ADDITIVE);
        Registry.register(BuiltinRegistries.DENSITY_FUNCTION, new Identifier("configurable-caves", "spaghetti_caves_2d/enabled"), SPAGHETTI_CAVES_2D_ENABLED);
        Registry.register(BuiltinRegistries.DENSITY_FUNCTION, new Identifier("configurable-caves", "spaghetti_caves_2d/elevation_shift"), SPAGHETTI_CAVES_2D_ELEVATION_SHIFT);
        Registry.register(BuiltinRegistries.DENSITY_FUNCTION, new Identifier("configurable-caves", "spaghetti_caves_3d/enabled"), SPAGHETTI_CAVES_3D_ENABLED);
    }
}