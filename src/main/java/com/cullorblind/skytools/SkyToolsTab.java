package com.cullorblind.skytools;

import com.cullorblind.skytools.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SkyToolsTab extends CreativeTabs {

    public SkyToolsTab(String label) {
        super(label);
        this.setBackgroundImageName("skytools.png");
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.sky_stick;
    }

}
