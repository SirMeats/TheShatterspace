package net.certifiedzako.theshatterspace.item;


import net.certifiedzako.theshatterspace.TheShatterspace;
import net.certifiedzako.theshatterspace.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheShatterspace.MOD_ID);


    public static final RegistryObject<CreativeModeTab> SHATTERSPACE_TAB = CREATIVE_MODE_TABS.register("shatterspace_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TABICON.get()))
                    .title(Component.translatable("creativetab.shatterspace_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.TABICON.get());

                        pOutput.accept(ModBlocks.TEST_BLOCK.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
