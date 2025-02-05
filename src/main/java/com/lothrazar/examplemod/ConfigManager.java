package com.lothrazar.examplemod;

import com.lothrazar.library.config.ConfigTemplate;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;

public class ConfigManager extends ConfigTemplate {

  private static ForgeConfigSpec CONFIG;
  public static BooleanValue TESTING;
  static {
    final ForgeConfigSpec.Builder BUILDER = builder();
    BUILDER.comment("Mod settings").push(ModMain.MODID);
    TESTING = BUILDER.comment("Testing boolean config").define("doesNothing", true);
    BUILDER.pop(); // one pop for every push
    CONFIG = BUILDER.build();
  }

  public ConfigManager() {
    CONFIG.setConfig(setup(ModMain.MODID));
  }
}
