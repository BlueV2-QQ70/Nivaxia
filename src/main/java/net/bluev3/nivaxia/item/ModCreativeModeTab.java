package net.bluev3.nivaxia.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
//import net.minecraftforge.event.CreativeModeTabEvent;


public class ModCreativeModeTab {
    public static final CreativeModeTab NIVAXIATAB = new CreativeModeTab("nivaxiatab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MINERAL.get());
        }
    };
}

// this version of the creative mode tab works for 1.19.3 and above but I am currently going to make my mod in 1.19 bcs more other more can be used with it then!
//@Mod.EventBusSubscriber(modid = Nivaxia.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
//public class ModCreativeModeTab {
//    public static CreativeModeTab NIVAXIA_TAB;
//
//    @SubscribeEvent
//    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
//        NIVAXIA_TAB = event.registerCreativeModeTab(new ResourceLocation(Nivaxia.MOD_ID, "nivaxia_tab"),
//                    builder -> builder.icon(() -> new ItemStack(ModItems.BLUE_PETALS.get()))
//                            .title(Component.translatable("creativemodetab.nivaxia_tab")));
//    }
//}