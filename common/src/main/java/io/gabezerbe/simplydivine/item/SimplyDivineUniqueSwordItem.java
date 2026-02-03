package io.gabezerbe.simplydivine.item;

import net.minecraft.world.item.Tier;
import net.sweenus.simplyswords.item.UniqueSwordItem;

public abstract class SimplyDivineUniqueSwordItem extends UniqueSwordItem {

    public SimplyDivineUniqueSwordItem(Tier toolMaterial, int attackDamage, float attackSpeed, Properties settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
}
