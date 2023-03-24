package apollo.configurable.caves.config;

import io.wispforest.owo.config.annotation.RangeConstraint;
import io.wispforest.owo.config.annotation.RestartRequired;
import io.wispforest.owo.config.annotation.SectionHeader;
import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;

@Modmenu(modId = "configurable-caves")
@Config(name = "configurable-caves-config", wrapperName = "ConfigurableCavesConfig")
public class ConfigurableCavesConfigModel
{
    @SectionHeader("cheeseCaves")
    @RestartRequired
    public boolean cheeseCavesEnabled;
    @RangeConstraint(min = 0.0, max = 0.5)
    @RestartRequired
    public double cheeseCaveAdditive;
    @RestartRequired
    public boolean cheeseCaveEntrancesEnabled;
    @RangeConstraint(min = 0.0, max = 0.5)
    @RestartRequired
    public double cheeseCaveEntranceAdditive;
    @SectionHeader("noodleCaves")
    @RestartRequired
    public boolean noodleCavesEnabled;
    @RangeConstraint(min = -1.0, max = 1.0)
    @RestartRequired
    public double noodleCaveThreshold;
    @RangeConstraint(min = -0.2, max = 0.0)
    @RestartRequired
    public double noodleCaveThicknessAdditive;
    @SectionHeader("cavePillars")
    @RestartRequired
    public boolean cavePillarsEnabled;
    @RangeConstraint(min = -0.5, max = 1.5)
    @RestartRequired
    public double cavePillarThicknessAdditive;
    @RangeConstraint(min = -1.5, max = -0.5)
    @RestartRequired
    public double cavePillarRarenessAdditive;
    @SectionHeader("spaghettiCaves2d")
    @RestartRequired
    public boolean spaghettiCaves2dEnabled;
    @RangeConstraint(min = 2.0, max = 16.0)
    @RestartRequired
    public int spaghettiCaves2dElevationShift;
    @SectionHeader("spaghettiCaves3d")
    @RestartRequired
    public boolean spaghettiCaves3dEnabled;
    
    public ConfigurableCavesConfigModel() {
        this.cheeseCavesEnabled = true;
        this.cheeseCaveAdditive = 0.27;
        this.cheeseCaveEntrancesEnabled = true;
        this.cheeseCaveEntranceAdditive = 0.37;
        this.noodleCavesEnabled = true;
        this.noodleCaveThreshold = 0.0;
        this.noodleCaveThicknessAdditive = -0.07500000000000001;
        this.cavePillarsEnabled = true;
        this.cavePillarThicknessAdditive = 0.55;
        this.cavePillarRarenessAdditive = -1.0;
        this.spaghettiCaves2dEnabled = true;
        this.spaghettiCaves2dElevationShift = 8;
        this.spaghettiCaves3dEnabled = true;
    }
}