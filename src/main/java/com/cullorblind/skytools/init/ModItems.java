package com.cullorblind.skytools.init;

import com.cullorblind.skytools.cullorsskytools;
import com.cullorblind.skytools.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static Item sky_stick;

    public static void init() {
        sky_stick = new Item().setUnlocalizedName("sky_stick").setCreativeTab(cullorsskytools.tabSkyToolsTab);
    }

    public static void register() {
       GameRegistry.registerItem(sky_stick, sky_stick.getUnlocalizedName().substring(5));
    }

    public static void registerRenders() {
        registerRender(sky_stick);
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
