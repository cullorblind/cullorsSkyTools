package com.cullorblind.skytools.proxy;

import com.cullorblind.skytools.init.ModItems;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenders() {
        ModItems.registerRenders();
    }
}
