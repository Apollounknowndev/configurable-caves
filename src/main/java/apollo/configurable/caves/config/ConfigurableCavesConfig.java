package apollo.configurable.caves.config;

import io.wispforest.owo.config.Option;
import io.wispforest.owo.config.ConfigWrapper;

public class ConfigurableCavesConfig extends ConfigWrapper<ConfigurableCavesConfigModel>
{
    private final Option<Boolean> cheeseCavesEnabled;
    private final Option<Double> cheeseCaveAdditive;
    private final Option<Boolean> cheeseCaveEntrancesEnabled;
    private final Option<Double> cheeseCaveEntranceAdditive;
    private final Option<Boolean> noodleCavesEnabled;
    private final Option<Double> noodleCaveThreshold;
    private final Option<Double> noodleCaveThicknessAdditive;
    private final Option<Boolean> cavePillarsEnabled;
    private final Option<Double> cavePillarThicknessAdditive;
    private final Option<Double> cavePillarRarenessAdditive;
    private final Option<Boolean> spaghettiCaves2dEnabled;
    private final Option<Integer> spaghettiCaves2dElevationShift;
    private final Option<Boolean> spaghettiCaves3dEnabled;
    
    private ConfigurableCavesConfig() {
        super(ConfigurableCavesConfigModel.class);
        this.cheeseCavesEnabled = this.optionForKey(new Option.Key("cheeseCavesEnabled"));
        this.cheeseCaveAdditive = this.optionForKey(new Option.Key("cheeseCaveAdditive"));
        this.cheeseCaveEntrancesEnabled = this.optionForKey(new Option.Key("cheeseCaveEntrancesEnabled"));
        this.cheeseCaveEntranceAdditive = this.optionForKey(new Option.Key("cheeseCaveEntranceAdditive"));
        this.noodleCavesEnabled = this.optionForKey(new Option.Key("noodleCavesEnabled"));
        this.noodleCaveThreshold = this.optionForKey(new Option.Key("noodleCaveThreshold"));
        this.noodleCaveThicknessAdditive = this.optionForKey(new Option.Key("noodleCaveThicknessAdditive"));
        this.cavePillarsEnabled = this.optionForKey(new Option.Key("cavePillarsEnabled"));
        this.cavePillarThicknessAdditive = this.optionForKey(new Option.Key("cavePillarThicknessAdditive"));
        this.cavePillarRarenessAdditive = this.optionForKey(new Option.Key("cavePillarRarenessAdditive"));
        this.spaghettiCaves2dEnabled = this.optionForKey(new Option.Key("spaghettiCaves2dEnabled"));
        this.spaghettiCaves2dElevationShift = this.optionForKey(new Option.Key("spaghettiCaves2dElevationShift"));
        this.spaghettiCaves3dEnabled = this.optionForKey(new Option.Key("spaghettiCaves3dEnabled"));
    }
    
    public static ConfigurableCavesConfig createAndLoad() {
        final ConfigurableCavesConfig wrapper = new ConfigurableCavesConfig();
        wrapper.load();
        return wrapper;
    }
    
    public boolean cheeseCavesEnabled() {
        return this.cheeseCavesEnabled.value();
    }
    
    public void cheeseCavesEnabled(final boolean value) {
        this.cheeseCavesEnabled.set(value);
    }
    
    public double cheeseCaveAdditive() {
        return (double)this.cheeseCaveAdditive.value();
    }
    
    public void cheeseCaveAdditive(final double value) {
        this.cheeseCaveAdditive.set(value);
    }
    
    public boolean cheeseCaveEntrancesEnabled() {
        return this.cheeseCaveEntrancesEnabled.value();
    }
    
    public void cheeseCaveEntrancesEnabled(final boolean value) {
        this.cheeseCaveEntrancesEnabled.set(value);
    }
    
    public double cheeseCaveEntranceAdditive() {
        return (double)this.cheeseCaveEntranceAdditive.value();
    }
    
    public void cheeseCaveEntranceAdditive(final double value) {
        this.cheeseCaveEntranceAdditive.set(value);
    }
    
    public boolean noodleCavesEnabled() {
        return this.noodleCavesEnabled.value();
    }
    
    public void noodleCavesEnabled(final boolean value) {
        this.noodleCavesEnabled.set(value);
    }
    
    public double noodleCaveThreshold() {
        return (double)this.noodleCaveThreshold.value();
    }
    
    public void noodleCaveThreshold(final double value) {
        this.noodleCaveThreshold.set(value);
    }
    
    public double noodleCaveThicknessAdditive() {
        return (double)this.noodleCaveThicknessAdditive.value();
    }
    
    public void noodleCaveThicknessAdditive(final double value) {
        this.noodleCaveThicknessAdditive.set(value);
    }
    
    public boolean cavePillarsEnabled() {
        return this.cavePillarsEnabled.value();
    }
    
    public void cavePillarsEnabled(final boolean value) {
        this.cavePillarsEnabled.set(value);
    }
    
    public double cavePillarThicknessAdditive() {
        return (double)this.cavePillarThicknessAdditive.value();
    }
    
    public void cavePillarThicknessAdditive(final double value) {
        this.cavePillarThicknessAdditive.set(value);
    }
    
    public double cavePillarRarenessAdditive() {
        return (double)this.cavePillarRarenessAdditive.value();
    }
    
    public void cavePillarRarenessAdditive(final double value) {
        this.cavePillarRarenessAdditive.set(value);
    }
    
    public boolean spaghettiCaves2dEnabled() {
        return this.spaghettiCaves2dEnabled.value();
    }
    
    public void spaghettiCaves2dEnabled(final boolean value) {
        this.spaghettiCaves2dEnabled.set(value);
    }
    
    public int spaghettiCaves2dElevationShift() {
        return (int)this.spaghettiCaves2dElevationShift.value();
    }
    
    public void spaghettiCaves2dElevationShift(final int value) {
        this.spaghettiCaves2dElevationShift.set(value);
    }
    
    public boolean spaghettiCaves3dEnabled() {
        return this.spaghettiCaves3dEnabled.value();
    }
    
    public void spaghettiCaves3dEnabled(final boolean value) {
        this.spaghettiCaves3dEnabled.set(value);
    }
}